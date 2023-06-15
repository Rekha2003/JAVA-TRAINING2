class  Animal{
public void move(){System.out.println(" Call from Animals class");}
}
class Wild extends Animal{
public void move(){System.out.println("Call from Wild class");}
}
class Pet extends Animal{
public void move(){System.out.println("Call from Pet class");}
}
class TestAnimal{
public static void main (String args[]){
Animal a=new Animal();//Animal reference and object
Animal w=new Wild();//Animal reference but wild object
Animal p=new Pet();//Animal reference but pet object
a.move();// runs the method in animal class
w.move();// runs the method in wild class
p.move();//runs the method in pet class
}
}