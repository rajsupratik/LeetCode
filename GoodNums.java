import java.util.HashMap;
import java.util.Scanner;

public class GoodNums {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        int pairs = 0;
        
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        for (int count : countMap.values()) {
            pairs += count * (count - 1) / 2;
        }
        
        return pairs;
    }
    
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int elements = sc.nextInt();
      int[] nums = new int[elements];
      
      for (int i = 0; i < elements; i++) {
          nums[i] = sc.nextInt();
      }
      
      GoodNums solution = new GoodNums();
      int pairs = solution.numIdenticalPairs(nums); // Corrected line
      System.out.println(pairs);

      sc.close();
  }
  
}
