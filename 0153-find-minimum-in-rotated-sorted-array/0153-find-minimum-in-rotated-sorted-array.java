class Solution 
{
    public int findMin(int[] nums) 
    {
        int n=nums.length;
        if(n==1) return nums[0];
        if(n==2) return (nums[0]<nums[1])? nums[0]:nums[1];

        int i,left=0,right=n-1,mid,min=nums[0];
        while(left<=right)
        {
            mid=left+(right-left)/2;

            // For sorted subarray
            if(nums[left]<=nums[mid])
            {
                min=Math.min(nums[left],min);
                left=mid+1;
            }

            else if(nums[mid]<=nums[right])
            {
                min=Math.min(nums[mid],min);
                right=mid-1;
            }
        }

        return min;
    }
}