package javax.swing.text

import java.lang.{Object, String}

// Used as a way to circumvent calling back into the Document to
// change it. Document implementations that wish to support
// a DocumentFilter must provide an implementation that will
// not callback into the DocumentFilter when the following methods
// are invoked from the DocumentFilter.
object abstract DocumentFilter.FilterBypass extends Object {

    @stub
    // Returns the Document the mutation is occurring on.
    def getDocument(): Document

    @stub
    // Inserts the specified text, bypassing the
    // DocumentFilter.
    def insertString(offset: Int, string: String, attr: AttributeSet): Unit

    @stub
    // Removes the specified region of text, bypassing the
    // DocumentFilter.
    def remove(offset: Int, length: Int): Unit
}
