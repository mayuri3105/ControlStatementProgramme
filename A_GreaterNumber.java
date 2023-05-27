// WAP To Find Greater Number Between Two Number In java
public class A_GreaterNumber {

  public static void main(String[] args) {
    // int a=100,b=20;
    // if(a>b){
    //     System.out.println("A is greater");
    // }else{
    //     System.out.println("b is greater");
    // }

    // WAP to find greater Number Between Three Numbers in Java

    int a = 10, b = 30, c = 20;
    if (a > b) {
      if (a > c) {
        System.out.println("a is greater");
      } else {
        System.out.println("c is greater");
      }
    } else if (b > c) {
      System.out.println("b is greater");
    } else {
      System.out.println("c is greater");
    }
  }
}
