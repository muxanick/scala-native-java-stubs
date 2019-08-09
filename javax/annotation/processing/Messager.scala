package javax.annotation.processing

import java.lang.CharSequence
import javax.lang.model.element.{AnnotationMirror, Element}
import javax.tools.Diagnostic.Kind

/** A Messager provides the way for an annotation processor to
 *  report error messages, warnings, and other notices.  Elements,
 *  annotations, and annotation values can be passed to provide a
 *  location hint for the message.  However, such location hints may be
 *  unavailable or only approximate.
 * 
 *  Printing a message with an error kind will raise an error.
 * 
 *  Note that the messages "printed" by methods in this
 *  interface may or may not appear as textual output to a location
 *  like System.out or System.err.  Implementations may
 *  choose to present this information in a different fashion, such as
 *  messages in a window.
 */
trait Messager {

    /** Prints a message of the specified kind. */
    @stub
    def printMessage(kind: Diagnostic.Kind, msg: CharSequence): Unit = ???

    /** Prints a message of the specified kind at the location of the
     *  element.
     */
    @stub
    def printMessage(kind: Diagnostic.Kind, msg: CharSequence, e: Element): Unit = ???

    /** Prints a message of the specified kind at the location of the
     *  annotation mirror of the annotated element.
     */
    @stub
    def printMessage(kind: Diagnostic.Kind, msg: CharSequence, e: Element, a: AnnotationMirror): Unit = ???
}
