package javax.swing.event

import java.lang.Object
import java.util.EventObject
import javax.swing.tree.TreePath

// An event that characterizes a change in the current
// selection.  The change is based on any number of paths.
// TreeSelectionListeners will generally query the source of
// the event for the new selected status of each potentially
// changed row.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class TreeSelectionEvent extends EventObject {

    @stub
    // Represents a change in the selection of a TreeSelectionModel.
    def this(source: Object, paths: Array[TreePath], areNew: Array[Boolean], oldLeadSelectionPath: TreePath, newLeadSelectionPath: TreePath) = ???

    @stub
    // For each path identifies if that path is in fact new.
    protected def areNew: Array[Boolean] = ???

    @stub
    // leadSelectionPath after the paths changed, may be null.
    protected def newLeadSelectionPath: TreePath = ???

    @stub
    // leadSelectionPath before the paths changed, may be null.
    protected def oldLeadSelectionPath: TreePath = ???

    @stub
    // Returns a copy of the receiver, but with the source being newSource.
    def cloneWithSource(newSource: Object): Object = ???

    @stub
    // Returns the current lead path.
    def getNewLeadSelectionPath(): TreePath = ???

    @stub
    // Returns the path that was previously the lead path.
    def getOldLeadSelectionPath(): TreePath = ???

    @stub
    // Returns the first path element.
    def getPath(): TreePath = ???

    @stub
    // Returns the paths that have been added or removed from the
    // selection.
    def getPaths(): Array[TreePath] = ???

    @stub
    // Returns whether the path identified by getPath was
    // added to the selection.
    def isAddedPath(): Boolean = ???

    @stub
    // Returns whether the path at getPaths()[index] was added
    // to the selection.
    def isAddedPath(index: Int): Boolean = ???
}
