import java.util.Scanner;
class Fibanocci{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int sum=0,n;
int a=0;
int b=1;
System.out.println("Enter the number:");
n=sc.nextInt();
System.out.println("Fabonacci series:");
while(sum<=n){
System.out.print(sum+" ");
a=b;//swaping numbers
b=sum;
sum=a+b;}
// next terms is the sum of the last two terms
}
}



