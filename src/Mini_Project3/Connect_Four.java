package Mini_Project3;

/*(Game: connect four) Connect four is a two-player board game in which the
 * players alternately drop coloured disks into a seven-column, six-row vertically
 * suspended grid.
 * The objective of the game is to connect four same-coloured disks in a row, a column,
 * or a diagonal before your opponent can do likewise.
 * The program prompts two players to drop a red or yellow disk alternately.
 * Whenever a disk is dropped, the program redisplays the board on the console and 
 * determines the status of the game (win, draw, or continue)
 * 
 */

import java.util.InputMismatchException;
import java.util.Scanner;
public class Connect_Four {
	
	
	public static void main(String[] args){
	
	//declare and create 6 x 7 matrix
			char[][] matrix = new char[6][7];	
			
			
			//fill in the empty space
			for (int row = 0; row < matrix.length; row++) {
				for (int column = 0; column < matrix[row].length; column++) {
					matrix[row][column] = ' ';
				}
			}
			
			//method call
			printMatrix(matrix);	
			
			int player = 0;		
			
		//as long as we do not have winner
			while (!Win(matrix)) {
				
				//if it is full and there is no winner, it's draw
				if (isFull(matrix)) {
					
					System.out.println("Draw");
					System.exit(0);	// end game
				}
				//method call
				play(matrix, player);	
				
				
				//method call
				printMatrix(matrix);			
				
				player++;				
				
			}
			
			//print winer
			if (player % 2 == 0)
				System.out.println("The yellow player won");
			else
				System.out.println("The red player won");
			

		}

		//print matrix
		public static void printMatrix(char[][] matrix) {	
			
			//create board for the game
			for (int row = 0; row < matrix.length; row++) {
				for (int column = 0; column < matrix[row].length; column++) {
					System.out.print("|" + matrix[row][column]);	
				}
				System.out.print("|\n");
			}
			System.out.println("---------------");
			
		}
		 
		//play method
		public static char[][] play(char[][] matrix, int player) {
			
			String playerSign;				
			
			//define first player
			if (player % 2 == 0)
				playerSign = "red";			
			else
				playerSign = "yellow";		
			
			System.out.print("Drop a " + playerSign + " disk at column (0–6): ");
			int column = columnInput();		// columnInput
			
			// as long as the column is full,continue input
			while (matrix[0][column] != ' ') {
				System.out.println("This column is full . Try again.");
				System.out.print("Drop a " + playerSign + " disk at column (0–6): ");
				column = columnInput();		
			}
			
			// check the first empty space and enter mark
			for (int row = matrix.length - 1; row >= 0; row--) {
				if (matrix[row][column] == ' ') {
					matrix[row][column] = Character.toUpperCase(playerSign.charAt(0));
					break;										
				}
			}
			
			return matrix;			
		}
		
		//win method
		public static boolean Win(char[][] matrix) {
			
			//if the consecutive four is in the rows
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[i].length - 3; j++) {
					if (matrix[i][j] != ' ' && matrix[i][j] == matrix[i][j + 1] && matrix[i][j] == matrix[i][j + 2] && 
							matrix[i][j] == matrix[i][j + 3])
						return true;
				}
			}
			
			// if the consecutive four is in column
			for (int j = 0; j < matrix[0].length; j++) {
				for (int i = matrix.length - 1; i >= 3; i--) {
					if (matrix[i][j] != ' ' && matrix[i][j] == matrix[i - 1][j] && matrix[i][j] == matrix[i - 2][j] && 
							matrix[i][j] == matrix[i - 3][j])
						return true;
				}
			}
			
	//if the consecutive four is in top-right to bottom-left diagonal
			for (int i = matrix.length - 1; i >= 3; i--) {
				for (int j = 0; j <= 3; j++) {
					if (matrix[i][j] != ' ' && matrix[i][j] == matrix[i - 1][j + 1] && matrix[i][j] == matrix[i - 2][j + 2] && 
							matrix[i][j] == matrix[i - 3][j + 3])
						return true;				
				}
			}
			
			// if there is consecutive four in top-left to bottom-right diagonal
			for (int i = 0; i <= 2; i++) {
				for (int j = 0; j <= 3; j++) {
					if (matrix[i][j] != ' ' && matrix[i][j] == matrix[i + 1][j + 1] && matrix[i][j] == matrix[i + 2][j + 2] && 
							matrix[i][j] == matrix[i + 3][j + 3])
						return true;				
				}
			}

			
			//if there is no win
			return false;
		}
		
		
		//isFull method
		public static boolean isFull(char[][] matrix) {
			
			int empty = 0;				
			
			for (int row = 0; row < matrix.length; row++) {
				for (int column = 0; column < matrix[row].length; column++) {
					if (matrix[row][column] == ' ')
						empty++; // count empty space in the matrix
				}
			}
			
			//if there is no empty space it is full
			if (empty == 0)
				return true;			
			else
				return false;			
			
		}

		
		public static int columnInput() {
			
			java.util.Scanner input = new java.util.Scanner(System.in);	
		
			while(true) {					
				try{
					int column = input.nextInt();		
					
					if (column < 0 || column > 6)		
						throw new InputMismatchException();
					
					return column;						
					
				} catch(InputMismatchException ex) {	
					System.out.print("Error! Wrong input. Try again: ");
					input.nextLine();
				}}
			
			}
		
	}


