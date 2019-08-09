package java.beans

import java.io.InputStream
import java.lang.{AutoCloseable, ClassLoader, Object}
import org.xml.sax.InputSource
import org.xml.sax.helpers.DefaultHandler

// The XMLDecoder class is used to read XML documents
// created using the XMLEncoder and is used just like
// the ObjectInputStream. For example, one can use
// the following fragment to read the first object defined
// in an XML document written by the XMLEncoder
// class:
// 
//       XMLDecoder d = new XMLDecoder(
//                          new BufferedInputStream(
//                              new FileInputStream("Test.xml")));
//       Object result = d.readObject();
//       d.close();
// 
//
//
// For more information you might also want to check out
// Long Term Persistence of JavaBeans Components: XML Schema,
// an article in The Swing Connection.
class XMLDecoder extends Object with AutoCloseable {

    @stub
    // Creates a new decoder to parse XML archives
    // created by the XMLEncoder class.
    def this(is: InputSource) = ???

    @stub
    // Creates a new input stream for reading archives
    // created by the XMLEncoder class.
    def this(in: InputStream) = ???

    @stub
    // Creates a new input stream for reading archives
    // created by the XMLEncoder class.
    def this(in: InputStream, owner: Object) = ???

    @stub
    // Creates a new input stream for reading archives
    // created by the XMLEncoder class.
    def this(in: InputStream, owner: Object, exceptionListener: ExceptionListener) = ???

    @stub
    // This method closes the input stream associated
    // with this stream.
    def close(): Unit = ???

    @stub
    // Gets the exception handler for this stream.
    def getExceptionListener(): ExceptionListener = ???

    @stub
    // Gets the owner of this decoder.
    def getOwner(): Object = ???

    @stub
    // Reads the next object from the underlying input stream.
    def readObject(): Object = ???

    @stub
    // Sets the exception handler for this stream to exceptionListener.
    def setExceptionListener(exceptionListener: ExceptionListener): Unit = ???
}

object XMLDecoder {
    @stub
    // Creates a new handler for SAX parser
    // that can be used to parse embedded XML archives
    // created by the XMLEncoder class.
    def createHandler(owner: Object, el: ExceptionListener, cl: ClassLoader): DefaultHandler = ???
}
