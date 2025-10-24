class Solution {
    public int numJewelsInStones(String jewels, String stones) 
    {
        Set<Character> jewel = new HashSet<>();
       for (int i=0;i<jewels.length();i++)
       {
           jewel.add(jewels.charAt(i));
       }
       int count = 0;
       for (int i=0;i<stones.length();i++)
       {
        if (jewel.contains(stones.charAt(i))) count++;
       }
      return count;
        
    }
}