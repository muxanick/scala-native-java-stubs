package javax.swing.plaf

import java.awt.Graphics
import java.lang.Object
import javax.swing.JSplitPane

/** Pluggable look and feel interface for JSplitPane. */
abstract class SplitPaneUI extends ComponentUI {

    /** Messaged after the JSplitPane the receiver is providing the look
     *  and feel for paints its children.
     */
    def finishedPaintingChildren(jc: JSplitPane, g: Graphics): Unit

    /** Returns the location of the divider. */
    def getDividerLocation(jc: JSplitPane): Int

    /** Returns the maximum possible location of the divider. */
    def getMaximumDividerLocation(jc: JSplitPane): Int

    /** Returns the minimum possible location of the divider. */
    def getMinimumDividerLocation(jc: JSplitPane): Int

    /** Messaged to relayout the JSplitPane based on the preferred size
     *  of the children components.
     */
    def resetToPreferredSizes(jc: JSplitPane): Unit
}
