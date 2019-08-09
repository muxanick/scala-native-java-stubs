package javax.swing.plaf.synth

/** Constants used by Synth. Not all Components support all states. A
 *  Component will at least be in one of the primary states. That is, the
 *  return value from SynthContext.getComponentState() will at
 *  least be one of ENABLED, MOUSE_OVER,
 *  PRESSED or DISABLED, and may also contain
 *  FOCUSED, SELECTED or DEFAULT.
 */
trait SynthConstants {
}

object SynthConstants {
    /** Indicates the region is the default. */
    @stub
    val DEFAULT: Int = ???

    /** Primary state indicating the region is not enabled. */
    @stub
    val DISABLED: Int = ???

    /** Primary state indicating the component is enabled. */
    @stub
    val ENABLED: Int = ???

    /** Indicates the region has focus. */
    @stub
    val FOCUSED: Int = ???

    /** Primary state indicating the mouse is over the region. */
    @stub
    val MOUSE_OVER: Int = ???

    /** Primary state indicating the region is in a pressed state. */
    @stub
    val PRESSED: Int = ???
}
