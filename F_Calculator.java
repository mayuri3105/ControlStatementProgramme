import java.util.Scanner;
//  WAP to create Calculator using switch statement 

public class F_Calculator {
    public static void main(String[] args) {
        String yn;
        do{
            Scanner s = new Scanner(System.in);
            System.out.println("Enter First No. ");
            int no1=s.nextInt();
            System.out.println("Enter second number ");
            int no2 =s.nextInt();
            System.out.println("Select symbol(/,*,+,-)");
            String sym =s.next();
            int res;
            switch(sym){
                case "+": res=no1+no2;
                System.out.println("Addition is : " +res);
                break;
                case "-" : res=no1-no2;
                System.out.println("Subtraction is : "+res);
                break;
                case "*" :res=no1*no2;
                System.out.println("Multiplication is : "+res);
                break;
                case "/" : res =no1/no2;
                System.out.println("Division is : "+res);
                break;
                default : System.out.println("invalid symbol");
                break;
            }
            System.out.println("Do you want to continue (press y for yes and n fr no)");
            yn=s.next();
            s.close();
        }while(yn.equals("y")||yn.equals("Y"));
    }
}
