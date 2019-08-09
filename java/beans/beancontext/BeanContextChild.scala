package java.beans.beancontext

import java.beans.{PropertyChangeListener, VetoableChangeListener}
import java.lang.String
import scala.scalanative.annotation.stub

/** 
 *  JavaBeans wishing to be nested within, and obtain a reference to their
 *  execution environment, or context, as defined by the BeanContext
 *  sub-interface shall implement this interface.
 *  
 *  
 *  Conformant BeanContexts shall as a side effect of adding a BeanContextChild
 *  object shall pass a reference to itself via the setBeanContext() method of
 *  this interface.
 *  
 *  
 *  Note that a BeanContextChild may refuse a change in state by throwing
 *  PropertyVetoedException in response.
 *  
 *  
 *  In order for persistence mechanisms to function properly on BeanContextChild
 *  instances across a broad variety of scenarios, implementing classes of this
 *  interface are required to define as transient, any or all fields, or
 *  instance variables, that may contain, or represent, references to the
 *  nesting BeanContext instance or other resources obtained
 *  from the BeanContext via any unspecified mechanisms.
 *  
 */
trait BeanContextChild {

    /** Adds a PropertyChangeListener
     *  to this BeanContextChild
     *  in order to receive a PropertyChangeEvent
     *  whenever the specified property has changed.
     */
    @stub
    def addPropertyChangeListener(name: String, pcl: PropertyChangeListener): Unit = ???

    /** Adds a VetoableChangeListener to
     *  this BeanContextChild
     *  to receive events whenever the specified property changes.
     */
    @stub
    def addVetoableChangeListener(name: String, vcl: VetoableChangeListener): Unit = ???

    /** Gets the BeanContext associated
     *  with this BeanContextChild.
     */
    @stub
    def getBeanContext(): BeanContext = ???

    /** Removes a PropertyChangeListener from this
     *  BeanContextChild  so that it no longer
     *  receives PropertyChangeEvents when the
     *  specified property is changed.
     */
    @stub
    def removePropertyChangeListener(name: String, pcl: PropertyChangeListener): Unit = ???

    /** Removes a VetoableChangeListener from this
     *  BeanContextChild so that it no longer receives
     *  events when the specified property changes.
     */
    @stub
    def removeVetoableChangeListener(name: String, vcl: VetoableChangeListener): Unit = ???

    /** 
     *  Objects that implement this interface,
     *  shall fire a java.beans.PropertyChangeEvent, with parameters:
     * 
     *  propertyName "beanContext", oldValue (the previous nesting
     *  BeanContext instance, or null),
     *  newValue (the current nesting
     *  BeanContext instance, or null).
     */
    @stub
    def setBeanContext(bc: BeanContext): Unit = ???
}
