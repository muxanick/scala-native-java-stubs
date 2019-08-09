package javax.swing.text

import java.lang.{Object, String}

/** Used as a way to circumvent calling back into the Document to
 *  change it. Document implementations that wish to support
 *  a DocumentFilter must provide an implementation that will
 *  not callback into the DocumentFilter when the following methods
 *  are invoked from the DocumentFilter.
 */
object abstract DocumentFilter.FilterBypass extends Object {

    /** Returns the Document the mutation is occurring on. */
    @stub
    def getDocument(): Document

    /** Inserts the specified text, bypassing the
     *  DocumentFilter.
     */
    @stub
    def insertString(offset: Int, string: String, attr: AttributeSet): Unit

    /** Removes the specified region of text, bypassing the
     *  DocumentFilter.
     */
    @stub
    def remove(offset: Int, length: Int): Unit
}
