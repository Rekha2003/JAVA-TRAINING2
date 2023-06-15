//Implementation the ArrayList Class
import java.util.List;
import java.util.ArrayList;
class Collectionex2{
public static void main(String args[]){
//Creating list using the arraylist class
List<Integer>numbers=new ArrayList<>();
//Add elements to the list
numbers.add(1);
numbers.add(2);
numbers.add(3);
System.out.println("List:"+numbers);
//Access element from the list
int number=numbers.get(2);
System.out.println("Accessed Element:"+numbers);
//Remove elements from the list
int removeNumber=numbers.remove(1);
System.out.println("Removed Element:"+removeNumber);
System.out.println("List:"+numbers);
}}