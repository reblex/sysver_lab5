import static org.junit.Assert.*;

import org.junit.Test;

public class TestSorting {

    @SuppressWarnings("deprecation")
    @Test
    public void FrameStructure_WorkingFrame_Pass() {
        BowlFrame fr = new BowlFrame(2,4);
        int arr[] = {2, 4};
        assertEquals(arr, fr.getFrame());
    }
}