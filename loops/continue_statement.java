
import java.util.Scanner;


public class continue_statement {
    public static void main(String[] args) {
        // for(int i= 0; i<=5; i++){
        //    if( i == 3){ 
        //     continue;
        //    }
        //    System.out.println(i);
        // }

        Scanner sc = new Scanner(System.in);

        do { 
            System.out.print("Enter the no. : ");
            int n = sc.nextInt();

            if( n % 10 == 0){
                continue;
            }

            System.out.println("number was : " + n);
        } while (true);
    }
}