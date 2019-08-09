package java.beans.beancontext

import java.beans.{PropertyChangeListener, VetoableChangeListener}
import java.lang.String

// 
// JavaBeans wishing to be nested within, and obtain a reference to their
// execution environment, or context, as defined by the BeanContext
// sub-interface shall implement this interface.
// 
// 
// Conformant BeanContexts shall as a side effect of adding a BeanContextChild
// object shall pass a reference to itself via the setBeanContext() method of
// this interface.
// 
// 
// Note that a BeanContextChild may refuse a change in state by throwing
// PropertyVetoedException in response.
// 
// 
// In order for persistence mechanisms to function properly on BeanContextChild
// instances across a broad variety of scenarios, implementing classes of this
// interface are required to define as transient, any or all fields, or
// instance variables, that may contain, or represent, references to the
// nesting BeanContext instance or other resources obtained
// from the BeanContext via any unspecified mechanisms.
// 
trait BeanContextChild {

    @stub
    // Adds a PropertyChangeListener
    // to this BeanContextChild
    // in order to receive a PropertyChangeEvent
    // whenever the specified property has changed.
    def addPropertyChangeListener(name: String, pcl: PropertyChangeListener): Unit = ???

    @stub
    // Adds a VetoableChangeListener to
    // this BeanContextChild
    // to receive events whenever the specified property changes.
    def addVetoableChangeListener(name: String, vcl: VetoableChangeListener): Unit = ???

    @stub
    // Gets the BeanContext associated
    // with this BeanContextChild.
    def getBeanContext(): BeanContext = ???

    @stub
    // Removes a PropertyChangeListener from this
    // BeanContextChild  so that it no longer
    // receives PropertyChangeEvents when the
    // specified property is changed.
    def removePropertyChangeListener(name: String, pcl: PropertyChangeListener): Unit = ???

    @stub
    // Removes a VetoableChangeListener from this
    // BeanContextChild so that it no longer receives
    // events when the specified property changes.
    def removeVetoableChangeListener(name: String, vcl: VetoableChangeListener): Unit = ???
}
