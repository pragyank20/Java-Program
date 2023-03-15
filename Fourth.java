import java.util.Scanner;

class Fourth

{
    int a, b;

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        Fourth t1 = new Fourth();
        t1.get(x, y);
        t1.put();

    }

    void get(int x, int y) {
        a = sc.nextInt();
        b = sc.nextInt();
    }

    void put() {
        System.out.println("Value of a:" + a);
        System.out.println("Value of b:" + b);
    }
}