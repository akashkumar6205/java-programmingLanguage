//convert no to decimal to binary

public class deci_to_bin{
    public static void deciToBin(int n) {
        int myNum = n;
        int pow = 0;
        int binNum = 0;

        while(n > 0){
            int rem = n % 2;
            binNum = binNum + (rem * (int)Math.pow(10, pow));

            pow++;
            n = n/2;
        }
        System.out.println("binary form of " + myNum + " = " + binNum);
    }
    public static void main(String[] args) {
        deciToBin(7);
    }
} 