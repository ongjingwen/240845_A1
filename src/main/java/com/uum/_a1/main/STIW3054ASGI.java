package com.uum._a1.main;

//Semester: #A171
//Course: #STIW3054
//Group: #A
//Task: #Assignment1
//Matrik: #240845
//Name: #Ong Jing Wen
//import java.io.File;
import java.util.Scanner;
import countIssue.countIssue;
import readFiles.getFiles;

public class STIW3054ASGI {

    static getFiles folder;
    static countIssue countingIssue = new countIssue();

    public static void main(String[] args) {

        String currentPath = (System.getProperty("user.dir"));
        String path = (currentPath.substring(0, currentPath.lastIndexOf('\\') + 1));

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Directory/Folder Name");
        String Directory = sc.nextLine();
        String fullPath = path + Directory + "\\src";

        folder = new getFiles(fullPath);
        int noFile = folder.numFiles();
        int noIssue = folder.issues.getIssue();

        System.out.println("Number of Java Files = " + noFile);
        System.out.println("Number of Issue = " + noIssue);

    }

}
