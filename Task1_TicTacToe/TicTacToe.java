import java.util.Scanner;
public class TicTacToe{
    public static void printBoard(char[][] board){
    System.out.println();
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            System.out.print(" " +board[i][j] + " ");
            if(j < 2){
                System.out.print("|");
            }
        }
        System.out.println();
        if(i < 2){
                 System.out.println("-----------");
        }
    }
    System.out.println();
}

public static boolean isPositionEmpty(char[][] board, int position) {

    switch (position) {
        case 1: return board[0][0] == '1';
        case 2: return board[0][1] == '2';
        case 3: return board[0][2] == '3';
        case 4: return board[1][0] == '4';
        case 5: return board[1][1] == '5';
        case 6: return board[1][2] == '6';
        case 7: return board[2][0] == '7';
        case 8: return board[2][1] == '8';
        case 9: return board[2][2] == '9';
        default: return false;
    }
}

public static boolean checkWinner(char[][] board, char player) {

    for (int i = 0; i < 3; i++) {
        if (board[i][0] == player &&
            board[i][1] == player &&
            board[i][2] == player) {
            return true;
        }
    }

    for (int j = 0; j < 3; j++) {
        if (board[0][j] == player &&
            board[1][j] == player &&
            board[2][j] == player) {
            return true;
        }
    }

    if (board[0][0] == player &&
        board[1][1] == player &&
        board[2][2] == player) {
        return true;
    }

    if (board[0][2] == player &&
        board[1][1] == player &&
        board[2][0] == player) {
        return true;
    }

    return false;
}

public static boolean isBoardFull(char[][] board) {

    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {

            if (board[i][j] != 'X' && board[i][j] != 'O') {
                return false;
            }

        }
    }

    return true;
}

public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("==================================");
    System.out.println("        TIC TAC TOE GAME");
    System.out.println("==================================");

    char[][] board = {
        {'1', '2', '3'},
        {'4', '5', '6'},
        {'7', '8', '9'}
    };
    printBoard(board);
    char currentPlayer = 'X';
    boolean gameOver = false;
    int position;

    while (!gameOver){
    System.out.println("Player " + currentPlayer + ", enter position (1-9): ");

    position = sc.nextInt();
    if (position < 1 || position > 9) {
    System.out.println("Please enter a number between 1 and 9.");
    continue;
}

    if (!isPositionEmpty(board, position)) {
    System.out.println("Position already occupied! Try again.");
    continue;
}

    switch (position) {
    case 1:
        board[0][0] = currentPlayer;
        break;
    case 2:
        board[0][1] = currentPlayer;
        break;
    case 3:
        board[0][2] = currentPlayer;
        break;
    case 4:
        board[1][0] = currentPlayer;
        break;
    case 5:
        board[1][1] = currentPlayer;
        break;
    case 6:
        board[1][2] = currentPlayer;
        break;
    case 7:
        board[2][0] = currentPlayer;
        break;
    case 8:
        board[2][1] = currentPlayer;
        break;
    case 9:
        board[2][2] = currentPlayer;
        break;
    default:
        System.out.println("Invalid Position!");
}
    printBoard(board);

    if (checkWinner(board, currentPlayer)) {
    System.out.println(" Player " + currentPlayer + " Wins!");
    gameOver = true;
    break;
} 

if (isBoardFull(board)) {
    System.out.println("Match Draw!");
    gameOver = true;
    break;
}

    if (currentPlayer == 'X') {
    currentPlayer = 'O';
} else {
    currentPlayer = 'X';
}
}
sc.close();
}
}
