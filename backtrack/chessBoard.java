public class chessBoard {
    public static boolean isSafe(int board[][],int n,int col)
    {
        //vertical up
        for(int i=0;i<n;i++)
        {
            if(board[i][col]==1)
            {
                return false;
            }
        }
        //left diagonal
        for(int i=n,j=col;i>=0 && j>=0;i--,j--)
        {
            if(board[i][j]==1)
            {
                return false;
            }
        }
        //right diagonal
        for(int i=n,j=col;j<board.length && i>=0;i--,j++)
        {
            if(board[i][j]==1)
            {
                return false;
            }
        }
        return true;
    }

    public static void nqueens(int board[][],int n)
    {
        
        if (board.length==n)
        {
            System.out.println("-------------------CHESS BOARD-------------------");
            prinboard(board, n);
            return;
        }
        for(int i=0;i<board.length;i++)
        {
            
            if(isSafe(board, n, i))
             {
                board[n][i]=1;
                nqueens(board, n+1);
                board[n][i]=0;
             }
            
        }
    }
    public static void prinboard(int board[][],int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        

    }


    public static void main(String[] args) {
        int n=5;
        int board[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                board[i][j]=0;
            }
        }
        nqueens(board, 0);
    }
    
}
