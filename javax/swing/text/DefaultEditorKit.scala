package javax.swing.text

import java.awt.event.ActionEvent
import java.io.{InputStream, OutputStream, Reader, Writer}
import java.lang.{Object, String}
import javax.swing.{AbstractAction, Action}
import scala.scalanative.annotation.stub

/** This is the set of things needed by a text component
 *  to be a reasonably functioning editor for some type
 *  of text document.  This implementation provides a default
 *  implementation which treats text as plain text and
 *  provides a minimal set of actions for a simple editor.
 * 
 *  
 *  Newlines
 *  
 *  There are two properties which deal with newlines.  The
 *  system property, line.separator, is defined to be
 *  platform-dependent, either "\n", "\r", or "\r\n".  There is also
 *  a property defined in DefaultEditorKit, called
 *  EndOfLineStringProperty,
 *  which is defined automatically when a document is loaded, to be
 *  the first occurrence of any of the newline characters.
 *  When a document is loaded, EndOfLineStringProperty
 *  is set appropriately, and when the document is written back out, the
 *  EndOfLineStringProperty is used.  But while the document
 *  is in memory, the "\n" character is used to define a
 *  newline, regardless of how the newline is defined when
 *  the document is on disk.  Therefore, for searching purposes,
 *  "\n" should always be used.  When a new document is created,
 *  and the EndOfLineStringProperty has not been defined,
 *  it will use the System property when writing out the
 *  document.
 *  Note that EndOfLineStringProperty is set
 *  on the Document using the get/putProperty
 *  methods.  Subclasses may override this behavior.
 * 
 *  
 */
class DefaultEditorKit extends EditorKit {

    /** default constructor for DefaultEditorKit */
    @stub
    def this() = ???

    /** Fetches a caret that can navigate through views
     *  produced by the associated ViewFactory.
     */
    @stub
    def createCaret(): Caret = ???

    /** Creates an uninitialized text storage model (PlainDocument)
     *  that is appropriate for this type of editor.
     */
    @stub
    def createDefaultDocument(): Document = ???

    /** Fetches the set of commands that can be used
     *  on a text component that is using a model and
     *  view produced by this kit.
     */
    @stub
    def getActions(): Array[Action] = ???

    /** Gets the MIME type of the data that this
     *  kit represents support for.
     */
    @stub
    def getContentType(): String = ???

    /** Fetches a factory that is suitable for producing
     *  views of any models that are produced by this
     *  kit.
     */
    @stub
    def getViewFactory(): ViewFactory = ???

    /** Inserts content from the given stream which is expected
     *  to be in a format appropriate for this kind of content
     *  handler.
     */
    @stub
    def read(in: InputStream, doc: Document, pos: Int): Unit = ???

    /** Inserts content from the given stream, which will be
     *  treated as plain text.
     */
    @stub
    def read(in: Reader, doc: Document, pos: Int): Unit = ???

    /** Writes content from a document to the given stream
     *  in a format appropriate for this kind of content handler.
     */
    @stub
    def write(out: OutputStream, doc: Document, pos: Int, len: Int): Unit = ???

    /** Writes content from a document to the given stream
     *  as plain text.
     */
    @stub
    def write(out: Writer, doc: Document, pos: Int, len: Int): Unit = ???
}

object DefaultEditorKit {
    /** Creates a beep.
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
    object BeepAction extends TextAction {

        /** Create this object with the appropriate identifier. */
        @stub
        def apply() = ???

        /** The operation to perform when this action is triggered. */
        @stub
        def actionPerformed(e: ActionEvent): Unit = ???
    }


    /** Copies the selected region and place its contents
     *  into the system clipboard.
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
    object CopyAction extends TextAction {

        /** Create this object with the appropriate identifier. */
        @stub
        def apply() = ???

        /** The operation to perform when this action is triggered. */
        @stub
        def actionPerformed(e: ActionEvent): Unit = ???
    }


    /** Cuts the selected region and place its contents
     *  into the system clipboard.
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
    object CutAction extends TextAction {

        /** Create this object with the appropriate identifier. */
        @stub
        def apply() = ???

        /** The operation to perform when this action is triggered. */
        @stub
        def actionPerformed(e: ActionEvent): Unit = ???
    }


    /** The action that is executed by default if
     *  a key typed event is received and there
     *  is no keymap entry.  There is a variation across
     *  different VM's in what gets sent as a key typed
     *  event, and this action tries to filter out the undesired
     *  events.  This filters the control characters and those
     *  with the ALT modifier.  It allows Control-Alt sequences
     *  through as these form legitimate unicode characters on
     *  some PC keyboards.
     *  
     *  If the event doesn't get filtered, it will try to insert
     *  content into the text editor.  The content is fetched
     *  from the command string of the ActionEvent.  The text
     *  entry is done through the replaceSelection
     *  method on the target text component.  This is the
     *  action that will be fired for most text entry tasks.
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
    object DefaultKeyTypedAction extends TextAction {

        /** Creates this object with the appropriate identifier. */
        @stub
        def apply() = ???

        /** The operation to perform when this action is triggered. */
        @stub
        def actionPerformed(e: ActionEvent): Unit = ???
    }


    /** Places a line/paragraph break into the document.
     *  If there is a selection, it is removed before
     *  the break is added.
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
    object InsertBreakAction extends TextAction {

        /** Creates this object with the appropriate identifier. */
        @stub
        def apply() = ???

        /** The operation to perform when this action is triggered. */
        @stub
        def actionPerformed(e: ActionEvent): Unit = ???
    }


    /** Places content into the associated document.
     *  If there is a selection, it is removed before
     *  the new content is added.
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
    object InsertContentAction extends TextAction {

        /** Creates this object with the appropriate identifier. */
        @stub
        def apply() = ???

        /** The operation to perform when this action is triggered. */
        @stub
        def actionPerformed(e: ActionEvent): Unit = ???
    }


    /** Places a tab character into the document. If there
     *  is a selection, it is removed before the tab is added.
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
    object InsertTabAction extends TextAction {

        /** Creates this object with the appropriate identifier. */
        @stub
        def apply() = ???

        /** The operation to perform when this action is triggered. */
        @stub
        def actionPerformed(e: ActionEvent): Unit = ???
    }


    /** Pastes the contents of the system clipboard into the
     *  selected region, or before the caret if nothing is
     *  selected.
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
    object PasteAction extends TextAction {

        /** Create this object with the appropriate identifier. */
        @stub
        def apply() = ???

        /** The operation to perform when this action is triggered. */
        @stub
        def actionPerformed(e: ActionEvent): Unit = ???
    }


    /** Name of the Action for moving the caret
     *  logically backward one position.
     */
    @stub
    val backwardAction: String = ???

    /** Name of the action to create a beep. */
    @stub
    val beepAction: String = ???

    /** Name of the Action for moving the caret
     *  to the beginning of the document.
     */
    @stub
    val beginAction: String = ???

    /** Name of the Action for moving the caret
     *  to the beginning of a line.
     */
    @stub
    val beginLineAction: String = ???

    /** Name of the Action for moving the caret
     *  to the beginning of a paragraph.
     */
    @stub
    val beginParagraphAction: String = ???

    /** Name of the Action for moving the caret
     *  to the beginning of a word.
     */
    @stub
    val beginWordAction: String = ???

    /** Name of the action to copy the selected region
     *  and place the contents into the system clipboard.
     */
    @stub
    val copyAction: String = ???

    /** Name of the action to cut the selected region
     *  and place the contents into the system clipboard.
     */
    @stub
    val cutAction: String = ???

    /** Name of the action that is executed by default if
     *  a key typed event is received and there
     *  is no keymap entry.
     */
    @stub
    val defaultKeyTypedAction: String = ???

    /** Name of the action to delete the character of content that
     *  follows the current caret position.
     */
    @stub
    val deleteNextCharAction: String = ???

    /** Name of the action to delete the word that
     *  follows the beginning of the selection.
     */
    @stub
    val deleteNextWordAction: String = ???

    /** Name of the action to delete the character of content that
     *  precedes the current caret position.
     */
    @stub
    val deletePrevCharAction: String = ???

    /** Name of the action to delete the word that
     *  precedes the beginning of the selection.
     */
    @stub
    val deletePrevWordAction: String = ???

    /** Name of the Action for moving the caret
     *  logically downward one position.
     */
    @stub
    val downAction: String = ???

    /** Name of the Action for moving the caret
     *  to the end of the document.
     */
    @stub
    val endAction: String = ???

    /** Name of the Action for moving the caret
     *  to the end of a line.
     */
    @stub
    val endLineAction: String = ???

    /** When reading a document if a CRLF is encountered a property
     *  with this name is added and the value will be "\r\n".
     */
    @stub
    val EndOfLineStringProperty: String = ???

    /** Name of the Action for moving the caret
     *  to the end of a paragraph.
     */
    @stub
    val endParagraphAction: String = ???

    /** Name of the Action for moving the caret
     *  to the end of a word.
     */
    @stub
    val endWordAction: String = ???

    /** Name of the Action for moving the caret
     *  logically forward one position.
     */
    @stub
    val forwardAction: String = ???

    /** Name of the action to place a line/paragraph break into
     *  the document.
     */
    @stub
    val insertBreakAction: String = ???

    /** Name of the action to place content into the associated
     *  document.
     */
    @stub
    val insertContentAction: String = ???

    /** Name of the action to place a tab character into
     *  the document.
     */
    @stub
    val insertTabAction: String = ???

    /** Name of the Action for moving the caret to the
     *  beginning of the next word.
     */
    @stub
    val nextWordAction: String = ???

    /** Name of the action to page down vertically. */
    @stub
    val pageDownAction: String = ???

    /** Name of the action to page up vertically. */
    @stub
    val pageUpAction: String = ???

    /** Name of the action to paste the contents of the
     *  system clipboard into the selected region, or before the
     *  caret if nothing is selected.
     */
    @stub
    val pasteAction: String = ???

    /** Name of the Action for moving the caret to the
     *  beginning of the previous word.
     */
    @stub
    val previousWordAction: String = ???

    /** Name of the action to set the editor into read-only
     *  mode.
     */
    @stub
    val readOnlyAction: String = ???

    /** Name of the Action for selecting the entire document */
    @stub
    val selectAllAction: String = ???

    /** Name of the Action for extending the selection
     *  by moving the caret logically backward one position.
     */
    @stub
    val selectionBackwardAction: String = ???

    /** Name of the Action for moving the caret
     *  to the beginning of the document.
     */
    @stub
    val selectionBeginAction: String = ???

    /** Name of the Action for moving the caret
     *  to the beginning of a line, extending the selection.
     */
    @stub
    val selectionBeginLineAction: String = ???

    /** Name of the Action for moving the caret
     *  to the beginning of a paragraph, extending the selection.
     */
    @stub
    val selectionBeginParagraphAction: String = ???

    /** Name of the Action for moving the caret
     *  to the beginning of a word, extending the selection.
     */
    @stub
    val selectionBeginWordAction: String = ???

    /** Name of the Action for moving the caret
     *  logically downward one position, extending the selection.
     */
    @stub
    val selectionDownAction: String = ???

    /** Name of the Action for moving the caret
     *  to the end of the document.
     */
    @stub
    val selectionEndAction: String = ???

    /** Name of the Action for moving the caret
     *  to the end of a line, extending the selection.
     */
    @stub
    val selectionEndLineAction: String = ???

    /** Name of the Action for moving the caret
     *  to the end of a paragraph, extending the selection.
     */
    @stub
    val selectionEndParagraphAction: String = ???

    /** Name of the Action for moving the caret
     *  to the end of a word, extending the selection.
     */
    @stub
    val selectionEndWordAction: String = ???

    /** Name of the Action for extending the selection
     *  by moving the caret logically forward one position.
     */
    @stub
    val selectionForwardAction: String = ???

    /** Name of the Action for moving the selection to the
     *  beginning of the next word, extending the selection.
     */
    @stub
    val selectionNextWordAction: String = ???

    /** Name of the Action for moving the selection to the
     *  beginning of the previous word, extending the selection.
     */
    @stub
    val selectionPreviousWordAction: String = ???

    /** Name of the Action for moving the caret
     *  logically upward one position, extending the selection.
     */
    @stub
    val selectionUpAction: String = ???

    /** Name of the Action for selecting a line around the caret. */
    @stub
    val selectLineAction: String = ???

    /** Name of the Action for selecting a paragraph around the caret. */
    @stub
    val selectParagraphAction: String = ???

    /** Name of the Action for selecting a word around the caret. */
    @stub
    val selectWordAction: String = ???

    /** Name of the Action for moving the caret
     *  logically upward one position.
     */
    @stub
    val upAction: String = ???

    /** Name of the action to set the editor into writeable
     *  mode.
     */
    @stub
    val writableAction: String = ???
}
