class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        
        String[] wordsA = A.split(" ");
        String[] wordsB = B.split(" ");
        
        // change to hashmap
        //Set<String> wordOccurA = new HashSet<>(Arrays.asList(wordsA));
        
        Map<String, Integer> wordOccurA = new HashMap<>();
        
        for(String word : wordsA)
            wordOccurA.put(word, wordOccurA.getOrDefault(word,0)+1);
        
        Map<String, Integer> wordOccurB = new HashMap<>();
        
        for(String word : wordsB)
            wordOccurB.put(word, wordOccurB.getOrDefault(word,0)+1);
        
        List<String> toRet = new ArrayList<>();
        
        //check if more than one
        for(String word : wordsA)
            if(!wordOccurB.containsKey(word) && wordOccurA.get(word) == 1)
                toRet.add(word);
        
        for(String word : wordsB)
            if(!wordOccurA.containsKey(word) && wordOccurB.get(word) == 1)
                toRet.add(word);
        
        return toRet.toArray(String[]::new);
        
    }
}