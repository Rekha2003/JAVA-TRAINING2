import java.util.Scanner;
class Factornum{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a,b;
a=sc.nextInt();
b=sc.nextInt();
for(int i=a;i>=0;i=i-b){
System.out.print(i);
if(i>0)
System.out.print(",");
}
}
}


