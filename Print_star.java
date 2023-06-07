
class Print_star{
public static void Print_multiple_chars(int i, char c){
int k=0;
for(k=1;k<=i;k=k+1)
System.out.println("*"); 
}
public static void main(String args[]){
int j=5;
Print_multiple_chars(j,"*");
Print_multiple_chars(j+1,'+');
Print_multiple_chars(j+2,'-');
System.out.println("*"); 
}}