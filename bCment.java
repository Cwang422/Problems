class Solution
{
    public int bitwiseComplement(int N) 
    {
        String NBinary = Integer.toBinaryString(N);
        String comp = "";
        for(int i = 0; i < NBinary.length();i++)
        {
            comp = comp + ((NBinary.charAt(i) == '1') ? "0" : "1");
        }
        
        return Integer.parseInt(comp, 2);  
    }

    
}
