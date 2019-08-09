package java.awt.image

import java.lang.Object

/** This class is an implementation of the ImageProducer interface which
 *  takes an existing image and a filter object and uses them to produce
 *  image data for a new filtered version of the original image.
 *  Here is an example which filters an image by swapping the red and
 *  blue compents:
 *  
 * 
 *       Image src = getImage("doc:///demo/images/duke/T1.gif");
 *       ImageFilter colorfilter = new RedBlueSwapFilter();
 *       Image img = createImage(new FilteredImageSource(src.getSource(),
 *                                                       colorfilter));
 * 
 *  
 */
class FilteredImageSource extends Object with ImageProducer {

    /** Adds the specified ImageConsumer
     *  to the list of consumers interested in data for the filtered image.
     */
    @stub
    def addConsumer(ic: ImageConsumer): Unit = ???

    /** Determines whether an ImageConsumer is on the list of consumers
     *  currently interested in data for this image.
     */
    @stub
    def isConsumer(ic: ImageConsumer): Boolean = ???

    /** Removes an ImageConsumer from the list of consumers interested in
     *  data for this image.
     */
    @stub
    def removeConsumer(ic: ImageConsumer): Unit = ???

    /** Requests that a given ImageConsumer have the image data delivered
     *  one more time in top-down, left-right order.
     */
    @stub
    def requestTopDownLeftRightResend(ic: ImageConsumer): Unit = ???
}
