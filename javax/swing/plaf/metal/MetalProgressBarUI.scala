package javax.swing.plaf.metal

import java.awt.Graphics
import java.lang.Object
import javax.swing.JComponent
import javax.swing.plaf.{ComponentUI, ProgressBarUI}
import javax.swing.plaf.basic.BasicProgressBarUI

/** The Metal implementation of ProgressBarUI.
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
class MetalProgressBarUI extends BasicProgressBarUI {

    /** Draws a bit of special highlighting on the progress bar. */
    @stub
    def paintDeterminate(g: Graphics, c: JComponent): Unit = ???
}

object MetalProgressBarUI {
    /**  */
    @stub
    def createUI(c: JComponent): ComponentUI = ???
}
