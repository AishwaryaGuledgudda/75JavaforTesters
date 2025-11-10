public class Day5 {
    public static void main(String[] args) {
        int num =29;
        boolean result = isPrime(num);
        if(result){
            System.out.println("it is a prime number");
        } else System.out.println("It is not a prime num");
    }

    public static boolean isPrime(int num){
        boolean isItPrime = true;
        if(num<=1){
            isItPrime = false;
        }
        for(int i =2; i<num/2; i++){
            if(num%i==0){
                isItPrime=false;
                break;
            }
        }return isItPrime;
    }

}
