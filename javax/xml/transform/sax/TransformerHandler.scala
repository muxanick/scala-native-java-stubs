package javax.xml.transform.sax

import java.lang.String
import javax.xml.transform.{Result, Transformer}
import org.xml.sax.{ContentHandler, DTDHandler}
import org.xml.sax.ext.LexicalHandler

// A TransformerHandler
// listens for SAX ContentHandler parse events and transforms
// them to a Result.
trait TransformerHandler extends ContentHandler , LexicalHandler , DTDHandler {

    @stub
    // Get the base ID (URI or system ID) from where relative
    // URLs will be resolved.
    def getSystemId(): String = ???

    @stub
    // Get the Transformer associated with this handler, which
    // is needed in order to set parameters and output properties.
    def getTransformer(): Transformer = ???

    @stub
    // Set  the Result associated with this
    // TransformerHandler to be used for the transformation.
    def setResult(result: Result): Unit = ???
}
