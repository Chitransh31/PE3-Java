import java.io.*;

public class Question9 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("src/hello.txt");

        BufferedReader reader = new BufferedReader(new FileReader(file1));

        int numLines = 0;
        String fileText = "";
        String line;
        while((line = reader.readLine()) != null) {
            fileText += line.toUpperCase() + "\n";
            numLines++;
        }
        System.out.println(fileText);
        System.out.println("No. of lines: " + numLines);
        reader.close();
    }
}
