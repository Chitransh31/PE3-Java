import java.io.*;
import java.util.Scanner;
import java.nio.file.*;

public class Question10 {
    public static void main(String[] args) {
         try {
             File folder = new File("src");
             File[] listOfFiles = folder.listFiles();

             for (int i = 0; i < listOfFiles.length; i++) {
                 if (listOfFiles[i].isFile()) {
                     System.out.println("File " + listOfFiles[i].getName());
                 } else if (listOfFiles[i].isDirectory()) {
                     System.out.println("Directory " + listOfFiles[i].getName());
                 }
             }

             Scanner in = new Scanner(System.in);
             System.out.println("Select extension: ");
             String ext = in.nextLine();

             File[] requiredFiles = folder.listFiles(new FilenameFilter() {
                 public boolean accept(File folder, String filename)
                 { return filename.endsWith(ext); }
             } );

             for (int i = 0; i < requiredFiles.length; i++) {
                 System.out.println("File: " + requiredFiles[i].getName());
                 File file = new File("src/" + requiredFiles[i].getName());
                 byte[] fileContent = Files.readAllBytes(file.toPath());
                 System.out.println("Byte Array Content: " + fileContent);
             }
         }
         catch(Exception e) {
             System.out.println("Error!");
         }

    }
}
