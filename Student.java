import java.util.Scanner;
class R extends Exception{
String msg;
R(String msg){
super(msg);
this.msg=msg;
}
public String toString(){
return msg;
}
}
class Student{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int rollno=sc.newInt();
String name=sc.nextLine();
int marks=sc.nextInt();
try{
if(marks<0){
throw new R("Marks should not be negative");
}
}
catch(R ex){
System.out.println(ex);
System.out.println(ex.getMessage());
}
}
}