package java.awt.image

/** An asynchronous update interface for receiving notifications about
 *  Image information as the Image is constructed.
 */
trait ImageObserver {
}

object ImageObserver {
    /** This flag in the infoflags argument to imageUpdate indicates that
     *  an image which was being tracked asynchronously was aborted before
     *  production was complete.
     */
    @stub
    val ABORT: Int = ???

    /** This flag in the infoflags argument to imageUpdate indicates that
     *  a static image which was previously drawn is now complete and can
     *  be drawn again in its final form.
     */
    @stub
    val ALLBITS: Int = ???

    /** This flag in the infoflags argument to imageUpdate indicates that
     *  an image which was being tracked asynchronously has encountered
     *  an error.
     */
    @stub
    val ERROR: Int = ???

    /** This flag in the infoflags argument to imageUpdate indicates that
     *  another complete frame of a multi-frame image which was previously
     *  drawn is now available to be drawn again.
     */
    @stub
    val FRAMEBITS: Int = ???

    /** This flag in the infoflags argument to imageUpdate indicates that
     *  the height of the base image is now available and can be taken
     *  from the height argument to the imageUpdate callback method.
     */
    @stub
    val HEIGHT: Int = ???

    /** This flag in the infoflags argument to imageUpdate indicates that
     *  the properties of the image are now available.
     */
    @stub
    val PROPERTIES: Int = ???

    /** This flag in the infoflags argument to imageUpdate indicates that
     *  more pixels needed for drawing a scaled variation of the image
     *  are available.
     */
    @stub
    val SOMEBITS: Int = ???
}
