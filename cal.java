class cal extends Thread{
public static void main(String[] args){
cal obj=new cal();
Thread threadobj=new Thread(obj);
threadobj.start();
System.out.println("Thread inside main area very much helpful in java");
}
public void run(){
System.out.println("Threads from overridden run method are");
}
}