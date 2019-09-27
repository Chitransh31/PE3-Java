import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.String;

public class Question4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            List<String> countries = new ArrayList<String>();
            String countryName;
            System.out.println("Type 'exit' to exit.Enter strings: ");

            int i = 0, len, numStrings;
            do {
                countryName = in.nextLine();
                countries.add(countryName);
                i++;
            }while(!countryName.equals("exit"));

            String[] countriesArray = countries.toArray(new String[0]);
            numStrings = i - 1;
            for(i = 0;i < numStrings;i++) {
                len = countriesArray[i].length();
                StringBuilder country = new StringBuilder(countriesArray[i]);

                for(int j = 1;j < len;j++) {
                    if(country.charAt(j) == 'a' || country.charAt(j) == 'e' || country.charAt(j) == 'i'
                            || country.charAt(j) == 'o' || country.charAt(j) == 'u') {

                            country.deleteCharAt(j);
                            len--;
                            if(j == len - 1) {
                                j = 1;
                            }
                    }
                }
                System.out.println(country);
            }

        }
        catch(Exception e) {
            System.out.println("Invalid input!");
        }
    }
}
