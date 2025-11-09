public class Day4 {
    public static void main(String[] args) {
        int a=10,b=5,c=12;
        int temp, largest;
        temp = (a>b)? a:b ;
        largest = (temp > c)? temp : c ;
        System.out.println("The largest among the three are " +largest);


    }
}
