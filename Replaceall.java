import java.util.Scanner;
class Replaceall{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
char ch=sc.next().charAt(0);
String c=String.valueOf(ch);
String rep=s.replaceAll(c,"");
System.out.print(rep);
}
}
