package Project_4;

import java.util.Random;
import java.util.Scanner;

public class BattleShip {

    public static void main(String[] args) {
        int[][] board = new int[5][5];
        int[][] ships = new int[3][2];
        int[] shoot = new int[2];
        int attempts=0,
            shipHit=0;
        
        startBoard(board);
        startShips(ships);
        
        System.out.println();
        
        /*the loop will iterate as long as all three ships are hit
         * the attempt counter increments with each user's try
         *the counter shotHit will increment each time the ship is hit
         */
        do{
            showBoard(board);
            shoot(shoot);
            attempts++;
            
            if(hit(shoot,ships)){
                hint(shoot,ships,attempts);
                shipHit++;
            }                
            else
                hint(shoot,ships,attempts);
            
            printNewBoard(shoot,ships,board);
            

        }while(shipHit!=3);
        
        System.out.println("\n\n\nGame is over! You hit 3 ships in "+attempts+" attempts");
        showBoard(board);
    }
    
   //startBoard method
    public static void startBoard(int[][] board){
    	
    	//create a 5x5 matrix, starting from 1
        for(int row=0 ; row < 5 ; row++ )
            for(int column=0 ; column < 5 ; column++ )
                board[row][column]=-1;
    }
    
    //showBoard method
    public static void showBoard(int[][] board){
       
    	//print the shape of a board,inserting "~" for empty space,"*" for missed guess and "X" for hit ship
        for(int row=0 ; row < 5 ; row++ ){
            System.out.print((row+1)+"");
            for(int column=0 ; column < 5 ; column++ ){
                if(board[row][column]==-1){
                    System.out.print("\t"+"~");
                }else if(board[row][column]==0){
                    System.out.print("\t"+"*");
                }else if(board[row][column]==1){
                    System.out.print("\t"+"X");
                }
                
            }
            System.out.println();
        }

    }

    //startShips method
    public static void startShips(int[][] ships){
       
    	Random random = new Random();
    	
    	
        //generate random space for ships to be placed in the board
        for(int ship=0 ; ship < 3 ; ship++){
            ships[ship][0]=random.nextInt(5);
            ships[ship][1]=random.nextInt(5);
            
            //let's check if that shot was already tried 
            //if it was, just finish the do...while when a new pair was randomly selected
            for(int last=0 ; last < ship ; last++){
                if( (ships[ship][0] == ships[last][0])&&(ships[ship][1] == ships[last][1]) )
                    do{
                        ships[ship][0]=random.nextInt(5);
                        ships[ship][1]=random.nextInt(5);
                    }while( (ships[ship][0] == ships[last][0])&&(ships[ship][1] == ships[last][1]) );
            }
            
        }
    }

    //shotMethod
    public static void shoot(int[] shoot){
    	
        Scanner input = new Scanner(System.in);
        
        //user input; the rows and columns are decremented immediately after the shoot
        System.out.print("Row: ");
        shoot[0] = input.nextInt();
        shoot[0]--;
        
        System.out.print("Column: ");
        shoot[1] = input.nextInt();
        shoot[1]--;
        
    }
    
    //hit method
    public static boolean hit(int[] shoot, int[][] ships){
        
    	//if the ship is hit print the location of a ship
        for(int ship=0 ; ship<ships.length ; ship++){
            if( shoot[0]==ships[ship][0] && shoot[1]==ships[ship][1]){
                System.out.printf("You hit a ship located in (%d,%d)\n",shoot[0]+1,shoot[1]+1);
                return true;
            }
        }
        return false;
    }

    //hint method
    public static void hint(int[] shoot, int[][] ships, int attempt){
       
    	
    	/*the method gives the hint to user 
    	 * if there is a ship in entered row or column, prints how many ships is in row or column
    	 */
    	int row=0,
            column=0;
        
        for(int line=0 ; line < ships.length ; line++){
            if(ships[line][0]==shoot[0])
                row++;
            if(ships[line][1]==shoot[1])
                column++;
        }
        
        System.out.printf("\nHint %d: \nRow %d -> %d ships\n" +
                                 "Column %d -> %d ships\n",attempt,shoot[0]+1,row,shoot[1]+1,column);
    }

    //printNewBoard method
    public static void printNewBoard(int[] shoot, int[][] ships, int[][] board){
    	
        if(hit(shoot,ships))
            board[shoot[0]][shoot[1]]=1;
        else
            board[shoot[0]][shoot[1]]=0;
    }
}

