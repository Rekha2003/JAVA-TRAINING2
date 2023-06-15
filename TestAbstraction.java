abstract class Shape{
abstract void draw();
}
//in real scenario method is called by programmer or user
class Rectangle extends Shape{
void draw(){System.out.println("drawing rectangle");}
}
class Circle extends Shape{
void draw(){System.out.println("drawing Circle");}
}
//in real scenario method is called by programmer or user
class TestAbstraction{
public static void main(String args[]){
Shape s=new Circle();//in real scenario object is provided
s.draw();
Shape r=new Rectangle();
r.draw();
}
}