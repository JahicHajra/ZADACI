package Mini_Project3;

/** (Game: play a tic-tac-toe game) In a game of tic-tac-toe, two players take turns
 * marking an available cell in a 3 * 3 grid with their respective tokens 
 * (either X or O). When one player has placed three tokens in a horizontal, vertical, or
 * diagonal row on the grid, the game is over and that player has won. 
 * A draw (no winner) occurs when all the cells on the grid have been filled with tokens and
 * neither player has achieved a win. Create a program for playing tic-tac-toe.
 * The program prompts two players to enter an X token and O token alternately.
 * Whenever a token is entered, the program redisplays the board on the
 * console and determines the status of the game (win, draw, or continue).
 * 
 */

public class Tic_Tac_Toe {

	
static java.util.Scanner input =new java.util.Scanner (System.in);
	

static int row = 0;
static int column = 0;


	public static void main(String[] args) {
		
		
		// declare and create matrix
		char[][] matrix = new char[3][3];
		
		//declare char-type variable and assign it 'X
		char player = 'X';
		
		//method call
		printMatrix(matrix);
		
		
		//as long as noone wins. play
		while (!isWin(player, matrix)) {
			player = play(matrix, player);
		}
	}

	// printMatrix method
	public static void printMatrix(char[][] matrix) {
		
		//create board for play
		for (int i = 0; i < 3; i++) {
			if (i != 0)
				System.out.println("-------------");
			System.out.print("| ");
			for (int j = 0; j < 3; j++) {
				System.out.print(matrix[i][j] + " | ");
			}
			System.out.println();
		}

	}

	//
	public static char play(char[][] matrix, char player) {
		
		//if the board is full,end game
		if (!isEmpty(matrix)) {
			System.exit(0);
		}
		
		//prompt the user to enter 0, 1 or 2 for row
		System.out.println("Enter a row  (0, 1, or 2) for player " + player);
		
		
		// user's input
		row = input.nextInt();
		
		
		System.out.println("Enter a  column (0, 1, or 2) for player "
		+ player + ": ");
		int column = input.nextInt();
		
		
		// if there is a sign, send message to user that is occupied
		if (matrix[row][column] != '\u0000') {
			System.out.println("The row and column is occupied. Choose another row and column");
			
			
			//switch players 
		} else {
			matrix[row][column] = player;
			if (player == 'O') {
				player = 'X';
			} else {
				player = 'O';
			}

		}
		// update table
		printMatrix(matrix);
		return player;
	}

	// isEmpty method
	public static boolean isEmpty(char[][] matrix) {
		
		//checks if the row and column is empty
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == '\u0000') {
					return true;
				}
			}
		}
		// if all places are occupied,then it's draw
		System.out.println("It's a draw!");
		return false;
	}

//isWin method
	public static boolean isWin(char player, char[][] matrix) {
		
		//method calls for all three conditions of win
		return (isWinInDiagonal(matrix) || isWinInRows(matrix) || isWinInColumns(matrix));
	}


	
// isWinInRows
	public static boolean isWinInRows(char[][] matrix) {
		
		//checks if there is win in rows
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i][0] != '\u0000' && matrix[i][0] == matrix[i][1]
					&& matrix[i][1] == matrix[i][2]) {
				System.out.println("\nPlayer " + matrix[i][0] + " won!");
				return true;
			}
		}
		return false;
	}

	// isWinInColumns method
	public static boolean isWinInColumns(char[][] matrix) {
		
		//checks if there is win in columns
		for (int j = 0; j < matrix.length; j++) {
			if (matrix[0][j] != '\u0000' && matrix[0][j] == matrix[1][j]
					&& matrix[1][j] == matrix[2][j]) {
				System.out.println("\nPlayer " + matrix[0][j] + " won!");
				return true;
			}
		}
		return false;
	}


//isWinInDiagonal
public static boolean isWinInDiagonal(char[][] matrix) {
	
	
	// top-left to bottom right diagonal checks 0 0, 1 1, 2 2 spaces in matrix
	if (matrix[0][0] != '\u0000' && matrix[0][0] == matrix[1][1]
			&& matrix[1][1] == matrix[2][2]) {
		
		
		//define winer
		System.out.println("\nPlayer " + matrix[0][0] + " won!");
		return true;
	}
	
	// top-right to bottom-left diagonal checks space in matrix 0 2, 1 1, 2 0
	if (matrix[0][2] != '\u0000' && matrix[0][2] == matrix[1][1]
			&& matrix[1][1] == matrix[2][0]) {
		
		//define winer
		System.out.println("\nPlayer " + matrix[0][2] + " won!");
		return true;
	}
	return false;
}}
