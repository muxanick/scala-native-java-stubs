package javax.xml.soap

import java.lang.Object
import javax.xml.transform.dom.DOMResult

/** Acts as a holder for the results of a JAXP transformation or a JAXB
 *  marshalling, in the form of a SAAJ tree. These results should be accessed
 *  by using the getResult() method. The DOMResult.getNode()
 *  method should be avoided in almost all cases.
 */
class SAAJResult extends DOMResult {

    /** Creates a SAAJResult that will present results in the form
     *  of a SAAJ tree that supports the default (SOAP 1.1) protocol.
     */
    @stub
    def this() = ???

    /** Creates a SAAJResult that will write the results as a
     *  child node of the SOAPElement specified.
     */
    @stub
    def this(rootNode: SOAPElement) = ???

    /** Creates a SAAJResult that will write the results into the
     *  SOAPPart of the supplied SOAPMessage.
     */
    @stub
    def this(message: SOAPMessage) = ???
}
