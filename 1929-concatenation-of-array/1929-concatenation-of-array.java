class Solution 
{
    public int[] getConcatenation(int[] nums) 
    {
        int i,l=nums.length,c=0;
        int arr[] = new int[l*2];
        for(i=0;i<l;i++)
        {
            arr[c++]=nums[i];
        }

        for(i=0;i<l;i++)
        {
            arr[c++]=nums[i];
        }
        return arr;
    }
}