package javax.swing.text

import java.lang.{Object, String}

/** DocumentFilter, as the name implies, is a filter for the
 *  Document mutation methods. When a Document
 *  containing a DocumentFilter is modified (either through
 *  insert or remove), it forwards the appropriate
 *  method invocation to the DocumentFilter. The
 *  default implementation allows the modification to
 *  occur. Subclasses can filter the modifications by conditionally invoking
 *  methods on the superclass, or invoking the necessary methods on
 *  the passed in FilterBypass. Subclasses should NOT call back
 *  into the Document for the modification
 *  instead call into the superclass or the FilterBypass.
 *  
 *  When remove or insertString is invoked
 *  on the DocumentFilter, the DocumentFilter
 *  may callback into the
 *  FilterBypass multiple times, or for different regions, but
 *  it should not callback into the FilterBypass after returning
 *  from the remove or insertString method.
 *  
 *  By default, text related document mutation methods such as
 *  insertString, replace and remove
 *  in AbstractDocument use DocumentFilter when
 *  available, and Element related mutation methods such as
 *  create, insert and removeElement in
 *  DefaultStyledDocument do not use DocumentFilter.
 *  If a method doesn't follow these defaults, this must be explicitly stated
 *  in the method documentation.
 */
class DocumentFilter extends Object {

    /** Invoked prior to insertion of text into the
     *  specified Document.
     */
    @stub
    def insertString(fb: DocumentFilter.FilterBypass, offset: Int, string: String, attr: AttributeSet): Unit = ???

    /** Invoked prior to removal of the specified region in the
     *  specified Document.
     */
    @stub
    def remove(fb: DocumentFilter.FilterBypass, offset: Int, length: Int): Unit = ???
}
