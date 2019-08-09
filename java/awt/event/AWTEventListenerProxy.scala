package java.awt.event

import java.awt.AWTEvent
import java.lang.Object
import java.util.EventListenerProxy
import scala.scalanative.annotation.stub

/** A class which extends the EventListenerProxy
 *  specifically for adding an AWTEventListener
 *  for a specific event mask.
 *  Instances of this class can be added as AWTEventListeners
 *  to a Toolkit object.
 *  
 *  The getAWTEventListeners method of Toolkit
 *  can return a mixture of AWTEventListener
 *  and AWTEventListenerProxy objects.
 */
class AWTEventListenerProxy extends EventListenerProxy[AWTEventListener] with AWTEventListener {

    /** Constructor which binds the AWTEventListener
     *  to a specific event mask.
     */
    @stub
    def this(eventMask: Long, listener: AWTEventListener) = ???

    /** Forwards the AWT event to the listener delegate. */
    @stub
    def eventDispatched(event: AWTEvent): Unit = ???

    /** Returns the event mask associated with the listener. */
    @stub
    def getEventMask(): Long = ???
}
