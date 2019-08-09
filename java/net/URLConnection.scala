package java.net

import java.io.{InputStream, OutputStream}
import java.lang.{Class, Object, String}
import java.security.Permission
import java.util.{List, Map}
import scala.scalanative.annotation.stub

/** The abstract class URLConnection is the superclass
 *  of all classes that represent a communications link between the
 *  application and a URL. Instances of this class can be used both to
 *  read from and to write to the resource referenced by the URL. In
 *  general, creating a connection to a URL is a multistep process:
 * 
 *  
 *  openConnection()
 *      connect()
 *  Manipulate parameters that affect the connection to the remote
 *          resource.
 *      Interact with the resource; query header fields and
 *          contents.
 *  
 *  ---------------------------->
 *  time
 * 
 *  
 *  The connection object is created by invoking the
 *      openConnection method on a URL.
 *  The setup parameters and general request properties are manipulated.
 *  The actual connection to the remote object is made, using the
 *     connect method.
 *  The remote object becomes available. The header fields and the contents
 *      of the remote object can be accessed.
 *  
 *  
 *  The setup parameters are modified using the following methods:
 *  
 *    setAllowUserInteraction
 *    setDoInput
 *    setDoOutput
 *    setIfModifiedSince
 *    setUseCaches
 *  
 *  
 *  and the general request properties are modified using the method:
 *  
 *    setRequestProperty
 *  
 *  
 *  Default values for the AllowUserInteraction and
 *  UseCaches parameters can be set using the methods
 *  setDefaultAllowUserInteraction and
 *  setDefaultUseCaches.
 *  
 *  Each of the above set methods has a corresponding
 *  get method to retrieve the value of the parameter or
 *  general request property. The specific parameters and general
 *  request properties that are applicable are protocol specific.
 *  
 *  The following methods are used to access the header fields and
 *  the contents after the connection is made to the remote object:
 *  
 *    getContent
 *    getHeaderField
 *    getInputStream
 *    getOutputStream
 *  
 *  
 *  Certain header fields are accessed frequently. The methods:
 *  
 *    getContentEncoding
 *    getContentLength
 *    getContentType
 *    getDate
 *    getExpiration
 *    getLastModifed
 *  
 *  
 *  provide convenient access to these fields. The
 *  getContentType method is used by the
 *  getContent method to determine the type of the remote
 *  object; subclasses may find it convenient to override the
 *  getContentType method.
 *  
 *  In the common case, all of the pre-connection parameters and
 *  general request properties can be ignored: the pre-connection
 *  parameters and request properties default to sensible values. For
 *  most clients of this interface, there are only two interesting
 *  methods: getInputStream and getContent,
 *  which are mirrored in the URL class by convenience methods.
 *  
 *  More information on the request properties and header fields of
 *  an http connection can be found at:
 *  
 *  http://www.ietf.org/rfc/rfc2616.txt
 *  
 * 
 *  Invoking the close() methods on the InputStream or OutputStream of an
 *  URLConnection after a request may free network resources associated with this
 *  instance, unless particular protocol specifications specify different behaviours
 *  for it.
 */
abstract class URLConnection extends Object {

    /** Constructs a URL connection to the specified URL. */
    @stub
    protected def this(url: URL) = ???

    /** If true, this URL is being examined in
     *  a context in which it makes sense to allow user interactions such
     *  as popping up an authentication dialog.
     */
    protected val allowUserInteraction: Boolean

    /** If false, this connection object has not created a
     *  communications link to the specified URL.
     */
    protected val connected: Boolean

    /** This variable is set by the setDoInput method. */
    protected val doInput: Boolean

    /** This variable is set by the setDoOutput method. */
    protected val doOutput: Boolean

    /** Some protocols support skipping the fetching of the object unless
     *  the object has been modified more recently than a certain time.
     */
    protected val ifModifiedSince: Long

    /** The URL represents the remote object on the World Wide Web to
     *  which this connection is opened.
     */
    protected val url: URL

    /** If true, the protocol is allowed to use caching
     *  whenever it can.
     */
    protected val useCaches: Boolean

    /** Adds a general request property specified by a
     *  key-value pair.
     */
    def addRequestProperty(key: String, value: String): Unit

    /** Opens a communications link to the resource referenced by this
     *  URL, if such a connection has not already been established.
     */
    def connect(): Unit

    /** Returns the value of the allowUserInteraction field for
     *  this object.
     */
    def getAllowUserInteraction(): Boolean

    /** Returns setting for connect timeout. */
    def getConnectTimeout(): Int

    /** Retrieves the contents of this URL connection. */
    def getContent(): Object

    /** Retrieves the contents of this URL connection. */
    def getContent(classes: Array[Class]): Object

    /** Returns the value of the content-encoding header field. */
    def getContentEncoding(): String

    /** Returns the value of the content-length header field. */
    def getContentLength(): Int

    /** Returns the value of the content-length header field as a
     *  long.
     */
    def getContentLengthLong(): Long

    /** Returns the value of the content-type header field. */
    def getContentType(): String

    /** Returns the value of the date header field. */
    def getDate(): Long

    /** Returns the default value of a URLConnection's
     *  useCaches flag.
     */
    def getDefaultUseCaches(): Boolean

    /** Returns the value of this URLConnection's
     *  doInput flag.
     */
    def getDoInput(): Boolean

    /** Returns the value of this URLConnection's
     *  doOutput flag.
     */
    def getDoOutput(): Boolean

    /** Returns the value of the expires header field. */
    def getExpiration(): Long

    /** Returns the value for the nth header field. */
    def getHeaderField(n: Int): String

    /** Returns the value of the named header field. */
    def getHeaderField(name: String): String

    /** Returns the value of the named field parsed as date. */
    def getHeaderFieldDate(name: String, Default: Long): Long

    /** Returns the value of the named field parsed as a number. */
    def getHeaderFieldInt(name: String, Default: Int): Int

    /** Returns the key for the nth header field. */
    def getHeaderFieldKey(n: Int): String

    /** Returns the value of the named field parsed as a number. */
    def getHeaderFieldLong(name: String, Default: Long): Long

    /** Returns an unmodifiable Map of the header fields. */
    def getHeaderFields(): Map[String, List[String]]

    /** Returns the value of this object's ifModifiedSince field. */
    def getIfModifiedSince(): Long

    /** Returns an input stream that reads from this open connection. */
    def getInputStream(): InputStream

    /** Returns the value of the last-modified header field. */
    def getLastModified(): Long

    /** Returns an output stream that writes to this connection. */
    def getOutputStream(): OutputStream

    /** Returns a permission object representing the permission
     *  necessary to make the connection represented by this
     *  object.
     */
    def getPermission(): Permission

    /** Returns setting for read timeout. */
    def getReadTimeout(): Int

    /** Returns an unmodifiable Map of general request
     *  properties for this connection.
     */
    def getRequestProperties(): Map[String, List[String]]

    /** Returns the value of the named general request property for this
     *  connection.
     */
    def getRequestProperty(key: String): String

    /** Returns the value of this URLConnection's URL
     *  field.
     */
    def getURL(): URL

    /** Returns the value of this URLConnection's
     *  useCaches field.
     */
    def getUseCaches(): Boolean

    /** Set the value of the allowUserInteraction field of
     *  this URLConnection.
     */
    def setAllowUserInteraction(allowuserinteraction: Boolean): Unit

    /** Sets a specified timeout value, in milliseconds, to be used
     *  when opening a communications link to the resource referenced
     *  by this URLConnection.
     */
    def setConnectTimeout(timeout: Int): Unit

    /** Sets the default value of the useCaches field to the
     *  specified value.
     */
    def setDefaultUseCaches(defaultusecaches: Boolean): Unit

    /** Sets the value of the doInput field for this
     *  URLConnection to the specified value.
     */
    def setDoInput(doinput: Boolean): Unit

    /** Sets the value of the doOutput field for this
     *  URLConnection to the specified value.
     */
    def setDoOutput(dooutput: Boolean): Unit

    /** Sets the value of the ifModifiedSince field of
     *  this URLConnection to the specified value.
     */
    def setIfModifiedSince(ifmodifiedsince: Long): Unit

    /** Sets the read timeout to a specified timeout, in
     *  milliseconds.
     */
    def setReadTimeout(timeout: Int): Unit

    /** Sets the general request property. */
    def setRequestProperty(key: String, value: String): Unit

    /** Sets the value of the useCaches field of this
     *  URLConnection to the specified value.
     */
    def setUseCaches(usecaches: Boolean): Unit

    /** Returns a String representation of this URL connection. */
    def toString(): String
}

object URLConnection {
    /** Returns the default value of the allowUserInteraction
     *  field.
     */
    @stub
    def getDefaultAllowUserInteraction(): Boolean = ???

    /** Deprecated. 
     * The instance specific getRequestProperty method
     *  should be used after an appropriate instance of URLConnection
     *  is obtained.
     * 
     */
    @stub
    def getDefaultRequestProperty(key: String): String = ???

    /** Loads filename map (a mimetable) from a data file. */
    @stub
    def getFileNameMap(): FileNameMap = ???

    /** Tries to determine the content type of an object, based
     *  on the specified "file" component of a URL.
     */
    @stub
    def guessContentTypeFromName(fname: String): String = ???

    /** Tries to determine the type of an input stream based on the
     *  characters at the beginning of the input stream.
     */
    @stub
    def guessContentTypeFromStream(is: InputStream): String = ???

    /** Sets the ContentHandlerFactory of an
     *  application.
     */
    @stub
    def setContentHandlerFactory(fac: ContentHandlerFactory): Unit = ???

    /** Sets the default value of the
     *  allowUserInteraction field for all future
     *  URLConnection objects to the specified value.
     */
    @stub
    def setDefaultAllowUserInteraction(defaultallowuserinteraction: Boolean): Unit = ???

    /** Deprecated. 
     * The instance specific setRequestProperty method
     *  should be used after an appropriate instance of URLConnection
     *  is obtained. Invoking this method will have no effect.
     * 
     */
    @stub
    def setDefaultRequestProperty(key: String, value: String): Unit = ???

    /** Sets the FileNameMap. */
    @stub
    def setFileNameMap(map: FileNameMap): Unit = ???
}
