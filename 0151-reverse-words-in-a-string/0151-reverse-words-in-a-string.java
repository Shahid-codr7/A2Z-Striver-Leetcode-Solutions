class Solution 
{
    public String reverseWords(String s) 
    {
        s=s.trim();
        s=s+" ";
        int i, l=s.length(), flg=0;
        String word="", sent="";
        char ch;

        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(ch!=' ')
            {
                word=word+ch;
                flg=0;
            }
            else if(flg==0) // ch=' ' & flg=0
            {
                sent=word+" "+sent;
                word="";
                flg=1;
            } 
        }
        return sent.trim();
    }
}