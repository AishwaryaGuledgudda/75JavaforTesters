public class Day11 {
    public static void main(String[] args) {
        int number = 151;
        int digit = 0;
        int temp = number;
        int result = 0;

        while(temp!=0){
            temp=temp/10;
            digit++;
        }

        temp=number;
        while(temp!=0){
            int rem = temp%10;
            result = result + (int)Math.pow(rem,digit);
            temp = temp/10;
        }
        if(number==result){
            System.out.println("Is a Armstrong number");
        }else System.out.println("Not an Armstrong numbr");
    }
}
