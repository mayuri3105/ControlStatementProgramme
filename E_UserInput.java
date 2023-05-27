import java.util.Scanner;
// User E_UserInput Using Scanner Class 
 
public class E_UserInput {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        System.out.println("enter your name : ");
        String name =s.next();

        System.out.println("enter your age : ");
        int age =s.nextInt();

        System.out.println("Enter Your Gender : ");
        char Gender = s.next().charAt(0);

        System.out.println("enter your phone number");
        long phno =s.nextLong();
        s.close();

        System.out.println("************************************");
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Gender : "+Gender);
        System.out.println("Phone Number : "+phno);
    }
}
