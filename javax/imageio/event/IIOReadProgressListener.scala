package javax.imageio.event

import java.util.EventListener
import javax.imageio.ImageReader

// An interface used by ImageReader implementations to
// notify callers of their image and thumbnail reading methods of
// progress.
//
//  This interface receives general indications of decoding
// progress (via the imageProgress and
// thumbnailProgress methods), and events indicating when
// an entire image has been updated (via the
// imageStarted, imageComplete,
// thumbnailStarted and thumbnailComplete
// methods).  Applications that wish to be informed of pixel updates
// as they happen (for example, during progressive decoding), should
// provide an IIOReadUpdateListener.
trait IIOReadProgressListener extends EventListener {

    @stub
    // Reports that the current image read operation has completed.
    def imageComplete(source: ImageReader): Unit = ???

    @stub
    // Reports the approximate degree of completion of the current
    // read call of the associated
    // ImageReader.
    def imageProgress(source: ImageReader, percentageDone: float): Unit = ???

    @stub
    // Reports that an image read operation is beginning.
    def imageStarted(source: ImageReader, imageIndex: Int): Unit = ???

    @stub
    // Reports that a read has been aborted via the reader's
    // abort method.
    def readAborted(source: ImageReader): Unit = ???

    @stub
    // Reports that a sequence of read operations has completed.
    def sequenceComplete(source: ImageReader): Unit = ???

    @stub
    // Reports that a sequence of read operations is beginning.
    def sequenceStarted(source: ImageReader, minIndex: Int): Unit = ???

    @stub
    // Reports that a thumbnail read operation has completed.
    def thumbnailComplete(source: ImageReader): Unit = ???

    @stub
    // Reports the approximate degree of completion of the current
    // getThumbnail call within the associated
    // ImageReader.
    def thumbnailProgress(source: ImageReader, percentageDone: float): Unit = ???
}
