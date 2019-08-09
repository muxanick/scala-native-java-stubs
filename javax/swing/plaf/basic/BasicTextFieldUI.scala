package javax.swing.plaf.basic

import java.awt.Component.BaselineResizeBehavior
import java.lang.{Object, String}
import javax.swing.JComponent
import javax.swing.plaf.{ComponentUI, TextUI}
import javax.swing.text.{Element, View}
import scala.scalanative.annotation.stub

/** Basis of a look and feel for a JTextField.
 *  
 *  Warning:
 *  Serialized objects of this class will not be compatible with
 *  future Swing releases. The current serialization support is
 *  appropriate for short term storage or RMI between applications running
 *  the same version of Swing.  As of 1.4, support for long term storage
 *  of all JavaBeans™
 *  has been added to the java.beans package.
 *  Please see XMLEncoder.
 */
class BasicTextFieldUI extends BasicTextUI {

    /** Creates a new BasicTextFieldUI. */
    @stub
    def this() = ???

    /** Creates a view (FieldView) based on an element. */
    @stub
    def create(elem: Element): View = ???

    /** Returns the baseline. */
    @stub
    def getBaseline(c: JComponent, width: Int, height: Int): Int = ???

    /** Returns an enum indicating how the baseline of the component
     *  changes as the size changes.
     */
    @stub
    def getBaselineResizeBehavior(c: JComponent): Component.BaselineResizeBehavior = ???

    /** Fetches the name used as a key to lookup properties through the
     *  UIManager.
     */
    @stub
    protected def getPropertyPrefix(): String = ???
}

object BasicTextFieldUI {
    /** Creates a UI for a JTextField. */
    @stub
    def createUI(c: JComponent): ComponentUI = ???
}
