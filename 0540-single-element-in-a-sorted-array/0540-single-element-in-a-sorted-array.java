class Solution 
{
    public int singleNonDuplicate(int[] nums) 
    {
        int n=nums.length;

        
        if(n==0) return -1;
        if(n==1) return nums[0];
        if(nums[n-1]!=nums[n-2]) return nums[n-1];
        if(nums[0]!=nums[1]) return nums[0];

        int left=1,right=n-2,mid;
        while(left<=right)
        {
            mid=left+(right-left)/2;
            if(nums[mid]!=nums[mid+1] && nums[mid]!=nums[mid-1])
                return nums[mid];

            else if((mid%2==0 && nums[mid]==nums[mid+1]) || (mid%2!=0 && nums[mid]==nums[mid-1]))
                // Target is on the right side
                left=mid+1;

            else
                // Target is on the left side
                right=mid-1;
            
        }

        return -1;
    }
}