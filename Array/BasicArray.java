import java.util.*;

public class BasicArray{
    public static void main(String[] args) {
        int marks[] = new int[100];

        System.out.println("Enter your marks : ");
        
        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        marks[3] = sc.nextInt();
        marks[4] = sc.nextInt();

        System.out.println("phy : " + marks[0]);
        System.out.println("chem : " + marks[1]);
        System.out.println("maths : " + marks[2]);
        System.out.println("bio : " + marks[3]);
        System.out.println("eng : " + marks[4]);


        System.out.println("length of array : " + marks.length);
    }
}