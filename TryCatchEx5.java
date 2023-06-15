import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class TryCatchEx5{
public static void main(String[] args){
PrintWriter pw;
try{
pw=new PrintWriter("jtp.txt");
pw.println("Saved");
}
//providing the checked exception handler
catch(FileNotFoundException e){
System.out.println(e);
}
System.out.println("File saved successfully");
}
}