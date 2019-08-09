package javax.swing.event

import java.awt.event.InputEvent
import java.lang.{Object, String}
import java.net.URL
import java.util.EventObject
import javax.swing.text.Element

/** HyperlinkEvent is used to notify interested parties that
 *  something has happened with respect to a hypertext link.
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
class HyperlinkEvent extends EventObject {

    /** Creates a new object representing a hypertext link event. */
    @stub
    def this(source: Object, type: HyperlinkEvent.EventType, u: URL) = ???

    /** Creates a new object representing a hypertext link event. */
    @stub
    def this(source: Object, type: HyperlinkEvent.EventType, u: URL, desc: String) = ???

    /** Creates a new object representing a hypertext link event. */
    @stub
    def this(source: Object, type: HyperlinkEvent.EventType, u: URL, desc: String, sourceElement: Element) = ???

    /** Get the description of the link as a string. */
    @stub
    def getDescription(): String = ???

    /** Gets the type of event. */
    @stub
    def getEventType(): HyperlinkEvent.EventType = ???

    /** Returns the InputEvent that triggered the hyperlink event. */
    @stub
    def getInputEvent(): InputEvent = ???

    /** Returns the Element that corresponds to the source of the
     *  event.
     */
    @stub
    def getSourceElement(): Element = ???
}
