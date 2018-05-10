public class BowlingGame {
    private static BowlFrame[] bf = new BowlFrame[10];

    public BowlingGame(){
        for(int i = 0; i < 10; i++){
            bf[i] = new BowlFrame();
        }
    }
    public BowlFrame[] getFrames(){
        return bf;
    }
}