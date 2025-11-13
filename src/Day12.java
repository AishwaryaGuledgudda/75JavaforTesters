public class Day12 {
    public static void main(String[] args) {
        int num = 1;
        int count = 0;

        while(num!=0){
            num = num / 10;
            count++;
        }
        System.out.println("The number of digits are "+count);
    }
}
