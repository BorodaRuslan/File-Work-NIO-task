package project;

import utils.Constants;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileWriteService {

    public static String CreatingAndWritingFile(String nameFile, String content){
        Path path;
        String pathFile = Constants.PATH_FILE + nameFile + Constants.FORMAT;
        try {
            path = Files.createFile(Path.of(pathFile));
            Files.writeString(path, content);
        } catch (IOException e) {
            return "Error something went wrong";
        }
        return "File: " + nameFile + " created and written successfully";
    }
}
