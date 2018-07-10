public class SchedulingProblem {
int[] a={10,5,7};
int[] b={8,4,6};
int[] c={12,6,8};
int[] bpr=new int[3];
char[] order=new char[3];
int[][] sbr=new int[3][3];
int[] time=new int[10];
int[] max=new int[3];
SchedulingProblemNode[] n=new SchedulingProblemNode[3];
TriAthalon tri=new TriAthalon();
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

static int count=1;
int cal(int temp,int counter)
{
	if(temp==2 && counter==1)
	{
		--temp;
		return(temp);
	}
	else
		if(temp==2 && counter==0){
			count=3;
			return 2;
		}
			else
		return 0;
	
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
			System.out.println();
			System.out.println("For A");
			n[i].Node();
		}
		else
			if(bpr[i]==b[1]+b[2])
			{
				n[i]=new SchedulingProblemNode();
				n[i].temp=b;
				System.out.println();
				System.out.println("For B");
				n[i].Node();
			}
			else
				if(bpr[i]==c[1]+c[2])
				{
					n[i]=new SchedulingProblemNode();
					n[i].temp=c;
					System.out.println();
					System.out.println("For C");
					n[i].Node();
				}	
		System.out.println();
	}	
}
void Computation()
{
	int i,j,k=0,l=0,m;
	int temp = 0,temp1=0;
	int val1=0,val2=0,val3=0;
	tri.swimdone=0;
	tri.bikedone=0;
	tri.rundone=0;
	for(j=0;j<3;j++)
		{
			
			tri.swim[j]=n[j].temp[0];
			tri.bike[j]=n[j].temp[1];
			tri.run[j]=n[j].temp[2];
		}
		
/*	System.out.print("Values in swim,bike and run");	
	for(i=0;i<3;i++){
	System.out.println();
	System.out.print(" "+tri.swim[i]+ "  " +tri.bike[i]+ "  " +tri.run[i]);
	} */
	
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			if(i==0)
			tri.mat[j][i]=tri.swim[j];
			else
				if(i==1)
					tri.mat[j][i]=tri.bike[j];
					else
						if(i==2)
							tri.mat[j][i]=tri.run[j];
							
			
		}		
	}
	
/*	System.out.print("Vale in swim:");
	for(i=0;i<3;i++)
		System.out.println("  "+tri.mat[i][0]);
	
	System.out.print("Vale in Bike:");
	for(i=0;i<3;i++)
		System.out.println("  "+tri.mat[i][1]);
	
	System.out.print("Vale in run:");
	for(i=0;i<3;i++)
		System.out.println("  "+tri.mat[i][2]);*/

	int counter=0;
	temp=0;
	int q=0,r=0,s=0;
	for(i=0;i<5;i++)
	{
		
		for(j=cal(temp,counter);j<count;j++)
		{
			if(j==0)
			{	
			tri.trans[i][j]=tri.mat[q][0];
			
			q++;
			temp=j;
			}
			else
				if(j==1)
				{
				tri.trans[i][j]=tri.mat[r][1];
				r++;
				temp=j;
				}
					else
						if(j==2)
						{
						tri.trans[i][j]=tri.mat[s][2];
						s++;
						temp=j;
						}
										
		}
		count++;
		counter=0;
		if(count==4)
			count=1; 
		if(i==2)
			{
			counter=1;
			count=3;
			}
	}
	
	System.out.println();
	System.out.print("Values in Trans is: ");
	for(i=0;i<6;i++){
		System.out.println();
		for(j=0;j<3;j++)
		{
			System.out.print("  "+tri.trans[i][j]);
		}
		System.out.println();
	}
	
}

void process()
{
	int i,j,k,l,m;
	int temp=0;
	int count=0;
	int counter=0;
	int q=0,r=0,s=0;
	
	for(i=0;i<5;i++)
	{
		temp=0;
		for(j=0;j<3;j++)
			if(tri.trans[i][j]>=temp)
			{
				time[i]=tri.trans[i][j];
				temp=tri.trans[i][j];
				
			}
	}
	
	for(i=0;i<5;i++)
	{
		for(j=0;j<3;j++)
		{
			if(tri.trans[i][j]!=0)
			tri.trans[i][j]=tri.trans[i][j]-time[i];
		}
		
	}
	
	
	
	
/*	System.out.print("Values in Trans is: ");
	for(i=0;i<6;i++){
		System.out.println();
		for(j=0;j<3;j++)
		{
			System.out.print("  "+tri.trans[i][j]);
		}
		System.out.println();
	}
	
	System.out.print("Value in Time:");
	for(i=0;i<6;i++)
	System.out.print("  " +time[i]);
	System.out.println();
	*/
	
	
}

void sum()
{
	int i,j,add=0;
	int temp=0;
	for(i=0;i<5;i++)
	{
		for(j=0;j<3;j++)
		{
			if(tri.trans[i][j]<0)
			temp=tri.trans[i][j]-temp;	
		}
	
	}
	System.out.println();
	for(i=0;i<5;i++)
	add=add+time[i];
	add=add+temp+1;
	System.out.println("Total time is " +add);
}

	public static void main(String[] args) {
		SchedulingProblem p=new SchedulingProblem();
		p.calorder();
		p.DecreasingOrder();
		p.Computation();
		p.process();
		p.sum();
	}

}
