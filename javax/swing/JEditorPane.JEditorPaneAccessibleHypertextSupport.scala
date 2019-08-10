package javax.swing

import java.awt.{Component.AccessibleAWTComponent, Container.AccessibleAWTContainer}
import java.lang.{Object, String}
import javax.accessibility.{AccessibleContext, AccessibleHyperlink, AccessibleHypertext}
import javax.swing.text.JTextComponent.AccessibleJTextComponent
import scala.scalanative.annotation.stub

/** What's returned by
 *  AccessibleJEditorPaneHTML.getAccessibleText.
 * 
 *  Provides support for AccessibleHypertext in case
 *  there is an HTML document being displayed in this
 *  JEditorPane.
 */
protected class JEditorPane_JEditorPaneAccessibleHypertextSupport extends JEditorPane.AccessibleJEditorPane with AccessibleHypertext {

    /** Make one of these puppies */
    @stub
    def JEditorPaneAccessibleHypertextSupport() = ???

    /**  */
    type HTMLLink = JEditorPane_JEditorPaneAccessibleHypertextSupport_HTMLLink

    /** Returns the index into an array of hyperlinks that
     *  index.
     */
    @stub
    def getLink(linkIndex: Int): AccessibleHyperlink = ???

    /** Returns the number of links within this hypertext doc. */
    @stub
    def getLinkCount(): Int = ???

    /** Returns the index into an array of hyperlinks that
     *  is associated with this character index, or -1 if there
     *  is no hyperlink associated with this index.
     */
    @stub
    def getLinkIndex(charIndex: Int): Int = ???

    /** Returns the contiguous text within the document that
     *  is associated with this hyperlink.
     */
    @stub
    def getLinkText(linkIndex: Int): String = ???
}
