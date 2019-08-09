package javax.swing.plaf.basic

import java.lang.Object
import javax.swing.event.{TreeExpansionEvent, TreeExpansionListener}

// Updates the TreeState in response to nodes expanding/collapsing.
class BasicTreeUI.TreeExpansionHandler extends Object with TreeExpansionListener {

    @stub
    // Called whenever an item in the tree has been collapsed.
    def treeCollapsed(event: TreeExpansionEvent): Unit = ???
}
