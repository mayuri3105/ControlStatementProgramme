import java.util.Scanner;
// WAP to check whether a number is prime or not in java 
public class J_Prime {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number : ");
        int no =sc.nextInt();
        sc.close();

        int temp =0;
        for(int i=2;i<=no-1;i++){
            if(no%i==0){
                temp=temp+1;

            }

        }
        if(temp==0){
            System.out.println(no+" is prime no");
        }
        else{
            System.out.println(no +" not a prime number");
        }
    }
}
