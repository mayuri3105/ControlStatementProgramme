import java.util.Scanner;

// WAP to check for Palodome number 

public class M_Palindrome {

    // WAP to check  for palindrome number 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int no =sc.nextInt();
        int temp =no;
        int rev=0,rem;
        sc.close();
        while(temp !=0){
            rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        if(no==rev){
            System.out.println(no +" is palindrome number");
        }else{
            System.out.println(no+" is not a palindrome number");
        }

    }
    
}
