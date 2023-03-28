package code.learn.cookLasagna;

public class CookYourLasagna {

    public int expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOven(int minutes) {
        CookYourLasagna lasagna = new CookYourLasagna();
        return lasagna.expectedMinutesInOven() - minutes;
    }


    public int preparationTimeInMinutes(int layers) {
        return 2 * layers;
    }
    public int totalTimeInMinutes(int layers, int minutes) {
        return (2 * layers) + minutes;

    }

}
