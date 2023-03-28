package code.learn.cookLasagna;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CookYourLasagnaTest {
    CookYourLasagna lasagna = new CookYourLasagna();

    @Test
    public void total_time_in_minutes_for_multiple_layers() {
        assertEquals(16, lasagna.totalTimeInMinutes(4, 8));
    }

    @Test
    public void total_time_in_minutes_for_one_layer() {
        assertEquals(32, lasagna.totalTimeInMinutes(1, 30));
    }

    @Test
    public void remaining_minutes_in_oven() {
        assertEquals(15, lasagna.remainingMinutesInOven(25));
    }

    @Test
    public void expected_minutes_in_oven() {
        assertEquals(40, lasagna.expectedMinutesInOven());
    }

    @Test
    public void preparation_time_in_minutes_for_one_layer() {
        assertEquals(2, lasagna.preparationTimeInMinutes(1));
    }

    @Test
    public void preparation_time_in_minutes_for_multiple_layers() {
        assertEquals(8, lasagna.preparationTimeInMinutes(4));
    }

}