package java.beans

import java.io.InputStream
import java.lang.{AutoCloseable, ClassLoader, Object}
import scala.scalanative.annotation.stub

/** The XMLDecoder class is used to read XML documents
 *  created using the XMLEncoder and is used just like
 *  the ObjectInputStream. For example, one can use
 *  the following fragment to read the first object defined
 *  in an XML document written by the XMLEncoder
 *  class:
 *  
 *        XMLDecoder d = new XMLDecoder(
 *                           new BufferedInputStream(
 *                               new FileInputStream("Test.xml")));
 *        Object result = d.readObject();
 *        d.close();
 *  
 * 
 * 
 *  For more information you might also want to check out
 *  Long Term Persistence of JavaBeans Components: XML Schema,
 *  an article in The Swing Connection.
 */
class XMLDecoder extends Object with AutoCloseable {

    /** Creates a new decoder to parse XML archives
     *  created by the XMLEncoder class.
     */
    @stub
    def this(is: InputSource) = ???

    /** Creates a new input stream for reading archives
     *  created by the XMLEncoder class.
     */
    @stub
    def this(in: InputStream) = ???

    /** Creates a new input stream for reading archives
     *  created by the XMLEncoder class.
     */
    @stub
    def this(in: InputStream, owner: Object) = ???

    /** Creates a new input stream for reading archives
     *  created by the XMLEncoder class.
     */
    @stub
    def this(in: InputStream, owner: Object, exceptionListener: ExceptionListener) = ???

    /** Creates a new input stream for reading archives
     *  created by the XMLEncoder class.
     */
    @stub
    def this(in: InputStream, owner: Object, exceptionListener: ExceptionListener, cl: ClassLoader) = ???

    /** This method closes the input stream associated
     *  with this stream.
     */
    @stub
    def close(): Unit = ???

    /** Gets the exception handler for this stream. */
    @stub
    def getExceptionListener(): ExceptionListener = ???

    /** Gets the owner of this decoder. */
    @stub
    def getOwner(): Object = ???

    /** Reads the next object from the underlying input stream. */
    @stub
    def readObject(): Object = ???

    /** Sets the exception handler for this stream to exceptionListener. */
    @stub
    def setExceptionListener(exceptionListener: ExceptionListener): Unit = ???

    /** Sets the owner of this decoder to owner. */
    @stub
    def setOwner(owner: Object): Unit = ???
}

object XMLDecoder {
    /** Creates a new handler for SAX parser
     *  that can be used to parse embedded XML archives
     *  created by the XMLEncoder class.
     */
    @stub
    def createHandler(owner: Object, el: ExceptionListener, cl: ClassLoader): DefaultHandler = ???
}
