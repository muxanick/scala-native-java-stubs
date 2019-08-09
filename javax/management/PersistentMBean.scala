package javax.management

import scala.scalanative.annotation.stub

/** This class is the interface to be implemented by MBeans that are meant to be
 *   persistent.  MBeans supporting this interface should call the load method during
 *   construction in order to prime the MBean from the persistent store.
 *   In the case of a ModelMBean, the store method should be called by the MBeanServer based on the descriptors in
 *   the ModelMBean or by the MBean itself during normal processing of the ModelMBean.
 */
trait PersistentMBean {

    /** Instantiates thisMBean instance with the data found for
     *  the MBean in the persistent store.
     */
    @stub
    def load(): Unit = ???

    /** Captures the current state of this MBean instance and
     *  writes it out to the persistent store.
     */
    @stub
    def store(): Unit = ???
}
