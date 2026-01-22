
public class linearsearch{
    // public static int linearSearch(int numbers[], int key) {
    //     for(int i=0; i<numbers.length; i++){
    //         if(numbers[i] == key){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }
    // public static void main(String[] args) {
    //     int numbers[] = {1, 2, 3, 5, 8, 15, 45, 32, 10};
    //     int key = 15; 


    //     int index = linearSearch(numbers, key);
    //         if(index == -1){
    //             System.out.println("Not Found");
    //         }else{
    //             System.out.println("Key is at index :" + index);
    //         }
    // }


    public static int  menus(String menus[], String key) {
        for(int i=0; i<menus.length; i++){
            if(menus[i] == key){
              return i;
            }
        }
        return -1;
}
    public static void main(String[] args) {
        String menus[] = {"samosa","idli","dosa","chai","cholabhutra","pizza","burger"};
        String key = "pizza";

        int index = menus(menus, key);
        if(index == -1){
            System.out.println("noy found");
        }else{
            System.out.println("Key is at index : "+ index);
        }
    }
} 