// check  giver integer id=s even or odd

import java.util.*;
public class solution2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter your no.: ");
    int num = sc.nextInt();

    if(isEven(num)) {
        System.out.println("Number is Even");
    }else{
        System.out.println("Number is odd");
    }
  }

  public static boolean isEven(int number) {
    if(number % 2 == 0){
        return true;
    }else{
        return false;
    }
  }
}