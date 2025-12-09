import java.util.Arrays;

public class Day30 {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30};
        int[] arr2 = {40, 50, 60};
        int[] merged = new int[arr1.length+arr2.length];
        System.arraycopy(arr1,0,merged,0,arr1.length);
        System.arraycopy(arr2,0,merged,arr1.length,arr2.length);
        System.out.println("The merged array is: " +Arrays.toString(merged));

    }
}
