package javax.accessibility

import scala.scalanative.annotation.stub

/** The AccessibleTableModelChange interface describes a change to
 *  the table model.  The attributes of the model change can be
 *  obtained by the following methods:
 *  
 *   public int getType()
 *   public int getFirstRow();
 *   public int getLastRow();
 *   public int getFirstColumn();
 *   public int getLastColumn();
 *  
 *  The model change type returned by getType() will be one of:
 *  
 *   INSERT - one or more rows and/or columns have been inserted
 *   UPDATE - some of the table data has changed
 *   DELETE - one or more rows and/or columns have been deleted
 *  
 *  The affected area of the table can be determined by the other
 *  four methods which specify ranges of rows and columns
 */
trait AccessibleTableModelChange {

    /** Returns the first column that changed. */
    @stub
    def getFirstColumn(): Int = ???

    /** Returns the first row that changed. */
    @stub
    def getFirstRow(): Int = ???

    /** Returns the last column that changed. */
    @stub
    def getLastColumn(): Int = ???

    /** Returns the last row that changed. */
    @stub
    def getLastRow(): Int = ???

    /** Returns the type of event. */
    @stub
    def getType(): Int = ???
}

object AccessibleTableModelChange {
    /** Identifies the deletion of rows and/or columns. */
    @stub
    val DELETE: Int = ???

    /** Identifies the insertion of new rows and/or columns. */
    @stub
    val INSERT: Int = ???

    /** Identifies a change to existing data. */
    @stub
    val UPDATE: Int = ???
}
