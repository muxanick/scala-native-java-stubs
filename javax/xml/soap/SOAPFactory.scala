package javax.xml.soap

import java.lang.{Object, String}
import javax.xml.namespace.QName
import org.w3c.dom.Element

/** SOAPFactory is a factory for creating various objects
 *  that exist in the SOAP XML tree.
 * 
 *  SOAPFactory can be
 *  used to create XML fragments that will eventually end up in the
 *  SOAP part. These fragments can be inserted as children of the
 *  SOAPHeaderElement or SOAPBodyElement or
 *  SOAPEnvelope or other SOAPElement objects.
 * 
 *  SOAPFactory also has methods to create
 *  javax.xml.soap.Detail objects as well as
 *  java.xml.soap.Name objects.
 */
abstract class SOAPFactory extends Object {

    /** Creates a new Detail object which serves as a container
     *  for DetailEntry objects.
     */
    def createDetail(): Detail

    /** Creates a SOAPElement object from an existing DOM
     *  Element.
     */
    def createElement(domElement: Element): SOAPElement

    /** Creates a SOAPElement object initialized with the
     *  given Name object.
     */
    def createElement(name: Name): SOAPElement

    /** Creates a SOAPElement object initialized with the
     *  given QName object.
     */
    def createElement(qname: QName): SOAPElement

    /** Creates a SOAPElement object initialized with the
     *  given local name.
     */
    def createElement(localName: String): SOAPElement

    /** Creates a new SOAPElement object with the given
     *  local name, prefix and uri.
     */
    def createElement(localName: String, prefix: String, uri: String): SOAPElement

    /** Creates a new default SOAPFault object */
    def createFault(): SOAPFault

    /** Creates a new SOAPFault object initialized with the given reasonText
     *   and faultCode
     */
    def createFault(reasonText: String, faultCode: QName): SOAPFault

    /** Creates a new Name object initialized with the
     *  given local name.
     */
    def createName(localName: String): Name

    /** Creates a new Name object initialized with the
     *  given local name, namespace prefix, and namespace URI.
     */
    def createName(localName: String, prefix: String, uri: String): Name
}

object SOAPFactory {
    /** Creates a new SOAPFactory object that is an instance of
     *  the default implementation (SOAP 1.1),
     * 
     *  This method uses the following ordered lookup procedure to determine the SOAPFactory implementation class to load:
     *  
     *    Use the javax.xml.soap.SOAPFactory system property.
     */
    @stub
    def newInstance(): SOAPFactory = ???
}
