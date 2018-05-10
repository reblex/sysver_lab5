import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

    @SuppressWarnings("deprecation")
    @Test
    public void BowlFrame_FrameStructure_WorkingFrame_returnFrame() {
        BowlFrame fr = new BowlFrame(2,4);
        int arr[] = {2, 4};
        int frArr[] = fr.getFrame();
        Boolean matching = true;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] != frArr[i]){
                matching = false;
            }
        }
        assertTrue(matching);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void BowlFrame_getScore_validData_Return6() {
        BowlFrame fr = new BowlFrame(2,4);
        assertEquals(6, fr.getScore());
    }

    @SuppressWarnings("deprecation")
    @Test
    public void BowlingGame_CreateGame_validData_return10() {
        BowlingGame bg = new BowlingGame();
        assertEquals(10, bg.getFrames().length);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void BowlingGame_getScore_validGame_return81() {
        BowlingGame bg = new BowlingGame();
        bg.addScore(new BowlFrame(1,5));
        bg.addScore(new BowlFrame(3,6));
        bg.addScore(new BowlFrame(7,2));
        bg.addScore(new BowlFrame(3,6));
        bg.addScore(new BowlFrame(4,4));
        bg.addScore(new BowlFrame(5,3));
        bg.addScore(new BowlFrame(3,3));
        bg.addScore(new BowlFrame(4,5));
        bg.addScore(new BowlFrame(8,1));
        bg.addScore(new BowlFrame(2,6));
        assertEquals(81, bg.getScore());
    }

    @SuppressWarnings("deprecation")
    @Test
    public void BowlingGame_getScore_validGameWithStrike_return94() {
        BowlingGame bg = new BowlingGame();
        bg.addScore(new BowlFrame(10,0));
        bg.addScore(new BowlFrame(3,6));
        bg.addScore(new BowlFrame(7,2));
        bg.addScore(new BowlFrame(3,6));
        bg.addScore(new BowlFrame(4,4));
        bg.addScore(new BowlFrame(5,3));
        bg.addScore(new BowlFrame(3,3));
        bg.addScore(new BowlFrame(4,5));
        bg.addScore(new BowlFrame(8,1));
        bg.addScore(new BowlFrame(2,6));
        assertEquals(94, bg.getScore());
    }

    @SuppressWarnings("deprecation")
    @Test
    public void BowlingGame_getScore_validGameWithSpare_return88() {
        BowlingGame bg = new BowlingGame();
        bg.addScore(new BowlFrame(1,9));
        bg.addScore(new BowlFrame(3,6));
        bg.addScore(new BowlFrame(7,2));
        bg.addScore(new BowlFrame(3,6));
        bg.addScore(new BowlFrame(4,4));
        bg.addScore(new BowlFrame(5,3));
        bg.addScore(new BowlFrame(3,3));
        bg.addScore(new BowlFrame(4,5));
        bg.addScore(new BowlFrame(8,1));
        bg.addScore(new BowlFrame(2,6));
        assertEquals(88, bg.getScore());
    }

    @SuppressWarnings("deprecation")
    @Test
    public void BowlingGame_getScore_validGameWithStrikeAndSpare_return103() {
        BowlingGame bg = new BowlingGame();
        bg.addScore(new BowlFrame(10,0));
        bg.addScore(new BowlFrame(4,6));
        bg.addScore(new BowlFrame(7,2));
        bg.addScore(new BowlFrame(3,6));
        bg.addScore(new BowlFrame(4,4));
        bg.addScore(new BowlFrame(5,3));
        bg.addScore(new BowlFrame(3,3));
        bg.addScore(new BowlFrame(4,5));
        bg.addScore(new BowlFrame(8,1));
        bg.addScore(new BowlFrame(2,6));
        assertEquals(103, bg.getScore());
    }

    @SuppressWarnings("deprecation")
    @Test
    public void BowlingGame_getScore_validGameMultipleStrikes_return112() {
        BowlingGame bg = new BowlingGame();
        bg.addScore(new BowlFrame(10,0));
        bg.addScore(new BowlFrame(10,0));
        bg.addScore(new BowlFrame(7,2));
        bg.addScore(new BowlFrame(3,6));
        bg.addScore(new BowlFrame(4,4));
        bg.addScore(new BowlFrame(5,3));
        bg.addScore(new BowlFrame(3,3));
        bg.addScore(new BowlFrame(4,5));
        bg.addScore(new BowlFrame(8,1));
        bg.addScore(new BowlFrame(2,6));
        assertEquals(112, bg.getScore());
    }
}