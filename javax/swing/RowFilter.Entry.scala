package javax.swing

import java.lang.{Object, String}

// An Entry object is passed to instances of
// RowFilter, allowing the filter to get the value of the
// entry's data, and thus to determine whether the entry should be shown.
// An Entry object contains information about the model
// as well as methods for getting the underlying values from the model.
object abstract RowFilter.Entry[M, I] extends Object {

    @stub
    // Returns the identifer (in the model) of the entry.
    def getIdentifier(): I

    @stub
    // Returns the underlying model.
    def getModel(): M

    @stub
    // Returns the string value at the specified index.
    def getStringValue(index: Int): String = ???

    @stub
    // Returns the value at the specified index.
    def getValue(index: Int): Object
}
