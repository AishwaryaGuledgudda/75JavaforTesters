import java.util.HashMap;
import java.util.Map;
public class Day27 {
    public static void main(String[] args) {
        String str = "Qaverse";
        char[] arr = str.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : arr){
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }else map.put(c,1);
        }
        System.out.println(map);

    }
}
