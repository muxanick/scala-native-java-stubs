package javax.swing.plaf.basic

import java.awt.event.MouseEvent
import java.lang.{Object, String}
import javax.swing.{JComponent, JMenuItem, MenuElement, MenuSelectionManager}
import javax.swing.plaf.{ButtonUI, ComponentUI, MenuItemUI}
import scala.scalanative.annotation.stub

/** BasicRadioButtonMenuItem implementation */
class BasicRadioButtonMenuItemUI extends BasicMenuItemUI {

    /**  */
    @stub
    def this() = ???

    /**  */
    @stub
    protected def getPropertyPrefix(): String = ???

    /**  */
    @stub
    def processMouseEvent(item: JMenuItem, e: MouseEvent, path: Array[MenuElement], manager: MenuSelectionManager): Unit = ???
}

object BasicRadioButtonMenuItemUI {
    /**  */
    @stub
    def createUI(b: JComponent): ComponentUI = ???
}
