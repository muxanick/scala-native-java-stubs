package java.awt

/** The Transparency interface defines the common transparency
 *  modes for implementing classes.
 */
trait Transparency {
}

object Transparency {
    /** Represents image data that is guaranteed to be either completely
     *  opaque, with an alpha value of 1.0, or completely transparent,
     *  with an alpha value of 0.0.
     */
    @stub
    val BITMASK: Int = ???

    /** Represents image data that is guaranteed to be completely opaque,
     *  meaning that all pixels have an alpha value of 1.0.
     */
    @stub
    val OPAQUE: Int = ???
}
