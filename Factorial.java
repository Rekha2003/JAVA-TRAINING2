import java.util.Scanner;
class Factorial{
public static void main(String args[]){
int i;
Scanner sc=new Scanner(System.in);
i=sc.nextInt();
int x=1; fact=1;
while(x<=i){
fact=fact*x;
x++;}
System.out.println(fact);
}
}

