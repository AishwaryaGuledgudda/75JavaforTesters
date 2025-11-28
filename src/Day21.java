import java.util.HashSet;

public class Day21 {
    //HashSet
    public static void main(String[] args) {
        int[] a={1,2,3,4,6};
        boolean hasDuplicate = false;

        HashSet<Integer> set = new HashSet<>();

        for(int num:a){
            if(set.add(num)==false){
                hasDuplicate=true;
                break;
            }
        }
        if(hasDuplicate==true){
            System.out.println("The array has duplicates");
        }else System.out.println("The array does not have duplicates");
    }
}
