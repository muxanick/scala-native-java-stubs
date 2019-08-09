package javax.management

// This class is the interface to be implemented by MBeans that are meant to be
//  persistent.  MBeans supporting this interface should call the load method during
//  construction in order to prime the MBean from the persistent store.
//  In the case of a ModelMBean, the store method should be called by the MBeanServer based on the descriptors in
//  the ModelMBean or by the MBean itself during normal processing of the ModelMBean.
trait PersistentMBean {

    @stub
    // Instantiates thisMBean instance with the data found for
    // the MBean in the persistent store.
    def load(): Unit = ???
}