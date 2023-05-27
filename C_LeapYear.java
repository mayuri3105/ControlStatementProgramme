public class C_LeapYear {
    public static void main(String[] args) {
        int year =2023;
        // if(year%4==0){
        //     if(year%100==0){
        //         if(year%400==0){
        //             System.out.println("leap year");
        //         }
        //         else{
        //             System.out.println("not a leap year");
        //         }
        //     }
        //     else{
        //         System.out.println("leap year");
        //     }
        // }
        // else{
        //     System.out.println("not a leap year");
        // }
        if((year%400==0) || (year%4==0 &&year%100!=0)){
            System.out.println("leap year");
        }
        else{
            System.out.println("not a leap year");
        }
    }
    
}
