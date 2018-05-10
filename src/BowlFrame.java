public class BowlFrame {
    private int[] frameSc;

    public BowlFrame(int... scores) {
        frameSc = scores;
    }
    public int[] getFrame(){
        return frameSc;
    }
    public int getScore(){
        int total = 0;
        for(int i = 0; i < frameSc.length; i++){
            total += frameSc[i];
        }
        return total;
    }
    public Boolean isStrike(){
        Boolean strike = false;
        if(frameSc[0] == 10){
            strike = true;
        }
        return strike;
    }
}
