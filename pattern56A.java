
import java.util.Scanner;
class pattern57
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Num:");
int n=sc.nextInt();
int c;

for(int i=1;i<=n;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print( (c++)+" ");
}
System.out.println(" ");
}}}

