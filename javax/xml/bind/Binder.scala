package javax.xml.bind

import java.lang.{Class, Object, String}
import javax.xml.validation.Schema
import scala.scalanative.annotation.stub

/** Enable synchronization between XML infoset nodes and JAXB objects
 *  representing same XML document.
 * 
 *  
 *  An instance of this class maintains the association between XML nodes of
 *  an infoset preserving view and a JAXB representation of an XML document.
 *  Navigation between the two views is provided by the methods
 *  getXMLNode(Object) and getJAXBNode(Object).
 * 
 *  
 *  Modifications can be made to either the infoset preserving view or the
 *  JAXB representation of the document while the other view remains
 *  unmodified. The binder is able to synchronize the changes made in the
 *  modified view back into the other view using the appropriate
 *  Binder update methods, updateXML(Object, Object) or
 *  updateJAXB(Object).
 * 
 *  
 *  A typical usage scenario is the following:
 *  
 *    load XML document into an XML infoset representation
 *    unmarshal(Object) XML infoset view to JAXB view.
 *        (Note to conserve resources, it is possible to only unmarshal a
 *        subtree of the XML infoset view to the JAXB view.)
 *    application access/updates JAXB view of XML document.
 *    updateXML(Object) synchronizes modifications to JAXB view
 *        back into the XML infoset view. Update operation preserves as
 *        much of original XML infoset as possible (i.e. comments, PI, ...)
 *  
 * 
 *  
 *  A Binder instance is created using the factory method
 *  JAXBContext.createBinder() or JAXBContext.createBinder(Class).
 * 
 *  
 *  The template parameter, XmlNode, is the
 *  root interface/class for the XML infoset preserving representation.
 *  A Binder implementation is required to minimally support
 *  an XmlNode value of org.w3c.dom.Node.class.
 *  A Binder implementation can support alternative XML infoset
 *  preserving representations.
 */
abstract class Binder[XmlNode] extends Object {

    /**  */
    @stub
    def this() = ???

    /** Return the current event handler or the default event handler if one
     *  hasn't been set.
     */
    def getEventHandler(): ValidationEventHandler

    /** Gets the JAXB object associated with the given XML element. */
    def getJAXBNode(xmlNode: XmlNode): Any

    /** Get the particular property in the underlying implementation of
     *  Binder.
     */
    def getProperty(name: String): Any

    /** Gets the last Schema object (including null) set by the
     *  setSchema(Schema) method.
     */
    def getSchema(): Schema

    /** Gets the XML element associated with the given JAXB object. */
    def getXMLNode(jaxbObject: Any): XmlNode

    /** Marshal a JAXB object tree to a new XML document. */
    def marshal(jaxbObject: Any, xmlNode: XmlNode): Unit

    /** Allow an application to register a ValidationEventHandler. */
    def setEventHandler(handler: ValidationEventHandler): Unit

    /** Set the particular property in the underlying implementation of
     *  Binder.
     */
    def setProperty(name: String, value: Any): Unit

    /** Specifies whether marshal, unmarshal and update methods
     *  performs validation on their XML content.
     */
    def setSchema(schema: Schema): Unit

    /** Unmarshal XML infoset view to a JAXB object tree. */
    def unmarshal(xmlNode: XmlNode): Any

    /** Unmarshal XML root element by provided declaredType
     *  to a JAXB object tree.
     */
    val JAXBElement[T]: abstract[T]

    /** Takes an XML node and updates its associated JAXB object and its descendants. */
    def updateJAXB(xmlNode: XmlNode): Any

    /** Takes an JAXB object and updates
     *  its associated XML node and its descendants.
     */
    def updateXML(jaxbObject: Any): XmlNode

    /** Changes in JAXB object tree are updated in its associated XML parse tree. */
    def updateXML(jaxbObject: Any, xmlNode: XmlNode): XmlNode
}
