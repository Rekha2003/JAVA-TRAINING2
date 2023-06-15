import java.util.Scanner;
class ExtractdigitPalindrome{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
int len=s.length()-1;
String rs="";
for(int i=0;i<=len;i++){
if((s.charAt(i)>='0')&&(s.charAt(i)<='9')){
rs=rs+s.charAt(i);}
}
int n=Integer.valueOf(rs);
int rev=0,temp,x;
temp=n;
while(n>0){
x=n%10;
rev=rev*10+x;
n=n/10;
}
if(temp==rev){System.out.println("PALINDROME");}
else {System.out.println(" NOT PALINDROME");}
}
}