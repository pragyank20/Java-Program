import java.util.Scanner;

class fifth
{ 
    public static void main(String[]args){
   int a,b,c;
   Scanner sc =new Scanner(System.in);
System.out.println("Enter value of A ");
a=sc.nextInt();
System.out.println("Enter value of B");
b=sc.nextInt();
System.out.println("Enter value of c");
c=sc.nextInt();

if(a>b&&a>c){
System.out.println("A is Greater");
}
else if(b>a&&b>c){
System.out.println("B is Greater");
}
else{
System.out.println("C is Greater");
}
}
}