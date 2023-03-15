import java.lang.reflect.Array;
import java.util.Scanner;
class Ninth
{ 
    public static void main(String[]args){
  int avg,sum=0;	
  int a[]=new int[20];
Scanner sc =new Scanner(System.in);

System.out.println("Enter the values ");

for(int i=0;i<=4;++i){
a[i]=sc.nextInt();
sum=sum+a[i];
}
avg=sum/5;
System.out.println("Average is"+avg);
}
}
