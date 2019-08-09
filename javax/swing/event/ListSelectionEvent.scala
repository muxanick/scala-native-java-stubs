package javax.swing.event

import java.lang.Object
import java.util.EventObject

// An event that characterizes a change in selection. The change is limited to a
// a single inclusive interval. The selection of at least one index within the
// range will have changed. A decent ListSelectionModel implementation
// will keep the range as small as possible. ListSelectionListeners will
// generally query the source of the event for the new selected status of each
// potentially changed row.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class ListSelectionEvent extends EventObject {

    @stub
    // Returns the index of the first row whose selection may have changed.
    def getFirstIndex(): Int = ???

    @stub
    // Returns the index of the last row whose selection may have changed.
    def getLastIndex(): Int = ???

    @stub
    // Returns whether or not this is one in a series of multiple events,
    // where changes are still being made.
    def getValueIsAdjusting(): Boolean = ???
}
