package edu.up.cs371.epp.photofunpattern;

import android.graphics.Bitmap;
import android.graphics.Color;

/**
 *  class GrayFilter changes the image manipulation behavior of its parent
 *  PhotoFilter to convert the image to gray scale.
 *
 *  @author Edward C. Epp
 *  @version November 2017
 *  https://github.com/edcepp/PhotoFunPattern
 *
 *  @edit Meredith and Ashley
 *  @version September 2018
 */

public class SmoothFilter extends PhotoFilter {

    /*
    * tranformPixel This method overrides the transformPixel in the parent
    * class. It transforms a color pixel to gray by averaging its three RGB
    * components.
    *
    * @param inPixel is a 32 bit pixel that contains RGB color values
    * @return a new Pixel in which each of the RGB components is their averaged
    * value
    */
    public int transformPixel(int onePixel, int twoPixel, int threePixel,int fourPixel, int fivePixel,
                              int sixPixel, int sevenPixel, int eightPixel, int ninePixel) {

        int red = constrain((Color.red(onePixel)/10) + (Color.red(twoPixel)/10) + (Color.red(threePixel)/10) + (Color.red(fourPixel)/10)
                + (Color.red(fivePixel)/5) + (Color.red(sixPixel)/10) + (Color.red(sevenPixel)/10) + (Color.red(eightPixel)/10) + (Color.red(ninePixel)/10));
        int green = constrain((Color.green(onePixel)/10) + (Color.green(twoPixel)/10) + (Color.green(threePixel)/10) + (Color.green(fourPixel)/10)
                + (Color.green(fivePixel)/5) + (Color.green(sixPixel)/10) + (Color.green(sevenPixel)/10) + (Color.green(eightPixel)/10) + (Color.green(ninePixel)/10));
        int blue = constrain((Color.blue(onePixel)/10) + (Color.blue(twoPixel)/10) + (Color.blue(threePixel)/10) + (Color.blue(fourPixel)/10)
                + (Color.red(fivePixel)/5) + (Color.blue(sixPixel)/10) + (Color.blue(sevenPixel)/10) + (Color.blue(eightPixel)/10) + (Color.blue(ninePixel)/10));

        return Color.argb(Color.alpha(fivePixel), red, green, blue);





        /**
         *
         *
         int intensity = (Color.red(fivePixel) + Color.green(fivePixel) +
         Color.blue(fivePixel)) / 3;
         return Color.argb(Color.alpha(fivePixel), intensity,intensity,intensity);


         int blue = constrain(Color.blue(onePixel) + (Color.blue(twoPixel)*(1/10)) + (Color.blue(threePixel)*(1/10))
         + (Color.blue(fourPixel)*(1/10)) + (Color.blue(fivePixel)*(1/5)) + (Color.blue(sixPixel)*(1/10))
         + (Color.blue(sevenPixel)*(1/10)) + (Color.blue(eightPixel)*(1/10)) + Color.blue(ninePixel)*(1/10));
         */



        /**
            int red = constrain((Color.red(onePixel)/9) + (Color.red(twoPixel)/9) + (Color.red(threePixel)/9)
                    + (Color.red(fourPixel)/9) + (Color.red(fivePixel)/9) + (Color.red(sixPixel)/9)
                    + (Color.red(sevenPixel)/9) + (Color.red(eightPixel)/9) + Color.red(ninePixel)/9);

            int green = constrain((Color.green(onePixel)/9) + (Color.green(twoPixel)/9) + (Color.green(threePixel)/9)
                    + (Color.green(fourPixel)/9) + (Color.green(fivePixel)/9) + (Color.green(sixPixel)/9)
                    + (Color.green(sevenPixel)/9) + (Color.green(eightPixel)/9) + Color.green(ninePixel)/9);
            int blue = constrain((Color.blue(onePixel)/9) + (Color.blue(twoPixel)/9) + (Color.blue(threePixel)/9)
                    + (Color.blue(fourPixel)/9) + (Color.blue(fivePixel)/9) + (Color.blue(sixPixel)/9)
                    + (Color.blue(sevenPixel)/9) + (Color.blue(eightPixel)/9) + Color.blue(ninePixel)/9);
            // int intensity = (Color.red(fivePixel) + Color.green(fivePixel) +
            //Color.blue(fivePixel)) / 3;
            return Color.argb(Color.alpha(fivePixel), red,green,blue);
         */

    }

    /**
    @Override
    public Bitmap apply(Bitmap inBmp) {
        super.apply(inBmp);
        int width = inBmp.getWidth();
        int height = inBmp.getHeight();

        Bitmap newBmp = Bitmap.createBitmap(width, height, inBmp.getConfig());

        for (int w = 1; w < width-1; w++) {
            for (int h = 1; h < height-1; h++) {
                int onePixel = inBmp.getPixel(w-1,h-1);
                int twoPixel = inBmp.getPixel(w,h-1);
                int threePixel = inBmp.getPixel(w+1,h-1);
                int fourPixel = inBmp.getPixel(w-1,h);
                int fivePixel = inBmp.getPixel(w,h);
                int sixPixel = inBmp.getPixel(w+1,h);
                int sevenPixel = inBmp.getPixel(w-1,h+1);
                int eightPixel = inBmp.getPixel(w,h+1);
                int ninePixel = inBmp.getPixel(w+1,h+1);
                int outPixel = transformPixel(onePixel, twoPixel, threePixel, fourPixel,
                        fivePixel, sixPixel, sevenPixel, eightPixel, ninePixel);
                newBmp.setPixel(w, h, outPixel);
            }
        }
        return newBmp;

    }
    */


}
