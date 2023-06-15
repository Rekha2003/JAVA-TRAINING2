public class JavaExceptionExample2{
public static void main(String args[]){
try{
//code that may raise exception
int data=50/0;
}//may throw exception
catch(Exception e){
System.out.println("Can't divided by zero");}
 
//rest code of the program
}
}