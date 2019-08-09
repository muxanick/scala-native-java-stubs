package java.awt

import java.awt.image.ColorModel

// The PaintContext interface defines the encapsulated
// and optimized environment to generate color patterns in device
// space for fill or stroke operations on a
// Graphics2D.  The PaintContext provides
// the necessary colors for Graphics2D operations in the
// form of a Raster associated with a ColorModel.
// The PaintContext maintains state for a particular paint
// operation.  In a multi-threaded environment, several
// contexts can exist simultaneously for a single Paint object.
trait PaintContext {

    @stub
    // Releases the resources allocated for the operation.
    def dispose(): Unit = ???

    @stub
    // Returns the ColorModel of the output.
    def getColorModel(): ColorModel = ???
}
