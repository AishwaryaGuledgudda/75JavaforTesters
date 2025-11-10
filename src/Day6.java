public class Day6 {
    public static void main(String[] args) {
        int n = 10;
        int fNum = 0;
        int sNum = 1;
        System.out.print(+fNum +"," +sNum);
        for(int i=2; i<n ; i++){
            int next;
            next = fNum+sNum;
            System.out.print("," +next);
            fNum=sNum;
            sNum=next;
        }
    }

}
