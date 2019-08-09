package javax.swing

import java.awt.{Component.AccessibleAWTComponent, Container.AccessibleAWTContainer, Frame.AccessibleAWTFrame, Window.AccessibleAWTWindow}
import java.lang.{Object, String}
import javax.accessibility.{AccessibleContext, AccessibleStateSet}
import scala.scalanative.annotation.stub

/** This class implements accessibility support for the
 *  JFrame class.  It provides an implementation of the
 *  Java Accessibility API appropriate to frame user-interface
 *  elements.
 */
protected class JFrame.AccessibleJFrame extends Frame.AccessibleAWTFrame {

    /**  */
    @stub
    protected def AccessibleJFrame() = ???

    /** Get the accessible name of this object. */
    @stub
    def getAccessibleName(): String = ???

    /** Get the state of this object. */
    @stub
    def getAccessibleStateSet(): AccessibleStateSet = ???
}
