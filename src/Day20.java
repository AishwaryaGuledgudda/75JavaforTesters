public class Day20 {
    public static void main(String[] args) {
        int[] a = {10,30,20,50,40};
        int key = 41;
        boolean check = false;
        for(int num : a){
            if(num==key){
                check=true;
                break;
            }
        }
        if(check){
            System.out.println("The ele was found");
        }else System.out.println("Element not found");

    }
}
