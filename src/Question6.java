import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Enter String with 7 numbers separated by commas");
            String numberString = in.nextLine();

            String[] numbers = numberString.split(",");
            if(numbers.length == 7) {
                int[] arrNumbers = new int[7];
                int i;
                for(i = 0;i < 7;i++) {
                    arrNumbers[i] = Integer.parseInt(numbers[i]);
                }
                int diff = arrNumbers[0] - arrNumbers[1];
                boolean isConsecutive = true;
                for(i = 1; i < 6 &&  isConsecutive; i++) {
                    if(diff != (arrNumbers[i] - arrNumbers[i + 1])) {
                        isConsecutive = false;
                    }
                }
                if (isConsecutive){
                    System.out.println("Consecutive numbers");
                }
                else {
                    System.out.println("Non-Consecutive numbers");
                }
            }
            else {
                System.out.println("Enter valid number sequence!");
            }
        }
        catch(Exception e) {
            System.out.println("Error!");
        }
    }
}
