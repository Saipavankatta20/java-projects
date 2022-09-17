import java.util.Scanner;
public class Tic 
{
    static Scanner scan=new Scanner(System.in);
    public static void main(String[]args)
    {
        System.out.println(" Lets play tic tac toe ");
        
        
        char [][] board={{ '_','_','_'},{'_','_','_'},{'_','_','_'}};
        printBoard(board);
        System.out.println(" ");
        for(int i=0;i<=8;i++)
        {
            if(i%2==0)
            {
                System.out.println("\nTurn : X");
                int[]spot=askUser(board);
                board[spot[0]][spot[1]]='X';
                
            }
            else
            {
                System.out.println("\n Turn : O");
               int[]spot= askUser(board);
               board[spot[0]][spot[1]]='O';
            }
            printBoard(board);
            int count=checkWin(board);
            if(count==3){
                System.out.println("\n X WINS n ");
                break;
            }
            else if(count==-3){
                System.out.println("\n O WINS");
                break;

            }
            else if(i==8)
            {
                System.out.println("\n ITS A TIE");

            }

        }

    }
    public static void printBoard(char[][] board)
    {
       
        for(int i=0;i<board.length;i++)
        {
            System.out.print(" \n ");
            for(int j=0;j<board[i].length;j++)
            {
                System.out.print("\t"+board[i][j]+" ");
                System.out.print("");
                System.out.print("");


            }
        }
    }
    public static int[] askUser(char[][]board)
    {
        System.out.print("Pick a row and a coloum number:");
        int row=scan.nextInt();
        int coloum=scan.nextInt();
        while(board[row][coloum]=='X'|| board[row][coloum]=='O')
        {
            System.out.print("Spot already taken please try again:");
            row=scan.nextInt();
            coloum=scan.nextInt();
        }
        return new int[]{row,coloum};
    }
    public static int checkWin(char[][]board)
    { 
        int count=0;
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[i].length;j++)
            {
                if(board[i][j]=='X')
                {
                    count++;
                }
                else if(board[i][j]=='O')
                {
                    count--;

                }
            }
            if(count == 3 || count == -3)
                {
                    return count;

                }
            else
                {
                    count=0;
                }
        }
        for(int i=0; i<3;i++)
        {
            for(int j =0;j<board.length;j++)
            {
                if(board[j][i]=='X')
                {
                    count++;
                }
                else if(board[j][i]=='O' )
                {
                    count--;
                }
            }
            if(count == 3 || count == -3)
                {
                    return count;

                }
            else
                {
                    count=0;
                }
        }
        for (int i=0;i<3;i++)
        {
            if(board[i][i]=='X')
            {
                count++;
            }
            else if(board[i][i]=='O')
            {
                count--;
            }
            
        }
        if(count == 3 || count == -3)
                {
                    return count;

                }
            else
                {
                    count=0;
                }
        for(int i=0;i<3;i++){
            if(board[2-i][i]=='X')
            {
                count++;
            }
            else if(board[2-i][i]=='O')
            {
                count--;
            }
        }  
           
        return count;

    }
    
}
