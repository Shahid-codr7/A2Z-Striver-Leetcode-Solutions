class Solution 
{
    public String longestCommonPrefix(String[] strs) 
    {
        Arrays.sort(strs);
        int i=0,l=strs.length;
        String first=strs[0];
        String last=strs[l-1];
        String ans="";

        for(i=0; i<Math.min(first.length(),last.length()); i++)
        {
            if(first.charAt(i)!=last.charAt(i))
                return ans;

            else
                ans+=first.charAt(i);
        }

        return ans;
    }
}