//Java for-each loop to loop through each element of the Arraylist
import java.util.ArrayList;
class ArrayAccess{
public static void main(String[] args){
//creating an array list
ArrayList<String>animals=new ArrayList<>();
animals.add("Cow");
animals.add("Cat");
animals.add("Dog");
System.out.println("ArrayList:"+animals);
//iterate using each for loop
System.out.println("Accessing individual elements:");
for(String temp:animals){
System.out.println(temp);System.out.print(",");
}
}
}

