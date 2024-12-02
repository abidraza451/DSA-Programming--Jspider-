package all_about_prime;

public class CheckPrime {
      
    public static boolean getPrime(int n){
        if (n < 2){
            return false;
        }
        for (int i = 2; i * i <= n; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 11;
        if (getPrime(n)){
            System.out.println("Your number " + n + " is a Prime number.");
        }
        else{
            System.out.println("Your number " + n + " is not a Prime number.");
        }
    }
}
