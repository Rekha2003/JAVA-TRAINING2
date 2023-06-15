class Student{
public int id;
public String name;
private void display(){
System.out.println(this.id+" "+this.name);
}//display()
public void displayStudent(){display();}
{id=26200;name="REKHA";}
}//student
class Test7{
public static void main(String args[]){
Student ob1=new Student();
ob1.displayStudent();
Student ob2=new Student();
ob2.displayStudent();}
}