class Solution {
    public int numRookCaptures(char[][] board) {
        int capturedPawns = 0;
        
        int rookY = -1;
        int rookX = -1;
        
        rookFound:
        for(int i = 0; i < 8; i++)
            for(int j = 0; j < 8; j++)
                if(board[i][j] == 'R')
                {
                    rookX = i;
                    rookY = j;
                    break rookFound;
                }
        
        for(int i = rookX-1; i > -1; i--)
            if(board[i][rookY] == 'B')
                break;
            else if(board[i][rookY] == 'p')
            {
                capturedPawns++;
                break;
            }
        
        for(int i = rookX+1; i < 8; i++)
            if(board[i][rookY] == 'B')
                break;
            else if(board[i][rookY] == 'p')
            {
                capturedPawns++;
                break;
            }
        
        for(int i = rookY-1; i > -1; i--)
            if(board[rookX][i] == 'B')
                break;
            else if(board[rookX][i] == 'p')
            {
                capturedPawns++;
                break;
            }
        
        for(int i = rookY+1; i < 8; i++)
            if(board[rookX][i] == 'B')
                break;
            else if(board[rookX][i] == 'p')
            {
                capturedPawns++;
                break;
            }
        
        return capturedPawns;
    }
    
    
}
