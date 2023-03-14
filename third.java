class Third

{  int a,b;
   public static void main(String[]args)
  {
       int x=Integer.parseInt(args[0]);
    int y=Integer.parseInt(args[1]);
    Third t1=new Third();
    t1.get(x,y);
    t1.put();
 
  }


void get(int x ,int y){
a=x;
b=y;
}
void put(){
 System.out.println("Value of a:"+a);
 System.out.println("Value of b:"+b);
}
}

