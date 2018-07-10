public class FordFulkersonAlgo {
	
	

	static int[][]  mat={
		{0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0},
		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0},
		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};

			node[] nod=new node[64];
	visited[] visit=new visited[20];
	int node=0;
	
	void convert()
	{
		int i,j,k=0;
		int l=0;
		for(i=0;i<mat.length;i++)
		{
			k=0;
			nod[i]=new node();
			nod[i].parent=i;
			l=0;
			for(j=0;j<mat.length;j++)
				if(mat[i][j]!=0)
				{
					nod[i].child[k]=j;
					nod[i].pvalue[k]=mat[i][j];
					nod[i].count=l+1;
			//		System.out.println("parent is "+nod[i].parent+ " child is "+nod[i].child[k] );
			//		System.out.println("Pvalue is " +nod[i].pvalue[k]);
					k++;
					l++;
				}
			System.out.println("Number of childrens of "+nod[i].parent+ " is " +nod[i].count);
		}
		System.out.println("Nos of new nodes: " +i);
		node=i;
		System.out.println("*******************************");
		System.out.println("Normal check");
		System.out.println("*******************************");
		System.out.println();
		k=0;
		for(i=0;i<node;i++)
		{
			for(j=0;j<nod[i].count;j++)
			{
					System.out.println("parent is "+nod[i].parent+ " child is "+nod[i].child[j] );
					System.out.println("Pvalue is " +nod[i].pvalue[j]);
					System.out.println();
				}
		
		}
		
		for(i=0;i<node;i++)
		{nod[7].child[i]=0;
		 nod[7].count=0;
		}
		System.out.println("*******************************");
		System.out.println("Linking Parent and child nodes");
		System.out.println("*******************************");
		System.out.println();
		k=0;
		int temp=0;
		int c=0;
		for(i=0;i<node;i++)
		{
			k=0;
			c=0;
			temp=0;
			for(j=0;j<node;j++)
			{//	System.out.println("VALUE IN NOD[I].CHILD[C] IS "+nod[i].child[c]+"AND IN NOD[K].PARENT IS" +nod[k].parent);
			
				if(nod[i].child[c]==nod[k].parent)
			{
				nod[i].n[temp]=nod[k];
//				System.out.println("parent is "+nod[i].parent+ " child is "+nod[i].n[temp].parent);
//				System.out.println("Pvalue is " +nod[i].pvalue[c]);
//				System.out.println("=====nod["+i+"].n["+temp+"].parent="+nod[i].n[temp].parent);
				c++;
				temp++;
			}
			k++;}
		}
		
		
		
		
		
// 		System.out.println("*******************************");
//		System.out.println("*******************************");
		temp=0;
		for(i=0;i<node;i++)
		{
			k=0;
			c=0;
		temp=0;
			for(j=0;j<node;j++)
			{//	System.out.println("VALUE IN NOD[I].CHILD[C] IS "+nod[i].child[c]+"AND IN NOD[K].PARENT IS" +nod[k].parent);
			
				if(nod[i].child[c]==nod[k].parent)
			{
				System.out.println("parent is "+nod[i].parent+ " child is "+nod[i].n[temp].parent);
				System.out.println("Pvalue is " +nod[i].pvalue[c]);
				System.out.println("nod["+i+"].n["+temp+"].parent="+nod[i].n[temp].parent);
			//	System.out.println("parent of nod[i].n[].parent");
				System.out.println();
				c++;
				temp++;
			}
			k++;}
		}
		}
	
	/*	k=0;
		int c=0;
		for(i=0;i<node;i++)
		{
			k=0;
			c=0;
			for(j=0;j<node;j++)
			{//	System.out.println("VALUE IN NOD[I].CHILD[C] IS "+nod[i].child[c]+"AND IN NOD[K].PARENT IS" +nod[k].parent);
			
				if(nod[i].child[c]==nod[k].parent)
			{
				nod[i].n[j]=nod[k];
			//	System.out.println("parent is "+nod[i].parent+ " child is "+nod[i].n[j].parent);
			//	System.out.println("Pvalue is " +nod[i].pvalue[c]);
				c++;
			}
			k++;}
		}*/
		
/* void count()
	{
		int i,j,k=0;
		int c=0;
		int m = 0,l=0;
		for(i=0;i<nod[k].count;i++)
		{
			k=0;
			visit[i]=new visited();
			visit[i].pvalue=0;
			if(i==nod[k].count)
				c=2;
		for(j=0;nod[j].child[0]!=0;j++)
			{
			if(nod[j].pvalue[c]<visit[i].pvalue || visit[i].pvalue==0)
			visit[i].pvalue=nod[j].pvalue[c];//visit[i].pvalue+nod[j].pvalue[c];
	//		System.out.println("Value in Visit["+i+"].pvalue="+visit[i].pvalue);
			j=nod[j].child[c];
			if(nod[j+1].count==1 || c==2)
				c=0;
	//		i=nod[i].parent-1;
			System.out.println("Value in Visit["+i+"].pvalue="+visit[i].pvalue);
			}
		c++;
		}
	
		System.out.println("*******************************");
		System.out.println("*******************************");
		k=0;
		for(i=0;i<nod[k].count;i++)
		{
		System.out.println("Value in Visit["+i+"].pvalue="+visit[i].pvalue);
		}
		
		
		
	} */
		
	void count1()
	{
		int i,j,parent = 0,child=0;
		int visitl=0,count=0,count1=0;
		int temp=0,k=0;
		int[] total=new int[3];
		int s=0;
		int q=0,maxflow=0;;
		for(i=0;i<3;i++)
			total[i]=nod[0].pvalue[i];
		System.out.println("--------------------------------------------");
		
		for(i=0;nod[parent].child[0]!=0;i++)
		{
			
		//	System.out.println("value in child is " +child);
			count=i;
			if(nod[child].count<=count || nod[child].count>count)
				count=0;
					visit[visitl]=new visited();
			visit[visitl].pvalue=nod[parent].pvalue[visitl];
			
			for(j=0;nod[child].child[0]!=0;j++)
			{
				
					temp=visit[visitl].pvalue;
					visit[visitl].pvalue=nod[child].pvalue[count];
						if(visit[visitl].pvalue>temp && temp!=0)
						{
							visit[visitl].pvalue=temp;
						}		
						child=nod[child].child[count];
						count++;
						if(nod[child].count<=count || nod[child].count>count)
							count=0;
						
			}
			if(s>=nod[0].count)
			{
				maxflow=maxflow-visit[visitl-1].pvalue;
				break;
			}
				if(s<nod[0].count){
					if(s==2)
						break;
			total[s]=total[s]-visit[visitl].pvalue;
			System.out.println("Remaining capacity : "+total[s]);
			maxflow=maxflow+visit[visitl].pvalue;
			}
			System.out.println("------------------------------------------------");
			if((visitl+1)>nod[parent].n[count].count)
			{visitl=0;
		//	count1=2;
			}else
			visitl++;
			child=nod[parent].n[count].child[visitl];
			
			if(visitl>nod[parent].count)
				visitl=0;	
			if((visitl+1)>=nod[parent].n[count].count)
			{	parent=0;
				count=1;}
			parent=nod[parent].child[count];
	/*		System.out.println("Parent="+parent);
			System.out.println("child="+child);
			System.out.println("count="+count);
			System.out.println("count1="+count1);
			
			System.out.println("visitl="+visitl);
			*/
			System.out.println("------------------------------------------------");
			if(s<nod[0].count)
			if(total[s]==0 && s<nod[0].count)
				s=s+1;
			maxflow++;
			
	//		System.out.println("Maxflow is " +maxflow);
		}
		
		
		System.out.println("Maxflow is " +(maxflow+1));
		
	}
	
	
	
	
	public static void main(String[] args)
	{
		FordFulkersonAlgo F=new FordFulkersonAlgo();
		F.convert();
	//	F.count();
		F.count1();
	}
	
	
}

