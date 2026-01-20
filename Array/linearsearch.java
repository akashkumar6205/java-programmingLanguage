
public class linearsearch{
    public static int linearSearch(int numbers[], int key) {
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 5, 8, 15, 45, 32, 10};
        int key = 15; 


        int index = linearSearch(numbers, key);
            if(index == -1){
                System.out.println("Not Found");
            }else{
                System.out.println("Key is at index :" + index);
            }
    }
}