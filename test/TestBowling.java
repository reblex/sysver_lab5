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

    @SuppressWarnings("deprecation")
    @Test
    public void BowlingGame_getScore_validGameMultipleSpares_return98() {
        BowlingGame bg = new BowlingGame();
        bg.addScore(new BowlFrame(8,2));
        bg.addScore(new BowlFrame(5,5));
        bg.addScore(new BowlFrame(7,2));
        bg.addScore(new BowlFrame(3,6));
        bg.addScore(new BowlFrame(4,4));
        bg.addScore(new BowlFrame(5,3));
        bg.addScore(new BowlFrame(3,3));
        bg.addScore(new BowlFrame(4,5));
        bg.addScore(new BowlFrame(8,1));
        bg.addScore(new BowlFrame(2,6));
        assertEquals(98, bg.getScore());
    }

    @SuppressWarnings("deprecation")
    @Test
    public void BowlingGame_getScore_validGameSpareAsLastFrame_return90() {
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
        bg.addScore(new BowlFrame(2,8,7));
        assertEquals(90, bg.getScore());
    }

    @SuppressWarnings("deprecation")
    @Test
    public void BowlingGame_getScore_validGameStrikeAsLastFrame_return92() {
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
        bg.addScore(new BowlFrame(10,7,2));
        assertEquals(92, bg.getScore());
    }

    @SuppressWarnings("deprecation")
    @Test
    public void BowlingGame_getScore_validGameBonusIsAStrike_return93() {
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
        bg.addScore(new BowlFrame(2,8,10));
        assertEquals(93, bg.getScore());
    }

    @SuppressWarnings("deprecation")
    @Test
    public void BowlingGame_getScore_validGameBestScore_return300() {
        BowlingGame bg = new BowlingGame();
        bg.addScore(new BowlFrame(10,0));
        bg.addScore(new BowlFrame(10,0));
        bg.addScore(new BowlFrame(10,0));
        bg.addScore(new BowlFrame(10,0));
        bg.addScore(new BowlFrame(10,0));
        bg.addScore(new BowlFrame(10,0));
        bg.addScore(new BowlFrame(10,0));
        bg.addScore(new BowlFrame(10,0));
        bg.addScore(new BowlFrame(10,0));
        bg.addScore(new BowlFrame(10,0,10,10));
        assertEquals(300, bg.getScore());
    }

    @SuppressWarnings("deprecation")
    @Test
    public void BowlingGame_getScore_validGameRealGame_return135() {
        BowlingGame bg = new BowlingGame();
        bg.addScore(new BowlFrame(6,3));
        bg.addScore(new BowlFrame(7,1));
        bg.addScore(new BowlFrame(8,2));
        bg.addScore(new BowlFrame(7,2));
        bg.addScore(new BowlFrame(10,0));
        bg.addScore(new BowlFrame(6,2));
        bg.addScore(new BowlFrame(7,3));
        bg.addScore(new BowlFrame(10,0));
        bg.addScore(new BowlFrame(8,0));
        bg.addScore(new BowlFrame(7,3,10));
        assertEquals(135, bg.getScore());
    }
}