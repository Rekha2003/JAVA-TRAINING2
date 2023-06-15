//Implementation the ArrayList Class
import java.util.List;
import java.util.LinkedList;
class Collectionex3{
public static void main(String args[]){
//Creating list using the Linkedlist class
List<Integer>numbers=new LinkedList<>();
//Add elements to the list
numbers.add(1);
numbers.add(2);
numbers.add(3);
System.out.println("List:"+numbers);
//Access element from the list
int number=numbers.get(2);
System.out.println("Accessed Element:"+numbers);
//Using the indexOf()method
int index=numbers.indexOf(2);
System.out.println("Position of 3 is"+index);
//Remove element from the list
int removedNumber=numbers.remove(1);
System.out.println("Removed Element:"+removedNumber);
}}