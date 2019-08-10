package javax.swing.plaf.basic

import java.awt.event.{ItemEvent, ItemListener}
import java.lang.Object
import scala.scalanative.annotation.stub

/** This listener watches for changes to the selection in the
 *  combo box.
 *  
 *  This public inner class should be treated as protected.
 *  Instantiate it only within subclasses of
 *  BasicComboBoxUI.
 */
class BasicComboBoxUI_ItemHandler extends Object with ItemListener {

    /**  */
    @stub
    def ItemHandler() = ???

    /** Invoked when an item has been selected or deselected by the user. */
    @stub
    def itemStateChanged(e: ItemEvent): Unit = ???
}
