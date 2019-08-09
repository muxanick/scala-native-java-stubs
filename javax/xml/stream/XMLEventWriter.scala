package javax.xml.stream

import java.lang.String
import javax.xml.namespace.NamespaceContext
import javax.xml.stream.events.XMLEvent
import javax.xml.stream.util.XMLEventConsumer
import scala.scalanative.annotation.stub

/** This is the top level interface for writing XML documents.
 * 
 *  Instances of this interface are not required to validate the
 *  form of the XML.
 */
trait XMLEventWriter extends XMLEventConsumer {

    /** Add an event to the output stream
     *  Adding a START_ELEMENT will open a new namespace scope that
     *  will be closed when the corresponding END_ELEMENT is written.
     */
    @stub
    def add(event: XMLEvent): Unit = ???

    /** Adds an entire stream to an output stream,
     *  calls next() on the inputStream argument until hasNext() returns false
     *  This should be treated as a convenience method that will
     *  perform the following loop over all the events in an
     *  event reader and call add on each event.
     */
    @stub
    def add(reader: XMLEventReader): Unit = ???

    /** Frees any resources associated with this stream */
    @stub
    def close(): Unit = ???

    /** Writes any cached events to the underlying output mechanism */
    @stub
    def flush(): Unit = ???

    /** Returns the current namespace context. */
    @stub
    def getNamespaceContext(): NamespaceContext = ???

    /** Gets the prefix the uri is bound to */
    @stub
    def getPrefix(uri: String): String = ???

    /** Binds a URI to the default namespace
     *  This URI is bound
     *  in the scope of the current START_ELEMENT / END_ELEMENT pair.
     */
    @stub
    def setDefaultNamespace(uri: String): Unit = ???

    /** Sets the current namespace context for prefix and uri bindings. */
    @stub
    def setNamespaceContext(context: NamespaceContext): Unit = ???

    /** Sets the prefix the uri is bound to. */
    @stub
    def setPrefix(prefix: String, uri: String): Unit = ???
}
