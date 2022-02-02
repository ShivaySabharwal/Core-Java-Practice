package Advanced2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {
        //To create a new File
        File myFile = new File("File1.txt");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            System.out.println("Error in creating the file.");
            e.printStackTrace();
        }

        //To Write to a File
        try {
            FileWriter fileWriter = new FileWriter("File1.txt");
            fileWriter.write("Writing to the file for the first time.\nAuthor: Shivay Sabharwal");
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Unable to Write.");
            e.printStackTrace();
        }

        //Reading a File
        try {
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //Deleting a File
//        File myFile1 = new File("File1.txt");
//        if(myFile1.delete()){
//            System.out.println("I have Deleted: " + myFile1.getName());
//        }
//        else{
//            System.out.println("Some Error occurred while deleting the File.");
//        }
    }
}
