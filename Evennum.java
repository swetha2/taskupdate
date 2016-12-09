import java.util.Scanner;
public class Evennum {
    public static void main(String args[]){
         Scanner in = new Scanner(System.in);
        System.out.println("enter the n");
        int n = in.nextInt();
        System.out.println("the even numbers are");
        
        for(int i=1;i<=n;i++){
            if(i%2==0)
                System.out.println(i);
        }



    }
}

