
import java.util.Scanner;
class pattern58
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Num:");
int n=sc.nextInt();
int c=

for(int i=n;i>=1;i--)
{
for(int j=n;j>=1;j--)
{
System.out.print( (i>=j?i:j);
}
System.out.println(" ");
}}}

