package javax.imageio.event

import java.util.EventListener
import javax.imageio.ImageReader
import scala.scalanative.annotation.stub

/** An interface used by ImageReader implementations to
 *  notify callers of their image and thumbnail reading methods of
 *  progress.
 * 
 *   This interface receives general indications of decoding
 *  progress (via the imageProgress and
 *  thumbnailProgress methods), and events indicating when
 *  an entire image has been updated (via the
 *  imageStarted, imageComplete,
 *  thumbnailStarted and thumbnailComplete
 *  methods).  Applications that wish to be informed of pixel updates
 *  as they happen (for example, during progressive decoding), should
 *  provide an IIOReadUpdateListener.
 */
trait IIOReadProgressListener extends EventListener {

    /** Reports that the current image read operation has completed. */
    @stub
    def imageComplete(source: ImageReader): Unit = ???

    /** Reports the approximate degree of completion of the current
     *  read call of the associated
     *  ImageReader.
     */
    @stub
    def imageProgress(source: ImageReader, percentageDone: Float): Unit = ???

    /** Reports that an image read operation is beginning. */
    @stub
    def imageStarted(source: ImageReader, imageIndex: Int): Unit = ???

    /** Reports that a read has been aborted via the reader's
     *  abort method.
     */
    @stub
    def readAborted(source: ImageReader): Unit = ???

    /** Reports that a sequence of read operations has completed. */
    @stub
    def sequenceComplete(source: ImageReader): Unit = ???

    /** Reports that a sequence of read operations is beginning. */
    @stub
    def sequenceStarted(source: ImageReader, minIndex: Int): Unit = ???

    /** Reports that a thumbnail read operation has completed. */
    @stub
    def thumbnailComplete(source: ImageReader): Unit = ???

    /** Reports the approximate degree of completion of the current
     *  getThumbnail call within the associated
     *  ImageReader.
     */
    @stub
    def thumbnailProgress(source: ImageReader, percentageDone: Float): Unit = ???

    /** Reports that a thumbnail read operation is beginning. */
    @stub
    def thumbnailStarted(source: ImageReader, imageIndex: Int, thumbnailIndex: Int): Unit = ???
}
