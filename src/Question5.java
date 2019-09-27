public class Question5 {
    public static void main(String[] args) {
        try {
            String[][] chessBoard = new String[8][8];
            int i, j;
            for (i = 0; i < 8; i++) {
                for (j = 0; j < 8; j++) {
                    if ((i + j) % 2 == 0) {
                        chessBoard[i][j] = "WW";
                    } else {
                        chessBoard[i][j] = "BB";
                    }
                    System.out.print(chessBoard[i][j] + "|");
                }
                System.out.println();
            }
        }
        catch(Exception e) {
            System.out.println("Error!");
        }
    }
}
