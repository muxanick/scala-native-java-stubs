package javax.swing.text.html

import java.lang.Object
import javax.swing.text.MutableAttributeSet
import scala.scalanative.annotation.stub

/** An action to be performed in response
 *  to parsing a tag.  This allows customization
 *  of how each tag is handled and avoids a large
 *  switch statement.
 */
class HTMLDocument_HTMLReader_TagAction extends Object {

    /**  */
    @stub
    def TagAction() = ???

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
