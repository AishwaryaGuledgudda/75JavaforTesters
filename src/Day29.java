public class Day29 {
    public static void main(String[] args) {
        String str = "Welcome to EzyQaVerse and EzyQaVerse is good channel" +
                "to enjoy learning";
        String word = "EzyQaVerse";
        int count = 0;
        String temp[] = str.split(" ");
        for(String c : temp){
            if(c.equalsIgnoreCase(word)){
                count++;
            }
        }
        System.out.println("The num of occ is: "+count);
    }
}
