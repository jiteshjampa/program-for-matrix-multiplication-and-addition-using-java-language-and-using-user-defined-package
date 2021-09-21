package JiteshDetails;
public class MatrixAdditonAndMultiplication
{
public void getAddition(int nrow,int ncol,int a1[][],int a[][])
{
 int A[][]=new int[nrow][ncol];
for(int i=0;i<nrow;i++)
{
for(int j=0;j<ncol;j++)
{
A[i][j]=a[i][j]+a1[i][j];
}
}
System.out.println("The values after Addition:");
for(int i=0;i<nrow;i++)
{
for(int j=0;j<ncol;j++)
{
System.out.print(A[i][j]+"   ");
}
System.out.println();
}
}
public void getMultiplication(int nrow,int ncol,int a1[][],int a[][])
{
int M[][]=new int[nrow][ncol];
for(int i=0;i<nrow;i++)
{
for(int j=0;j<ncol;j++)
{
M[i][j]=a[i][j] * a1[i][j];
}
}
System.out.println("The values after Multiplication:");
for(int i=0;i<nrow;i++)
{
for(int j=0;j<ncol;j++)
{
System.out.print(M[i][j]+"   ");
}
System.out.println();
}
}
}