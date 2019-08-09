package javax.swing.tree

import scala.scalanative.annotation.stub

/** Defines the requirements for an object that translates paths in
 *  the tree into display rows.
 */
trait RowMapper {

    /** Returns the rows that the TreePath instances in path
     *  are being displayed at.
     */
    @stub
    def getRowsForPaths(path: Array[TreePath]): Array[Int] = ???
}
