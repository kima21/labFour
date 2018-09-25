package edu.up.cs371.epp.photofunpattern;

import android.graphics.Bitmap;
import android.graphics.Color;

/**
 *  class BrightFilter changes the image manipulation behavior of its parent
 *  PhotoFilter to increase an image brightness by value of 100.
 *
 *  @author Edward C. Epp
 *  @version November 2017
 *  https://github.com/edcepp/PhotoFunPattern
 *
 *  @edit Meredith and Ashley
 *  @version September 2018
 */

public class WestEdgeFilter extends PhotoFilter {


    private final int ADJUSTMENT = 100;

    /*
    * transformPixel This method overrides the transformPixel in the parent
    * class. It adds 100 to each RGB color component. The maximum value of each
    * component is limited to 255
    *
    * @param inPixel is a 32 bit pixel that contains RGB color values
    * @return a new Pixel in which each of the RGB components has been increased
    */

    public int transformPixel(int onePixel, int twoPixel, int threePixel,int fourPixel, int fivePixel,
                              int sixPixel, int sevenPixel, int eightPixel, int ninePixel) {

        int red = constrain(Color.red(onePixel) + Color.red(twoPixel) + (Color.red(threePixel)*-1)
                + Color.red(fourPixel) + (Color.red(fivePixel)*-2) + (Color.red(sixPixel)*-1)
                + Color.red(sevenPixel) + Color.red(eightPixel) + (Color.red(ninePixel)*-1));
        int green = constrain(Color.green(onePixel) + Color.green(twoPixel) + (Color.green(threePixel)*-1)
                + Color.green(fourPixel) + (Color.green(fivePixel)*-2) + (Color.green(sixPixel)*-1)
                + Color.green(sevenPixel) + Color.green(eightPixel) + (Color.green(ninePixel)*-1));
        int blue = constrain(Color.blue(onePixel) + Color.blue(twoPixel) + (Color.blue(threePixel)*-1)
                + Color.blue(fourPixel) + (Color.blue(fivePixel)*-2) + (Color.blue(sixPixel)*-1)
                + Color.blue(sevenPixel) + Color.blue(eightPixel) + (Color.blue(ninePixel)*-1));

        return Color.argb(Color.alpha(fivePixel), red, green, blue);
    }


}
