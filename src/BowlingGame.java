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
        int gameScore = 0;
        for(int i = 0; i < 10; i++){
            int frameScore = 0;
            if(i == 8) {
                if (bf[i].isStrike() && bf[i+1].isStrike()){
                    frameScore += bf[i].getScore();
                    frameScore += bf[i+1].getScore();
                    frameScore += bf[i+2].getFirstVal();
                }else{
                    frameScore += calculateFrameScore(i);
                }
            }else if(i == 9){
                frameScore += bf[i].getScore();
            }else {
                frameScore += calculateFrameScore(i);
            }
            gameScore += frameScore;
        }
        return gameScore;
    }
    private int calculateFrameScore(int i){
        int frameScore = 0;
        if (bf[i].isStrike()) { //strike
            frameScore += bf[i].getScore();
            if (bf[i + 1].isStrike()) {
                frameScore += bf[i + 1].getScore();
                frameScore += bf[i + 2].getFirstVal();
            } else {
                frameScore += bf[i + 1].getScore();
            }
        } else if (bf[i].isSpare()) { //spare
            frameScore += bf[i].getScore();
            frameScore += bf[i + 1].getFirstVal();
        } else {
            frameScore += bf[i].getScore();
        }
        return frameScore;
    }
}