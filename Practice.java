import java.util.Scanner;
public class Practice{
    public static void main(String[] args){

        //printing out data types
        String a="Rohan Sharma";
        byte b=100;
        short c=3000;
        int age=19;
        long d=1000000;
        float e=3.14f;
        double cgpa=7.5;
        boolean pass=true;
        char h='a';
        System.out.println("Perfect");
        System.out.println(age +" is integer");
        System.out.println(a + " is string");
        System.out.println(cgpa + "is double");
        System.out.println(pass + " is bool");
        System.out.println(b + " is byte");
        System.out.println(c+"is short");
        System.out.println(d+"is long");
        System.out.println(e+"is float");
        System.out.println(h+"is char");
        
        //taking in input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter name: ");
        String name=sc.nextLine();
        System.out.println("Hello " + name);
        System.out.print("enter age: ");
        int f=sc.nextInt();
        System.out.println(f+" age ");
        System.out.print("enter decimal: ");
        double g=sc.nextDouble();
        System.out.println(g+" decimal ");
        sc.close();
    }
}