package javax.swing.text.html

import java.awt.Cursor
import java.awt.event.{ActionEvent, MouseAdapter, MouseEvent, MouseMotionListener}
import java.io.{Reader, Serializable, Writer}
import java.lang.{Object, String}
import javax.accessibility.{Accessible, AccessibleContext}
import javax.swing.{AbstractAction, Action, JEditorPane}
import javax.swing.text.{DefaultEditorKit, Document, EditorKit, Element, MutableAttributeSet, StyledEditorKit, StyledEditorKit.StyledTextAction, TextAction, View, ViewFactory}
import scala.scalanative.annotation.stub

/** The Swing JEditorPane text component supports different kinds
 *  of content via a plug-in mechanism called an EditorKit.  Because
 *  HTML is a very popular format of content, some support is provided
 *  by default.  The default support is provided by this class, which
 *  supports HTML version 3.2 (with some extensions), and is migrating
 *  toward version 4.0.
 *  The <applet> tag is not supported, but some support is provided
 *  for the <object> tag.
 *  
 *  There are several goals of the HTML EditorKit provided, that have
 *  an effect upon the way that HTML is modeled.  These
 *  have influenced its design in a substantial way.
 *  
 *  
 *  Support editing
 *  
 *  It might seem fairly obvious that a plug-in for JEditorPane
 *  should provide editing support, but that fact has several
 *  design considerations.  There are a substantial number of HTML
 *  documents that don't properly conform to an HTML specification.
 *  These must be normalized somewhat into a correct form if one
 *  is to edit them.  Additionally, users don't like to be presented
 *  with an excessive amount of structure editing, so using traditional
 *  text editing gestures is preferred over using the HTML structure
 *  exactly as defined in the HTML document.
 *  
 *  The modeling of HTML is provided by the class HTMLDocument.
 *  Its documentation describes the details of how the HTML is modeled.
 *  The editing support leverages heavily off of the text package.
 * 
 *  
 *  Extendable/Scalable
 *  
 *  To maximize the usefulness of this kit, a great deal of effort
 *  has gone into making it extendable.  These are some of the
 *  features.
 *  
 *    
 *    The parser is replaceable.  The default parser is the Hot Java
 *    parser which is DTD based.  A different DTD can be used, or an
 *    entirely different parser can be used.  To change the parser,
 *    reimplement the getParser method.  The default parser is
 *    dynamically loaded when first asked for, so the class files
 *    will never be loaded if an alternative parser is used.  The
 *    default parser is in a separate package called parser below
 *    this package.
 *    
 *    The parser drives the ParserCallback, which is provided by
 *    HTMLDocument.  To change the callback, subclass HTMLDocument
 *    and reimplement the createDefaultDocument method to return
 *    document that produces a different reader.  The reader controls
 *    how the document is structured.  Although the Document provides
 *    HTML support by default, there is nothing preventing support of
 *    non-HTML tags that result in alternative element structures.
 *    
 *    The default view of the models are provided as a hierarchy of
 *    View implementations, so one can easily customize how a particular
 *    element is displayed or add capabilities for new kinds of elements
 *    by providing new View implementations.  The default set of views
 *    are provided by the HTMLFactory class.  This can
 *    be easily changed by subclassing or replacing the HTMLFactory
 *    and reimplementing the getViewFactory method to return the alternative
 *    factory.
 *    
 *    The View implementations work primarily off of CSS attributes,
 *    which are kept in the views.  This makes it possible to have
 *    multiple views mapped over the same model that appear substantially
 *    different.  This can be especially useful for printing.  For
 *    most HTML attributes, the HTML attributes are converted to CSS
 *    attributes for display.  This helps make the View implementations
 *    more general purpose
 *  
 * 
 *  
 *  Asynchronous Loading
 *  
 *  Larger documents involve a lot of parsing and take some time
 *  to load.  By default, this kit produces documents that will be
 *  loaded asynchronously if loaded using JEditorPane.setPage.
 *  This is controlled by a property on the document.  The method
 *  createDefaultDocument can
 *  be overriden to change this.  The batching of work is done
 *  by the HTMLDocument.HTMLReader class.  The actual
 *  work is done by the DefaultStyledDocument and
 *  AbstractDocument classes in the text package.
 * 
 *  
 *  Customization from current LAF
 *  
 *  HTML provides a well known set of features without exactly
 *  specifying the display characteristics.  Swing has a theme
 *  mechanism for its look-and-feel implementations.  It is desirable
 *  for the look-and-feel to feed display characteristics into the
 *  HTML views.  An user with poor vision for example would want
 *  high contrast and larger than typical fonts.
 *  
 *  The support for this is provided by the StyleSheet
 *  class.  The presentation of the HTML can be heavily influenced
 *  by the setting of the StyleSheet property on the EditorKit.
 * 
 *  
 *  Not lossy
 *  
 *  An EditorKit has the ability to be read and save documents.
 *  It is generally the most pleasing to users if there is no loss
 *  of data between the two operation.  The policy of the HTMLEditorKit
 *  will be to store things not recognized or not necessarily visible
 *  so they can be subsequently written out.  The model of the HTML document
 *  should therefore contain all information discovered while reading the
 *  document.  This is constrained in some ways by the need to support
 *  editing (i.e. incorrect documents sometimes must be normalized).
 *  The guiding principle is that information shouldn't be lost, but
 *  some might be synthesized to produce a more correct model or it might
 *  be rearranged.
 *  
 */
class HTMLEditorKit extends StyledEditorKit with Accessible {

    /** Constructs an HTMLEditorKit, creates a StyleContext,
     *  and loads the style sheet.
     */
    @stub
    def this() = ???

    /** Creates a copy of the editor kit. */
    @stub
    def clone(): Any = ???

    /** Create an uninitialized text storage model
     *  that is appropriate for this type of editor.
     */
    @stub
    def createDefaultDocument(): Document = ???

    /** Copies the key/values in elements AttributeSet into
     *  set.
     */
    @stub
    protected def createInputAttributes(element: Element, set: MutableAttributeSet): Unit = ???

    /** Called when the kit is being removed from the
     *  JEditorPane.
     */
    @stub
    def deinstall(c: JEditorPane): Unit = ???

    /** returns the AccessibleContext associated with this editor kit */
    @stub
    def getAccessibleContext(): AccessibleContext = ???

    /** Fetches the command list for the editor. */
    @stub
    def getActions(): Array[Action] = ???

    /** Get the MIME type of the data that this
     *  kit represents support for.
     */
    @stub
    def getContentType(): String = ???

    /** Returns the default cursor. */
    @stub
    def getDefaultCursor(): Cursor = ???

    /** Gets the input attributes used for the styled
     *  editing actions.
     */
    @stub
    def getInputAttributes(): MutableAttributeSet = ???

    /** Returns the cursor to use over hyper links. */
    @stub
    def getLinkCursor(): Cursor = ???

    /** Fetch the parser to use for reading HTML streams. */
    @stub
    protected def getParser(): HTMLEditorKit.Parser = ???

    /** Get the set of styles currently being used to render the
     *  HTML elements.
     */
    @stub
    def getStyleSheet(): StyleSheet = ???

    /** Fetch a factory that is suitable for producing
     *  views of any models that are produced by this
     *  kit.
     */
    @stub
    def getViewFactory(): ViewFactory = ???

    /** Inserts HTML into an existing document. */
    @stub
    def insertHTML(doc: HTMLDocument, offset: Int, html: String, popDepth: Int, pushDepth: Int, insertTag: HTML.Tag): Unit = ???

    /** Called when the kit is being installed into the
     *  a JEditorPane.
     */
    @stub
    def install(c: JEditorPane): Unit = ???

    /** Indicates whether an html form submission is processed automatically
     *  or only FormSubmitEvent is fired.
     */
    @stub
    def isAutoFormSubmission(): Boolean = ???

    /** Inserts content from the given stream. */
    @stub
    def read(in: Reader, doc: Document, pos: Int): Unit = ???

    /** Specifies if an html form submission is processed
     *  automatically or only FormSubmitEvent is fired.
     */
    @stub
    def setAutoFormSubmission(isAuto: Boolean): Unit = ???

    /** Sets the default cursor. */
    @stub
    def setDefaultCursor(cursor: Cursor): Unit = ???

    /** Sets the cursor to use over links. */
    @stub
    def setLinkCursor(cursor: Cursor): Unit = ???

    /** Set the set of styles to be used to render the various
     *  HTML elements.
     */
    @stub
    def setStyleSheet(s: StyleSheet): Unit = ???

    /** Write content from a document to the given stream
     *  in a format appropriate for this kind of content handler.
     */
    @stub
    def write(out: Writer, doc: Document, pos: Int, len: Int): Unit = ???
}

object HTMLEditorKit {
    /** A factory to build views for HTML.  The following
     *  table describes what this factory will build by
     *  default.
     * 
     *  
     *  
     *  TagView created
     *  
     *  HTML.Tag.CONTENTInlineView
     *  
     *  HTML.Tag.IMPLIEDjavax.swing.text.html.ParagraphView
     *  
     *  HTML.Tag.Pjavax.swing.text.html.ParagraphView
     *  
     *  HTML.Tag.H1javax.swing.text.html.ParagraphView
     *  
     *  HTML.Tag.H2javax.swing.text.html.ParagraphView
     *  
     *  HTML.Tag.H3javax.swing.text.html.ParagraphView
     *  
     *  HTML.Tag.H4javax.swing.text.html.ParagraphView
     *  
     *  HTML.Tag.H5javax.swing.text.html.ParagraphView
     *  
     *  HTML.Tag.H6javax.swing.text.html.ParagraphView
     *  
     *  HTML.Tag.DTjavax.swing.text.html.ParagraphView
     *  
     *  HTML.Tag.MENUListView
     *  
     *  HTML.Tag.DIRListView
     *  
     *  HTML.Tag.ULListView
     *  
     *  HTML.Tag.OLListView
     *  
     *  HTML.Tag.LIBlockView
     *  
     *  HTML.Tag.DLBlockView
     *  
     *  HTML.Tag.DDBlockView
     *  
     *  HTML.Tag.BODYBlockView
     *  
     *  HTML.Tag.HTMLBlockView
     *  
     *  HTML.Tag.CENTERBlockView
     *  
     *  HTML.Tag.DIVBlockView
     *  
     *  HTML.Tag.BLOCKQUOTEBlockView
     *  
     *  HTML.Tag.PREBlockView
     *  
     *  HTML.Tag.BLOCKQUOTEBlockView
     *  
     *  HTML.Tag.PREBlockView
     *  
     *  HTML.Tag.IMGImageView
     *  
     *  HTML.Tag.HRHRuleView
     *  
     *  HTML.Tag.BRBRView
     *  
     *  HTML.Tag.TABLEjavax.swing.text.html.TableView
     *  
     *  HTML.Tag.INPUTFormView
     *  
     *  HTML.Tag.SELECTFormView
     *  
     *  HTML.Tag.TEXTAREAFormView
     *  
     *  HTML.Tag.OBJECTObjectView
     *  
     *  HTML.Tag.FRAMESETFrameSetView
     *  
     *  HTML.Tag.FRAMEFrameView
     *  
     *  
     */
    object HTMLFactory extends Object with ViewFactory {

        /**  */
        @stub
        def apply() = ???

        /** Creates a view from an element. */
        @stub
        def create(elem: Element): View = ???
    }


    /** An abstract Action providing some convenience methods that may
     *  be useful in inserting HTML into an existing document.
     *  NOTE: None of the convenience methods obtain a lock on the
     *  document. If you have another thread modifying the text these
     *  methods may have inconsistent behavior, or return the wrong thing.
     */
    abstract object HTMLTextAction extends StyledEditorKit.StyledTextAction {

        /**  */
        @stub
        def apply(name: String) = ???

        /** Returns number of elements, starting at the deepest leaf, needed
         *  to get to an element representing tag.
         */
        @stub
        protected def elementCountToTag(doc: HTMLDocument, offset: Int, tag: HTML.Tag): Int = ???

        /** Returns the deepest element at offset matching
         *  tag.
         */
        @stub
        protected def findElementMatchingTag(doc: HTMLDocument, offset: Int, tag: HTML.Tag): Element = ???

        /** Returns an array of the Elements that contain offset. */
        @stub
        protected def getElementsAt(doc: HTMLDocument, offset: Int): Array[Element] = ???

        /**  */
        @stub
        protected def getHTMLDocument(e: JEditorPane): HTMLDocument = ???

        /**  */
        @stub
        protected def getHTMLEditorKit(e: JEditorPane): HTMLEditorKit = ???
    }


    /** InsertHTMLTextAction can be used to insert an arbitrary string of HTML
     *  into an existing HTML document. At least two HTML.Tags need to be
     *  supplied. The first Tag, parentTag, identifies the parent in
     *  the document to add the elements to. The second tag, addTag,
     *  identifies the first tag that should be added to the document as
     *  seen in the HTML string. One important thing to remember, is that
     *  the parser is going to generate all the appropriate tags, even if
     *  they aren't in the HTML string passed in.
     *  For example, lets say you wanted to create an action to insert
     *  a table into the body. The parentTag would be HTML.Tag.BODY,
     *  addTag would be HTML.Tag.TABLE, and the string could be something
     *  like <table><tr><td></td></tr></table>.
     *  There is also an option to supply an alternate parentTag and
     *  addTag. These will be checked for if there is no parentTag at
     *  offset.
     */
    object InsertHTMLTextAction extends HTMLEditorKit.HTMLTextAction {

        /**  */
        @stub
        def apply(name: String, html: String, parentTag: HTML.Tag, addTag: HTML.Tag) = ???

        /**  */
        @stub
        def apply(name: String, html: String, parentTag: HTML.Tag, addTag: HTML.Tag, alternateParentTag: HTML.Tag, alternateAddTag: HTML.Tag) = ???

        /** Tag in HTML to start adding tags from. */
        @stub
        protected val addTag: HTML.Tag = ???

        /** Alternate tag in HTML to start adding tags from if parentTag
         *  is not found and alternateParentTag is found.
         */
        @stub
        protected val alternateAddTag: HTML.Tag = ???

        /** Alternate Tag to check for in the document if parentTag is
         *  not found.
         */
        @stub
        protected val alternateParentTag: HTML.Tag = ???

        /** HTML to insert. */
        @stub
        protected val html: String = ???

        /** Tag to check for in the document. */
        @stub
        protected val parentTag: HTML.Tag = ???

        /** Inserts the HTML into the document. */
        @stub
        def actionPerformed(ae: ActionEvent): Unit = ???

        /** This is invoked when inserting at a boundary. */
        @stub
        protected def insertAtBoundary(editor: JEditorPane, doc: HTMLDocument, offset: Int, insertElement: Element, html: String, parentTag: HTML.Tag, addTag: HTML.Tag): Unit = ???

        /** Deprecated. 
         * As of Java 2 platform v1.3, use insertAtBoundary
         * 
         */
        @stub
        protected def insertAtBoundry(editor: JEditorPane, doc: HTMLDocument, offset: Int, insertElement: Element, html: String, parentTag: HTML.Tag, addTag: HTML.Tag): Unit = ???

        /** A cover for HTMLEditorKit.insertHTML. */
        @stub
        protected def insertHTML(editor: JEditorPane, doc: HTMLDocument, offset: Int, html: String, popDepth: Int, pushDepth: Int, addTag: HTML.Tag): Unit = ???
    }


    /** Class to watch the associated component and fire
     *  hyperlink events on it when appropriate.
     */
    object LinkController extends MouseAdapter with MouseMotionListener with Serializable {

        /**  */
        @stub
        def apply() = ???

        /** Calls linkActivated on the associated JEditorPane
         *  if the given position represents a link.
         */
        @stub
        protected def activateLink(pos: Int, editor: JEditorPane): Unit = ???

        /** Called for a mouse click event. */
        @stub
        def mouseClicked(e: MouseEvent): Unit = ???

        /** Invoked when a mouse button is pressed on a component and then
         *  dragged.
         */
        @stub
        def mouseDragged(e: MouseEvent): Unit = ???

        /** Invoked when the mouse cursor has been moved onto a component
         *  but no buttons have been pushed.
         */
        @stub
        def mouseMoved(e: MouseEvent): Unit = ???
    }


    /** Interface to be supported by the parser.  This enables
     *  providing a different parser while reusing some of the
     *  implementation provided by this editor kit.
     */
    abstract object Parser extends Object {

        /**  */
        @stub
        def apply() = ???

        /** Parse the given stream and drive the given callback
         *  with the results of the parse.
         */
        def parse(r: Reader, cb: HTMLEditorKit.ParserCallback, ignoreCharSet: Boolean): Unit
    }


    /** The result of parsing drives these callback methods.
     *  The open and close actions should be balanced.  The
     *  flush method will be the last method
     *  called, to give the receiver a chance to flush any
     *  pending data into the document.
     *  Refer to DocumentParser, the default parser used, for further
     *  information on the contents of the AttributeSets, the positions, and
     *  other info.
     */
    object ParserCallback extends Object {

        /**  */
        @stub
        def apply() = ???

        /** This is passed as an attribute in the attributeset to indicate
         *  the element is implied eg, the string '<>foo<\t>'
         *  contains an implied html element and an implied body element.
         */
        @stub
        val IMPLIED: Any = ???

        /**  */
        @stub
        def flush(): Unit = ???

        /**  */
        @stub
        def handleComment(data: Array[Char], pos: Int): Unit = ???

        /** This is invoked after the stream has been parsed, but before
         *  flush.
         */
        @stub
        def handleEndOfLineString(eol: String): Unit = ???

        /**  */
        @stub
        def handleEndTag(t: HTML.Tag, pos: Int): Unit = ???

        /**  */
        @stub
        def handleError(errorMsg: String, pos: Int): Unit = ???

        /**  */
        @stub
        def handleSimpleTag(t: HTML.Tag, a: MutableAttributeSet, pos: Int): Unit = ???

        /**  */
        @stub
        def handleStartTag(t: HTML.Tag, a: MutableAttributeSet, pos: Int): Unit = ???

        /**  */
        @stub
        def handleText(data: Array[Char], pos: Int): Unit = ???
    }


    /** The bold action identifier */
    @stub
    val BOLD_ACTION: String = ???

    /** The Color choice action identifier
     *      The color is passed as an argument
     */
    @stub
    val COLOR_ACTION: String = ???

    /** Default Cascading Style Sheet file that sets
     *  up the tag views.
     */
    @stub
    val DEFAULT_CSS: String = ???

    /** The  font size increase to next value action identifier */
    @stub
    val FONT_CHANGE_BIGGER: String = ???

    /** The font size decrease to next value action identifier */
    @stub
    val FONT_CHANGE_SMALLER: String = ???

    /** Align images at the bottom. */
    @stub
    val IMG_ALIGN_BOTTOM: String = ???

    /** Align images in the middle. */
    @stub
    val IMG_ALIGN_MIDDLE: String = ???

    /** Align images at the top. */
    @stub
    val IMG_ALIGN_TOP: String = ???

    /** Align images at the border. */
    @stub
    val IMG_BORDER: String = ???

    /** The italic action identifier */
    @stub
    val ITALIC_ACTION: String = ???

    /** The logical style choice action identifier
     *      The logical style is passed in as an argument
     */
    @stub
    val LOGICAL_STYLE_ACTION: String = ???

    /** The paragraph left indent action identifier */
    @stub
    val PARA_INDENT_LEFT: String = ???

    /** The paragraph right indent action identifier */
    @stub
    val PARA_INDENT_RIGHT: String = ???
}
