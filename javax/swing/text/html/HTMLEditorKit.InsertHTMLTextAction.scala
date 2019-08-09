package javax.swing.text.html

import java.awt.event.ActionEvent
import java.lang.{Object, String}
import javax.swing.{AbstractAction, JEditorPane}
import javax.swing.text.{Element, StyledEditorKit.StyledTextAction, TextAction}

/** InsertHTMLTextAction can be used to insert an arbitrary string of HTML
 *  into an existing HTML document. At least two HTML.Tags need to be
 *  supplied. The first Tag, parentTag, identifies the parent in
 *  the document to add the elements to. The second tag, addTag,
 *  identifies the first tag that should be added to the document as
 *  seen in the HTML string. One important thing to remember, is that
 *  the parser is going to generate all the appropriate tags, even if
 *  they aren't in the HTML string passed in.
 *  For example, lets say you wanted to create an action to insert
 *  a table into the body. The parentTag would be HTML.Tag.BODY,
 *  addTag would be HTML.Tag.TABLE, and the string could be something
 *  like <table><tr><td></td></tr></table>.
 *  There is also an option to supply an alternate parentTag and
 *  addTag. These will be checked for if there is no parentTag at
 *  offset.
 */
object HTMLEditorKit.InsertHTMLTextAction extends HTMLEditorKit.HTMLTextAction {

    /**  */
    @stub
    def InsertHTMLTextAction(name: String, html: String, parentTag: HTML.Tag, addTag: HTML.Tag) = ???

    /** Tag in HTML to start adding tags from. */
    @stub
    protected val addTag: HTML.Tag = ???

    /** Alternate tag in HTML to start adding tags from if parentTag
     *  is not found and alternateParentTag is found.
     */
    @stub
    protected val alternateAddTag: HTML.Tag = ???

    /** Alternate Tag to check for in the document if parentTag is
     *  not found.
     */
    @stub
    protected val alternateParentTag: HTML.Tag = ???

    /** HTML to insert. */
    @stub
    protected val html: String = ???

    /** Inserts the HTML into the document. */
    @stub
    def actionPerformed(ae: ActionEvent): Unit = ???

    /** This is invoked when inserting at a boundary. */
    @stub
    protected def insertAtBoundary(editor: JEditorPane, doc: HTMLDocument, offset: Int, insertElement: Element, html: String, parentTag: HTML.Tag, addTag: HTML.Tag): Unit = ???

    /** Deprecated. 
     * As of Java 2 platform v1.3, use insertAtBoundary
     * 
     */
    @stub
    protected def insertAtBoundry(editor: JEditorPane, doc: HTMLDocument, offset: Int, insertElement: Element, html: String, parentTag: HTML.Tag, addTag: HTML.Tag): Unit = ???
}
