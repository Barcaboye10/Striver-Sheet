import java.util.*;
class Solution 
{
    public static List<List<Integer>> generate(int numRows) 
    {
        List<List<Integer>> pascal = new ArrayList<>();
        List<Integer> a = Arrays.asList(1); // ignore the spread operator; VS Code added it
        pascal.add(a);
        for(int i=1;i<numRows;i++)
        {
            List<Integer> newRow=new ArrayList<Integer>();
            newRow.add(1);
            List<Integer> prevRow=pascal.get(i-1);
            for(int j=1;j<=i;j++)
            {
                if(j==i)
                    newRow.add(1);
                else
                    newRow.add(prevRow.get(j-1)+prevRow.get(j));
            }
            pascal.add(newRow);
        }
        return pascal;
    }
}