public class TicTacToe {
    static char [] board = new char[10];
    public static void main(String[] args) {
        createEmptyBoard();
    }

    // UC1- TO create an empty board of size 10.
    public static void createEmptyBoard()
    {
        for(int index = 1;index<board.length;index++)
        {
            board[index]= ' ';
        }
    }

}
