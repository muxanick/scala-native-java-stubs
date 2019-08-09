package javax.swing.text.html.parser

import java.io.{Reader, Serializable}
import java.lang.{Object, String}
import javax.swing.text.html.{HTMLEditorKit.Parser, HTMLEditorKit.ParserCallback}
import scala.scalanative.annotation.stub

/** Responsible for starting up a new DocumentParser
 *  each time its parse method is invoked. Stores a
 *  reference to the dtd.
 */
class ParserDelegator extends HTMLEditorKit.Parser with Serializable {

    /**  */
    @stub
    def this() = ???

    /** Parse the given stream and drive the given callback
     *  with the results of the parse.
     */
    @stub
    def parse(r: Reader, cb: HTMLEditorKit.ParserCallback, ignoreCharSet: Boolean): Unit = ???
}

object ParserDelegator {
    /**  */
    @stub
    protected def createDTD(dtd: DTD, name: String): DTD = ???

    /**  */
    @stub
    protected def setDefaultDTD(): Unit = ???
}
