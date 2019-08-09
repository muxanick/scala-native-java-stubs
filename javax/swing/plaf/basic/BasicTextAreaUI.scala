package javax.swing.plaf.basic

import java.awt.{Component.BaselineResizeBehavior, Dimension}
import java.lang.{Object, String}
import javax.swing.JComponent
import javax.swing.plaf.{ComponentUI, TextUI}
import javax.swing.text.{Element, View}

/** Provides the look and feel for a plain text editor.  In this
 *  implementation the default UI is extended to act as a simple
 *  view factory.
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
class BasicTextAreaUI extends BasicTextUI {

    /** Creates the view for an element. */
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

    /** The method is overridden to take into account caret width. */
    @stub
    def getMinimumSize(c: JComponent): Dimension = ???

    /** The method is overridden to take into account caret width. */
    @stub
    def getPreferredSize(c: JComponent): Dimension = ???

    /** Fetches the name used as a key to look up properties through the
     *  UIManager.
     */
    @stub
    protected def getPropertyPrefix(): String = ???

    /** Initializes component properties, such as font, foreground,
     *  background, caret color, selection color, selected text color,
     *  disabled text color, and border color.
     */
    @stub
    protected def installDefaults(): Unit = ???
}

object BasicTextAreaUI {
    /** Creates a UI for a JTextArea. */
    @stub
    def createUI(ta: JComponent): ComponentUI = ???
}
