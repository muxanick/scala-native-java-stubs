package javax.swing.text.html

import java.lang.Object
import javax.swing.text.MutableAttributeSet
import scala.scalanative.annotation.stub

/**  */
class HTMLDocument.HTMLReader.ParagraphAction extends HTMLDocument.HTMLReader.BlockAction {

    /**  */
    @stub
    def ParagraphAction() = ???

    /** Called when an end tag is seen for the
     *  type of tag this action was registered
     *  to.
     */
    @stub
    def end(t: HTML.Tag): Unit = ???

    /** Called when a start tag is seen for the
     *  type of tag this action was registered
     *  to.
     */
    @stub
    def start(t: HTML.Tag, a: MutableAttributeSet): Unit = ???
}
