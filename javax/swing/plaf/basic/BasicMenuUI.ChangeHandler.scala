package javax.swing.plaf.basic

import java.awt.Component
import java.lang.Object
import javax.swing.JMenu
import javax.swing.event.{ChangeEvent, ChangeListener}
import scala.scalanative.annotation.stub

/** As of Java 2 platform 1.4, this previously undocumented class
 *  is now obsolete. KeyBindings are now managed by the popup menu.
 */
class BasicMenuUI_ChangeHandler extends Object with ChangeListener {

    /**  */
    @stub
    def ChangeHandler(m: JMenu, ui: BasicMenuUI) = ???

    /**  */
    @stub
    val isSelected: Boolean = ???

    /**  */
    @stub
    val menu: JMenu = ???

    /**  */
    @stub
    val ui: BasicMenuUI = ???

    /**  */
    @stub
    val wasFocused: Component = ???

    /** Invoked when the target of the listener has changed its state. */
    @stub
    def stateChanged(e: ChangeEvent): Unit = ???
}
