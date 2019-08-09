package javax.swing.plaf.basic

import java.lang.Object
import javax.swing.event.{TreeExpansionEvent, TreeExpansionListener}

/** Updates the TreeState in response to nodes expanding/collapsing. */
class BasicTreeUI.TreeExpansionHandler extends Object with TreeExpansionListener {

    /** Called whenever an item in the tree has been collapsed. */
    @stub
    def treeCollapsed(event: TreeExpansionEvent): Unit = ???
}
