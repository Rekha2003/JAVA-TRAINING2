import java.util.Vector;
class ArraysVector{
public static void main(String args[]){
Vector<String>mammals=new Vector<>();
//Using the add() method
mammals.add(2,"Cat");
System.out.println("Vector:"+mammals);
//Using addAll()
Vector<String>animals=new Vector<>();
animals.add("Crocodile");
animals.addAll(mammals);
System.out.println(" New Vector:"+animals);
}
}