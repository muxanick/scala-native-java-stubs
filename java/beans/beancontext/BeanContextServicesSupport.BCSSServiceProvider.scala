package java.beans.beancontext

import java.io.Serializable
import java.lang.Object
import scala.scalanative.annotation.stub

/** subclasses may subclass this nested class to add behaviors for
 *  each BeanContextServicesProvider.
 */
object protected BeanContextServicesSupport_BCSSServiceProvider extends Object with Serializable {

    /** The service provider. */
    @stub
    protected val serviceProvider: BeanContextServiceProvider = ???

    /** Returns the service provider. */
    @stub
    protected def getServiceProvider(): BeanContextServiceProvider = ???
}
