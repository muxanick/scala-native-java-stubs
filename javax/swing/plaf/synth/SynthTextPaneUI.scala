package javax.swing.plaf.synth

import java.awt.Graphics
import java.beans.PropertyChangeEvent
import java.lang.{Object, String}
import javax.swing.JComponent
import javax.swing.plaf.{ComponentUI, TextUI}
import javax.swing.plaf.basic.{BasicEditorPaneUI, BasicTextUI}
import scala.scalanative.annotation.stub

/** Provides the look and feel for a styled text editor in the
 *  Synth look and feel.
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
class SynthTextPaneUI extends SynthEditorPaneUI {

    /**  */
    @stub
    def this() = ???

    /** Fetches the name used as a key to lookup properties through the
     *  UIManager.
     */
    @stub
    protected def getPropertyPrefix(): String = ???

    /** Installs the UI for a component. */
    @stub
    def installUI(c: JComponent): Unit = ???

    /** Paints the border. */
    @stub
    def paintBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit = ???

    /** This method gets called when a bound property is changed
     *  on the associated JTextComponent.
     */
    @stub
    protected def propertyChange(evt: PropertyChangeEvent): Unit = ???
}

object SynthTextPaneUI {
    /** Creates a UI for the JTextPane. */
    @stub
    def createUI(c: JComponent): ComponentUI = ???
}
