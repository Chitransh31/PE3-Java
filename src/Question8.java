public class Question8 {
    public static void main(String[] args) {

        try {
            int[] arr1 = new int[-2];
        }
        catch(NegativeArraySizeException e) {
            System.out.println("Negative Array Size Exception");
        }

        try {
            int[] arr2 = new int[3];
            System.out.println(arr2[3]);
        }
        catch(IndexOutOfBoundsException e) {
            System.out.println("Index out of Bounds Exception");
        }

        try {
            int[] arr3 = null;
            int length = arr3.length;
        }
        catch(NullPointerException e) {
            System.out.println("Null Pointer Exception");
        }
    }
}
