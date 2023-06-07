import java.util.*;
class PalindromeString{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
char a=sc.next().charAt(0);
StringBuffer s=new StringBuffer(a).reverse().toString();
if(s.equals(a))
System.out.print("yes");
else
System.out.print("no");
}
}

