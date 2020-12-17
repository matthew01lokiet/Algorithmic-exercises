class Solution {
    public String reformatDate(String date) {
        
        HashMap<String,String> months = new HashMap<String,String>();
        
        months.put("Jan", "01");
        months.put("Feb", "02");
        months.put("Mar", "03");
        months.put("Apr", "04");
        months.put("May", "05");
        months.put("Jun", "06");
        months.put("Jul", "07");
        months.put("Aug", "08");
        months.put("Sep", "09");
        months.put("Oct", "10");
        months.put("Nov", "11");
        months.put("Dec", "12");
        
        String[] parts = date.split(" ");
        
        StringBuilder formattedDate = new StringBuilder();
        
        formattedDate.append(date.substring(date.length()-4));
        formattedDate.append("-");
        
        formattedDate.append(months.get(parts[1]));
        formattedDate.append("-");
        
        StringBuilder day = new StringBuilder();
        
        for(char numb : parts[0].toCharArray())
        {
            if((int)numb > 57 || (int)numb < 48)
                break;
            else
                day.append(numb);
        }
        
        if(day.length() == 1)
            day.insert(0,'0');
        
       formattedDate.append(day.toString()); 
        
        return formattedDate.toString();
    }
}
