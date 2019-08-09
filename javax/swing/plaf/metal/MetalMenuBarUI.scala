package javax.swing.plaf.metal

import java.lang.Object
import javax.swing.JComponent
import javax.swing.plaf.{ComponentUI, MenuBarUI}
import javax.swing.plaf.basic.BasicMenuBarUI

/** Metal implementation of MenuBarUI. This class is responsible
 *  for providing the metal look and feel for JMenuBars.
 */
class MetalMenuBarUI extends BasicMenuBarUI {

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
}

object MetalMenuBarUI {
    /** Creates the ComponentUI implementation for the passed
     *  in component.
     */
    @stub
    def createUI(x: JComponent): ComponentUI = ???
}
