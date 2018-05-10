public class BowlFrame {
    private static int score1;
    private static int score2;

    public BowlFrame(int s1, int s2) {
        score1 = s1;
        score2 = s2;
    }
    public int[] getFrame(){
        int arr[] = {score1, score2};
        return arr;
    }
    public int getScore(){
        return score1+score2;
    }
}
