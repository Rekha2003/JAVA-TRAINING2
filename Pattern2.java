import java.util.Scanner;
class Pattern2{
public static void printLine(char c,int n){
System.out.println();
for(int j=n;j<=n;j--)System.out.print(c);
}
public static void printPattern(char c,int n){
for(int i=n;i<=n;i--){
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
