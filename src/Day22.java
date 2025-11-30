import java.util.HashSet;

public class Day22 {
    public static void main(String[] args) {
        int[] a={4,2,7,4,9,2,7};
        HashSet<Integer> uniqElements = new HashSet<>();
        HashSet<Integer> duplicate = new HashSet<>();
        for(int num : a){
            if(!uniqElements.add(num)){
                duplicate.add(num);
            }
        }
        System.out.println("Duplicate Elements are");
        for(int dup: duplicate){
            System.out.print(dup);
        }
    }
}
