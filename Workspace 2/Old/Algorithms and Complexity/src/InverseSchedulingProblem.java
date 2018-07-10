
public class InverseSchedulingProblem {
	int[] a={10,5,7};
int[] b={8,4,6};
int[] c={12,6,8};
int[] bpr=new int[3];
char[] order=new char[3];
int[][] sbr=new int[3][3];
int[] time=new int[3];
int[] max=new int[3];
SchedulingProblemNode[] n=new SchedulingProblemNode[3];

void calorder()
{	
	int i;
	bpr[0]=a[1]+a[2];
	bpr[1]=b[1]+b[2];
	bpr[2]=c[1]+c[2];
	System.out.print("Values stores in bpr:");
	for(i=0;i<3;i++)
	System.out.print("  " +bpr[i]);
	System.out.println();
}

void DecreasingOrder()
{
	int i,j,temp=0;
	for(i=0;i<3;i++)
	for(j=i+1;j<3;j++)
		if(bpr[i]<bpr[j])
		{
			temp=bpr[i];
			bpr[i]=bpr[j];
			bpr[j]=temp;
		}
	System.out.print("Decreasing Order:");
	for(i=0;i<3;i++)
		System.out.print("  " +bpr[i]);
	System.out.println();
	
	for(i=0;i<3;i++)
	{
		if(bpr[i]==a[1]+a[2])
		{
			n[i]=new SchedulingProblemNode();
			n[i].temp=a;
			n[i].Node();
		}
		else
			if(bpr[i]==b[1]+b[2])
			{
				n[i]=new SchedulingProblemNode();
				n[i].temp=b;
				n[i].Node();
			}
			else
				if(bpr[i]==c[1]+c[2])
				{
					n[i]=new SchedulingProblemNode();
					n[i].temp=c;
					n[i].Node();
				}			
	}	
	System.out.println();
}
void Computation()
{
	int i,j,k,l=0,m,count;
	int temp=n[0].temp[0];
	System.out.println("Value in Temp Is " +temp);
	for(i=0;i<3;i++)
	{
		count=0;
		k=0;
		temp=n[i].temp[0];
		for(j=i;count<3;j++)
		{
			if(temp<=n[j].temp[k])
			{
				time[l]=temp;
				temp=n[j].temp[k];
			}
			
			k++;
			if(count==1 && i==1)
				j=0;
				
			else
				if(count==0 && i==2)
					j=0;
			count++;
		}
		l++;
		
	}
		
	System.out.print("Value in Time:");
	for(i=0;i<3;i++)
	System.out.print("  " +time[i]);
	System.out.println();
}

void sum()
{
	int i,add=0;
	
	for(i=0;i<3;i++)
	add=add+time[i];
	System.out.println("Total Is " +add);
}

	public static void main(String[] args) {
		SchedulingProblem p=new SchedulingProblem();
		p.calorder();
		p.DecreasingOrder();
		p.Computation();
		p.sum();
	}
}
