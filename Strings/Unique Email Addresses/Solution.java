class Solution {
    public int numUniqueEmails(String[] emails) {
        
        HashSet set = new HashSet();
        
        
        for(String email : emails)
        {
            StringBuilder formattedEmail = new StringBuilder();
            
            int i = 0;
            
            while(email.charAt(i) != '@')
            {
                if(email.charAt(i) == '+')
                {
                    while(email.charAt(i) != '@')
                        i++;
                    
                    break;
                }
                else if(email.charAt(i) == '.')
                {
                    i++;
                    continue;
                }
                else
                {
                    formattedEmail.append(email.charAt(i));
                    i++;
                }
            }
            
            formattedEmail.append(email.substring(i));
            
            set.add(formattedEmail.toString());
            
        }
        
        return set.size();
        
    }
}
