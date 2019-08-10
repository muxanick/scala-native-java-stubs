package javax.swing.text

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** Used as a way to circumvent calling back into the Document to
 *  change it. Document implementations that wish to support
 *  a DocumentFilter must provide an implementation that will
 *  not callback into the DocumentFilter when the following methods
 *  are invoked from the DocumentFilter.
 */
object abstract DocumentFilter_FilterBypass extends Object {

    /**  */
    @stub
    def FilterBypass() = ???

    /** Returns the Document the mutation is occurring on. */
    def getDocument(): Document

    /** Inserts the specified text, bypassing the
     *  DocumentFilter.
     */
    def insertString(offset: Int, string: String, attr: AttributeSet): Unit

    /** Removes the specified region of text, bypassing the
     *  DocumentFilter.
     */
    def remove(offset: Int, length: Int): Unit

    /** Deletes the region of text from offset to
     *  offset + length, and replaces it with
     *   text.
     */
    def replace(offset: Int, length: Int, string: String, attrs: AttributeSet): Unit
}
