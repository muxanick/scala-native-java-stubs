package javax.swing

import java.beans.PropertyChangeListener
import java.lang.Object
import javax.swing.event.TreeSelectionListener
import javax.swing.tree.{DefaultTreeSelectionModel, RowMapper, TreePath}

/** EmptySelectionModel is a TreeSelectionModel
 *  that does not allow anything to be selected.
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
object protected JTree.EmptySelectionModel extends DefaultTreeSelectionModel {

    /** This is overriden to do nothing; EmptySelectionModel
     *  does not allow a selection.
     */
    @stub
    def addPropertyChangeListener(listener: PropertyChangeListener): Unit = ???

    /** This is overriden to do nothing; EmptySelectionModel
     *  does not allow a selection.
     */
    @stub
    def addSelectionPaths(paths: Array[TreePath]): Unit = ???

    /** This is overriden to do nothing; EmptySelectionModel
     *  does not allow a selection.
     */
    @stub
    def addTreeSelectionListener(listener: TreeSelectionListener): Unit = ???

    /** This is overriden to do nothing; EmptySelectionModel
     *  does not allow a selection.
     */
    @stub
    def removePropertyChangeListener(listener: PropertyChangeListener): Unit = ???

    /** This is overriden to do nothing; EmptySelectionModel
     *  does not allow a selection.
     */
    @stub
    def removeSelectionPaths(paths: Array[TreePath]): Unit = ???

    /** This is overriden to do nothing; EmptySelectionModel
     *  does not allow a selection.
     */
    @stub
    def removeTreeSelectionListener(listener: TreeSelectionListener): Unit = ???

    /** This is overriden to do nothing; EmptySelectionModel
     *  does not allow a selection.
     */
    @stub
    def setRowMapper(mapper: RowMapper): Unit = ???

    /** This is overriden to do nothing; EmptySelectionModel
     *  does not allow a selection.
     */
    @stub
    def setSelectionMode(mode: Int): Unit = ???

    /** This is overriden to do nothing; EmptySelectionModel
     *  does not allow a selection.
     */
    @stub
    def setSelectionPaths(paths: Array[TreePath]): Unit = ???
}
