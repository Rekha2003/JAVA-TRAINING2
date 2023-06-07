import java.util.Scanner;
class Pattern3{
public static void printLine(char c,int n){
System.out.println();
for(int j=n;j>=1;j--)System.out.print(c);
}
public static void printPattern(char c,int n){
for(int i=n;i>=1;i--){
printLine(c,i);
}
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
char ch=sc.next().charAt(0);
int row=sc.nextInt();
printPattern(ch,row);
}
}
