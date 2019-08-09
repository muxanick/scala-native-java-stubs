package javax.swing.plaf.basic

import java.awt.{Component.BaselineResizeBehavior, Dimension}
import java.lang.{Object, String}
import javax.swing.JComponent
import javax.swing.plaf.{ComponentUI, TextUI}
import javax.swing.text.{Element, View}

// Provides the look and feel for a plain text editor.  In this
// implementation the default UI is extended to act as a simple
// view factory.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class BasicTextAreaUI extends BasicTextUI {

    @stub
    // Creates the view for an element.
    def create(elem: Element): View = ???

    @stub
    // Returns the baseline.
    def getBaseline(c: JComponent, width: Int, height: Int): Int = ???

    @stub
    // Returns an enum indicating how the baseline of the component
    // changes as the size changes.
    def getBaselineResizeBehavior(c: JComponent): Component.BaselineResizeBehavior = ???

    @stub
    // The method is overridden to take into account caret width.
    def getMinimumSize(c: JComponent): Dimension = ???

    @stub
    // The method is overridden to take into account caret width.
    def getPreferredSize(c: JComponent): Dimension = ???

    @stub
    // Fetches the name used as a key to look up properties through the
    // UIManager.
    protected def getPropertyPrefix(): String = ???

    @stub
    // Initializes component properties, such as font, foreground,
    // background, caret color, selection color, selected text color,
    // disabled text color, and border color.
    protected def installDefaults(): Unit = ???
}

object BasicTextAreaUI {
    @stub
    // Creates a UI for a JTextArea.
    def createUI(ta: JComponent): ComponentUI = ???
}
