import java.util.*;
public class pattern5 {
  public static void main(String[] args) {
    
    int n =4;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        int p= 2*(n-i);
        for(int j=1;j<=p;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    for(int i=n;i>=1;i--){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        int p=2*(n-i);
        for(int j=1;j<=p;j++){
            System.out.print(" ");
        }
        for (int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
  }  
}
