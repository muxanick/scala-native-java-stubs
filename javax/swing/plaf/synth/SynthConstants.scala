package javax.swing.plaf.synth

// Constants used by Synth. Not all Components support all states. A
// Component will at least be in one of the primary states. That is, the
// return value from SynthContext.getComponentState() will at
// least be one of ENABLED, MOUSE_OVER,
// PRESSED or DISABLED, and may also contain
// FOCUSED, SELECTED or DEFAULT.
trait SynthConstants {
}

object SynthConstants {
    @stub
    // Indicates the region is the default.
    def DEFAULT: Int = ???

    @stub
    // Primary state indicating the region is not enabled.
    def DISABLED: Int = ???

    @stub
    // Primary state indicating the component is enabled.
    def ENABLED: Int = ???

    @stub
    // Indicates the region has focus.
    def FOCUSED: Int = ???

    @stub
    // Primary state indicating the mouse is over the region.
    def MOUSE_OVER: Int = ???

    @stub
    // Primary state indicating the region is in a pressed state.
    def PRESSED: Int = ???
}
