package javax.swing.plaf.metal

import java.awt.{Component, Container}
import java.awt.event.MouseEvent
import java.lang.{Deprecated, Object}
import javax.swing.{JComboBox, JComponent, JPopupMenu}
import javax.swing.plaf.basic.BasicComboPopup
import scala.scalanative.annotation.stub

/** This class should be treated as a "protected" inner class.
 *  Instantiate it only within subclasses of MetalComboBoxUI.
 * 
 *  This class is now obsolete and doesn't do anything and
 *  is only included for backwards API compatibility. Do not call or
 *  override.
 */
@Deprecated class MetalComboBoxUI_MetalComboPopup extends BasicComboPopup {

    /** Deprecated.  */
    @stub
    def MetalComboPopup(cBox: JComboBox) = ???

    /** Deprecated.  */
    @stub
    def delegateFocus(e: MouseEvent): Unit = ???
}
