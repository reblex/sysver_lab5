public class BowlingGame {
    private static BowlFrame[] bf = new BowlFrame[10];
    private static int framesPlayed;

    public BowlingGame(){
        for(int i = 0; i < 10; i++){
            bf[i] = new BowlFrame();
        }
        framesPlayed = 0;
    }
    public BowlFrame[] getFrames(){
        return bf;
    }
    public void addScore(BowlFrame bfs){
        bf[framesPlayed] = bfs;
        framesPlayed++;
    }
    public int getScore(){
        int score = 0;
        for(int i = 0; i < 10; i++){
            score += bf[i].getScore();
        }
        return score;
    }
}