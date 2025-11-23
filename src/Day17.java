public class Day17 {
    public static void main(String[] args) {
       int[] a = {10,1,78,32,99,5};
       int min = a[0];
       int max = a[0];

       for(int i=1;i<a.length;i++){
           if(a[i]>max){
               max=a[i];
           }
           if(a[i]<min){
               min=a[i];
           }
       }
        System.out.println("Min in this array is " +min);
        System.out.println("Max in this array is " +max);

    }
}
