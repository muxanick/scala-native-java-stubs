package javax.xml.bind.helpers

import java.io.{File, OutputStream, Writer}
import java.lang.{Class, Object, String}
import javax.xml.bind.{Marshaller, Marshaller.Listener, ValidationEventHandler}
import javax.xml.bind.annotation.adapters.XmlAdapter
import javax.xml.bind.attachment.AttachmentMarshaller
import javax.xml.stream.{XMLEventWriter, XMLStreamWriter}
import javax.xml.validation.Schema
import scala.scalanative.annotation.stub

/** Partial default Marshaller implementation.
 * 
 *  
 *  This class provides a partial default implementation for the
 *  Marshaller interface.
 * 
 *  
 *  The only methods that a JAXB Provider has to implement are
 *  marshal(Object, javax.xml.transform.Result),
 *  marshal(Object, javax.xml.stream.XMLStreamWriter), and
 *  marshal(Object, javax.xml.stream.XMLEventWriter).
 */
abstract class AbstractMarshallerImpl extends Object with Marshaller {

    /**  */
    @stub
    def this() = ???

    /** Gets the adapter associated with the specified type. */
    def getAdapter[A <: XmlAdapter](type: Class[A]): A

    /**  */
    def getAttachmentMarshaller(): AttachmentMarshaller

    /** Convenience method for getting the current output encoding. */
    protected def getEncoding(): String

    /** Return the current event handler or the default event handler if one
     *  hasn't been set.
     */
    def getEventHandler(): ValidationEventHandler

    /** Gets the corresponding Java encoding name from an IANA name. */
    protected def getJavaEncoding(encoding: String): String

    /** Return Marshaller.Listener registered with this Marshaller. */
    def getListener(): Marshaller.Listener

    /** By default, the getNode method is unsupported and throw
     *  an UnsupportedOperationException.
     */
    def getNode(obj: Any): Node

    /** Convenience method for getting the current noNamespaceSchemaLocation. */
    protected def getNoNSSchemaLocation(): String

    /** Default implementation of the getProperty method handles
     *  the four defined properties in Marshaller.
     */
    def getProperty(name: String): Any

    /** Get the JAXP 1.3 Schema object
     *  being used to perform marshal-time validation.
     */
    def getSchema(): Schema

    /** Convenience method for getting the current schemaLocation. */
    protected def getSchemaLocation(): String

    /** Convenience method for getting the formatted output flag. */
    protected def isFormattedOutput(): Boolean

    /** Convenience method for getting the fragment flag. */
    protected def isFragment(): Boolean

    /** Marshal the content tree rooted at jaxbElement into SAX2 events. */
    def marshal(obj: Any, handler: ContentHandler): Unit

    /** Marshal the content tree rooted at jaxbElement into a file. */
    def marshal(jaxbElement: Any, output: File): Unit

    /** Marshal the content tree rooted at jaxbElement into a DOM tree. */
    def marshal(obj: Any, node: Node): Unit

    /** Marshal the content tree rooted at jaxbElement into an output stream. */
    def marshal(obj: Any, os: OutputStream): Unit

    /** Marshal the content tree rooted at jaxbElement into a Writer. */
    def marshal(obj: Any, w: Writer): Unit

    /** Marshal the content tree rooted at jaxbElement into a
     *  XMLEventWriter.
     */
    def marshal(obj: Any, writer: XMLEventWriter): Unit

    /** Marshal the content tree rooted at jaxbElement into a
     *  XMLStreamWriter.
     */
    def marshal(obj: Any, writer: XMLStreamWriter): Unit

    /** Associates a configured instance of XmlAdapter with this marshaller. */
    def setAdapter[A <: XmlAdapter](type: Class[A], adapter: A): Unit

    /** Associates a configured instance of XmlAdapter with this marshaller. */
    def setAdapter(adapter: XmlAdapter): Unit

    /** Associate a context that enables binary data within an XML document
     *  to be transmitted as XML-binary optimized attachment.
     */
    def setAttachmentMarshaller(am: AttachmentMarshaller): Unit

    /** Convenience method for setting the output encoding. */
    protected def setEncoding(encoding: String): Unit

    /** Allow an application to register a validation event handler. */
    def setEventHandler(handler: ValidationEventHandler): Unit

    /** Convenience method for setting the formatted output flag. */
    protected def setFormattedOutput(v: Boolean): Unit

    /** Convenience method for setting the fragment flag. */
    protected def setFragment(v: Boolean): Unit

    /** 
     *  Register marshal event callback Marshaller.Listener with this Marshaller.
     */
    def setListener(listener: Marshaller.Listener): Unit

    /** Convenience method for setting the noNamespaceSchemaLocation. */
    protected def setNoNSSchemaLocation(location: String): Unit

    /** Default implementation of the setProperty method handles
     *  the four defined properties in Marshaller.
     */
    def setProperty(name: String, value: Any): Unit

    /** Specify the JAXP 1.3 Schema
     *  object that should be used to validate subsequent marshal operations
     *  against.
     */
    def setSchema(schema: Schema): Unit

    /** Convenience method for setting the schemaLocation. */
    protected def setSchemaLocation(location: String): Unit
}
