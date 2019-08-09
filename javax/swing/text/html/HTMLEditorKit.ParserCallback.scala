package javax.swing.text.html

import java.lang.{Object, String}
import javax.swing.text.MutableAttributeSet

/** The result of parsing drives these callback methods.
 *  The open and close actions should be balanced.  The
 *  flush method will be the last method
 *  called, to give the receiver a chance to flush any
 *  pending data into the document.
 *  Refer to DocumentParser, the default parser used, for further
 *  information on the contents of the AttributeSets, the positions, and
 *  other info.
 */
object HTMLEditorKit.ParserCallback extends Object {

    /**  */
    @stub
    def flush(): Unit = ???

    /**  */
    @stub
    def handleComment(data: Array[Char], pos: Int): Unit = ???

    /** This is invoked after the stream has been parsed, but before
     *  flush.
     */
    @stub
    def handleEndOfLineString(eol: String): Unit = ???

    /**  */
    @stub
    def handleEndTag(t: HTML.Tag, pos: Int): Unit = ???

    /**  */
    @stub
    def handleError(errorMsg: String, pos: Int): Unit = ???

    /**  */
    @stub
    def handleSimpleTag(t: HTML.Tag, a: MutableAttributeSet, pos: Int): Unit = ???

    /**  */
    @stub
    def handleStartTag(t: HTML.Tag, a: MutableAttributeSet, pos: Int): Unit = ???
}
