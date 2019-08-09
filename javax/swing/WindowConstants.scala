package javax.swing

// Constants used to control the window-closing operation.
// The setDefaultCloseOperation and
// getDefaultCloseOperation methods
// provided by JFrame,
// JInternalFrame, and
// JDialog
// use these constants.
// For examples of setting the default window-closing operation, see
// Responding to Window-Closing Events,
// a section in The Java Tutorial.
trait WindowConstants {
}

object WindowConstants {
    @stub
    // The dispose-window default window close operation.
    def DISPOSE_ON_CLOSE: Int = ???

    @stub
    // The do-nothing default window close operation.
    def DO_NOTHING_ON_CLOSE: Int = ???

    @stub
    // The exit application default window close operation.
    def EXIT_ON_CLOSE: Int = ???
}
