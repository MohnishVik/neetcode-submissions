class Solution 
{
    List<List<String>> ans =new ArrayList<>();
    public List<List<String>> solveNQueens(int n) 
    {
        char[][]board=new char[n][n];
        for(char[] row:board)
        {
            Arrays.fill(row,'.');
        }
        backtrack(board,0);
        return ans;   
    }
    public void backtrack(char[][]board,int row)
    {
        if(row==board.length)
        {
            List<String> temp=new ArrayList<>();
            for(char[] r:board)
            {
                temp.add(new String(r));
            }
            ans.add(temp);
            return;
        }
        for(int col=0;col<board.length;col++)
        {
            if(isSafe(board,row,col))
            {
                board[row][col]='Q';
                backtrack(board,row+1);
                board[row][col]='.';
            }
        }

    }
    public boolean isSafe(char[][]board,int row,int col)
    {
        for(int i=0;i<row;i++)//check column
        {
            if(board[i][col]=='Q')
            {
                return false;
            }
        }
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--)//upper left diagonal
        {
            if(board[i][j]=='Q') return false;
        }
        for(int i=row-1,j=col+1;i>=0&&j<board.length;i--,j++)//upper right diagonal
        {
            if(board[i][j]=='Q') return false;
        }
        return true;
    }
}
