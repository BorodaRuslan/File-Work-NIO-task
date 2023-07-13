package project;

import utils.Constants;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;


public class FileWriteService {
    public static File file;
    public static void creatingFile (String name){
        file = new File(Constants.PATH_FILE + name + Constants.FORMAT);
        DatabaseFile.addFile(file);
    }
    public static String writeFile(String content){
        try {
            Files.writeString(file.toPath(), content);
        } catch (IOException e) {
            return "Error something went wrong";
        }
        return "File: " + Main.fileName + " created and written successfully";
    }



}
