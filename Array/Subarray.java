public class Subarray{
    public static void printsubarrays(int numbers[]){
      int ts = 0; //total 
      int totalSumOfAllSubarrays = 0;
      int maxSum = Integer.MIN_VALUE;
      int minSum = Integer.MAX_VALUE;

      for(int i=0; i<numbers.length; i++){
        int start = i;
        for(int j=i; j<numbers.length; j++){
          int end = j;
          int currSum = 0;

          //print arrar in addition format
          for(int k=start; k<=end; k++){
            currSum += numbers[k];
            System.out.print(numbers[k]+" ");

            if(k < end) {
              System.out.print(" + ");
            }
          }

          System.out.println(" = " + currSum);

          totalSumOfAllSubarrays += currSum;
          maxSum = Math.max(maxSum, currSum);
          minSum = Math.min(minSum, currSum);

          ts++;
        }
        System.out.println("");
      }
      System.out.println("Total subarrays = " + ts);
      System.out.println("Sum of all subarrays = " + totalSumOfAllSubarrays);
      System.out.println("Maximum subarray sum = " + maxSum);
      System.out.println("Minimum subarray sum = " + minSum);
    }
  public static void main(String[] args) { 
    int numbers[] = {2, 4, 6, 8, 10};
    printsubarrays(numbers);
  }
}