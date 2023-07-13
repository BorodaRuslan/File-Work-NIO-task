package project;

import utils.Constants;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileReadService {

    public static String readFile(String fileName){
        String path = Constants.PATH_FILE + fileName + Constants.FORMAT;
        try {
            System.out.println(Files.readString(Path.of(path)));
        } catch (IOException e) {
            return "Error something went wrong";
        }
        return "File: " + fileName  +" read successfully";
    }
}
