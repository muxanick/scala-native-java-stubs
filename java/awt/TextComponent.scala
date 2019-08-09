package java.awt

import java.awt.event.{TextEvent, TextListener}
import java.awt.im.InputMethodRequests
import java.lang.{Class, Object, String}
import java.util.EventListener
import javax.accessibility.{Accessible, AccessibleContext}

/** The TextComponent class is the superclass of
 *  any component that allows the editing of some text.
 *  
 *  A text component embodies a string of text.  The
 *  TextComponent class defines a set of methods
 *  that determine whether or not this text is editable. If the
 *  component is editable, it defines another set of methods
 *  that supports a text insertion caret.
 *  
 *  In addition, the class defines methods that are used
 *  to maintain a current selection from the text.
 *  The text selection, a substring of the component's text,
 *  is the target of editing operations. It is also referred
 *  to as the selected text.
 */
class TextComponent extends Component with Accessible {

    /** Makes this Component displayable by connecting it to a
     *  native screen resource.
     */
    @stub
    def addNotify(): Unit = ???

    /** Adds the specified text event listener to receive text events
     *  from this text component.
     */
    @stub
    def addTextListener(l: TextListener): Unit = ???

    /** Enables or disables input method support for this text component. */
    @stub
    def enableInputMethods(enable: Boolean): Unit = ???

    /** Gets the AccessibleContext associated with this TextComponent. */
    @stub
    def getAccessibleContext(): AccessibleContext = ???

    /** Gets the background color of this text component. */
    @stub
    def getBackground(): Color = ???

    /** Returns the position of the text insertion caret. */
    @stub
    def getCaretPosition(): Int = ???

    /** Gets the input method request handler which supports
     *  requests from input methods for this component.
     */
    @stub
    def getInputMethodRequests(): InputMethodRequests = ???

    /** Returns an array of all the objects currently registered
     *  as FooListeners
     *  upon this TextComponent.
     */
    @stub
    def getListeners[T <: EventListener](listenerType: Class[T]): Array[T] = ???

    /** Returns the selected text from the text that is
     *  presented by this text component.
     */
    @stub
    def getSelectedText(): String = ???

    /** Gets the end position of the selected text in
     *  this text component.
     */
    @stub
    def getSelectionEnd(): Int = ???

    /** Gets the start position of the selected text in
     *  this text component.
     */
    @stub
    def getSelectionStart(): Int = ???

    /** Returns the text that is presented by this text component. */
    @stub
    def getText(): String = ???

    /** Returns an array of all the text listeners
     *  registered on this text component.
     */
    @stub
    def getTextListeners(): Array[TextListener] = ???

    /** Indicates whether or not this text component is editable. */
    @stub
    def isEditable(): Boolean = ???

    /** Returns a string representing the state of this
     *  TextComponent.
     */
    @stub
    protected def paramString(): String = ???

    /** Processes events on this text component. */
    @stub
    protected def processEvent(e: AWTEvent): Unit = ???

    /** Processes text events occurring on this text component by
     *  dispatching them to any registered TextListener objects.
     */
    @stub
    protected def processTextEvent(e: TextEvent): Unit = ???

    /** Removes the TextComponent's peer. */
    @stub
    def removeNotify(): Unit = ???

    /** Removes the specified text event listener so that it no longer
     *  receives text events from this text component
     *  If l is null, no exception is
     *  thrown and no action is performed.
     */
    @stub
    def removeTextListener(l: TextListener): Unit = ???

    /** Selects the text between the specified start and end positions. */
    @stub
    def select(selectionStart: Int, selectionEnd: Int): Unit = ???

    /** Selects all the text in this text component. */
    @stub
    def selectAll(): Unit = ???

    /** Sets the background color of this text component. */
    @stub
    def setBackground(c: Color): Unit = ???

    /** Sets the position of the text insertion caret. */
    @stub
    def setCaretPosition(position: Int): Unit = ???

    /** Sets the flag that determines whether or not this
     *  text component is editable.
     */
    @stub
    def setEditable(b: Boolean): Unit = ???

    /** Sets the selection end for this text component to
     *  the specified position.
     */
    @stub
    def setSelectionEnd(selectionEnd: Int): Unit = ???

    /** Sets the selection start for this text component to
     *  the specified position.
     */
    @stub
    def setSelectionStart(selectionStart: Int): Unit = ???
}
