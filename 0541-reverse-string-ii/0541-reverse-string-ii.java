public class Solution {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        int n = arr.length;

        for (int i=0; i<n ; i+= 2 * k)
         {
            int a = i;
            int j = Math.min(i+k-1,n-1); 
            while (a<j)
            {
                char temp = arr[a];
                arr[a] = arr[j];
                arr[j] = temp;
                a++;
                j--;
            }
        }
        return new String(arr);
    }
}
