class Solution 
{
    public boolean rotateString(String s, String goal) 
    {
        String doubledS=s+s;
        if(s.length()==goal.length())
        {
            if(doubledS.contains(goal))
                return true;
        }
        return false;
    }
}