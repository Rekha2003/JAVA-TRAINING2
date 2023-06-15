abstract class Bike{
Bike(){System.out.println("bike is created");}
abstract void run();
void changeGear(){System.out.println("gear changed");}
}
//creating a child class which inherits Abstract class
class Honda extends Bike{
void run(){System.out.println("Running Safely");}
}
// Creating test class which calls abstract and non abstract methods
class TestAbstraction2{
public static void main(String args[]){
Bike ob=new Honda();
ob.run();
ob.changeGear();
}
}