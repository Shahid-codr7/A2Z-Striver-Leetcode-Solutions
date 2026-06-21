class Solution 
{
    public String largestOddNumber(String num) 
    {
        int i,l=num.length(),ind=-1;
        char ch;
        for(i=l-1;i>=0;i--)
        {
            ch=num.charAt(i);
            if(ch!=' ' && Character.isDigit(ch))
            {
                if(Character.getNumericValue(ch)%2!=0)
                {
                    ind=i;
                    break;
                }
            }
        } 

        return (ind==-1)? "" : num.substring(0,ind+1);
    }
}