package javax.swing.event

import java.lang.{Object, String}
import javax.swing.text.{Document, Element}
import scala.scalanative.annotation.stub

/** Interface for document change notifications.  This provides
 *  detailed information to Document observers about how the
 *  Document changed.  It provides high level information such
 *  as type of change and where it occurred, as well as the more
 *  detailed structural changes (What Elements were inserted and
 *  removed).
 */
trait DocumentEvent {

    /** Gets the change information for the given element. */
    @stub
    def getChange(elem: Element): DocumentEvent.ElementChange = ???

    /** Gets the document that sourced the change event. */
    @stub
    def getDocument(): Document = ???

    /** Returns the length of the change. */
    @stub
    def getLength(): Int = ???

    /** Returns the offset within the document of the start
     *  of the change.
     */
    @stub
    def getOffset(): Int = ???

    /** Gets the type of event. */
    @stub
    def getType(): DocumentEvent.EventType = ???
}

object DocumentEvent {
    /** Describes changes made to a specific element. */
    trait ElementChange {

        /** Gets the child elements that were added to the given
         *  parent element.
         */
        @stub
        def getChildrenAdded(): Array[Element] = ???

        /** Gets the child elements that were removed from the
         *  given parent element.
         */
        @stub
        def getChildrenRemoved(): Array[Element] = ???

        /** Returns the element represented. */
        @stub
        def getElement(): Element = ???

        /** Fetches the index within the element represented. */
        @stub
        def getIndex(): Int = ???
    }


    /** Enumeration for document event types */
    final object EventType extends Object {

        /** Change type. */
        @stub
        val CHANGE: EventType = ???

        /** Insert type. */
        @stub
        val INSERT: EventType = ???

        /** Remove type. */
        @stub
        val REMOVE: EventType = ???

        /** Converts the type to a string. */
        @stub
        def toString(): String = ???
    }

}
