package javax.swing

import java.io.Serializable
import java.lang.{Class, Object}
import java.util.EventListener
import javax.swing.event.ListDataListener

// The abstract definition for the data model that provides
// a List with its contents.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
abstract class AbstractListModel[E] extends Object with ListModel[E], with Serializable {

    // Adds a listener to the list that's notified each time a change
    // to the data model occurs.
    def addListDataListener(l: ListDataListener): Unit

    // AbstractListModel subclasses must call this method
    // after
    // one or more elements of the list change.
    protected def fireContentsChanged(source: Object, index0: Int, index1: Int): Unit

    // AbstractListModel subclasses must call this method
    // after
    // one or more elements are added to the model.
    protected def fireIntervalAdded(source: Object, index0: Int, index1: Int): Unit

    // AbstractListModel subclasses must call this method
    // after one or more elements are removed from the model.
    protected def fireIntervalRemoved(source: Object, index0: Int, index1: Int): Unit

    // Returns an array of all the list data listeners
    // registered on this AbstractListModel.
    def getListDataListeners(): Array[ListDataListener]

    // Returns an array of all the objects currently registered as
    // FooListeners
    // upon this model.
    def Array[T]: [T <: EventListener]
}
