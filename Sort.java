import java.util.*;
class Sort{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int k=sc.nextInt();
int sum=0,i=0;
int a[]=new int[k];
for( i=0;i<k;i++){a[i]=sc.nextInt();}
Arrays.sort(a);
System.out.println(a[0]+" "+a[k-1]);
for(int y:a){sum+=y;}
float avg=(float)sum/k;
System.out.println(sum+"\n"+avg);
}
}

