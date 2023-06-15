class Student{
public int id;
public String name;
public void display(){
System.out.println(this.id+" "+this.name);
}//display()
public void displayStudent(){display();}
}//student
class Test6{
public static void main(String args[]){
Student ob=new Student();
ob.displayStudent();
ob.id=26200;
ob.name="Rekha";
ob.displayStudent();}
}