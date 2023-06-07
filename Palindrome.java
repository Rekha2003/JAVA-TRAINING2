import java.util.Scanner;
class Palindrome{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n,rev=0, x,temp;
n=sc.nextInt();
temp=n;
while(n>0)
{
x=n%10;
rev=rev*10+x;
n=n/10;
}
if(temp==rev){
System.out.println("Given number is a palindrome");}
else{
System.out.println("Given number is not a palindrome");}
}
}