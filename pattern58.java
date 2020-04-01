
import java.util.Scanner;
import java.lang.Math;
class pattern58
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Num:");
int n=sc.nextInt();


for(int i=1;i<=n;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print( (char)(j+64));
System.out.print( (char)(j+96));

}
System.out.println(" ");
}}}

