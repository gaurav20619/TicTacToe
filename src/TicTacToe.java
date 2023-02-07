import java.util.Scanner;

public class TicTacToe {
    static char [] board = new char[10];
    static char userLetter;
    static char computerLetter;

    public static void main(String[] args) {
        createEmptyBoard();
        chooseLetter();

    }

    // UC1- TO create an empty board of size 10.
    public static void createEmptyBoard()
    {
        for(int index = 1;index<board.length;index++)
        {
            board[index]= ' ';
        }
    }
    // UC2- to choose a letter for user and computer
    public static void chooseLetter()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("choose a letter: X or O");
        userLetter = sc.next().toUpperCase().charAt(0);
        if (userLetter=='X') {
            computerLetter = 'O';

        } else {
            computerLetter = 'X';
        }
    }

    

}
