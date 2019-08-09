package javax.xml.xpath

import java.lang.{ClassLoader, Object, String}
import scala.scalanative.annotation.stub

/** An XPathFactory instance can be used to create
 *  XPath objects.
 * 
 * See newInstance(String uri) for lookup mechanism.
 * 
 *  The XPathFactory class is not thread-safe. In other words,
 *  it is the application's responsibility to ensure that at most
 *  one thread is using a XPathFactory object at any
 *  given moment. Implementations are encouraged to mark methods
 *  as synchronized to protect themselves from broken clients.
 * 
 *  XPathFactory is not re-entrant. While one of the
 *  newInstance methods is being invoked, applications
 *  may not attempt to recursively invoke a newInstance method,
 *  even from the same thread.
 */
abstract class XPathFactory extends Object {

    /** Protected constructor as newInstance() or newInstance(String uri)
     *  or newInstance(String uri, String factoryClassName, ClassLoader classLoader)
     *  should be used to create a new instance of an XPathFactory.
     */
    @stub
    protected def this() = ???

    /** Get the state of the named feature. */
    def getFeature(name: String): Boolean

    /** Is specified object model supported by this XPathFactory? */
    def isObjectModelSupported(objectModel: String): Boolean

    /** Return a new XPath using the underlying object
     *  model determined when the XPathFactory was instantiated.
     */
    def newXPath(): XPath

    /** Set a feature for this XPathFactory and
     *  XPaths created by this factory.
     */
    def setFeature(name: String, value: Boolean): Unit

    /** Establish a default function resolver. */
    def setXPathFunctionResolver(resolver: XPathFunctionResolver): Unit

    /** Establish a default variable resolver. */
    def setXPathVariableResolver(resolver: XPathVariableResolver): Unit
}

object XPathFactory {
    /** Default Object Model URI. */
    @stub
    val DEFAULT_OBJECT_MODEL_URI: String = ???

    /** The default property name according to the JAXP spec. */
    @stub
    val DEFAULT_PROPERTY_NAME: String = ???

    /** Get a new XPathFactory instance using the default object model,
     *  DEFAULT_OBJECT_MODEL_URI,
     *  the W3C DOM.
     */
    @stub
    def newInstance(): XPathFactory = ???

    /** Get a new XPathFactory instance using the specified object model. */
    @stub
    def newInstance(uri: String): XPathFactory = ???

    /** Obtain a new instance of a XPathFactory from a factory class name. */
    @stub
    def newInstance(uri: String, factoryClassName: String, classLoader: ClassLoader): XPathFactory = ???
}
