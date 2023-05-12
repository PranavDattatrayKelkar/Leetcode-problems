package Medium;

public class SurroundRegions {

    public static int solveSurroundRegions(char[][] board)
    {
        if(board == null || board.length == 0)
        {
            return 0;
        }
        int nr = board.length;
        int nl = board[0].length;
        int num_islands = 0;
        for(int r = 0; r < nr; r++)
        {
            for(int l = 0; l < nl; l++)
            {
                if(board[r][l] == 'O')
                {
                    ++num_islands;
                    boardCheck(board, r, l);
                }

            }
        }
        return num_islands;

    }

    public static void boardCheck(char[][] board, int r, int l)
    {
        int nr = board.length;
        int nl = board[0].length;
        if(r < 0 || l < 0 || r >= nr || l >= nl || board[r][l] == 'X')
        {
            return;
        }
        board[r][l] = 'X';
        boardCheck(board, r-1, l);
        boardCheck(board, r+1, l);
        boardCheck(board, r, l-1);
        boardCheck(board, r, l+1);
    }
}
