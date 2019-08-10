package javax.swing.text.html

import java.awt.Cursor
import java.io.{Reader, Writer}
import java.lang.{Object, String}
import javax.accessibility.{Accessible, AccessibleContext}
import javax.swing.{Action, JEditorPane}
import javax.swing.text.{DefaultEditorKit, Document, EditorKit, Element, MutableAttributeSet, StyledEditorKit, ViewFactory}
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
    /** A factory to build views for HTML. */
    type HTMLFactory = HTMLEditorKit_HTMLFactory

    /** An abstract Action providing some convenience methods that may
     *  be useful in inserting HTML into an existing document.
     */
    type HTMLTextAction = HTMLEditorKit_HTMLTextAction

    /** InsertHTMLTextAction can be used to insert an arbitrary string of HTML
     *  into an existing HTML document.
     */
    type InsertHTMLTextAction = HTMLEditorKit_InsertHTMLTextAction

    /** Class to watch the associated component and fire
     *  hyperlink events on it when appropriate.
     */
    type LinkController = HTMLEditorKit_LinkController

    /** Interface to be supported by the parser. */
    type Parser = HTMLEditorKit_Parser

    /** The result of parsing drives these callback methods. */
    type ParserCallback = HTMLEditorKit_ParserCallback

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
