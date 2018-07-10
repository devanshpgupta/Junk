
public class SignificantInversion {
static int[] numbers={5,2,4,1,6,3};
static int[] num1=new int[3];
static int[] num2=new int[3];
static int[] arr=new int[6];
static int[] temp1=new int[3];
int noi=0;
void divide(int[] numbers)
{
	int i,j=0;
	for(i=0;i<6;i++)
		if(i<3)
			num1[i]=numbers[i];
		else
			{
			num2[j]=numbers[i];
			j++;
			}
	System.out.println("Values in num1:");
	for(i=0;i<num1.length;i++)
		System.out.print(num1[i]+"  ");
	System.out.println();
	System.out.println("Values in num2:");
	for(i=0;i<num2.length;i++)
		System.out.print(num2[i]+"  ");
	
}

void sort(int[] num)
{
	int count=0;
	int i,j;
	int temp=0;
	for(i=0;i<num.length;i++)
		for(j=i+1;j<num.length;j++)
			if(num[i]>num[j])
			{			
				temp=num[i];
				num[i]=num[j];
				num[j]=temp;
			}
	
	System.out.println();
	System.out.println("Sorted Values:");
	for(i=0;i<num.length;i++)
		System.out.print(num[i]+"  ");
	
	}
	


void multi(int[] num1,int[] num2)
{
	int i, j;
	for(i=0;i<num2.length;i++)
		num2[i]=num2[i]*2;
	System.out.println();
	System.out.println("Values in num2 * 2:");
	for(i=0;i<num2.length;i++)
		System.out.print(num2[i]+"  ");
	
}

void process()
{
	int i,j;
	int count=0;
	int temp=0;
	
	for(i=0;i<num1.length;i++)
		for(j=temp;j<num2.length;j++)
		{
		//Checking Whether number in num2 is Twice less then num1
			if(num2[temp]<=2*num1[i])
			{
				temp1[j]=count;
				arr[count]=num2[temp];
				count++;
				temp++;	
				noi++;
				
			}
			else
			{
				arr[count]=num1[i];
				count++;
				j=2;		
			}
			
		}

	for(i=temp;i!=num2.length;i++)
	{	
	arr[count]=num2[i];
	temp1[i]=count;
	count++;
	}
	
	System.out.println();
	System.out.println("Values in array:");
	for(i=0;i<num1.length+num2.length;i++)
		System.out.print(arr[i]+"  ");
	
	System.out.println();
	System.out.print("Number of Inversions are " +noi);
	
	
	/*
	System.out.println();
	System.out.println("Values in temp1:");
	for(i=0;i<3;i++)
		System.out.print(temp1[i]+"  ");
	*/
}

void div()
{
	int i,j;
	int count=0;
	for(i=0;i<6;i++)
	{
		if(temp1[count]==i)
		{	
			count++;
			arr[i]=arr[i]/2;	
		}
	}
	
/*
 	System.out.println();
	System.out.println("Values are :");
	for(i=0;i<num1.length+num2.length;i++)
	System.out.print(arr[i]+ "  "); 	
*/
	
}

public static void main(String args[])
{
	SignificantInversion sig=new SignificantInversion();
	sig.divide(numbers);
	sig.sort(num1);
	sig.sort(num2);
	sig.multi(num1,num2);
	sig.process();
	sig.div();
	sig.sort(arr);
	
}
	
	
	
	
}
