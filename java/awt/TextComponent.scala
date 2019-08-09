package java.awt

import java.awt.event.{TextEvent, TextListener}
import java.awt.im.InputMethodRequests
import java.lang.{Class, Object, String}
import java.util.EventListener
import javax.accessibility.{Accessible, AccessibleContext}

// The TextComponent class is the superclass of
// any component that allows the editing of some text.
// 
// A text component embodies a string of text.  The
// TextComponent class defines a set of methods
// that determine whether or not this text is editable. If the
// component is editable, it defines another set of methods
// that supports a text insertion caret.
// 
// In addition, the class defines methods that are used
// to maintain a current selection from the text.
// The text selection, a substring of the component's text,
// is the target of editing operations. It is also referred
// to as the selected text.
class TextComponent extends Component with Accessible {

    @stub
    // Makes this Component displayable by connecting it to a
    // native screen resource.
    def addNotify(): Unit = ???

    @stub
    // Adds the specified text event listener to receive text events
    // from this text component.
    def addTextListener(l: TextListener): Unit = ???

    @stub
    // Enables or disables input method support for this text component.
    def enableInputMethods(enable: Boolean): Unit = ???

    @stub
    // Gets the AccessibleContext associated with this TextComponent.
    def getAccessibleContext(): AccessibleContext = ???

    @stub
    // Gets the background color of this text component.
    def getBackground(): Color = ???

    @stub
    // Returns the position of the text insertion caret.
    def getCaretPosition(): Int = ???

    @stub
    // Gets the input method request handler which supports
    // requests from input methods for this component.
    def getInputMethodRequests(): InputMethodRequests = ???

    @stub
    // Returns an array of all the objects currently registered
    // as FooListeners
    // upon this TextComponent.
    def Array[T]: [T <: EventListener] = ???

    @stub
    // Returns the selected text from the text that is
    // presented by this text component.
    def getSelectedText(): String = ???

    @stub
    // Gets the end position of the selected text in
    // this text component.
    def getSelectionEnd(): Int = ???

    @stub
    // Gets the start position of the selected text in
    // this text component.
    def getSelectionStart(): Int = ???

    @stub
    // Returns the text that is presented by this text component.
    def getText(): String = ???

    @stub
    // Returns an array of all the text listeners
    // registered on this text component.
    def getTextListeners(): Array[TextListener] = ???

    @stub
    // Indicates whether or not this text component is editable.
    def isEditable(): Boolean = ???

    @stub
    // Returns a string representing the state of this
    // TextComponent.
    protected def paramString(): String = ???

    @stub
    // Processes events on this text component.
    protected def processEvent(e: AWTEvent): Unit = ???

    @stub
    // Processes text events occurring on this text component by
    // dispatching them to any registered TextListener objects.
    protected def processTextEvent(e: TextEvent): Unit = ???

    @stub
    // Removes the TextComponent's peer.
    def removeNotify(): Unit = ???

    @stub
    // Removes the specified text event listener so that it no longer
    // receives text events from this text component
    // If l is null, no exception is
    // thrown and no action is performed.
    def removeTextListener(l: TextListener): Unit = ???

    @stub
    // Selects the text between the specified start and end positions.
    def select(selectionStart: Int, selectionEnd: Int): Unit = ???

    @stub
    // Selects all the text in this text component.
    def selectAll(): Unit = ???

    @stub
    // Sets the background color of this text component.
    def setBackground(c: Color): Unit = ???

    @stub
    // Sets the position of the text insertion caret.
    def setCaretPosition(position: Int): Unit = ???

    @stub
    // Sets the flag that determines whether or not this
    // text component is editable.
    def setEditable(b: Boolean): Unit = ???

    @stub
    // Sets the selection end for this text component to
    // the specified position.
    def setSelectionEnd(selectionEnd: Int): Unit = ???

    @stub
    // Sets the selection start for this text component to
    // the specified position.
    def setSelectionStart(selectionStart: Int): Unit = ???
}
