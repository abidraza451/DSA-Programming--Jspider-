package all_about_prime;
public class AlternatePrime {

    public static void getAlternatePrime(int hlimit){
        if(hlimit<2){
            System.out.println("A Prime no. can not be less than 2");
        }
        int flag=1;
        for(int i=2; i<=hlimit; i++){
            
            if(CheckPrime.getPrime(i)){
                if(flag==1){
                    System.out.println(i);
                    flag=0;
                }
                else{
                    flag=1;
                }
            }
        }
    }

    public static void main(String[] args) {
        int n=50;
        getAlternatePrime(n);
    }
}
