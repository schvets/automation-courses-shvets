package infrastusture.generators;

import java.awt.*;
import java.util.Random;

public class ColorGenerator implements Generator {
    int red;
    int green;
    int blue;

    public ColorGenerator() {
        Random r = new Random();
        red = r.nextInt(256);
        green = r.nextInt(256);
        blue = r.nextInt(256);
    }

    @Override
    public Color generate() {
        return new Color(red, green, blue);
    }
}
