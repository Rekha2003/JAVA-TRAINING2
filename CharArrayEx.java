import java.io.*;
public class CharArrayEx{
public static void main(String args[])throws Exception{
char[] ary={ 'r','e','k','h','a'};
CharArrayReader reader=new CharArrayReader(ary);
int k=0;
//Read until the end of a file
while((k=reader.read())!=-1){
char ch=(char)k;
System.out.print(ch+":");
System.out.print(k);
}
}
}
