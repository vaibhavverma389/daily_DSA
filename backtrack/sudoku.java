public class sudoku {
    public static boolean issafe(int board[][],int row,int col,int digit)
    {
        //column
        for(int i=0;i<board.length;i++)
        {
            if(board[i][col]==digit)
            {
                return false;
            }
        }
        //row
        for(int j=0;j<board.length;j++)
        {
            if(board[row][j]==digit)
            {
                return false;
            }
        }
        //3x3 grid
        int sr=row - row%3;
        int sc=col - col%3;
        for(int i=sr;i<sr+3;i++)
        {
            for(int j=sc;j<sc+3;j++)
            {
                if(board[i][j]==digit)
                {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean sudokusolver(int board[][],int row,int col)
    {
        
        if(row==board.length && col==0)
        {
            return true;
        }
    
        if(col==board.length)
        {
            return sudokusolver(board, row+1, 0);
        }
        
        if(board[row][col]!=0)
        {
            return sudokusolver(board, row, col+1);
        }
        for(int digit=1;digit<=9;digit++)
        {
            if(issafe(board, row, col, digit))
            {
                board[row][col]=digit;
                if(sudokusolver(board, row, col+1))
                {
                    return true;
                }
                board[row][col]=0; 
            }
        }
        return false;
    }




    public static void main(String[] args) {
        int board[][]={
            {5,3,0,0,7,0,0,0,0},
            {6,0,0,1,9,5,0,0,0},
            {0,9,8,0,0,0,0,6,0},
            {8,0,0,0,6,0,0,0,3},
            {4,0,0,8,0,3,0,0,1},
            {7,0,0,0,2,0,0,0,6},
            {0,6,0,0,0,0,2,8,0},
            {0,0,0,4,1,9,0,0,5},
            {0,0,0,0,8,0,0,7,9}
        };
        if(sudokusolver(board, 0, 0))
        {
            for(int i=0;i<board.length;i++)
            {
                for(int j=0;j<board.length;j++)
                {
                    System.out.print(board[i][j]+" ");
                }
                System.out.println();
            }
        }
        else
        {
            System.out.println("Cannot be solved");
        }
    }
    
}
