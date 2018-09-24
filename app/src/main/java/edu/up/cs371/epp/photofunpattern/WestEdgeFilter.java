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
    * class. It adds 100 to each RGB color component. The maxium value of each
    * component is limited to 255
    *
    * @param inPixel is a 32 bit pixel that contains RGB color values
    * @return a new Pixel in which each of the RGB components has been increased
    */
    public int transformPixel(int onePixel, int twoPixel, int threePixel, int fourPixel,
                              int fivePixel, int sixPixel, int sevenPixel, int eightPixel,
                              int ninePixel) {
        /**
        int red = constrain(Color.red(fourPixel) + ADJUSTMENT);
        int green = constrain(Color.green(fourPixel) + ADJUSTMENT);
        int blue = constrain(Color.blue(fourPixel) + ADJUSTMENT);
        int outPixel = Color.argb(Color.alpha(fourPixel), red, green, blue);
        return outPixel;
         */
        Bitmap westEdge = new Bitmap();
        int width = westEdge.getWidth();
        int height = westEdge.getHeight();


                int outPixel = transformPixel(onePixel, twoPixel, threePixel, fourPixel,
                        fivePixel, sixPixel, sevenPixel, eightPixel, ninePixel);


        //int outPixel = (onePixel + twoPixel + threePixel + fourPixel + fivePixel + sixPixel + sevenPixel
                // + eightPixel + ninePixel) / 9;
        return outPixel;
    }

}
