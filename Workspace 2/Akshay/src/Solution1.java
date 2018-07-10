/*
 * Complete the function below.
 */
public class Solution1{
    static void StairCase(int n) {
int i=0,j=0;
     
        for(i=n;i>=1;i--)
        {
            for(j=1;j<=6;j++)
                {
                if(j>=i)
                System.out.print("#");
                    else
                    System.out.print(" ");
            }
            System.out.println("");
            }

    }
    public static void main(String args[])
    {
    	Solution1 s=new Solution1();
    	s.StairCase(6);
    }
}