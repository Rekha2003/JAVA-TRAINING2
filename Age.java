//user defined exceptionmin java
import java.util.*;
//custom exception to validate age with defined age limit
class AgeDoesNotFitException extends Exception{
//member variable to store our custom message
String msg;
AgeDoesNotFitException(String args[]){
//passing the parameter tpo the super class
super(msg);
this.msg=msg;
}
//overriding with our custom message
@override
public String toString(){
return msg;}
}
class Age{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int age=sc.nextInt();
try{
if(age<18){//checking if the age is above the limit or not
throw new AgeDoesNotFitException("Entered age doesnt fulfill the required age limit");
}
}
catch(AgeDoesNotFitException ex){
//calls override to String() method
System.out.println(ex);
//print message passed to the super constructer
System.out.println(ex.getMessage());
}
}
}