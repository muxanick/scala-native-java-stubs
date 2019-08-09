package javax.xml.soap

import java.lang.Object
import scala.scalanative.annotation.stub

/** A factory for creating SOAPConnection objects. Implementation of this class
 *  is optional. If SOAPConnectionFactory.newInstance() throws an
 *  UnsupportedOperationException then the implementation does not support the
 *  SAAJ communication infrastructure. Otherwise SOAPConnection objects
 *  can be created by calling createConnection() on the newly
 *  created SOAPConnectionFactory object.
 */
abstract class SOAPConnectionFactory extends Object {

    /**  */
    @stub
    def this() = ???

    /** Create a new SOAPConnection. */
    def createConnection(): SOAPConnection
}

object SOAPConnectionFactory {
    /** Creates an instance of the default
     *  SOAPConnectionFactory object.
     */
    @stub
    def newInstance(): SOAPConnectionFactory = ???
}
