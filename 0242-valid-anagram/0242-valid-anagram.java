class Solution 
{
    public boolean isAnagram(String s, String t) 
    {
        if(s.length()!=t.length()) return false;

        int a[]=new int[26];
        int b[]=new int[26];

        s=s.toLowerCase();
        t=t.toLowerCase();

        int i,l=s.length();
        for(i=0;i<l;i++)
            a[s.charAt(i)-97]++;
        
        for(i=0;i<l;i++)
            b[t.charAt(i)-97]++;
        
        for(i=0;i<26;i++)
        {
            if(a[i]!=b[i])
                return false;
        }  

        return true;

    }

}