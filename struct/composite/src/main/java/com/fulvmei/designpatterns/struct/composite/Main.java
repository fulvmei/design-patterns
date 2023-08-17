package com.fulvmei.designpatterns.struct.composite;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Folder folder = new Folder("音乐");

        List<Folder> subFolders2 = new ArrayList<>();
        subFolders2.add(new Folder("--摇滚音乐"));
        subFolders2.add(new Folder("--爵士音乐"));

        Folder folder1=new Folder("-流行音乐");
        folder1.setSubFolders(subFolders2);

        List<Folder> subFolders = new ArrayList<>();
        subFolders.add(folder1);
        subFolders.add(new Folder("-古典音乐"));

        folder.setSubFolders(subFolders);

        printFolder(folder);
    }

    private static void printFolder(Folder folder) {
        System.out.println(folder.getName());
        for (int i = 0; i < folder.getSubFolders().size(); i++) {
            printFolder(folder.getSubFolders().get(i));
        }
    }
}