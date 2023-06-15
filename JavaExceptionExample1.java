public class JavaExceptionExample1{
public static void main(String args[]){
try{
//code that may raise exception
int data=50/0;//may throw exception
catch(Exception e)
{System.out.println(e);}
System.out.println("rest of the code...");
} 
//rest code of the program
}
