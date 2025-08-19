import java.util.*;
public class pattern3 {
    public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      int  n=sc.nextInt();
      //  half pyramid with numbers
      for (int i=1;i<=n;i++){
        for (int j=1;j<=i;j++){
            System.out.print(j+"");
        }
        System.out.println();
      }  
      System.out.println();

      // inverted half pyramid with numbers

      for (int i=n;i>=1;i--){
        for(int j=1;j<=i;j++){
            System.out.print(j+"");
        }
        System.out.println();
      }

    }
}
