import java.util.HashMap;
import java.util.Map;
public class Day28 {
    public static void main(String[] args) {
        //Frequency
        String str = "madam";
        char[] arr = str.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : arr){
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }else map.put(c,1);
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey() +" " +entry.getValue());
            }
        }

    }
}
