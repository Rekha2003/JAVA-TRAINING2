import java.util.Scanner;
public class Largest{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a,b,c;
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
if(a>b&&a>c){
System.out.println(a+"is largest");}
if(b>a&&b>c){
System.out.println(b+"is largest");}
if(c>a&&c>b){
System.out.println(c+"is largest");}
}
}
 