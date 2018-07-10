public class GaleShapleyAlgorithm {
	static String[][] mPref={{"v","b","a","d","e","c"},
			{"w","d","b","a","c","e"},
			{"x","b","e","c","d","a"},
			{"y","a","d","c","b","e"},
			{"z","b","d","a","e","c"}};
	static String[][] fPref={{"a","z","v","w","y","x"},
			{"b","x","w","y","v","z"},
			{"c","w","x","y","z","v"},
			{"d","v","z","y","x","w"},
			{"e","y","w","z","x","v"}};
	static String[][] mprop=new String[2][5];
	static String[][] fprop=new String[2][5];
	static String[][] mproposed=new String[3][5];
	static String value=new String();
	private int count=0,count1=0,count2=0,count3=0;
	void mprefrences()
	{
		int i,j;
	System.out.println("Mens  Prefrence List is as follows:");

		for (i = 0; i < 5; i++) {
			for (j = 0; j < 6; j++) {
				System.out.print(mPref[i][j]+ "    ");
			}
			System.out.println();
			}
		
		System.out.println("Female Prefrence List is as follows:");
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 6; j++) {
				System.out.print(fPref[i][j]+ "    ");
			}
			System.out.println();
			}
	}
	void proposed()
	{
	int i=0,j=0;
	for (i = 0; i < 5; i++) {
		mprop[0][i]=mPref[i][0];
		fprop[0][i]=fPref[i][0];
		mprop[1][i]=String.valueOf(1);
		fprop[1][i]=String.valueOf(1);
	}

	for(i=0;i<5;i++)
	mproposed[0][i]=mPref[i][0];

	}
	void computation(){
		int i,j,k,l,m,n,p,q,r,s,t=0,u,v,w;
		for(k=0;k<5;k++)
			//Finding whether Male is free or not 
			 if(mPref[k][0].equals(mprop[0][k]))
			 if(mprop[1][k].equals(String.valueOf(1)))
			 {
				 count2=0;count3=0;
			 for(j=1;j<6 && Integer.valueOf(mprop[1][k])==1;j++)
			 {	//checking mproposed
				 for(r=0;r<5;r++)
				 {
					if(mproposed[1][r]==(mPref[k][j]))
					 {
						 count2=Integer.valueOf(mproposed[2][r]);
						 for(m=0;m<5;m++)
							 if(mPref[k][j].equals(fPref[m][0]))
							 for(i=1;i<6;i++)
							 if(mPref[k][0].equals(fPref[m][i]))
							 count3=i;
					 }
				 }
				 if(count2<=count3)
				 {
				 for(l=0;l<5;l++)
				 if(mPref[k][j].equals(fprop[0][l]))
				 if(fprop[1][l].equals(String.valueOf(1)))
				 {
				 for(m=0;m<5;m++)
					 if(mPref[k][j].equals(fPref[m][0]))
					 for(n=1;n<6;n++)
					 if(mPref[k][0].equals(fPref[m][n]))
						 {
							 mproposed[1][k]=mPref[k][j];
							 mproposed[2][k]=String.valueOf(n);
							 fprop[1][l]=String.valueOf(0);
							 mprop[1][k]=String.valueOf(0);
						}
			 	 }}
			 	 else
				 {	 
			 		 for(l=0;l<5;l++)
					 if(mPref[k][j].equals(fprop[0][l]))
					 if(fprop[1][l].equals(String.valueOf(0)))
					 {
					 for(n=0;n<5;n++){
	   				 if(mproposed[1][n].equals(mPref[k][j]))
	   				 {
	   				 value=mproposed[0][n];
	   				 count=Integer.valueOf(mproposed[2][n]);
	   				 break;
	   				 
	   				 }	
	   				 }
			
				 for(p=1;p<6;p++)
					if(mPref[k][0].equals(fPref[l][p]))
					count1=p;
	
				if(count1<count)
					{
					mproposed[1][k]=mPref[k][j];
					mproposed[2][k]=String.valueOf(count1);
					mprop[1][k]=String.valueOf(0);
					fprop[1][l]=String.valueOf(0);
					for(t=0;t<5;t++)
					{
					if(mprop[0][t].equals(value))
					{
						//System.out.println("Value for value is " +value);
						mprop[1][t]=String.valueOf(1);
						
					}
					for(u=0;u<5;u++)
					{
						if(mproposed[0][u].equals(value))
						mproposed[2][u]=String.valueOf(0);
					}
					}
					k=0;
					j=0;
					}
    				else
    				{
    					j++;
    				mproposed[1][k]=mPref[k][j];
    		//		j=j-1;
    		//		mproposed[2][k]=String.valueOf(0);
    				
    				}
					}
				 }
			 }
			 }
		}
		
	void display()
	{
		int i,j;
		
		System.out.println();
		System.out.println("Males Proposed List:");
			for (i = 0; i < 2; i++) {
			for(j=0;j<5;j++)
			System.out.print(mprop[i][j]+ "   ");
			System.out.println();
			}

			System.out.println("Females Proposed List:");
			for (i = 0; i < 2; i++) {
			for(j=0;j<5;j++)
			System.out.print(fprop[i][j]+ "   ");
			System.out.println();
			}
		System.out.println("Printing mproposed:");
			for(i=0;i<2;i++){
				System.out.println();
				for(j=0;j<5;j++)
					System.out.print("    " +mproposed[i][j]);
			}
			
			
			
	}
	
	
	
	
	public static void main(String[] args) {
		GaleShapleyAlgorithm a=new GaleShapleyAlgorithm();
		a.mprefrences();
		a.proposed();
		a.computation();
		a.display();
		

	}

}
