package javax.imageio.event

import java.util.EventListener
import javax.imageio.ImageWriter

/** An interface used by ImageWriter implementations to notify
 *  callers of their image writing methods of progress.
 */
trait IIOWriteProgressListener extends EventListener {

    /** Reports that the image write operation has completed. */
    @stub
    def imageComplete(source: ImageWriter): Unit = ???

    /** Reports the approximate degree of completion of the current
     *  write call within the associated
     *  ImageWriter.
     */
    @stub
    def imageProgress(source: ImageWriter, percentageDone: Float): Unit = ???

    /** Reports that an image write operation is beginning. */
    @stub
    def imageStarted(source: ImageWriter, imageIndex: Int): Unit = ???

    /** Reports that a thumbnail write operation has completed. */
    @stub
    def thumbnailComplete(source: ImageWriter): Unit = ???

    /** Reports the approximate degree of completion of the current
     *  thumbnail write within the associated ImageWriter.
     */
    @stub
    def thumbnailProgress(source: ImageWriter, percentageDone: Float): Unit = ???

    /** Reports that a thumbnail write operation is beginning. */
    @stub
    def thumbnailStarted(source: ImageWriter, imageIndex: Int, thumbnailIndex: Int): Unit = ???
}
