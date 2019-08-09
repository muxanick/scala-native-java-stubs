package javax.swing.event

import java.lang.Object
import java.util.EventObject

// TableColumnModelEvent is used to notify listeners that a table
// column model has changed, such as a column was added, removed, or
// moved.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class TableColumnModelEvent extends EventObject {

    @stub
    // The index of the column from where it was moved or removed
    protected def fromIndex: Int = ???

    @stub
    // Returns the fromIndex.
    def getFromIndex(): Int = ???
}
