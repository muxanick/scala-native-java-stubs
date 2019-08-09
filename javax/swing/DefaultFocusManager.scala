package javax.swing

import java.awt.{Component, Container, DefaultKeyboardFocusManager, KeyboardFocusManager}
import java.lang.Object

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
class DefaultFocusManager extends FocusManager {

    /**  */
    @stub
    def compareTabOrder(a: Component, b: Component): Boolean = ???

    /**  */
    @stub
    def getComponentAfter(aContainer: Container, aComponent: Component): Component = ???

    /**  */
    @stub
    def getComponentBefore(aContainer: Container, aComponent: Component): Component = ???

    /**  */
    @stub
    def getFirstComponent(aContainer: Container): Component = ???
}
