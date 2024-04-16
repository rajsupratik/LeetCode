import java.util.Scanner;

class TrailingZeroes {
  public String removeTrailingZeros(String num) {
    int index  = num.length() - 1;
        for(int i = index; i>=0; i--){
          
          char ch = num.charAt(i);
          if(ch != '0'){
            index = i;  
            break;
          }
      
  }
  return num.substring(0, index+1);
  
}
  public static void main(String args[]){
      Scanner sc =  new Scanner(System.in);
      String str = sc.nextLine();
      Solution obj = new Solution();
      String ans = obj.removeTrailingZeros(str);
      System.out.println(ans);
      
  }
}
