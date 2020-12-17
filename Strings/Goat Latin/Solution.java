class Solution {
    public String toGoatLatin(String S) {
        
        String[] words = S.split(" ");
        
        StringBuilder formattedWords = new StringBuilder();
        
        for(int i = 0; i < words.length; i++)
        {
            StringBuilder formattedWord = new StringBuilder(words[i]);
            
            char letter = words[i].charAt(0);
            
                if( letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' ||
                   letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U')
                {
                    formattedWord.append("ma");
                    
                    for(int j = 0; j <= i; j++)
                        formattedWord.append("a");
                }
                else
                {
                    formattedWord.append(formattedWord.charAt(0));
                    formattedWord.deleteCharAt(0);
                    
                    formattedWord.append("ma");
                    
                    for(int j = 0; j <= i; j++)
                        formattedWord.append("a");
                }
            
            
            formattedWords.append(formattedWord.toString());
            formattedWords.append(" ");
        }
        
        formattedWords.deleteCharAt(formattedWords.length() - 1);
        
        return formattedWords.toString();
        
    }
}
