class Solution {
    public List<String> commonChars(String[] A) {
        
        ArrayList<Character> charList = new ArrayList();
        StringBuilder[] strTab = new StringBuilder[A.length-1];
        
        for(int i = 1; i < A.length; i++)
        {
            strTab[i-1] = new StringBuilder(A[i]);
        }
        
        
        for(int i = 0; i < A[0].length(); i++)
            charList.add(A[0].charAt(i));
        
        for(int i = 0; i < charList.size(); i++)
        {
            for(int j = 0; j < A.length-1; j++)
            {
                if(strTab[j].toString().contains(String.valueOf(charList.get(i))))
                {
                    strTab[j].deleteCharAt(strTab[j].indexOf(charList.get(i).toString()));
                }
                else
                {
                    charList.remove(i);
                    i--;
                    break;
                }
            }
        }
        
        ArrayList<String> retArr = new ArrayList();
        
        for(Character character : charList)
            retArr.add(character.toString());
        
        
        return retArr;
        
        
    }
}
