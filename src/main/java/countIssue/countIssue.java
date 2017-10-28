package countIssue;

import java.io.BufferedReader;
import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class countIssue {

    private String pathDirectory = "";
    private int countIssue;

    /**
     *
     * @param folder
     * @param ext
     * @return
     */
    public int calculateIssue(final File folder, String[] ext) {

        int noIssue = 0;
        for (String ext1 : ext) {
            pathDirectory = folder + "\\" + ext1;
            try (BufferedReader br = new BufferedReader(new FileReader(pathDirectory))) {
                String readLine;
                while ((readLine = br.readLine()) != null) {
                    if (readLine.contains("public static void main")) {
                        noIssue++;
                    }
                }
            } catch (IOException e) {

            }
        }
    setCountIssue(noIssue);
        return countIssue;
    }

   public void setPathDirectory(String pathDirectory) {
       this.pathDirectory = pathDirectory;
    }

    public void setCountIssue(int countIssue) {
        this.countIssue = countIssue;
    }
    public void setIssue(int count) {
        countIssue = count;
    }
    public int getIssue() {
        return countIssue;
    }
   public String getPathDirectory() {
        return pathDirectory;
  }

}