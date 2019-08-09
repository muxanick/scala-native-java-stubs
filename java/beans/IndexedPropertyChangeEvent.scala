package java.beans

import java.lang.Object
import java.util.EventObject

// An "IndexedPropertyChange" event gets delivered whenever a component that
// conforms to the JavaBeans™ specification (a "bean") changes a bound
// indexed property. This class is an extension of PropertyChangeEvent
// but contains the index of the property that has changed.
// 
// Null values may be provided for the old and the new values if their
// true values are not known.
// 
// An event source may send a null object as the name to indicate that an
// arbitrary set of if its properties have changed.  In this case the
// old and new values should also be null.
class IndexedPropertyChangeEvent extends PropertyChangeEvent {
}
