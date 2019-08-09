package java.beans.beancontext

import java.beans.BeanInfo
import scala.scalanative.annotation.stub

/** A BeanContextServiceProvider implementor who wishes to provide explicit
 *  information about the services their bean may provide shall implement a
 *  BeanInfo class that implements this BeanInfo subinterface and provides
 *  explicit information about the methods, properties, events, etc, of their
 *  services.
 */
trait BeanContextServiceProviderBeanInfo extends BeanInfo {

    /** Gets a BeanInfo array, one for each
     *  service class or interface statically available
     *  from this ServiceProvider.
     */
    @stub
    def getServicesBeanInfo(): Array[BeanInfo] = ???
}
