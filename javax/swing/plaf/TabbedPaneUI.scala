package javax.swing.plaf

import java.awt.Rectangle
import java.lang.Object
import javax.swing.JTabbedPane

/** Pluggable look and feel interface for JTabbedPane. */
abstract class TabbedPaneUI extends ComponentUI {

    /**  */
    def getTabBounds(pane: JTabbedPane, index: Int): Rectangle

    /**  */
    def getTabRunCount(pane: JTabbedPane): Int
}
