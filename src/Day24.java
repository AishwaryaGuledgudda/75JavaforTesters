public class Day24 {
    public static void main(String[] args) {
        String str = "EzyQaverse";
        String rev = "";
        str = str.toLowerCase();
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        System.out.println("The reversed string is : "+rev);
    }
}
