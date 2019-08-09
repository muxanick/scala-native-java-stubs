package java.util

import java.io.Serializable
import java.lang.Object

// 
// The root class from which all event state objects shall be derived.
// 
// All Events are constructed with a reference to the object, the "source",
// that is logically deemed to be the object upon which the Event in question
// initially occurred upon.
class EventObject extends Object with Serializable {

    @stub
    // The object on which the Event initially occurred.
    def getSource(): Object = ???
}
