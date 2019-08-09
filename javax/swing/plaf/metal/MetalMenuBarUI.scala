package javax.swing.plaf.metal

import java.awt.Graphics
import java.lang.Object
import javax.swing.JComponent
import javax.swing.plaf.{ComponentUI, MenuBarUI}
import javax.swing.plaf.basic.BasicMenuBarUI
import scala.scalanative.annotation.stub

/** Metal implementation of MenuBarUI. This class is responsible
 *  for providing the metal look and feel for JMenuBars.
 */
class MetalMenuBarUI extends BasicMenuBarUI {

    /**  */
    @stub
    def this() = ???

    /** Configures the specified component appropriate for the metal look and
     *  feel.
     */
    @stub
    def installUI(c: JComponent): Unit = ???

    /** Reverses configuration which was done on the specified component during
     *  installUI.
     */
    @stub
    def uninstallUI(c: JComponent): Unit = ???

    /** If necessary paints the background of the component, then
     *  invokes paint.
     */
    @stub
    def update(g: Graphics, c: JComponent): Unit = ???
}

object MetalMenuBarUI {
    /** Creates the ComponentUI implementation for the passed
     *  in component.
     */
    @stub
    def createUI(x: JComponent): ComponentUI = ???
}
