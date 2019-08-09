package javax.swing.plaf.synth

import java.awt.Graphics
import java.beans.PropertyChangeEvent
import java.lang.Object
import javax.swing.JComponent
import javax.swing.plaf.{ComponentUI, TextUI}
import javax.swing.plaf.basic.{BasicTextAreaUI, BasicTextUI}
import scala.scalanative.annotation.stub

/** Provides the look and feel for a plain text editor in the
 *  Synth look and feel. In this implementation the default UI
 *  is extended to act as a simple view factory.
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
class SynthTextAreaUI extends BasicTextAreaUI with SynthUI {

    /**  */
    @stub
    def this() = ???

    /** Returns the Context for the specified component. */
    @stub
    def getContext(c: JComponent): SynthContext = ???

    /** Initializes component properties, such as font, foreground,
     *  background, caret color, selection color, selected text color,
     *  disabled text color, and border color.
     */
    @stub
    protected def installDefaults(): Unit = ???

    /** Paints the specified component. */
    @stub
    protected def paint(context: SynthContext, g: Graphics): Unit = ???

    /** Paints a background for the view. */
    @stub
    protected def paintBackground(g: Graphics): Unit = ???

    /** Paints the border. */
    @stub
    def paintBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit = ???

    /** This method gets called when a bound property is changed
     *  on the associated JTextComponent.
     */
    @stub
    protected def propertyChange(evt: PropertyChangeEvent): Unit = ???

    /** Sets the component properties that have not been explicitly overridden
     *  to null.
     */
    @stub
    protected def uninstallDefaults(): Unit = ???

    /** Notifies this UI delegate to repaint the specified component. */
    @stub
    def update(g: Graphics, c: JComponent): Unit = ???
}

object SynthTextAreaUI {
    /** Creates a UI object for a JTextArea. */
    @stub
    def createUI(ta: JComponent): ComponentUI = ???
}
