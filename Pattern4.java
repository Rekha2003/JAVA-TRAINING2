import java.util.Scanner;
class Pattern4{
public static void PrintReversePattern(char c,int n){
for(int i=n;i>=1;i--){
PrintLine(c,i);
}
}
public static void PrintLine(char c,int k){
System.out.println();
for(int j=1;j<=k;j++){
System.out.print(c+" ");
}
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
char ch=sc.next().charAt(0);
int row=sc.nextInt();
int x,y;
if(row%2==0)x=y=row/2;
else{x=row/2;y=row/2+1;}
PrintLine(ch,x);
PrintReversePattern(ch,y);
}
}