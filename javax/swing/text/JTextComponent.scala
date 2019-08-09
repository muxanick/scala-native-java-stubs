package javax.swing.text

import java.awt.{Color, Component, ComponentOrientation, Container, Dimension, Insets, Point, Rectangle}
import java.awt.event.{InputMethodEvent, InputMethodListener, MouseEvent}
import java.awt.im.InputMethodRequests
import java.awt.print.Printable
import java.io.Reader
import java.lang.{Object, String}
import java.text.MessageFormat
import javax.accessibility.{Accessible, AccessibleContext}
import javax.print.PrintService
import javax.print.attribute.PrintRequestAttributeSet
import javax.swing.{Action, DropMode, JComponent, Scrollable}
import javax.swing.event.{CaretEvent, CaretListener}
import javax.swing.plaf.TextUI

// JTextComponent is the base class for swing text
// components.  It tries to be compatible with the
// java.awt.TextComponent class
// where it can reasonably do so.  Also provided are other services
// for additional flexibility (beyond the pluggable UI and bean
// support).
// You can find information on how to use the functionality
// this class provides in
// General Rules for Using Text Components,
// a section in The Java Tutorial.
//
// 
// Caret Changes
// 
// The caret is a pluggable object in swing text components.
// Notification of changes to the caret position and the selection
// are sent to implementations of the CaretListener
// interface that have been registered with the text component.
// The UI will install a default caret unless a customized caret
// has been set. 
// By default the caret tracks all the document changes
// performed on the Event Dispatching Thread and updates it's position
// accordingly if an insertion occurs before or at the caret position
// or a removal occurs before the caret position. DefaultCaret
// tries to make itself visible which may lead to scrolling
// of a text component within JScrollPane. The default caret
// behavior can be changed by the DefaultCaret.setUpdatePolicy(int) method.
// 
// Note: Non-editable text components also have a caret though
// it may not be painted.
//
// Commands
// 
// Text components provide a number of commands that can be used
// to manipulate the component.  This is essentially the way that
// the component expresses its capabilities.  These are expressed
// in terms of the swing Action interface,
// using the TextAction implementation.
// The set of commands supported by the text component can be
// found with the getActions() method.  These actions
// can be bound to key events, fired from buttons, etc.
//
// Text Input
// 
// The text components support flexible and internationalized text input, using
// keymaps and the input method framework, while maintaining compatibility with
// the AWT listener model.
// 
// A Keymap lets an application bind key
// strokes to actions.
// In order to allow keymaps to be shared across multiple text components, they
// can use actions that extend TextAction.
// TextAction can determine which JTextComponent
// most recently has or had focus and therefore is the subject of
// the action (In the case that the ActionEvent
// sent to the action doesn't contain the target text component as its source).
// 
// The input method framework
// lets text components interact with input methods, separate software
// components that preprocess events to let users enter thousands of
// different characters using keyboards with far fewer keys.
// JTextComponent is an active client of
// the framework, so it implements the preferred user interface for interacting
// with input methods. As a consequence, some key events do not reach the text
// component because they are handled by an input method, and some text input
// reaches the text component as committed text within an InputMethodEvent instead of as a key event.
// The complete text input is the combination of the characters in
// keyTyped key events and committed text in input method events.
// 
// The AWT listener model lets applications attach event listeners to
// components in order to bind events to actions. Swing encourages the
// use of keymaps instead of listeners, but maintains compatibility
// with listeners by giving the listeners a chance to steal an event
// by consuming it.
// 
// Keyboard event and input method events are handled in the following stages,
// with each stage capable of consuming the event:
//
// 
// 
// Stage
// KeyEvent
// InputMethodEvent
// 1.   
//     input methods 
//     (generated here)
// 2.   
//     focus manager 
//     
// 
// 
//     3.   
//     registered key listeners
//     registered input method listeners
// 
//     4.   
//     
//     input method handling in JTextComponent
// 
//     5.   keymap handling using the current keymap
// 6.   keyboard handling in JComponent (e.g. accelerators, component navigation, etc.)
//     
// 
//
// 
// To maintain compatibility with applications that listen to key
// events but are not aware of input method events, the input
// method handling in stage 4 provides a compatibility mode for
// components that do not process input method events. For these
// components, the committed text is converted to keyTyped key events
// and processed in the key event pipeline starting at stage 3
// instead of in the input method event pipeline.
// 
// By default the component will create a keymap (named DEFAULT_KEYMAP)
// that is shared by all JTextComponent instances as the default keymap.
// Typically a look-and-feel implementation will install a different keymap
// that resolves to the default keymap for those bindings not found in the
// different keymap. The minimal bindings include:
// 
// inserting content into the editor for the
//  printable keys.
// removing content with the backspace and del
//  keys.
// caret movement forward and backward
// 
//
// Model/View Split
// 
// The text components have a model-view split.  A text component pulls
// together the objects used to represent the model, view, and controller.
// The text document model may be shared by other views which act as observers
// of the model (e.g. a document may be shared by multiple components).
//
// 
//
// 
// The model is defined by the Document interface.
// This is intended to provide a flexible text storage mechanism
// that tracks change during edits and can be extended to more sophisticated
// models.  The model interfaces are meant to capture the capabilities of
// expression given by SGML, a system used to express a wide variety of
// content.
// Each modification to the document causes notification of the
// details of the change to be sent to all observers in the form of a
// DocumentEvent which allows the views to stay up to date with the model.
// This event is sent to observers that have implemented the
// DocumentListener
// interface and registered interest with the model being observed.
//
// Location Information
// 
// The capability of determining the location of text in
// the view is provided.  There are two methods, modelToView(int)
// and viewToModel(java.awt.Point) for determining this information.
//
// Undo/Redo support
// 
// Support for an edit history mechanism is provided to allow
// undo/redo operations.  The text component does not itself
// provide the history buffer by default, but does provide
// the UndoableEdit records that can be used in conjunction
// with a history buffer to provide the undo/redo support.
// The support is provided by the Document model, which allows
// one to attach UndoableEditListener implementations.
//
// Thread Safety
// 
// The swing text components provide some support of thread
// safe operations.  Because of the high level of configurability
// of the text components, it is possible to circumvent the
// protection provided.  The protection primarily comes from
// the model, so the documentation of AbstractDocument
// describes the assumptions of the protection provided.
// The methods that are safe to call asynchronously are marked
// with comments.
//
// Newlines
// 
// For a discussion on how newlines are handled, see
// DefaultEditorKit.
//
//
// Printing support
// 
// Several print methods are provided for basic
// document printing.  If more advanced printing is needed, use the
// getPrintable(java.text.MessageFormat, java.text.MessageFormat) method.
// 
//
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
abstract class JTextComponent extends JComponent with Scrollable, with Accessible {

    // This class implements accessibility support for the
    // JTextComponent class.
    def JTextComponent.AccessibleJTextComponent: class

    // Adds a caret listener for notification of any changes
    // to the caret.
    def addCaretListener(listener: CaretListener): Unit

    // Adds the specified input method listener to receive
    // input method events from this component.
    def addInputMethodListener(l: InputMethodListener): Unit

    // Transfers the currently selected range in the associated
    // text model to the system clipboard, leaving the contents
    // in the text model.
    def copy(): Unit

    // Transfers the currently selected range in the associated
    // text model to the system clipboard, removing the contents
    // from the model.
    def cut(): Unit

    // Notifies all listeners that have registered interest for
    // notification on this event type.
    protected def fireCaretUpdate(e: CaretEvent): Unit

    // Gets the AccessibleContext associated with this
    // JTextComponent.
    def getAccessibleContext(): AccessibleContext

    // Fetches the command list for the editor.
    def getActions(): Array[Action]

    // Fetches the caret that allows text-oriented navigation over
    // the view.
    def getCaret(): Caret

    // Fetches the current color used to render the
    // caret.
    def getCaretColor(): Color

    // Returns an array of all the caret listeners
    // registered on this text component.
    def getCaretListeners(): Array[CaretListener]

    // Returns the position of the text insertion caret for the
    // text component.
    def getCaretPosition(): Int

    // Fetches the current color used to render the
    // disabled text.
    def getDisabledTextColor(): Color

    // Fetches the model associated with the editor.
    def getDocument(): Document

    // Returns whether or not automatic drag handling is enabled.
    def getDragEnabled(): Boolean

    // Returns the location that this component should visually indicate
    // as the drop location during a DnD operation over the component,
    // or null if no location is to currently be shown.
    def getDropLocation(): JTextComponent.DropLocation

    // Returns the drop mode for this component.
    def getDropMode(): DropMode

    // Returns the key accelerator that will cause the receiving
    // text component to get the focus.
    def getFocusAccelerator(): Char

    // Fetches the object responsible for making highlights.
    def getHighlighter(): Highlighter

    // Gets the input method request handler which supports
    // requests from input methods for this component.
    def getInputMethodRequests(): InputMethodRequests

    // Fetches the keymap currently active in this text
    // component.
    def getKeymap(): Keymap

    // Returns the margin between the text component's border and
    // its text.
    def getMargin(): Insets

    // Returns the NavigationFilter.
    def getNavigationFilter(): NavigationFilter

    // Returns the preferred size of the viewport for a view component.
    def getPreferredScrollableViewportSize(): Dimension

    // Returns a Printable to use for printing the content of this
    // JTextComponent.
    def getPrintable(headerFormat: MessageFormat, footerFormat: MessageFormat): Printable

    // Components that display logical rows or columns should compute
    // the scroll increment that will completely expose one block
    // of rows or columns, depending on the value of orientation.
    def getScrollableBlockIncrement(visibleRect: Rectangle, orientation: Int, direction: Int): Int

    // Returns true if a viewport should always force the height of this
    // Scrollable to match the height of the viewport.
    def getScrollableTracksViewportHeight(): Boolean

    // Returns true if a viewport should always force the width of this
    // Scrollable to match the width of the viewport.
    def getScrollableTracksViewportWidth(): Boolean

    // Components that display logical rows or columns should compute
    // the scroll increment that will completely expose one new row
    // or column, depending on the value of orientation.
    def getScrollableUnitIncrement(visibleRect: Rectangle, orientation: Int, direction: Int): Int

    // Returns the selected text contained in this
    // TextComponent.
    def getSelectedText(): String

    // Fetches the current color used to render the
    // selected text.
    def getSelectedTextColor(): Color

    // Fetches the current color used to render the
    // selection.
    def getSelectionColor(): Color

    // Returns the selected text's end position.
    def getSelectionEnd(): Int

    // Returns the selected text's start position.
    def getSelectionStart(): Int

    // Returns the text contained in this TextComponent.
    def getText(): String

    // Fetches a portion of the text represented by the
    // component.
    def getText(offs: Int, len: Int): String

    // Returns the string to be used as the tooltip for event.
    def getToolTipText(event: MouseEvent): String

    // Fetches the user-interface factory for this text-oriented editor.
    def getUI(): TextUI

    // Returns the boolean indicating whether this
    // TextComponent is editable or not.
    def isEditable(): Boolean

    // Converts the given location in the model to a place in
    // the view coordinate system.
    def modelToView(pos: Int): Rectangle

    // Moves the caret to a new position, leaving behind a mark
    // defined by the last time setCaretPosition was
    // called.
    def moveCaretPosition(pos: Int): Unit

    // Returns a string representation of this JTextComponent.
    protected def paramString(): String

    // Transfers the contents of the system clipboard into the
    // associated text model.
    def paste(): Unit

    // A convenience print method that displays a print dialog, and then
    // prints this JTextComponent in interactive mode with no
    // header or footer text.
    def print(): Boolean

    // A convenience print method that displays a print dialog, and then
    // prints this JTextComponent in interactive mode with
    // the specified header and footer text.
    def print(headerFormat: MessageFormat, footerFormat: MessageFormat): Boolean

    // Prints the content of this JTextComponent.
    def print(headerFormat: MessageFormat, footerFormat: MessageFormat, showPrintDialog: Boolean, service: PrintService, attributes: PrintRequestAttributeSet, interactive: Boolean): Boolean

    // Processes input method events occurring on this component by
    // dispatching them to any registered
    // InputMethodListener objects.
    protected def processInputMethodEvent(e: InputMethodEvent): Unit

    // Initializes from a stream.
    def read(in: Reader, desc: Object): Unit

    // Removes a caret listener.
    def removeCaretListener(listener: CaretListener): Unit

    // Notifies this component that it no longer has a parent component.
    def removeNotify(): Unit

    // Replaces the currently selected content with new content
    // represented by the given string.
    def replaceSelection(content: String): Unit

    // Restores composed text previously saved by saveComposedText.
    protected def restoreComposedText(): Unit

    // Saves composed text around the specified position.
    protected def saveComposedText(pos: Int): Boolean

    // Selects the text between the specified start and end positions.
    def select(selectionStart: Int, selectionEnd: Int): Unit

    // Selects all the text in the TextComponent.
    def selectAll(): Unit

    // Sets the caret to be used.
    def setCaret(c: Caret): Unit

    // Sets the current color used to render the caret.
    def setCaretColor(c: Color): Unit

    // Sets the position of the text insertion caret for the
    // TextComponent.
    def setCaretPosition(position: Int): Unit

    // Sets the language-sensitive orientation that is to be used to order
    // the elements or text within this component.
    def setComponentOrientation(o: ComponentOrientation): Unit

    // Sets the current color used to render the
    // disabled text.
    def setDisabledTextColor(c: Color): Unit

    // Associates the editor with a text document.
    def setDocument(doc: Document): Unit

    // Turns on or off automatic drag handling.
    def setDragEnabled(b: Boolean): Unit

    // Sets the drop mode for this component.
    def setDropMode(dropMode: DropMode): Unit

    // Sets the specified boolean to indicate whether or not this
    // TextComponent should be editable.
    def setEditable(b: Boolean): Unit

    // Sets the key accelerator that will cause the receiving text
    // component to get the focus.
    def setFocusAccelerator(aKey: Char): Unit

    // Sets the highlighter to be used.
    def setHighlighter(h: Highlighter): Unit

    // Sets the keymap to use for binding events to
    // actions.
    def setKeymap(map: Keymap): Unit

    // Sets margin space between the text component's border
    // and its text.
    def setMargin(m: Insets): Unit

    // Sets the NavigationFilter.
    def setNavigationFilter(filter: NavigationFilter): Unit

    // Sets the current color used to render the selected text.
    def setSelectedTextColor(c: Color): Unit

    // Sets the current color used to render the selection.
    def setSelectionColor(c: Color): Unit

    // Sets the selection end to the specified position.
    def setSelectionEnd(selectionEnd: Int): Unit

    // Sets the selection start to the specified position.
    def setSelectionStart(selectionStart: Int): Unit

    // Sets the text of this TextComponent
    // to the specified text.
    def setText(t: String): Unit

    // Sets the user-interface factory for this text-oriented editor.
    def setUI(ui: TextUI): Unit

    // Reloads the pluggable UI.
    def updateUI(): Unit

    // Converts the given place in the view coordinate system
    // to the nearest representative location in the model.
    def viewToModel(pt: Point): Int
}

object JTextComponent {
    @stub
    // Represents a drop location for JTextComponents.
    def JTextComponent.DropLocation: class = ???

    @stub
    // The default keymap that will be shared by all
    // JTextComponent instances unless they
    // have had a different keymap set.
    def DEFAULT_KEYMAP: String = ???

    @stub
    // Adds a new keymap into the keymap hierarchy.
    def addKeymap(nm: String, parent: Keymap): Keymap = ???

    @stub
    // Fetches a named keymap previously added to the document.
    def getKeymap(nm: String): Keymap = ???

    @stub
    // 
    // Loads a keymap with a bunch of
    // bindings.
    def loadKeymap(map: Keymap, bindings: Array[JTextComponent.KeyBinding], actions: Array[Action]): Unit = ???

    @stub
    // Removes a named keymap previously added to the document.
    def removeKeymap(nm: String): Keymap = ???
}
