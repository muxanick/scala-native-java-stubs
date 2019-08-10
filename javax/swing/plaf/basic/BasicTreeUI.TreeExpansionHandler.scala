package javax.swing.plaf.basic

import java.lang.Object
import javax.swing.event.{TreeExpansionEvent, TreeExpansionListener}
import scala.scalanative.annotation.stub

/** Updates the TreeState in response to nodes expanding/collapsing. */
class BasicTreeUI_TreeExpansionHandler extends Object with TreeExpansionListener {

    /**  */
    @stub
    def TreeExpansionHandler() = ???

    /** Called whenever an item in the tree has been collapsed. */
    @stub
    def treeCollapsed(event: TreeExpansionEvent): Unit = ???

    /** Called whenever an item in the tree has been expanded. */
    @stub
    def treeExpanded(event: TreeExpansionEvent): Unit = ???
}
