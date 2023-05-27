import java.util.Scanner;

// WAP to print Multiplication table 

public class G_Multiplication {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter A number You want to print table");
        int no =sc.nextInt();
        sc.close();
        for(int i=1;i<=10;i++){
            System.out.println(no +" * "+i+" = "+no*i);
        }
    }
}
