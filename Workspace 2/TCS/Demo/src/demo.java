import java.util.Scanner;

public class demo {
public static void main(String[] args) {
	
Scanner S=new Scanner(System.in);
String ch;
int X=1;
int[][] matrix=new int[3][3];
System.out.println("Please select the type of matrix:");
System.out.println("1----- 3*3");
System.out.println("2----- 4*4");
System.out.print("Please Enter:");
ch=S.nextLine();
int choice;
choice=Integer.parseInt(ch);
switch(choice)
{
case 1:
	System.out.println("3 * 3 matrix selected");
	break;
case 2:
	System.out.println("4 * 4 matrix selected");
	break;
default:
	System.out.println("Nothing Selected");
	break;
}
System.out.println("Playing X|0 Game");
System.out.println("Please enter X first");
int row,col;
for (int i = 1; i <= 9; i++)
{
if(i%2==1)
{	System.out.println("X's Turn");
	System.out.println("X select location");
	System.out.println("Please select row:::::::::::");
	row=S.nextInt();
	System.out.println("Please select col:::::::::::");
	col=S.nextInt();
	matrix[row][col]=1;
	System.out.println("=============================");}
else if(i%2==0)
	{System.out.println("0's Turn");
	System.out.println("0 select location");
	System.out.println("Please select row:::::::::::");
	row=S.nextInt();
	System.out.println("Please select col:::::::::::");
	col=S.nextInt();
	matrix[row][col]=0;
	System.out.println("=============================");}
}

for (int i = 0; i < matrix.length; i++)
{
for (int j = 0; j < matrix.length; j++)
System.out.print(matrix[i][j]);
System.out.println();}

System.out.println("=============================");
//No of winning possibilities

	if(matrix[0][0]==X && matrix[0][1]==X && matrix[0][2]==X)
		System.out.println("X wins");
	else
	if(matrix[1][0]==X && matrix[1][1]==X && matrix[1][2]==X)
		System.out.println("X wins");
	else
	if(matrix[2][0]==X && matrix[2][1]==X && matrix[2][2]==X)
		System.out.println("X wins");
	else
	if(matrix[0][0]==X && matrix[1][0]==X && matrix[2][0]==X)
		System.out.println("X wins");
	else
	if(matrix[0][1]==X && matrix[1][1]==X && matrix[2][1]==X)
		System.out.println("X wins");
	else
	if(matrix[0][2]==X && matrix[1][2]==X && matrix[2][2]==X)
		System.out.println("X wins");
	else
	if(matrix[0][0]==X && matrix[1][1]==X && matrix[2][2]==X)
		System.out.println("X wins");
	else
	if(matrix[0][2]==X && matrix[1][1]==X && matrix[2][0]==X)
		System.out.println("X wins");
	System.out.println("=============================");
}

}
