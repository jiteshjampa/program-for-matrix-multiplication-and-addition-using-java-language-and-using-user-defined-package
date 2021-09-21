import JiteshDetails.MatrixAdditonAndMultiplication;
import java.util.Scanner;
public class MatrixResult{
void getarray(int a[][],int rows,int columns)
{
Scanner matrix=new Scanner(System.in);
for(int i=0;i<rows;i++)
{
for(int j=0;j<columns;j++)
{
System.out.println("Enter the array a["+i+"]["+j+"]:");
a[i][j]=matrix.nextInt();

}
}
}
public static void main(String args[])
{
 int rows=0;
 int columns=0;
MatrixResult m=new MatrixResult();
Scanner matrix=new Scanner(System.in);
System.out.println("Enter the number of rows:");
rows=matrix.nextInt();
System.out.println("Enter the number of columns:");
columns=matrix.nextInt();
 int s[][]=new int[rows][columns];
 int q[][]=new int[rows][columns];
System.out.println("Enter the first array:");
m.getarray(s,rows,columns);
System.out.println("Enter the Second array:");
m.getarray(q,rows,columns);
MatrixAdditonAndMultiplication os=new MatrixAdditonAndMultiplication();
os.getAddition(rows,columns,q,s);
os.getMultiplication(rows,columns,q,s);
}
}