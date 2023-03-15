import java.lang.reflect.Array;
import java.util.Scanner;
class Tenth
{ 
    public static void main(String[]args){	
  int a[][]=new int[20][20];
Scanner sc =new Scanner(System.in);
System.out.println("Enter the values ");

for(int i=1;i<=2;++i){
for(int ii=1;ii<=3;++ii){
a[i][ii]=sc.nextInt();

}
}
System.out.println("2-d Array is");
for(int i=1;i<=2;++i){
for(int ii=1;ii<=3;++ii){
System.out.print(a[i][ii]+" ");
}
System.out.print("\n");
}

}

}