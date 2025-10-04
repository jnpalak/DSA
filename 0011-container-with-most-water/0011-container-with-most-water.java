class Solution {
    public int maxArea(int[] arr)
     {
        int n=arr.length;
        int i=0;
        int j=n-1;
        int areamax=0;
        while(i<j)
        {
            int width=j-i;
            int height=Math.min(arr[i],arr[j]);
            int area=width*height;
            areamax=Math.max(area,areamax);
            if(arr[i]>arr[j])j--;
            else i++;
        }
        
        return areamax;
        
    }
}