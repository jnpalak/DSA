class Solution {
    public void duplicateZeros(int[] arr) {
        int zeroes = 0;
        for (int n : arr) {
            if (n == 0) zeroes++;
        }
        int i = arr.length - 1;
        int j = arr.length + zeroes - 1;
        while (i<j) 
        {
            if (j<arr.length) {
                arr[j] = arr[i];
            }
            if (arr[i] == 0)
             {
                j--;
                if (j<arr.length) {
                    arr[j] = 0;
                }
            }
            i--;
            j--;
        }
    }
}
