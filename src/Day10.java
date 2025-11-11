public class Day10 {
    public static void main(String[] args) {
        int num = 12345;
        int digit;
        int sum=0;

        while(num!=0){
            digit = num % 10;
            sum = sum +digit;
            num = num/10;
        }
        System.out.println("The sum of the digits are "
                +sum);
    }
}
