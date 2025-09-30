class Solution {
    public String removeStars(String s) 
    {
        char arr[]= new char[s.length()];
        int j=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch!='*')
            {
                arr[j]=ch;
                j++;
            }
            else j--;
        }
        StringBuilder build= new StringBuilder();
        for(int i=0;i<j;i++)
        {
          build.append(arr[i]);
        }
        return build.toString();
    }
}