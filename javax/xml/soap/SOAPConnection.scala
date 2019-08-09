package javax.xml.soap

import java.lang.Object

/** A point-to-point connection that a client can use for sending messages
 *  directly to a remote party (represented by a URL, for instance).
 *  
 *  The SOAPConnection class is optional. Some implementations may
 *  not implement this interface in which case the call to
 *  SOAPConnectionFactory.newInstance() (see below) will
 *  throw an UnsupportedOperationException.
 *  
 *  A client can obtain a SOAPConnection object using a
 *  SOAPConnectionFactory object as in the following example:
 *  
 *       SOAPConnectionFactory factory = SOAPConnectionFactory.newInstance();
 *       SOAPConnection con = factory.createConnection();
 *  
 *  A SOAPConnection object can be used to send messages
 *  directly to a URL following the request/response paradigm.  That is,
 *  messages are sent using the method call, which sends the
 *  message and then waits until it gets a reply.
 */
abstract class SOAPConnection extends Object {

    /** Sends the given message to the specified endpoint and blocks until
     *  it has returned the response.
     */
    def call(request: SOAPMessage, to: Object): SOAPMessage

    /** Closes this SOAPConnection object. */
    def close(): Unit
}
