package javax.swing.text.html

import java.io.Reader
import java.lang.Object
import scala.scalanative.annotation.stub

/** Interface to be supported by the parser.  This enables
 *  providing a different parser while reusing some of the
 *  implementation provided by this editor kit.
 */
object abstract HTMLEditorKit_Parser extends Object {

    /**  */
    @stub
    def Parser() = ???

    /** Parse the given stream and drive the given callback
     *  with the results of the parse.
     */
    def parse(r: Reader, cb: HTMLEditorKit.ParserCallback, ignoreCharSet: Boolean): Unit
}
