package javax.swing.event

import java.lang.Object
import java.util.EventObject

/** Defines an event that encapsulates changes to a list.
 *  
 *  Warning:
 *  Serialized objects of this class will not be compatible with
 *  future Swing releases. The current serialization support is
 *  appropriate for short term storage or RMI between applications running
 *  the same version of Swing.  As of 1.4, support for long term storage
 *  of all JavaBeans™
 *  has been added to the java.beans package.
 *  Please see XMLEncoder.
 */
class ListDataEvent extends EventObject {

    /** Returns the lower index of the range. */
    @stub
    def getIndex0(): Int = ???

    /** Returns the upper index of the range. */
    @stub
    def getIndex1(): Int = ???

    /** Returns the event type. */
    @stub
    def getType(): Int = ???
}

object ListDataEvent {
    /** Identifies one or more changes in the lists contents. */
    @stub
    val CONTENTS_CHANGED: Int = ???

    /** Identifies the addition of one or more contiguous items to the list */
    @stub
    val INTERVAL_ADDED: Int = ???
}
