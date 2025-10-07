public class Solution
 {
    boolean checkFreq(String s)
    {
        int[] freq = new int[26];
        for (char ch : s.toCharArray()) 
        {
            freq[ch - 'a']++;
            if (freq[ch -'a']>1) 
            {
                return true; 
            }
        }
        return false;
    }

    public boolean buddyStrings(String s, String goal)
     {
        if (s.length() != goal.length())
            return false;

        if (s.equals(goal)) {
            return checkFreq(s);
        }
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                indices.add(i);
            }
        }
        if (indices.size() != 2)
            return false;

        int first = indices.get(0);
        int second = indices.get(1);

        char[] chars = s.toCharArray();
        char temp = chars[first];
        chars[first] = chars[second];
        chars[second] = temp;
        return new String(chars).equals(goal);
    }
}
