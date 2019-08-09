package javax.xml.transform.sax

import java.lang.String
import javax.xml.transform.{Result, Transformer}
import scala.scalanative.annotation.stub

/** A TransformerHandler
 *  listens for SAX ContentHandler parse events and transforms
 *  them to a Result.
 */
trait TransformerHandler extends ContentHandler with LexicalHandler with DTDHandler {

    /** Get the base ID (URI or system ID) from where relative
     *  URLs will be resolved.
     */
    @stub
    def getSystemId(): String = ???

    /** Get the Transformer associated with this handler, which
     *  is needed in order to set parameters and output properties.
     */
    @stub
    def getTransformer(): Transformer = ???

    /** Set  the Result associated with this
     *  TransformerHandler to be used for the transformation.
     */
    @stub
    def setResult(result: Result): Unit = ???

    /** Set the base ID (URI or system ID) from where relative
     *  URLs will be resolved.
     */
    @stub
    def setSystemId(systemID: String): Unit = ???
}
