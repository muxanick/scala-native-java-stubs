package java.awt.image

/** The interface for objects which can produce the image data for Images.
 *  Each image contains an ImageProducer which is used to reconstruct
 *  the image whenever it is needed, for example, when a new size of the
 *  Image is scaled, or when the width or height of the Image is being
 *  requested.
 */
trait ImageProducer {

    /** Registers an ImageConsumer with the
     *  ImageProducer for access to the image data
     *  during a later reconstruction of the Image.
     */
    @stub
    def addConsumer(ic: ImageConsumer): Unit = ???

    /** Determines if a specified ImageConsumer
     *  object is currently registered with this
     *  ImageProducer as one of its consumers.
     */
    @stub
    def isConsumer(ic: ImageConsumer): Boolean = ???

    /** Removes the specified ImageConsumer object
     *  from the list of consumers currently registered to
     *  receive image data.
     */
    @stub
    def removeConsumer(ic: ImageConsumer): Unit = ???

    /** Requests, on behalf of the ImageConsumer,
     *  that the ImageProducer attempt to resend
     *  the image data one more time in TOPDOWNLEFTRIGHT order
     *  so that higher quality conversion algorithms which
     *  depend on receiving pixels in order can be used to
     *  produce a better output version of the image.
     */
    @stub
    def requestTopDownLeftRightResend(ic: ImageConsumer): Unit = ???
}
