package project;

import utils.Constants;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class FileReadService {
    public static Scanner scanner = new Scanner(System.in);

    public static String readFile(){
        System.out.println("What file do you want to read? Enter " +
                "file name without format!");
        String fileName = scanner.nextLine();

        String path = Constants.PATH_FILE + fileName + Constants.FORMAT;
        try {
            System.out.println(Files.readString(Path.of(path)));
        } catch (IOException e) {
            return "Error something went wrong";
        }
        return "File: " + fileName  +" read successfully";
    }


}
