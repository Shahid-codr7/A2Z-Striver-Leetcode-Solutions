class Solution 
{
    public int maxDepth(String s) 
    {
        int i=0,c=0,max=0,l=s.length();
        char ch;
        for(i=0;i<l;i++)
        {
            max = (c>max)? c:max;
            ch=s.charAt(i);
            if(ch=='(')
                c++;
            else if(ch==')')
                c--;
        }
        return max;
    }
}