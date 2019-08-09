package javax.swing

import java.awt.{DefaultKeyboardFocusManager, KeyboardFocusManager}
import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** This class has been obsoleted by the 1.4 focus APIs. While client code may
 *  still use this class, developers are strongly encouraged to use
 *  java.awt.KeyboardFocusManager and
 *  java.awt.DefaultKeyboardFocusManager instead.
 *  
 *  Please see
 *  
 *  How to Use the Focus Subsystem,
 *  a section in The Java Tutorial, and the
 *  Focus Specification
 *  for more information.
 */
abstract class FocusManager extends DefaultKeyboardFocusManager {

    /**  */
    @stub
    def this() = ???
}

object FocusManager {
    /** This field is obsolete, and its use is discouraged since its
     *  specification is incompatible with the 1.4 focus APIs.
     */
    @stub
    val FOCUS_MANAGER_CLASS_PROPERTY: String = ???

    /** Deprecated. 
     * as of 1.4, replaced by
     *  KeyboardFocusManager.setDefaultFocusTraversalPolicy(FocusTraversalPolicy)
     * 
     */
    @stub
    def disableSwingFocusManager(): Unit = ???

    /** Returns the current KeyboardFocusManager instance
     *  for the calling thread's context.
     */
    @stub
    def getCurrentManager(): FocusManager = ???

    /** Deprecated. 
     * As of 1.4, replaced by
     *    KeyboardFocusManager.getDefaultFocusTraversalPolicy()
     * 
     */
    @stub
    def isFocusManagerEnabled(): Boolean = ???

    /** Sets the current KeyboardFocusManager instance
     *  for the calling thread's context.
     */
    @stub
    def setCurrentManager(aFocusManager: FocusManager): Unit = ???
}
