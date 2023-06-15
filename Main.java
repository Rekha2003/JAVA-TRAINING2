class Main{
public static void main(String args[]){
try{
int arr[]={1,2,3,4,5};
//code that may not throw an exception
System.out.println(arr[10]);//this statement will throw exception
}catch(ArrayIndexOutOfBoundsException e){
//code to handle ArrayIndexOutOfBoundsException e
System.out.println("ArrayIndexOutOfBoundsException");
}finally{
//code that is already executed
System.out.println("finally block");
}}}

