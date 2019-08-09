package javax.imageio.event

import java.awt.image.BufferedImage
import java.util.EventListener
import javax.imageio.ImageReader

// An interface used by ImageReader implementations to
// notify callers of their image and thumbnail reading methods of
// pixel updates.
trait IIOReadUpdateListener extends EventListener {

    @stub
    // Reports that a given region of the image has been updated.
    def imageUpdate(source: ImageReader, theImage: BufferedImage, minX: Int, minY: Int, width: Int, height: Int, periodX: Int, periodY: Int, bands: Array[Int]): Unit = ???

    @stub
    // Reports that the current read operation has completed a
    // progressive pass.
    def passComplete(source: ImageReader, theImage: BufferedImage): Unit = ???

    @stub
    // Reports that the current read operation is about to begin a
    // progressive pass.
    def passStarted(source: ImageReader, theImage: BufferedImage, pass: Int, minPass: Int, maxPass: Int, minX: Int, minY: Int, periodX: Int, periodY: Int, bands: Array[Int]): Unit = ???

    @stub
    // Reports that the current thumbnail read operation has completed
    // a progressive pass.
    def thumbnailPassComplete(source: ImageReader, theThumbnail: BufferedImage): Unit = ???

    @stub
    // Reports that the current thumbnail read operation is about to
    // begin a progressive pass.
    def thumbnailPassStarted(source: ImageReader, theThumbnail: BufferedImage, pass: Int, minPass: Int, maxPass: Int, minX: Int, minY: Int, periodX: Int, periodY: Int, bands: Array[Int]): Unit = ???
}