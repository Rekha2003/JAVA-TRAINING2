//java program to convert primitive into objects
//autoboxing example of int to integer
public class Wrapperex{
public static void main(String args[]){
//Converting int into integer
int a=20;
Integer i=Integer.valueOf(a);//converting int into integer 
Integer j=a;//autoboxing,now compiler will write Integer.valueOf(a) internally
System.out.println(a+" "+i+" "+j);
}
}