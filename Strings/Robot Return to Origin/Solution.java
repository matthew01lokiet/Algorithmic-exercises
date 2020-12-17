class Solution {
    public boolean judgeCircle(String moves) {
        
        int x = 0;
        int y = 0;
        
        for(char cha : moves.toCharArray())
        {
            if(cha == 'R')
                x++;
            else if(cha == 'L')
                x--;
            else if(cha == 'U')
                y++;
            else 
                y--;
        }
        
        if(x == 0 && y == 0)
            return true;
        else
            return false;
        
    }
}
