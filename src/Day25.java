public class Day25 {
    public static void main(String[] args) {
       //Reverse a string
        String str = "Madam";
        String rev = "";
        str = str.toLowerCase();
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        System.out.println("The reversed string is : "+rev);
        if(str.equalsIgnoreCase(rev)){
            System.out.println("Is palindrome");
        }else System.out.println("not a palindrome");
    }

}
