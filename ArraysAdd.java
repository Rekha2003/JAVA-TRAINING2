//Access ArrayList elements
import java.util.ArrayList;
class ArraysAdd{
public static void main(String args[]){
ArrayList<String>animals=new ArrayList<>();
//add elements in the arraylist
animals.add("Cat");  
animals.add("Dog");  
animals.add("Cow");
System.out.println("ArrayList:"+animals);
//get the element from the arraylist
String str=animals.get(1);
System.out.println("Elements at index 1:"+str);
str=animals.get(2);
System.out.println("Elements at index 2:"+str);
}
}