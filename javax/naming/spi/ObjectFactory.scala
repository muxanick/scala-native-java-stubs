package javax.naming.spi

/** This interface represents a factory for creating an object.
 * 
 *  The JNDI framework allows for object implementations to
 *  be loaded in dynamically via object factories.
 *  For example, when looking up a printer bound in the name space,
 *  if the print service binds printer names to References, the printer
 *  Reference could be used to create a printer object, so that
 *  the caller of lookup can directly operate on the printer object
 *  after the lookup.
 *  An ObjectFactory is responsible
 *  for creating objects of a specific type.  In the above example,
 *  you may have a PrinterObjectFactory for creating Printer objects.
 * 
 *  An object factory must implement the ObjectFactory interface.
 *  In addition, the factory class must be public and must have a
 *  public constructor that accepts no parameters.
 * 
 *  The getObjectInstance() method of an object factory may
 *  be invoked multiple times, possibly using different parameters.
 *  The implementation is thread-safe.
 * 
 *  The mention of URL in the documentation for this class refers to
 *  a URL string as defined by RFC 1738 and its related RFCs. It is
 *  any string that conforms to the syntax described therein, and
 *  may not always have corresponding support in the java.net.URL
 *  class or Web browsers.
 */
trait ObjectFactory {
}
