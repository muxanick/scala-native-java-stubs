package javax.xml.stream

import java.lang.String
import javax.xml.namespace.NamespaceContext
import javax.xml.stream.events.XMLEvent
import javax.xml.stream.util.XMLEventConsumer

// This is the top level interface for writing XML documents.
//
// Instances of this interface are not required to validate the
// form of the XML.
trait XMLEventWriter extends XMLEventConsumer {

    @stub
    // Add an event to the output stream
    // Adding a START_ELEMENT will open a new namespace scope that
    // will be closed when the corresponding END_ELEMENT is written.
    def add(event: XMLEvent): Unit = ???

    @stub
    // Adds an entire stream to an output stream,
    // calls next() on the inputStream argument until hasNext() returns false
    // This should be treated as a convenience method that will
    // perform the following loop over all the events in an
    // event reader and call add on each event.
    def add(reader: XMLEventReader): Unit = ???

    @stub
    // Frees any resources associated with this stream
    def close(): Unit = ???

    @stub
    // Writes any cached events to the underlying output mechanism
    def flush(): Unit = ???

    @stub
    // Returns the current namespace context.
    def getNamespaceContext(): NamespaceContext = ???

    @stub
    // Gets the prefix the uri is bound to
    def getPrefix(uri: String): String = ???

    @stub
    // Binds a URI to the default namespace
    // This URI is bound
    // in the scope of the current START_ELEMENT / END_ELEMENT pair.
    def setDefaultNamespace(uri: String): Unit = ???

    @stub
    // Sets the current namespace context for prefix and uri bindings.
    def setNamespaceContext(context: NamespaceContext): Unit = ???
}
