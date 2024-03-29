package javax.swing.plaf.metal

import java.awt.{Dimension, Graphics}
import java.lang.Object
import javax.swing.{JComponent, JSeparator}
import javax.swing.plaf.{ComponentUI, SeparatorUI}
import javax.swing.plaf.basic.BasicSeparatorUI
import scala.scalanative.annotation.stub

/** A Metal L&F implementation of SeparatorUI.  This implementation
 *  is a "combined" view/controller.
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
class MetalSeparatorUI extends BasicSeparatorUI {

    /**  */
    @stub
    def this() = ???

    /** Returns the specified component's preferred size appropriate for
     *  the look and feel.
     */
    @stub
    def getPreferredSize(c: JComponent): Dimension = ???

    /**  */
    @stub
    protected def installDefaults(s: JSeparator): Unit = ???

    /** Paints the specified component appropriately for the look and feel. */
    @stub
    def paint(g: Graphics, c: JComponent): Unit = ???
}

object MetalSeparatorUI {
    /**  */
    @stub
    def createUI(c: JComponent): ComponentUI = ???
}
