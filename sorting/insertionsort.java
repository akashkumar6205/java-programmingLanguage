
public class insertionsort{
    public static void insertionSort(int arr[]){ //Integer is used when reverse an sorted arr
        for(int i = 1; i < arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            // finding out the correct pos i=ot insert
            while(prev >= 0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1] = curr;
        }
    }
    public static void printArr(int arr[]){ //Integer is used when reverse an sorted arr
        for(int i = 0; i < arr.length; i++){
            System.out.print( arr[i] +" ");
        }
        System.out.println();
    }
   public static void main(String[] args) {
    //Integer arr[] = {5, 4, 1, 3, 2};
       int arr[] = {5, 4, 1, 3, 2};
      //  insertionSort(arr);
    //Arrays.sort(arr);//sorted array
    //Arrays.sort(arr,1,4); //with starting and ending index
    //Arrays.sort(arr, 1, 4,Collections.reverseOrder());

       printArr(arr);
   }
}