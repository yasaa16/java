import java.util.*;
public class AP1 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the No. : ");
    int n = sc.nextInt();
    for(int i = 1; i <=n ; i++){
      //spaces
      for(int j =1; j<= n-i; j++){
        System.out.print("  ");
      }
      //first half
      for(int j = 1; j<=i; j++){
        System.out.print(j+" ");
      }
      //second half
      if(i>=2){
        for(int j = i-1; j>=1 ; j--){
          System.out.print(j+" ");
        }
      }
      System.out.println();
    }
  }
}  
