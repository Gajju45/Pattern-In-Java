
//A BB CCC DDDD EEEEE
import java.util.Scanner;
class pattern55
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Num:");
int n=sc.nextInt();

for(int i=1;i<=n;i++)
{
for(int j=i;j>=n;j++)
{
System.out.print( (char)(j+64));
}
System.out.println(" ");
}}}

