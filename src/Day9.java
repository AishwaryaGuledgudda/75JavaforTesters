public class Day9 {
    public static void main(String[] args) {
        //Reverse a num
        int num = 129;
        int rev = 0;
        int digit;

        int original = num;

        while(num!=0){
            digit=num%10;
            rev = rev*10+digit;
            num = num/10;
        }

        if(rev==original){
            System.out.println("The number is a palindrome");

        } else System.out.println("The number is not a palindrome");
    }
}
