import java.sql.SQLOutput;

public class Day18 {
    //Linear Search
    public static void main(String[] args) {
       int[] a = {10,9,44,30,8,17};
       int key=30;
       int index = -1;

       for(int i=0;i<a.length;i++){
           if(a[i]==key){
               index = i;
               break;
           }
       }
        if(index!=-1){
            System.out.println("The key was found at index " +index);

        }else System.out.println("The key was not found");
    }
}
