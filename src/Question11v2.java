import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class Question11v2 {
    static void countEachWords(String fileName, Map<String,Integer>words) throws FileNotFoundException {
        Scanner file= new Scanner(new File(fileName));
        while(file.hasNext()) {
            String word = file.next();
            String[] wordsWithoutDelimiter = word.split("[\\s,.?'\"]");

            for(int i = 0;i < wordsWithoutDelimiter.length;i++) {
                Integer count = words.get(wordsWithoutDelimiter[i]);
                if (count != null) {
                    count++;
                } else {
                    count = 1;
                }
                words.put(wordsWithoutDelimiter[i], count);
            }
        }
        file.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        Map<String,Integer> words = new HashMap<String,Integer>();
        countEachWords("src/FileDemo.txt", words);
        System.out.println(words);
    }
}
