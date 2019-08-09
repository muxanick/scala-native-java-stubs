package java.awt

import java.awt.image.{Raster, WritableRaster}

/** The CompositeContext interface defines the encapsulated
 *  and optimized environment for a compositing operation.
 *  CompositeContext objects maintain state for
 *  compositing operations.  In a multi-threaded environment, several
 *  contexts can exist simultaneously for a single Composite
 *  object.
 */
trait CompositeContext {

    /** Composes the two source Raster objects and
     *  places the result in the destination
     *  WritableRaster.
     */
    @stub
    def compose(src: Raster, dstIn: Raster, dstOut: WritableRaster): Unit = ???
}
