package project;

import java.io.File;
import java.util.ArrayList;

public class DatabaseFile {

    // This class saves files to the database
    public static ArrayList<File> database = new ArrayList<>();

    // Method for adding a file to the database
    public static void addFile(File fileName){
        database.add(fileName);
    }
    // Method for displaying files from the database
    public static void showFiles(){
        int count = 1;
        System.out.println("___Available files___\n");
       for (File file: database){
           System.out.println(file.getName());
       }
    }
}
