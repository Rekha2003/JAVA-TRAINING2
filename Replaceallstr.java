import java.util.Scanner;
class Replaceallstr{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String c=sc.next();
String r=sc.next();
String rep=s.replaceAll(c,r);
System.out.print(rep);
}
}
