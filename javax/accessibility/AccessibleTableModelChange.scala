package javax.accessibility

// The AccessibleTableModelChange interface describes a change to
// the table model.  The attributes of the model change can be
// obtained by the following methods:
// 
//  public int getType()
//  public int getFirstRow();
//  public int getLastRow();
//  public int getFirstColumn();
//  public int getLastColumn();
// 
// The model change type returned by getType() will be one of:
// 
//  INSERT - one or more rows and/or columns have been inserted
//  UPDATE - some of the table data has changed
//  DELETE - one or more rows and/or columns have been deleted
// 
// The affected area of the table can be determined by the other
// four methods which specify ranges of rows and columns
trait AccessibleTableModelChange {

    @stub
    // Returns the first column that changed.
    def getFirstColumn(): Int = ???

    @stub
    // Returns the first row that changed.
    def getFirstRow(): Int = ???

    @stub
    // Returns the last column that changed.
    def getLastColumn(): Int = ???

    @stub
    // Returns the last row that changed.
    def getLastRow(): Int = ???
}

object AccessibleTableModelChange {
    @stub
    // Identifies the deletion of rows and/or columns.
    def DELETE: Int = ???

    @stub
    // Identifies the insertion of new rows and/or columns.
    def INSERT: Int = ???
}
