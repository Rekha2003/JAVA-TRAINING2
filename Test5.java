class Student{
public int id;
public String name;
}
class Test5{
public static void main(String args[]){
Student ob=new Student();
System.out.println(ob.id+" "+ob.name);
ob.id=26200;
ob.name="Rekha";
System.out.println(ob.id+" "+ob.name);
}
}