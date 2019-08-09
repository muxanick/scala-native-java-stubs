package java.beans.beancontext

import java.beans.{DesignMode, Visibility}
import java.io.InputStream
import java.lang.{Object, String}
import java.net.URL
import java.util.Collection

// 
// The BeanContext acts a logical hierarchical container for JavaBeans.
// 
trait BeanContext extends BeanContextChild , Collection , DesignMode , Visibility {

    @stub
    // Adds the specified BeanContextMembershipListener
    // to receive BeanContextMembershipEvents from
    // this BeanContext whenever it adds
    // or removes a child Component(s).
    def addBeanContextMembershipListener(bcml: BeanContextMembershipListener): Unit = ???

    @stub
    // Analagous to java.lang.ClassLoader.getResource(), this
    // method allows a BeanContext implementation to interpose
    // behavior between the child Component
    // and underlying ClassLoader.
    def getResource(name: String, bcc: BeanContextChild): URL = ???

    @stub
    // Analagous to java.lang.ClassLoader.getResourceAsStream(),
    // this method allows a BeanContext implementation
    // to interpose behavior between the child Component
    // and underlying ClassLoader.
    def getResourceAsStream(name: String, bcc: BeanContextChild): InputStream = ???

    @stub
    // Instantiate the javaBean named as a
    // child of this BeanContext.
    def instantiateChild(beanName: String): Object = ???
}
