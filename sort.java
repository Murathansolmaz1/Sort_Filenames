package com.javatutorialhq.tutorial;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortFileName {

    public static void main(String[] args) {
        File fileDir = new File("C:\\Users\\solmaz");
        if(fileDir.isDirectory()){
            List listFile = Arrays.asList(fileDir.list());
            System.out.println("************************************************************************************");
            System.out.println("Listing files unsorted");
            for(Object s:listFile){
                System.out.println(s);
            }
            Collections.sort(listFile);
            System.out.println("************************************************************************************");
            System.out.println("Sorting by filename in ascending order");
            for(Object s:listFile){
                System.out.println(s);
            }
            System.out.println("************************************************************************************");
            System.out.println("Sorting by filename in descending order");
            Collections.sort(listFile,Collections.reverseOrder());
            for(Object s:listFile){
                System.out.println(s);
            }

        }
        else{
            System.out.println(fileDir.getAbsolutePath() + " is not a directory");
        }

    }

}
