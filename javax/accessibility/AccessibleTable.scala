package javax.accessibility

import scala.scalanative.annotation.stub

/** Class AccessibleTable describes a user-interface component that
 *  presents data in a two-dimensional table format.
 */
trait AccessibleTable {

    /** Returns the Accessible at a specified row and column
     *  in the table.
     */
    @stub
    def getAccessibleAt(r: Int, c: Int): Accessible = ???

    /** Returns the caption for the table. */
    @stub
    def getAccessibleCaption(): Accessible = ???

    /** Returns the number of columns in the table. */
    @stub
    def getAccessibleColumnCount(): Int = ???

    /** Returns the description text of the specified column in the table. */
    @stub
    def getAccessibleColumnDescription(c: Int): Accessible = ???

    /** Returns the number of columns occupied by the Accessible at
     *  a specified row and column in the table.
     */
    @stub
    def getAccessibleColumnExtentAt(r: Int, c: Int): Int = ???

    /** Returns the column headers as an AccessibleTable. */
    @stub
    def getAccessibleColumnHeader(): AccessibleTable = ???

    /** Returns the number of rows in the table. */
    @stub
    def getAccessibleRowCount(): Int = ???

    /** Returns the description of the specified row in the table. */
    @stub
    def getAccessibleRowDescription(r: Int): Accessible = ???

    /** Returns the number of rows occupied by the Accessible at
     *  a specified row and column in the table.
     */
    @stub
    def getAccessibleRowExtentAt(r: Int, c: Int): Int = ???

    /** Returns the row headers as an AccessibleTable. */
    @stub
    def getAccessibleRowHeader(): AccessibleTable = ???

    /** Returns the summary description of the table. */
    @stub
    def getAccessibleSummary(): Accessible = ???

    /** Returns the selected columns in a table. */
    @stub
    def getSelectedAccessibleColumns(): Array[Int] = ???

    /** Returns the selected rows in a table. */
    @stub
    def getSelectedAccessibleRows(): Array[Int] = ???

    /** Returns a boolean value indicating whether the specified column
     *  is selected.
     */
    @stub
    def isAccessibleColumnSelected(c: Int): Boolean = ???

    /** Returns a boolean value indicating whether the specified row
     *  is selected.
     */
    @stub
    def isAccessibleRowSelected(r: Int): Boolean = ???

    /** Returns a boolean value indicating whether the accessible at
     *  a specified row and column is selected.
     */
    @stub
    def isAccessibleSelected(r: Int, c: Int): Boolean = ???

    /** Sets the caption for the table. */
    @stub
    def setAccessibleCaption(a: Accessible): Unit = ???

    /** Sets the description text of the specified column in the table. */
    @stub
    def setAccessibleColumnDescription(c: Int, a: Accessible): Unit = ???

    /** Sets the column headers. */
    @stub
    def setAccessibleColumnHeader(table: AccessibleTable): Unit = ???

    /** Sets the description text of the specified row of the table. */
    @stub
    def setAccessibleRowDescription(r: Int, a: Accessible): Unit = ???

    /** Sets the row headers. */
    @stub
    def setAccessibleRowHeader(table: AccessibleTable): Unit = ???

    /** Sets the summary description of the table */
    @stub
    def setAccessibleSummary(a: Accessible): Unit = ???
}
