package javax.swing.event

import java.lang.Object
import java.util.EventObject

// Defines an event that encapsulates changes to a list.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class ListDataEvent extends EventObject {

    @stub
    // Returns the lower index of the range.
    def getIndex0(): Int = ???

    @stub
    // Returns the upper index of the range.
    def getIndex1(): Int = ???

    @stub
    // Returns the event type.
    def getType(): Int = ???
}

object ListDataEvent {
    @stub
    // Identifies one or more changes in the lists contents.
    def CONTENTS_CHANGED: Int = ???

    @stub
    // Identifies the addition of one or more contiguous items to the list
    def INTERVAL_ADDED: Int = ???
}
