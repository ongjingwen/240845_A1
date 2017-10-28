package readFiles;
import java.io.File;
import countIssue.countIssue;
import java.util.LinkedList;

public final class getFiles {
    public countIssue issues = new countIssue();
    private final LinkedList<String> listFile = new LinkedList();
    private String allList = "";


    public getFiles(String path) {

        final File folder = new File(path);
        listFolderFile(folder);

    }

    public void listFolderFile(final File folder) {
        for (final File fileEntry : folder.listFiles()) {
            if (fileEntry.isDirectory()) {
                this.listFolderFile(fileEntry);
            } else {
                String list[] = {fileEntry.getName()};
                for (String list1 : list) {
                    addFile(list1);
                }
            }
        }
        issues.calculateIssue(folder, getFileList());
    }

    public void addFile(String fileExt) {
       if (javaExt(fileExt)) {
           listFile.add(fileExt);
        }
    }

    public boolean javaExt(String ext) {
        return ext.substring(ext.length() - 4).equalsIgnoreCase("Java");
    }

    public String[] getFileList() {
        String arrayFile[] = new String[listFile.size()];

        for (int i = 0; i < listFile.size(); i++) {
            arrayFile[i] = listFile.get(i);
        }
        return arrayFile;
    }

    /**
     *
     * @return
     */
    public String displayFile() {

        for (int i = 0; i < listFile.size(); i++) {
            allList += listFile.get(i);
        }
        return allList;
    }

    public int numFiles() {
        int noFile = listFile.size();
        return noFile;
    }
}


