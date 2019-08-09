package javax.swing.plaf.metal

import java.beans.PropertyChangeListener
import java.lang.Object
import javax.swing.{JComponent, JScrollPane}
import javax.swing.plaf.{ComponentUI, ScrollPaneUI}
import javax.swing.plaf.basic.BasicScrollPaneUI

/** A Metal L&F implementation of ScrollPaneUI.
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
class MetalScrollPaneUI extends BasicScrollPaneUI {

    /**  */
    @stub
    protected def createScrollBarSwapListener(): PropertyChangeListener = ???

    /**  */
    @stub
    def installListeners(scrollPane: JScrollPane): Unit = ???

    /** Configures the specified component appropriately for the look and feel. */
    @stub
    def installUI(c: JComponent): Unit = ???

    /**  */
    @stub
    protected def uninstallListeners(c: JComponent): Unit = ???

    /** Deprecated. 
     * - Replaced by uninstallListeners(JComponent)
     * 
     */
    @stub
    def uninstallListeners(scrollPane: JScrollPane): Unit = ???
}

object MetalScrollPaneUI {
    /**  */
    @stub
    def createUI(x: JComponent): ComponentUI = ???
}
