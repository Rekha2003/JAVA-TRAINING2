//to change elements  of the arraylist,we use the set() method of the Array
import java.util.ArrayList;
class ArraysChange{
public static void main(String args[]){
ArrayList<String>languages=new ArrayList<>();
//add elements in the arraylist
languages.add("Java");  
languages.add("C++");  
languages.add("python");
System.out.println("ArrayList:"+languages);
//change the element of the array list
languages.set(2,"JAVASCRIPT");
System.out.println("Modified ArrayList:"+languages);
}
}