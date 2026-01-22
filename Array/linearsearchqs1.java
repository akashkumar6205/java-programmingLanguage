// finding largest and smallest
public class linearsearchqs1{
    public static int largest(int numbers[]) {
        int largest = Integer.MIN_VALUE; // - infinity in java
        int smallest = Integer.MAX_VALUE; // + infinity in java

        for(int i=0; i<numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("smallest valus is : " + smallest);
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = {1, 2, 6, 3, 5};
        System.out.println("Largest value is : " + largest(numbers));
    }
}