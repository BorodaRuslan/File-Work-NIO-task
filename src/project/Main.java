package project;

import java.util.Scanner;

public class Main {
    public static String fileName;
    public static String contentText;
    public static int resultChoice;
    public static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        service();

    }

    public static void getDataFromUser() {
        System.out.println("Please enter a file name (No format)");
        fileName = scanner.next();
        scanner.nextLine();
        System.out.println("Please enter the text to be written");
        contentText = scanner.nextLine();
    }

    public static void service() {
        boolean lock = true;
        while (lock) {
            System.out.println("""
                    Choose an action (Enter a number 1-2-0)
                                     
                     1. Write to file.
                     2. Read file.
                     0. Close.
                     """);
            if (scanner.hasNextInt()) {
                resultChoice = scanner.nextInt();
                if (resultChoice == 1) {
                    getDataFromUser();
                    informationWorkingMethods(FileWriteService.CreatingAndWritingFile(fileName, contentText));
                } else if (resultChoice == 2) {
                    informationWorkingMethods(FileReadService.readFile(fileName));
                } else {
                    System.out.println("Thanks, bye!");
                    lock = false;
                }
            } else {
                System.out.println("Invalid input! Please enter an integer value");
                scanner.nextLine();
            }
        }
    }
    public static void informationWorkingMethods(String info){
        System.out.println(info);
    }
}
