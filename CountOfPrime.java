import java.util.Scanner;

public class CountOfPrime {
    static int N;
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        N = sc.nextInt();
        
        int count = 0;
        for(int i = N; i > 1; i--){ 
            if(i == 2){
                count++;
                continue;
            }
            if(i % 2 == 0){
                continue;
            }
            if(prime(i)){
                count++;
            }
        }
        
        System.out.println("Prime numbers : " + count);    
    }
    
    public static boolean prime(int i){ //Check Prime number. 
        for (int j = i - 1; j > 1; j--){
            if(i % j == 0){
                return false; //Not Prime Number.
            } 
        }
        return true; //Prime Number.
    }
    
}
