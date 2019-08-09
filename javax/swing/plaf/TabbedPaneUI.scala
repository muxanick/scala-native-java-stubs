package javax.swing.plaf

import java.awt.Rectangle
import java.lang.Object
import javax.swing.JTabbedPane
import scala.scalanative.annotation.stub

/** Pluggable look and feel interface for JTabbedPane. */
abstract class TabbedPaneUI extends ComponentUI {

    /**  */
    @stub
    def this() = ???

    /**  */
    def getTabBounds(pane: JTabbedPane, index: Int): Rectangle

    /**  */
    def getTabRunCount(pane: JTabbedPane): Int

    /**  */
    def tabForCoordinate(pane: JTabbedPane, x: Int, y: Int): Int
}
