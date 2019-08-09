package javax.imageio.event

import java.util.EventListener
import javax.imageio.ImageWriter

// An interface used by ImageWriter implementations to notify
// callers of their image writing methods of progress.
trait IIOWriteProgressListener extends EventListener {

    @stub
    // Reports that the image write operation has completed.
    def imageComplete(source: ImageWriter): Unit = ???

    @stub
    // Reports the approximate degree of completion of the current
    // write call within the associated
    // ImageWriter.
    def imageProgress(source: ImageWriter, percentageDone: float): Unit = ???

    @stub
    // Reports that an image write operation is beginning.
    def imageStarted(source: ImageWriter, imageIndex: Int): Unit = ???

    @stub
    // Reports that a thumbnail write operation has completed.
    def thumbnailComplete(source: ImageWriter): Unit = ???

    @stub
    // Reports the approximate degree of completion of the current
    // thumbnail write within the associated ImageWriter.
    def thumbnailProgress(source: ImageWriter, percentageDone: float): Unit = ???

    @stub
    // Reports that a thumbnail write operation is beginning.
    def thumbnailStarted(source: ImageWriter, imageIndex: Int, thumbnailIndex: Int): Unit = ???
}
