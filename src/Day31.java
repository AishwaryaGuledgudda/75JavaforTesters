public class Day31 {
    public static void main(String[] args) {
        int[] a1={1,2,4,5,6};
        int[] a2={2,4,6,8};

        int i = 0;
        int j = 0;
        while(i<a1.length && i<a2.length){
            if(a1[i]==a2[j]){
                System.out.print(a1[i] +" ");
                i++;
                j++;
            }else if(a1[i]<a2[j]){
                i++;
            } else if (a1[i]>a2[j]) {
                j++;

            }
        }
    }
}
