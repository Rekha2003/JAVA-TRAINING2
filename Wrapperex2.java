//java program to convert object into primitive
//unboxing example of integer to int
public class Wrapperex2{
public static void main(String args[]){
//converting integer to int
Integer a=new Integer(3);
int i=a.intValue();//converting integer to int explicitly
int j=a;//unboxing
System.out.println(a+" "+i+" "+j);
}
}