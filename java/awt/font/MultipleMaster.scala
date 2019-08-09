package java.awt.font

import java.awt.Font
import java.lang.String

// The MultipleMaster interface represents Type 1
// Multiple Master fonts.
// A particular Font object can implement this interface.
trait MultipleMaster {

    @stub
    // Creates a new instance of a multiple master font based on the design
    // axis values contained in the specified array.
    def deriveMMFont(axes: Array[float]): Font = ???

    @stub
    // Creates a new instance of a multiple master font based on detailed metric
    // information.
    def deriveMMFont(glyphWidths: Array[float], avgStemWidth: float, typicalCapHeight: float, typicalXHeight: float, italicAngle: float): Font = ???

    @stub
    // Returns an array of default design values for each axis.
    def getDesignAxisDefaults(): Array[float] = ???

    @stub
    // Returns the name for each design axis.
    def getDesignAxisNames(): Array[String] = ???

    @stub
    // Returns an array of design limits interleaved in the form [from→to]
    // for each axis.
    def getDesignAxisRanges(): Array[float] = ???
}
