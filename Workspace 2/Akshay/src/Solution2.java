
public class Solution2 {
    static int summation(int[] numbers) {
int a=numbers.length;
int result=0;
int i=0;
for(i=0;i<a;i++)
{
	result=numbers[i]+result;
}

return result;


    }
    public static void main(String args[])
    {
    	int[] arr={1,2,3,4,5};
    	Solution2 s=new Solution2();
    	int total=0;
    	total=s.summation(arr);
    	System.out.println(total);
    }
}
