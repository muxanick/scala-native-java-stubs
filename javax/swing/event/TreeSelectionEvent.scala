package javax.swing.event

import java.lang.Object
import java.util.EventObject
import javax.swing.tree.TreePath

/** An event that characterizes a change in the current
 *  selection.  The change is based on any number of paths.
 *  TreeSelectionListeners will generally query the source of
 *  the event for the new selected status of each potentially
 *  changed row.
 *  
 *  Warning:
 *  Serialized objects of this class will not be compatible with
 *  future Swing releases. The current serialization support is
 *  appropriate for short term storage or RMI between applications running
 *  the same version of Swing.  As of 1.4, support for long term storage
 *  of all JavaBeans™
 *  has been added to the java.beans package.
 *  Please see XMLEncoder.
 */
class TreeSelectionEvent extends EventObject {

    /** Represents a change in the selection of a TreeSelectionModel. */
    @stub
    def this(source: Object, paths: Array[TreePath], areNew: Array[Boolean], oldLeadSelectionPath: TreePath, newLeadSelectionPath: TreePath) = ???

    /** For each path identifies if that path is in fact new. */
    @stub
    protected val areNew: Array[Boolean] = ???

    /** leadSelectionPath after the paths changed, may be null. */
    @stub
    protected val newLeadSelectionPath: TreePath = ???

    /** leadSelectionPath before the paths changed, may be null. */
    @stub
    protected val oldLeadSelectionPath: TreePath = ???

    /** Returns a copy of the receiver, but with the source being newSource. */
    @stub
    def cloneWithSource(newSource: Object): Object = ???

    /** Returns the current lead path. */
    @stub
    def getNewLeadSelectionPath(): TreePath = ???

    /** Returns the path that was previously the lead path. */
    @stub
    def getOldLeadSelectionPath(): TreePath = ???

    /** Returns the first path element. */
    @stub
    def getPath(): TreePath = ???

    /** Returns the paths that have been added or removed from the
     *  selection.
     */
    @stub
    def getPaths(): Array[TreePath] = ???

    /** Returns whether the path identified by getPath was
     *  added to the selection.
     */
    @stub
    def isAddedPath(): Boolean = ???

    /** Returns whether the path at getPaths()[index] was added
     *  to the selection.
     */
    @stub
    def isAddedPath(index: Int): Boolean = ???
}
