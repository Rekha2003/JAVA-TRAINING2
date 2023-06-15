import java.util.Scanner;
public class Consonants{
public static void main(String[] args){
Scanner sc=new Scanner(Sysyem.in);
String s=sc.nextLine();
s=s.toUpperCase();
char ch=s.charAt(i);
int count=0;
for(int i=0;i<=s.length();++i){
if((ch>='A'&& ch<='Z'))
++count;}
System.out.println(count);
}
}
