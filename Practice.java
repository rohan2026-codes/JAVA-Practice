import java.util.Scanner;
public class Practice{
    public static void main(String[] args){

        //printing out data types
        /*String a="Rohan Sharma";
        int age=19;
        double cgpa=7.5;
        boolean pass=true;
        char b='a';
        System.out.println("Perfect");
        System.out.println(age +" is my age");
        System.out.println(a + " is my name");
        System.out.println(cgpa + "is my cgpa");
        System.out.println(pass + " is my result");
        System.out.println(b + " is a character");*/
        
        //taking in input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter name: ");
        String name=sc.nextLine();
        System.out.println("Hello " + name);
        System.out.print("enter int: ");
        int a=sc.nextInt();
        System.out.print("enter decimal: ");
        double b=sc.nextDouble();
        System.out.println(a);
        System.out.println(b);
        sc.close();
    }
}