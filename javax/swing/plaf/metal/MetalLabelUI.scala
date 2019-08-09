package javax.swing.plaf.metal

import java.lang.Object
import javax.swing.JComponent
import javax.swing.plaf.{ComponentUI, LabelUI}
import javax.swing.plaf.basic.BasicLabelUI

/** A Windows L&F implementation of LabelUI.  This implementation
 *  is completely static, i.e. there's only one UIView implementation
 *  that's shared by all JLabel objects.
 */
class MetalLabelUI extends BasicLabelUI {
}

object MetalLabelUI {
    /**  */
    @stub
    def createUI(c: JComponent): ComponentUI = ???
}
