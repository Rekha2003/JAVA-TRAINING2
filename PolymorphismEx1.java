import java.util.Scanner;
class PolymorphismEx1{
void print(){System.out.println("Welcome");}
void print(String n){System.out.println("Welcome"+n);}
}//polymorphisim
class Test{
public static void main(String args[]){
PolymorphismEx1 ob=new PolymorphismEx1();
ob.print();
Scanner sc=new Scanner(System.in);
System.out.println("Please enter your name:");
String s=sc.next();
ob.print(s);
}
}