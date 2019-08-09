package javax.accessibility

// Class AccessibleTable describes a user-interface component that
// presents data in a two-dimensional table format.
trait AccessibleTable {

    @stub
    // Returns the Accessible at a specified row and column
    // in the table.
    def getAccessibleAt(r: Int, c: Int): Accessible = ???

    @stub
    // Returns the caption for the table.
    def getAccessibleCaption(): Accessible = ???

    @stub
    // Returns the number of columns in the table.
    def getAccessibleColumnCount(): Int = ???

    @stub
    // Returns the description text of the specified column in the table.
    def getAccessibleColumnDescription(c: Int): Accessible = ???

    @stub
    // Returns the number of columns occupied by the Accessible at
    // a specified row and column in the table.
    def getAccessibleColumnExtentAt(r: Int, c: Int): Int = ???

    @stub
    // Returns the column headers as an AccessibleTable.
    def getAccessibleColumnHeader(): AccessibleTable = ???

    @stub
    // Returns the number of rows in the table.
    def getAccessibleRowCount(): Int = ???

    @stub
    // Returns the description of the specified row in the table.
    def getAccessibleRowDescription(r: Int): Accessible = ???

    @stub
    // Returns the number of rows occupied by the Accessible at
    // a specified row and column in the table.
    def getAccessibleRowExtentAt(r: Int, c: Int): Int = ???

    @stub
    // Returns the row headers as an AccessibleTable.
    def getAccessibleRowHeader(): AccessibleTable = ???

    @stub
    // Returns the summary description of the table.
    def getAccessibleSummary(): Accessible = ???

    @stub
    // Returns the selected columns in a table.
    def getSelectedAccessibleColumns(): Array[Int] = ???

    @stub
    // Returns the selected rows in a table.
    def getSelectedAccessibleRows(): Array[Int] = ???

    @stub
    // Returns a boolean value indicating whether the specified column
    // is selected.
    def isAccessibleColumnSelected(c: Int): Boolean = ???

    @stub
    // Returns a boolean value indicating whether the specified row
    // is selected.
    def isAccessibleRowSelected(r: Int): Boolean = ???

    @stub
    // Returns a boolean value indicating whether the accessible at
    // a specified row and column is selected.
    def isAccessibleSelected(r: Int, c: Int): Boolean = ???

    @stub
    // Sets the caption for the table.
    def setAccessibleCaption(a: Accessible): Unit = ???

    @stub
    // Sets the description text of the specified column in the table.
    def setAccessibleColumnDescription(c: Int, a: Accessible): Unit = ???

    @stub
    // Sets the column headers.
    def setAccessibleColumnHeader(table: AccessibleTable): Unit = ???

    @stub
    // Sets the description text of the specified row of the table.
    def setAccessibleRowDescription(r: Int, a: Accessible): Unit = ???

    @stub
    // Sets the row headers.
    def setAccessibleRowHeader(table: AccessibleTable): Unit = ???
}
