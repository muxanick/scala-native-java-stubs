package java.net

import java.lang.{Class, Object}
import scala.scalanative.annotation.stub

/** The abstract class ContentHandler is the superclass
 *  of all classes that read an Object from a
 *  URLConnection.
 *  
 *  An application does not generally call the
 *  getContent method in this class directly. Instead, an
 *  application calls the getContent method in class
 *  URL or in URLConnection.
 *  The application's content handler factory (an instance of a class that
 *  implements the interface ContentHandlerFactory set
 *  up by a call to setContentHandler) is
 *  called with a String giving the MIME type of the
 *  object being received on the socket. The factory returns an
 *  instance of a subclass of ContentHandler, and its
 *  getContent method is called to create the object.
 *  
 *  If no content handler could be found, URLConnection will
 *  look for a content handler in a user-defineable set of places.
 *  By default it looks in sun.net.www.content, but users can define a
 *  vertical-bar delimited set of class prefixes to search through in
 *  addition by defining the java.content.handler.pkgs property.
 *  The class name must be of the form:
 *  
 *      {package-prefix}.{major}.{minor}
 *  e.g.
 *      YoyoDyne.experimental.text.plain
 *  
 *  If the loading of the content handler class would be performed by
 *  a classloader that is outside of the delegation chain of the caller,
 *  the JVM will need the RuntimePermission "getClassLoader".
 */
abstract class ContentHandler extends Object {

    /**  */
    @stub
    def this() = ???

    /** Given a URL connect stream positioned at the beginning of the
     *  representation of an object, this method reads that stream and
     *  creates an object from it.
     */
    def getContent(urlc: URLConnection): Object

    /** Given a URL connect stream positioned at the beginning of the
     *  representation of an object, this method reads that stream and
     *  creates an object that matches one of the types specified.
     */
    def getContent(urlc: URLConnection, classes: Array[Class]): Object
}
