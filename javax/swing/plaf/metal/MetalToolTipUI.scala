package javax.swing.plaf.metal

import java.awt.{Dimension, Graphics}
import java.lang.{Object, String}
import javax.swing.JComponent
import javax.swing.plaf.{ComponentUI, ToolTipUI}
import javax.swing.plaf.basic.BasicToolTipUI

/** A Metal L&F extension of BasicToolTipUI.
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
class MetalToolTipUI extends BasicToolTipUI {

    /**  */
    @stub
    def getAcceleratorString(): String = ???

    /** Returns the specified component's preferred size appropriate for
     *  the look and feel.
     */
    @stub
    def getPreferredSize(c: JComponent): Dimension = ???

    /** Configures the specified component appropriately for the look and feel. */
    @stub
    def installUI(c: JComponent): Unit = ???

    /**  */
    @stub
    protected def isAcceleratorHidden(): Boolean = ???

    /** Paints the specified component appropriately for the look and feel. */
    @stub
    def paint(g: Graphics, c: JComponent): Unit = ???
}

object MetalToolTipUI {
    /**  */
    @stub
    def createUI(c: JComponent): ComponentUI = ???
}
