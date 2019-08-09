package javax.swing.text.html

import java.awt.event.InputEvent
import java.lang.{Object, String}
import java.net.URL
import java.util.EventObject
import javax.swing.event.{HyperlinkEvent, HyperlinkEvent.EventType}
import javax.swing.text.Element
import scala.scalanative.annotation.stub

/** HTMLFrameHyperlinkEvent is used to notify interested
 *  parties that link was activated in a frame.
 */
class HTMLFrameHyperlinkEvent extends HyperlinkEvent {

    /** Creates a new object representing a hypertext link event. */
    @stub
    def this(source: Object, type: HyperlinkEvent.EventType, targetURL: URL, sourceElement: Element, targetFrame: String) = ???

    /** Creates a new object representing a html frame
     *  hypertext link event.
     */
    @stub
    def this(source: Object, type: HyperlinkEvent.EventType, targetURL: URL, targetFrame: String) = ???

    /** Creates a new object representing a hypertext link event. */
    @stub
    def this(source: Object, type: HyperlinkEvent.EventType, targetURL: URL, desc: String, sourceElement: Element, inputEvent: InputEvent, targetFrame: String) = ???

    /** Creates a new object representing a hypertext link event. */
    @stub
    def this(source: Object, type: HyperlinkEvent.EventType, targetURL: URL, desc: String, sourceElement: Element, targetFrame: String) = ???

    /** Creates a new object representing a hypertext link event. */
    @stub
    def this(source: Object, type: HyperlinkEvent.EventType, targetURL: URL, desc: String, targetFrame: String) = ???

    /** returns the target for the link. */
    @stub
    def getTarget(): String = ???
}
