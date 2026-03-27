//brute force approch
//     public static void printMaxSubArray(int numbers[]){
//        int maxSum = Integer.MIN_VALUE;

//        for(int i=0; i<numbers.length; i++){
//             int start = i;
//             for(int j=i; j<numbers.length; j++){
//                 int end = j;
//                 int currSum = 0;

//                 for(int k=start; k<=end; k++){
//                    currSum += numbers[k];
//                 }
//                 System.out.println(currSum);
//                 if(maxSum < currSum){
//                     maxSum = currSum;
//                 }
//             }
//             System.out.println("");
//         }
//         System.out.println("Maximum subarray sum = " + maxSum);
//     }
//     public static void main(String[] args) {
//         int numbers[] = {1, -2, 6, -1, 3};
//         printMaxSubArray(numbers); 
//     }
// }

//prefix  approch

// public class maxsubarray{
//     public static void printMaxSubArray(int numbers[]){
//        int currSum = 0;
//        int maxSum = Integer.MIN_VALUE;
//        int prefix[] = new int[numbers.length];

//        prefix[0] = numbers[0];
//        //claculate prefix array
//        for(int i=1; i<prefix.length; i++){
//         prefix[i] = prefix[i-1] + numbers[i];
//        }


//        for(int i=0; i<numbers.length; i++){
//         int start = i;
//         for(int j=0; j<numbers.length; j++){
//             int end = j;
//             // main logic
//             currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];//ternary operator
//             if(maxSum < currSum){
//                maxSum = currSum;
//             }
//         }
//        }
//        System.out.println("max sum = " + maxSum);
//     }
//     public static void main(String[] args) {
//         int numbers[] = {1, -1, 6, -1, 3};
//         printMaxSubArray(numbers); 
//     }
// }

// KADANES algorithem

public class maxsubarray{
    public static void printkadanes(int numbers[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i=0; i<numbers.length; i++){
            cs = cs + numbers[i];
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("the maximum no. : " + ms);
    }
   public static void main(String[] args) {
    int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
    printkadanes(numbers);
   }
}