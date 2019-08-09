package javax.swing

import java.lang.Object
import javax.accessibility.AccessibleTableModelChange
import scala.scalanative.annotation.stub

/**  */
protected class JTable.AccessibleJTable.AccessibleJTableModelChange extends Object with AccessibleTableModelChange {

    /**  */
    @stub
    protected def AccessibleJTableModelChange(type: Int, firstRow: Int, lastRow: Int, firstColumn: Int, lastColumn: Int) = ???

    /**  */
    @stub
    protected val firstColumn: Int = ???

    /**  */
    @stub
    protected val firstRow: Int = ???

    /**  */
    @stub
    protected val lastColumn: Int = ???

    /**  */
    @stub
    protected val lastRow: Int = ???

    /**  */
    @stub
    protected val type: Int = ???

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
