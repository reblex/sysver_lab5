import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

    @SuppressWarnings("deprecation")
    @Test
    public void FrameStructure_WorkingFrame_Pass() {
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
}