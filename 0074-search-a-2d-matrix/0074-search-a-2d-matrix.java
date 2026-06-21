class Solution 
{
    public boolean searchMatrix(int[][] matrix, int target) 
    {
        int n=matrix.length;
        int m=matrix[0].length;
        int left=0, right=(n*m)-1, mid;

        while(left<=right)
        {
            mid=left+(right-left)/2;
            if(matrix[mid/m][mid%m] == target)
                return true;

            else if(matrix[mid/m][mid%m] > target)
                right=mid-1;

            else
                left=mid+1;
        }

        return false;
    }
}