package java.util

import java.io.Serializable
import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** 
 *  The root class from which all event state objects shall be derived.
 *  
 *  All Events are constructed with a reference to the object, the "source",
 *  that is logically deemed to be the object upon which the Event in question
 *  initially occurred upon.
 */
class EventObject extends Object with Serializable {

    /** Constructs a prototypical Event. */
    @stub
    def this(source: Object) = ???

    /** The object on which the Event initially occurred. */
    @stub
    protected val source: Object = ???

    /** The object on which the Event initially occurred. */
    @stub
    def getSource(): Object = ???

    /** Returns a String representation of this EventObject. */
    @stub
    def toString(): String = ???
}
