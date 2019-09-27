public class Question7 {
    public static  void main(String[] args) {
        int i = 10;
        try {
            if(i  < 20) {
                throw new Exception("Number less than 20!");
            }
        }
        catch(Exception e) {
            System.out.println(e);
        }
        finally {
            System.out.println("Inside finally block");
        }

    }
}
