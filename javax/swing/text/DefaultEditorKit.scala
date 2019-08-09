package javax.swing.text

import java.io.{InputStream, OutputStream, Reader}
import java.lang.{Object, String}
import javax.swing.Action

// This is the set of things needed by a text component
// to be a reasonably functioning editor for some type
// of text document.  This implementation provides a default
// implementation which treats text as plain text and
// provides a minimal set of actions for a simple editor.
//
// 
// Newlines
// 
// There are two properties which deal with newlines.  The
// system property, line.separator, is defined to be
// platform-dependent, either "\n", "\r", or "\r\n".  There is also
// a property defined in DefaultEditorKit, called
// EndOfLineStringProperty,
// which is defined automatically when a document is loaded, to be
// the first occurrence of any of the newline characters.
// When a document is loaded, EndOfLineStringProperty
// is set appropriately, and when the document is written back out, the
// EndOfLineStringProperty is used.  But while the document
// is in memory, the "\n" character is used to define a
// newline, regardless of how the newline is defined when
// the document is on disk.  Therefore, for searching purposes,
// "\n" should always be used.  When a new document is created,
// and the EndOfLineStringProperty has not been defined,
// it will use the System property when writing out the
// document.
// Note that EndOfLineStringProperty is set
// on the Document using the get/putProperty
// methods.  Subclasses may override this behavior.
//
// 
class DefaultEditorKit extends EditorKit {

    @stub
    // Fetches a caret that can navigate through views
    // produced by the associated ViewFactory.
    def createCaret(): Caret = ???

    @stub
    // Creates an uninitialized text storage model (PlainDocument)
    // that is appropriate for this type of editor.
    def createDefaultDocument(): Document = ???

    @stub
    // Fetches the set of commands that can be used
    // on a text component that is using a model and
    // view produced by this kit.
    def getActions(): Array[Action] = ???

    @stub
    // Gets the MIME type of the data that this
    // kit represents support for.
    def getContentType(): String = ???

    @stub
    // Fetches a factory that is suitable for producing
    // views of any models that are produced by this
    // kit.
    def getViewFactory(): ViewFactory = ???

    @stub
    // Inserts content from the given stream which is expected
    // to be in a format appropriate for this kind of content
    // handler.
    def read(in: InputStream, doc: Document, pos: Int): Unit = ???

    @stub
    // Inserts content from the given stream, which will be
    // treated as plain text.
    def read(in: Reader, doc: Document, pos: Int): Unit = ???

    @stub
    // Writes content from a document to the given stream
    // in a format appropriate for this kind of content handler.
    def write(out: OutputStream, doc: Document, pos: Int, len: Int): Unit = ???
}

object DefaultEditorKit {
    @stub
    // Creates a beep.
    def DefaultEditorKit.BeepAction: class = ???

    @stub
    // Copies the selected region and place its contents
    // into the system clipboard.
    def DefaultEditorKit.CopyAction: class = ???

    @stub
    // Cuts the selected region and place its contents
    // into the system clipboard.
    def DefaultEditorKit.CutAction: class = ???

    @stub
    // The action that is executed by default if
    // a key typed event is received and there
    // is no keymap entry.
    def DefaultEditorKit.DefaultKeyTypedAction: class = ???

    @stub
    // Places a line/paragraph break into the document.
    def DefaultEditorKit.InsertBreakAction: class = ???

    @stub
    // Places content into the associated document.
    def DefaultEditorKit.InsertContentAction: class = ???

    @stub
    // Places a tab character into the document.
    def DefaultEditorKit.InsertTabAction: class = ???

    @stub
    // Name of the Action for moving the caret
    // logically backward one position.
    def backwardAction: String = ???

    @stub
    // Name of the action to create a beep.
    def beepAction: String = ???

    @stub
    // Name of the Action for moving the caret
    // to the beginning of the document.
    def beginAction: String = ???

    @stub
    // Name of the Action for moving the caret
    // to the beginning of a line.
    def beginLineAction: String = ???

    @stub
    // Name of the Action for moving the caret
    // to the beginning of a paragraph.
    def beginParagraphAction: String = ???

    @stub
    // Name of the Action for moving the caret
    // to the beginning of a word.
    def beginWordAction: String = ???

    @stub
    // Name of the action to copy the selected region
    // and place the contents into the system clipboard.
    def copyAction: String = ???

    @stub
    // Name of the action to cut the selected region
    // and place the contents into the system clipboard.
    def cutAction: String = ???

    @stub
    // Name of the action that is executed by default if
    // a key typed event is received and there
    // is no keymap entry.
    def defaultKeyTypedAction: String = ???

    @stub
    // Name of the action to delete the character of content that
    // follows the current caret position.
    def deleteNextCharAction: String = ???

    @stub
    // Name of the action to delete the word that
    // follows the beginning of the selection.
    def deleteNextWordAction: String = ???

    @stub
    // Name of the action to delete the character of content that
    // precedes the current caret position.
    def deletePrevCharAction: String = ???

    @stub
    // Name of the action to delete the word that
    // precedes the beginning of the selection.
    def deletePrevWordAction: String = ???

    @stub
    // Name of the Action for moving the caret
    // logically downward one position.
    def downAction: String = ???

    @stub
    // Name of the Action for moving the caret
    // to the end of the document.
    def endAction: String = ???

    @stub
    // Name of the Action for moving the caret
    // to the end of a line.
    def endLineAction: String = ???

    @stub
    // When reading a document if a CRLF is encountered a property
    // with this name is added and the value will be "\r\n".
    def EndOfLineStringProperty: String = ???

    @stub
    // Name of the Action for moving the caret
    // to the end of a paragraph.
    def endParagraphAction: String = ???

    @stub
    // Name of the Action for moving the caret
    // to the end of a word.
    def endWordAction: String = ???

    @stub
    // Name of the Action for moving the caret
    // logically forward one position.
    def forwardAction: String = ???

    @stub
    // Name of the action to place a line/paragraph break into
    // the document.
    def insertBreakAction: String = ???

    @stub
    // Name of the action to place content into the associated
    // document.
    def insertContentAction: String = ???

    @stub
    // Name of the action to place a tab character into
    // the document.
    def insertTabAction: String = ???

    @stub
    // Name of the Action for moving the caret to the
    // beginning of the next word.
    def nextWordAction: String = ???

    @stub
    // Name of the action to page down vertically.
    def pageDownAction: String = ???

    @stub
    // Name of the action to page up vertically.
    def pageUpAction: String = ???

    @stub
    // Name of the action to paste the contents of the
    // system clipboard into the selected region, or before the
    // caret if nothing is selected.
    def pasteAction: String = ???

    @stub
    // Name of the Action for moving the caret to the
    // beginning of the previous word.
    def previousWordAction: String = ???

    @stub
    // Name of the action to set the editor into read-only
    // mode.
    def readOnlyAction: String = ???

    @stub
    // Name of the Action for selecting the entire document
    def selectAllAction: String = ???

    @stub
    // Name of the Action for extending the selection
    // by moving the caret logically backward one position.
    def selectionBackwardAction: String = ???

    @stub
    // Name of the Action for moving the caret
    // to the beginning of the document.
    def selectionBeginAction: String = ???

    @stub
    // Name of the Action for moving the caret
    // to the beginning of a line, extending the selection.
    def selectionBeginLineAction: String = ???

    @stub
    // Name of the Action for moving the caret
    // to the beginning of a paragraph, extending the selection.
    def selectionBeginParagraphAction: String = ???

    @stub
    // Name of the Action for moving the caret
    // to the beginning of a word, extending the selection.
    def selectionBeginWordAction: String = ???

    @stub
    // Name of the Action for moving the caret
    // logically downward one position, extending the selection.
    def selectionDownAction: String = ???

    @stub
    // Name of the Action for moving the caret
    // to the end of the document.
    def selectionEndAction: String = ???

    @stub
    // Name of the Action for moving the caret
    // to the end of a line, extending the selection.
    def selectionEndLineAction: String = ???

    @stub
    // Name of the Action for moving the caret
    // to the end of a paragraph, extending the selection.
    def selectionEndParagraphAction: String = ???

    @stub
    // Name of the Action for moving the caret
    // to the end of a word, extending the selection.
    def selectionEndWordAction: String = ???

    @stub
    // Name of the Action for extending the selection
    // by moving the caret logically forward one position.
    def selectionForwardAction: String = ???

    @stub
    // Name of the Action for moving the selection to the
    // beginning of the next word, extending the selection.
    def selectionNextWordAction: String = ???

    @stub
    // Name of the Action for moving the selection to the
    // beginning of the previous word, extending the selection.
    def selectionPreviousWordAction: String = ???

    @stub
    // Name of the Action for moving the caret
    // logically upward one position, extending the selection.
    def selectionUpAction: String = ???

    @stub
    // Name of the Action for selecting a line around the caret.
    def selectLineAction: String = ???

    @stub
    // Name of the Action for selecting a paragraph around the caret.
    def selectParagraphAction: String = ???

    @stub
    // Name of the Action for selecting a word around the caret.
    def selectWordAction: String = ???

    @stub
    // Name of the Action for moving the caret
    // logically upward one position.
    def upAction: String = ???
}
