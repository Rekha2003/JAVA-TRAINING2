//Java program to initialize the values from one object to another object
class Student7{
int id;
String name;
// constructer to initialize integer and string
Student7(int i,String n){
id=i;
name=n;
} 
//constructer to initialize another object
Student7(){
}
void display(){System.out.println(id+" "+name);}
public static void main(String args[]){
Student7 s1=new Student7(111,"rekha");
Student7 s2=new Student7();
s2.id=s1.id;
s2.name=s1.name;
s1.display();
s2.display();
}
}


