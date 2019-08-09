package javax.imageio.spi

import java.lang.{Class, Object, String}
import java.util.Locale

/** A superinterface for functionality common to all Image I/O service
 *  provider interfaces (SPIs).  For more information on service
 *  provider classes, see the class comment for the
 *  IIORegistry class.
 */
abstract class IIOServiceProvider extends Object with RegisterableService {

    /** Constructs a blank IIOServiceProvider. */
    @stub
    def this() = ???

    /** A String to be returned from
     *  getVendorName, initially null.
     */
    protected val vendorName: String

    /** Returns a brief, human-readable description of this service
     *  provider and its associated implementation.
     */
    def getDescription(locale: Locale): String

    /** Returns the name of the vendor responsible for creating this
     *  service provider and its associated implementation.
     */
    def getVendorName(): String

    /** Returns a string describing the version
     *  number of this service provider and its associated
     *  implementation.
     */
    def getVersion(): String

    /** A callback that will be whenever the Spi class has been
     *  deregistered from a ServiceRegistry.
     */
    def onDeregistration(registry: ServiceRegistry, category: Class[_]): Unit
}
