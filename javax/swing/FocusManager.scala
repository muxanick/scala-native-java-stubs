package javax.swing

import java.awt.{DefaultKeyboardFocusManager, KeyboardFocusManager}
import java.lang.Object

// This class has been obsoleted by the 1.4 focus APIs. While client code may
// still use this class, developers are strongly encouraged to use
// java.awt.KeyboardFocusManager and
// java.awt.DefaultKeyboardFocusManager instead.
// 
// Please see
// 
// How to Use the Focus Subsystem,
// a section in The Java Tutorial, and the
// Focus Specification
// for more information.
abstract class FocusManager extends DefaultKeyboardFocusManager {
}

object FocusManager {
    @stub
    // Deprecated. 
    //as of 1.4, replaced by
    // KeyboardFocusManager.setDefaultFocusTraversalPolicy(FocusTraversalPolicy)
    //
    def disableSwingFocusManager(): Unit = ???

    @stub
    // Returns the current KeyboardFocusManager instance
    // for the calling thread's context.
    def getCurrentManager(): FocusManager = ???

    @stub
    // Deprecated. 
    //As of 1.4, replaced by
    //   KeyboardFocusManager.getDefaultFocusTraversalPolicy()
    //
    def isFocusManagerEnabled(): Boolean = ???
}
