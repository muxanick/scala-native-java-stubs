package javax.swing.plaf.basic

import java.lang.Object
import javax.swing.JMenu
import javax.swing.event.ChangeListener

// As of Java 2 platform 1.4, this previously undocumented class
// is now obsolete. KeyBindings are now managed by the popup menu.
class BasicMenuUI.ChangeHandler extends Object with ChangeListener {

    @stub
    // 
    def isSelected: Boolean = ???

    @stub
    // 
    def menu: JMenu = ???

    @stub
    // 
    def ui: BasicMenuUI = ???
}
