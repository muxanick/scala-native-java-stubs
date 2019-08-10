package javax.swing.text.html

import java.lang.{Object, String}
import java.net.URL
import java.util.Vector
import javax.swing.event.{DocumentEvent, UndoableEditEvent}
import javax.swing.text.{AbstractDocument, AbstractDocument.AbstractElement, AbstractDocument.BranchElement, AbstractDocument.Content, AbstractDocument.DefaultDocumentEvent, AbstractDocument.LeafElement, AttributeSet, DefaultStyledDocument, DefaultStyledDocument.ElementSpec, Element, MutableAttributeSet}
import scala.scalanative.annotation.stub

/** A document that models HTML.  The purpose of this model is to
 *  support both browsing and editing.  As a result, the structure
 *  described by an HTML document is not exactly replicated by default.
 *  The element structure that is modeled by default, is built by the
 *  class HTMLDocument.HTMLReader, which implements the
 *  HTMLEditorKit.ParserCallback protocol that the parser
 *  expects.  To change the structure one can subclass
 *  HTMLReader, and reimplement the method getReader(int) to return the new reader implementation.  The
 *  documentation for HTMLReader should be consulted for
 *  the details of the default structure created.  The intent is that
 *  the document be non-lossy (although reproducing the HTML format may
 *  result in a different format).
 * 
 *  The document models only HTML, and makes no attempt to store
 *  view attributes in it.  The elements are identified by the
 *  StyleContext.NameAttribute attribute, which should
 *  always have a value of type HTML.Tag that identifies
 *  the kind of element.  Some of the elements (such as comments) are
 *  synthesized.  The HTMLFactory uses this attribute to
 *  determine what kind of view to build.
 * 
 *  This document supports incremental loading.  The
 *  TokenThreshold property controls how much of the parse
 *  is buffered before trying to update the element structure of the
 *  document.  This property is set by the EditorKit so
 *  that subclasses can disable it.
 * 
 *  The Base property determines the URL against which
 *  relative URLs are resolved.  By default, this will be the
 *  Document.StreamDescriptionProperty if the value of the
 *  property is a URL.  If a <BASE> tag is encountered, the base
 *  will become the URL specified by that tag.  Because the base URL is
 *  a property, it can of course be set directly.
 * 
 *  The default content storage mechanism for this document is a gap
 *  buffer (GapContent).  Alternatives can be supplied by
 *  using the constructor that takes a Content
 *  implementation.
 * 
 *  Modifying HTMLDocument
 * 
 *  In addition to the methods provided by Document and
 *  StyledDocument for mutating an HTMLDocument, HTMLDocument provides
 *  a number of convenience methods.  The following methods can be used
 *  to insert HTML content into an existing document.
 * 
 *  
 *    setInnerHTML(Element, String)
 *    setOuterHTML(Element, String)
 *    insertBeforeStart(Element, String)
 *    insertAfterStart(Element, String)
 *    insertBeforeEnd(Element, String)
 *    insertAfterEnd(Element, String)
 *  
 * 
 *  The following examples illustrate using these methods.  Each
 *  example assumes the HTML document is initialized in the following
 *  way:
 * 
 *  
 *  JEditorPane p = new JEditorPane();
 *  p.setContentType("text/html");
 *  p.setText("..."); // Document text is provided below.
 *  HTMLDocument d = (HTMLDocument) p.getDocument();
 *  
 * 
 *  With the following HTML content:
 * 
 *  
 *  <html>
 *    <head>
 *      <title>An example HTMLDocument</title>
 *      <style type="text/css">
 *        div { background-color: silver; }
 *        ul { color: red; }
 *      </style>
 *    </head>
 *    <body>
 *      <div id="BOX">
 *        <p>Paragraph 1</p>
 *        <p>Paragraph 2</p>
 *      </div>
 *    </body>
 *  </html>
 *  
 * 
 *  All the methods for modifying an HTML document require an Element.  Elements can be obtained from an HTML document by using
 *  the method getElement(Element e, Object attribute, Object
 *  value).  It returns the first descendant element that contains the
 *  specified attribute with the given value, in depth-first order.
 *  For example, d.getElement(d.getDefaultRootElement(),
 *  StyleConstants.NameAttribute, HTML.Tag.P) returns the first
 *  paragraph element.
 * 
 *  A convenient shortcut for locating elements is the method getElement(String); returns an element whose ID
 *  attribute matches the specified value.  For example,
 *  d.getElement("BOX") returns the DIV
 *  element.
 * 
 *  The getIterator(HTML.Tag t) method can also be used for
 *  finding all occurrences of the specified HTML tag in the
 *  document.
 * 
 *  Inserting elements
 * 
 *  Elements can be inserted before or after the existing children
 *  of any non-leaf element by using the methods
 *  insertAfterStart and insertBeforeEnd.
 *  For example, if e is the DIV element,
 *  d.insertAfterStart(e, "<ul><li>List
 *  Item</li></ul>") inserts the list before the first
 *  paragraph, and d.insertBeforeEnd(e, "<ul><li>List
 *  Item</li></ul>") inserts the list after the last
 *  paragraph.  The DIV block becomes the parent of the
 *  newly inserted elements.
 * 
 *  Sibling elements can be inserted before or after any element by
 *  using the methods insertBeforeStart and
 *  insertAfterEnd.  For example, if e is the
 *  DIV element, d.insertBeforeStart(e,
 *  "<ul><li>List Item</li></ul>") inserts the list
 *  before the DIV element, and d.insertAfterEnd(e,
 *  "<ul><li>List Item</li></ul>") inserts the list
 *  after the DIV element.  The newly inserted elements
 *  become siblings of the DIV element.
 * 
 *  Replacing elements
 * 
 *  Elements and all their descendants can be replaced by using the
 *  methods setInnerHTML and setOuterHTML.
 *  For example, if e is the DIV element,
 *  d.setInnerHTML(e, "<ul><li>List
 *  Item</li></ul>") replaces all children paragraphs with
 *  the list, and d.setOuterHTML(e, "<ul><li>List
 *  Item</li></ul>") replaces the DIV element
 *  itself.  In latter case the parent of the list is the
 *  BODY element.
 * 
 *  Summary
 * 
 *  The following table shows the example document and the results
 *  of various methods described above.
 * 
 *  
 *    
 *      Example
 *      insertAfterStart
 *      insertBeforeEnd
 *      insertBeforeStart
 *      insertAfterEnd
 *      setInnerHTML
 *      setOuterHTML
 *    
 *    
 *      
 *        
 *          Paragraph 1
 *          Paragraph 2
 *        
 *      
 *  <!-- insertAfterStart -->
 *      
 *        
 *          
 *            List Item
 *          
 *          Paragraph 1
 *          Paragraph 2
 *        
 *      
 *  <!-- insertBeforeEnd -->
 *      
 *        
 *          Paragraph 1
 *          Paragraph 2
 *          
 *            List Item
 *          
 *        
 *      
 *  <!-- insertBeforeStart -->
 *      
 *        
 *          List Item
 *        
 *        
 *          Paragraph 1
 *          Paragraph 2
 *        
 *      
 *  <!-- insertAfterEnd -->
 *      
 *        
 *          Paragraph 1
 *          Paragraph 2
 *        
 *        
 *          List Item
 *        
 *      
 *  <!-- setInnerHTML -->
 *      
 *        
 *          
 *            List Item
 *          
 *        
 *      
 *  <!-- setOuterHTML -->
 *      
 *        
 *          List Item
 *        
 *      
 *    
 *  
 * 
 *  Warning: Serialized objects of this class will
 *  not be compatible with future Swing releases. The current
 *  serialization support is appropriate for short term storage or RMI
 *  between applications running the same version of Swing.  As of 1.4,
 *  support for long term storage of all JavaBeans™
 *  has been added to the
 *  java.beans package.  Please see XMLEncoder.
 */
class HTMLDocument extends DefaultStyledDocument {

    /** Constructs an HTML document using the default buffer size
     *  and a default StyleSheet.
     */
    @stub
    def this() = ???

    /** Constructs an HTML document with the given content
     *  storage implementation and the given style/attribute
     *  storage mechanism.
     */
    @stub
    def this(c: AbstractDocument.Content, styles: StyleSheet) = ???

    /** Constructs an HTML document with the default content
     *  storage implementation and the specified style/attribute
     *  storage mechanism.
     */
    @stub
    def this(styles: StyleSheet) = ???

    /** An element that represents a structural block of
     *  HTML.
     */
    class BlockElement extends AbstractDocument.BranchElement {

        /** Constructs a composite element that initially contains
         *  no children.
         */
        @stub
        def this(parent: Element, a: AttributeSet) = ???

        /** Gets the name of the element. */
        @stub
        def getName(): String = ???

        /** Gets the resolving parent. */
        @stub
        def getResolveParent(): AttributeSet = ???
    }


    /** An HTML reader to load an HTML document with an HTML
     *  element structure.  This is a set of callbacks from
     *  the parser, implemented to create a set of elements
     *  tagged with attributes.  The parse builds up tokens
     *  (ElementSpec) that describe the element subtree desired,
     *  and burst it into the document under the protection of
     *  a write lock using the insert method on the document
     *  outer class.
     *  
     *  The reader can be configured by registering actions
     *  (of type HTMLDocument.HTMLReader.TagAction)
     *  that describe how to handle the action.  The idea behind
     *  the actions provided is that the most natural text editing
     *  operations can be provided if the element structure boils
     *  down to paragraphs with runs of some kind of style
     *  in them.  Some things are more naturally specified
     *  structurally, so arbitrary structure should be allowed
     *  above the paragraphs, but will need to be edited with structural
     *  actions.  The implication of this is that some of the
     *  HTML elements specified in the stream being parsed will
     *  be collapsed into attributes, and in some cases paragraphs
     *  will be synthesized.  When HTML elements have been
     *  converted to attributes, the attribute key will be of
     *  type HTML.Tag, and the value will be of type AttributeSet
     *  so that no information is lost.  This enables many of the
     *  existing actions to work so that the user can type input,
     *  hit the return key, backspace, delete, etc and have a
     *  reasonable result.  Selections can be created, and attributes
     *  applied or removed, etc.  With this in mind, the work done
     *  by the reader can be categorized into the following kinds
     *  of tasks:
     *  
     *  Block
     *  Build the structure like it's specified in the stream.
     *  This produces elements that contain other elements.
     *  Paragraph
     *  Like block except that it's expected that the element
     *  will be used with a paragraph view so a paragraph element
     *  won't need to be synthesized.
     *  Character
     *  Contribute the element as an attribute that will start
     *  and stop at arbitrary text locations.  This will ultimately
     *  be mixed into a run of text, with all of the currently
     *  flattened HTML character elements.
     *  Special
     *  Produce an embedded graphical element.
     *  Form
     *  Produce an element that is like the embedded graphical
     *  element, except that it also has a component model associated
     *  with it.
     *  Hidden
     *  Create an element that is hidden from view when the
     *  document is being viewed read-only, and visible when the
     *  document is being edited.  This is useful to keep the
     *  model from losing information, and used to store things
     *  like comments and unrecognized tags.
     * 
     *  
     *  
     *  Currently, <APPLET>, <PARAM>, <MAP>, <AREA>, <LINK>,
     *  <SCRIPT> and <STYLE> are unsupported.
     * 
     *  
     *  The assignment of the actions described is shown in the
     *  following table for the tags defined in HTML.Tag.
     *  
     *  TagAction
     *  HTML.Tag.A         CharacterAction
     *  HTML.Tag.ADDRESS   CharacterAction
     *  HTML.Tag.APPLET    HiddenAction
     *  HTML.Tag.AREA      AreaAction
     *  HTML.Tag.B         CharacterAction
     *  HTML.Tag.BASE      BaseAction
     *  HTML.Tag.BASEFONT  CharacterAction
     *  HTML.Tag.BIG       CharacterAction
     *  HTML.Tag.BLOCKQUOTEBlockAction
     *  HTML.Tag.BODY      BlockAction
     *  HTML.Tag.BR        SpecialAction
     *  HTML.Tag.CAPTION   BlockAction
     *  HTML.Tag.CENTER    BlockAction
     *  HTML.Tag.CITE      CharacterAction
     *  HTML.Tag.CODE      CharacterAction
     *  HTML.Tag.DD        BlockAction
     *  HTML.Tag.DFN       CharacterAction
     *  HTML.Tag.DIR       BlockAction
     *  HTML.Tag.DIV       BlockAction
     *  HTML.Tag.DL        BlockAction
     *  HTML.Tag.DT        ParagraphAction
     *  HTML.Tag.EM        CharacterAction
     *  HTML.Tag.FONT      CharacterAction
     *  HTML.Tag.FORM      As of 1.4 a BlockAction
     *  HTML.Tag.FRAME     SpecialAction
     *  HTML.Tag.FRAMESET  BlockAction
     *  HTML.Tag.H1        ParagraphAction
     *  HTML.Tag.H2        ParagraphAction
     *  HTML.Tag.H3        ParagraphAction
     *  HTML.Tag.H4        ParagraphAction
     *  HTML.Tag.H5        ParagraphAction
     *  HTML.Tag.H6        ParagraphAction
     *  HTML.Tag.HEAD      HeadAction
     *  HTML.Tag.HR        SpecialAction
     *  HTML.Tag.HTML      BlockAction
     *  HTML.Tag.I         CharacterAction
     *  HTML.Tag.IMG       SpecialAction
     *  HTML.Tag.INPUT     FormAction
     *  HTML.Tag.ISINDEX   IsndexAction
     *  HTML.Tag.KBD       CharacterAction
     *  HTML.Tag.LI        BlockAction
     *  HTML.Tag.LINK      LinkAction
     *  HTML.Tag.MAP       MapAction
     *  HTML.Tag.MENU      BlockAction
     *  HTML.Tag.META      MetaAction
     *  HTML.Tag.NOFRAMES  BlockAction
     *  HTML.Tag.OBJECT    SpecialAction
     *  HTML.Tag.OL        BlockAction
     *  HTML.Tag.OPTION    FormAction
     *  HTML.Tag.P         ParagraphAction
     *  HTML.Tag.PARAM     HiddenAction
     *  HTML.Tag.PRE       PreAction
     *  HTML.Tag.SAMP      CharacterAction
     *  HTML.Tag.SCRIPT    HiddenAction
     *  HTML.Tag.SELECT    FormAction
     *  HTML.Tag.SMALL     CharacterAction
     *  HTML.Tag.STRIKE    CharacterAction
     *  HTML.Tag.S         CharacterAction
     *  HTML.Tag.STRONG    CharacterAction
     *  HTML.Tag.STYLE     StyleAction
     *  HTML.Tag.SUB       CharacterAction
     *  HTML.Tag.SUP       CharacterAction
     *  HTML.Tag.TABLE     BlockAction
     *  HTML.Tag.TD        BlockAction
     *  HTML.Tag.TEXTAREA  FormAction
     *  HTML.Tag.TH        BlockAction
     *  HTML.Tag.TITLE     TitleAction
     *  HTML.Tag.TR        BlockAction
     *  HTML.Tag.TT        CharacterAction
     *  HTML.Tag.U         CharacterAction
     *  HTML.Tag.UL        BlockAction
     *  HTML.Tag.VAR       CharacterAction
     *  
     *  
     *  Once </html> is encountered, the Actions are no longer notified.
     */
    class HTMLReader extends HTMLEditorKit.ParserCallback {

        /**  */
        @stub
        def this(offset: Int) = ???

        /**  */
        @stub
        def this(offset: Int, popDepth: Int, pushDepth: Int, insertTag: HTML.Tag) = ???

        /**  */
        class BlockAction extends HTMLDocument.HTMLReader.TagAction {

            /**  */
            @stub
            def this() = ???

            /** Called when an end tag is seen for the
             *  type of tag this action was registered
             *  to.
             */
            @stub
            def end(t: HTML.Tag): Unit = ???

            /** Called when a start tag is seen for the
             *  type of tag this action was registered
             *  to.
             */
            @stub
            def start(t: HTML.Tag, attr: MutableAttributeSet): Unit = ???
        }


        /**  */
        class CharacterAction extends HTMLDocument.HTMLReader.TagAction {

            /**  */
            @stub
            def this() = ???

            /** Called when an end tag is seen for the
             *  type of tag this action was registered
             *  to.
             */
            @stub
            def end(t: HTML.Tag): Unit = ???

            /** Called when a start tag is seen for the
             *  type of tag this action was registered
             *  to.
             */
            @stub
            def start(t: HTML.Tag, attr: MutableAttributeSet): Unit = ???
        }


        /** Action to support forms by building all of the elements
         *  used to represent form controls.  This will process
         *  the <INPUT>, <TEXTAREA>, <SELECT>,
         *  and <OPTION> tags.  The element created by
         *  this action is expected to have the attribute
         *  StyleConstants.ModelAttribute set to
         *  the model that holds the state for the form control.
         *  This enables multiple views, and allows document to
         *  be iterated over picking up the data of the form.
         *  The following are the model assignments for the
         *  various type of form elements.
         *  
         *  
         *    Element Type
         *    Model Type
         *  
         *    input, type button
         *    DefaultButtonModel
         *  
         *    input, type checkbox
         *    JToggleButton.ToggleButtonModel
         *  
         *    input, type image
         *    DefaultButtonModel
         *  
         *    input, type password
         *    PlainDocument
         *  
         *    input, type radio
         *    JToggleButton.ToggleButtonModel
         *  
         *    input, type reset
         *    DefaultButtonModel
         *  
         *    input, type submit
         *    DefaultButtonModel
         *  
         *    input, type text or type is null.
         *    PlainDocument
         *  
         *    select
         *    DefaultComboBoxModel or an DefaultListModel, with an item type of Option
         *  
         *    textarea
         *    PlainDocument
         *  
         */
        class FormAction extends HTMLDocument.HTMLReader.SpecialAction {

            /**  */
            @stub
            def this() = ???

            /** Called when an end tag is seen for the
             *  type of tag this action was registered
             *  to.
             */
            @stub
            def end(t: HTML.Tag): Unit = ???

            /** Called when a start tag is seen for the
             *  type of tag this action was registered
             *  to.
             */
            @stub
            def start(t: HTML.Tag, attr: MutableAttributeSet): Unit = ???
        }


        /**  */
        class HiddenAction extends HTMLDocument.HTMLReader.TagAction {

            /**  */
            @stub
            def this() = ???

            /** Called when an end tag is seen for the
             *  type of tag this action was registered
             *  to.
             */
            @stub
            def end(t: HTML.Tag): Unit = ???

            /** Called when a start tag is seen for the
             *  type of tag this action was registered
             *  to.
             */
            @stub
            def start(t: HTML.Tag, a: MutableAttributeSet): Unit = ???
        }


        /**  */
        class IsindexAction extends HTMLDocument.HTMLReader.TagAction {

            /**  */
            @stub
            def this() = ???

            /** Called when a start tag is seen for the
             *  type of tag this action was registered
             *  to.
             */
            @stub
            def start(t: HTML.Tag, a: MutableAttributeSet): Unit = ???
        }


        /**  */
        class ParagraphAction extends HTMLDocument.HTMLReader.BlockAction {

            /**  */
            @stub
            def this() = ???

            /** Called when an end tag is seen for the
             *  type of tag this action was registered
             *  to.
             */
            @stub
            def end(t: HTML.Tag): Unit = ???

            /** Called when a start tag is seen for the
             *  type of tag this action was registered
             *  to.
             */
            @stub
            def start(t: HTML.Tag, a: MutableAttributeSet): Unit = ???
        }


        /**  */
        class PreAction extends HTMLDocument.HTMLReader.BlockAction {

            /**  */
            @stub
            def this() = ???

            /** Called when an end tag is seen for the
             *  type of tag this action was registered
             *  to.
             */
            @stub
            def end(t: HTML.Tag): Unit = ???

            /** Called when a start tag is seen for the
             *  type of tag this action was registered
             *  to.
             */
            @stub
            def start(t: HTML.Tag, attr: MutableAttributeSet): Unit = ???
        }


        /**  */
        class SpecialAction extends HTMLDocument.HTMLReader.TagAction {

            /**  */
            @stub
            def this() = ???

            /** Called when a start tag is seen for the
             *  type of tag this action was registered
             *  to.
             */
            @stub
            def start(t: HTML.Tag, a: MutableAttributeSet): Unit = ???
        }


        /** An action to be performed in response
         *  to parsing a tag.  This allows customization
         *  of how each tag is handled and avoids a large
         *  switch statement.
         */
        class TagAction extends Object {

            /**  */
            @stub
            def this() = ???

            /** Called when an end tag is seen for the
             *  type of tag this action was registered
             *  to.
             */
            @stub
            def end(t: HTML.Tag): Unit = ???

            /** Called when a start tag is seen for the
             *  type of tag this action was registered
             *  to.
             */
            @stub
            def start(t: HTML.Tag, a: MutableAttributeSet): Unit = ???
        }


        /**  */
        @stub
        protected val charAttr: MutableAttributeSet = ???

        /**  */
        @stub
        protected val parseBuffer: Vector[DefaultStyledDocument.ElementSpec] = ???

        /** Adds some text with the current character attributes. */
        @stub
        protected def addContent(data: Array[Char], offs: Int, length: Int): Unit = ???

        /** Adds some text with the current character attributes. */
        @stub
        protected def addContent(data: Array[Char], offs: Int, length: Int, generateImpliedPIfNecessary: Boolean): Unit = ???

        /** Adds content that is basically specified entirely
         *  in the attribute set.
         */
        @stub
        protected def addSpecialElement(t: HTML.Tag, a: MutableAttributeSet): Unit = ???

        /** Adds an instruction to the parse buffer to close out
         *  a block element of the given type.
         */
        @stub
        protected def blockClose(t: HTML.Tag): Unit = ???

        /** Adds an instruction to the parse buffer to create a
         *  block element with the given attributes.
         */
        @stub
        protected def blockOpen(t: HTML.Tag, attr: MutableAttributeSet): Unit = ???

        /** The last method called on the reader. */
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

        /** Callback from the parser. */
        @stub
        def handleEndTag(t: HTML.Tag, pos: Int): Unit = ???

        /** Callback from the parser. */
        @stub
        def handleSimpleTag(t: HTML.Tag, a: MutableAttributeSet, pos: Int): Unit = ???

        /** Callback from the parser. */
        @stub
        def handleStartTag(t: HTML.Tag, a: MutableAttributeSet, pos: Int): Unit = ???

        /** Called by the parser to indicate a block of text was
         *  encountered.
         */
        @stub
        def handleText(data: Array[Char], pos: Int): Unit = ???

        /** Pops a previously pushed character style off the stack
         *  to return to a previous style.
         */
        @stub
        protected def popCharacterStyle(): Unit = ???

        /** Adds the given content that was encountered in a
         *  PRE element.
         */
        @stub
        protected def preContent(data: Array[Char]): Unit = ???

        /** Pushes the current character style on a stack in preparation
         *  for forming a new nested character style.
         */
        @stub
        protected def pushCharacterStyle(): Unit = ???

        /** Registers a handler for the given tag. */
        @stub
        protected def registerTag(t: HTML.Tag, a: HTMLDocument.HTMLReader.TagAction): Unit = ???

        /** Adds the given content to the textarea document. */
        @stub
        protected def textAreaContent(data: Array[Char]): Unit = ???
    }


    /** An element that represents a chunk of text that has
     *  a set of HTML character level attributes assigned to
     *  it.
     */
    class RunElement extends AbstractDocument.LeafElement {

        /** Constructs an element that represents content within the
         *  document (has no children).
         */
        @stub
        def this(parent: Element, a: AttributeSet, offs0: Int, offs1: Int) = ???

        /** Gets the name of the element. */
        @stub
        def getName(): String = ???

        /** Gets the resolving parent. */
        @stub
        def getResolveParent(): AttributeSet = ???
    }


    /** Replaces the contents of the document with the given
     *  element specifications.
     */
    @stub
    protected def create(data: Array[DefaultStyledDocument.ElementSpec]): Unit = ???

    /** Creates a document branch element, that can contain other elements. */
    @stub
    protected def createBranchElement(parent: Element, a: AttributeSet): Element = ???

    /** Creates the root element to be used to represent the
     *  default document structure.
     */
    @stub
    protected def createDefaultRoot(): AbstractDocument.AbstractElement = ???

    /** Creates a document leaf element that directly represents
     *  text (doesn't have any children).
     */
    @stub
    protected def createLeafElement(parent: Element, a: AttributeSet, p0: Int, p1: Int): Element = ???

    /** Notifies all listeners that have registered interest for
     *  notification on this event type.
     */
    @stub
    protected def fireChangedUpdate(e: DocumentEvent): Unit = ???

    /** Notifies all listeners that have registered interest for
     *  notification on this event type.
     */
    @stub
    protected def fireUndoableEditUpdate(e: UndoableEditEvent): Unit = ???

    /** Returns the location to resolve relative URLs against. */
    @stub
    def getBase(): URL = ???

    /** Returns the child element of e that contains the
     *  attribute, attribute with value value, or
     *  null if one isn't found.
     */
    @stub
    def getElement(e: Element, attribute: Any, value: Any): Element = ???

    /** Returns the element that has the given id Attribute. */
    @stub
    def getElement(id: String): Element = ???

    /** Fetches an iterator for the specified HTML tag. */
    @stub
    def getIterator(t: HTML.Tag): HTMLDocument.Iterator = ???

    /** Returns the parser that is used when inserting HTML into the existing
     *  document.
     */
    @stub
    def getParser(): HTMLEditorKit.Parser = ???

    /** Returns the behavior the parser observes when encountering
     *  unknown tags.
     */
    @stub
    def getPreservesUnknownTags(): Boolean = ???

    /** Fetches the reader for the parser to use when loading the document
     *  with HTML.
     */
    @stub
    def getReader(pos: Int): HTMLEditorKit.ParserCallback = ???

    /** Returns the reader for the parser to use to load the document
     *  with HTML.
     */
    @stub
    def getReader(pos: Int, popDepth: Int, pushDepth: Int, insertTag: HTML.Tag): HTMLEditorKit.ParserCallback = ???

    /** Fetches the StyleSheet with the document-specific display
     *  rules (CSS) that were specified in the HTML document itself.
     */
    @stub
    def getStyleSheet(): StyleSheet = ???

    /** Gets the number of tokens to buffer before trying to update
     *  the documents element structure.
     */
    @stub
    def getTokenThreshold(): Int = ???

    /** Inserts new elements in bulk. */
    @stub
    protected def insert(offset: Int, data: Array[DefaultStyledDocument.ElementSpec]): Unit = ???

    /** Inserts the HTML specified as a string after the the end of the
     *  given element.
     */
    @stub
    def insertAfterEnd(elem: Element, htmlText: String): Unit = ???

    /** Inserts the HTML specified as a string at the start
     *  of the element.
     */
    @stub
    def insertAfterStart(elem: Element, htmlText: String): Unit = ???

    /** Inserts the HTML specified as a string at the end of
     *  the element.
     */
    @stub
    def insertBeforeEnd(elem: Element, htmlText: String): Unit = ???

    /** Inserts the HTML specified as a string before the start of
     *  the given element.
     */
    @stub
    def insertBeforeStart(elem: Element, htmlText: String): Unit = ???

    /** Updates document structure as a result of text insertion. */
    @stub
    protected def insertUpdate(chng: AbstractDocument.DefaultDocumentEvent, attr: AttributeSet): Unit = ???

    /** Processes HyperlinkEvents that
     *  are generated by documents in an HTML frame.
     */
    @stub
    def processHTMLFrameHyperlinkEvent(e: HTMLFrameHyperlinkEvent): Unit = ???

    /** Sets the location to resolve relative URLs against. */
    @stub
    def setBase(u: URL): Unit = ???

    /** Replaces the children of the given element with the contents
     *  specified as an HTML string.
     */
    @stub
    def setInnerHTML(elem: Element, htmlText: String): Unit = ???

    /** Replaces the given element in the parent with the contents
     *  specified as an HTML string.
     */
    @stub
    def setOuterHTML(elem: Element, htmlText: String): Unit = ???

    /** Sets attributes for a paragraph. */
    @stub
    def setParagraphAttributes(offset: Int, length: Int, s: AttributeSet, replace: Boolean): Unit = ???

    /** Sets the parser that is used by the methods that insert html
     *  into the existing document, such as setInnerHTML,
     *  and setOuterHTML.
     */
    @stub
    def setParser(parser: HTMLEditorKit.Parser): Unit = ???

    /** Determines how unknown tags are handled by the parser. */
    @stub
    def setPreservesUnknownTags(preservesTags: Boolean): Unit = ???

    /** Sets the number of tokens to buffer before trying to update
     *  the documents element structure.
     */
    @stub
    def setTokenThreshold(n: Int): Unit = ???
}

object HTMLDocument {
    /** An iterator to iterate over a particular type of
     *  tag.  The iterator is not thread safe.  If reliable
     *  access to the document is not already ensured by
     *  the context under which the iterator is being used,
     *  its use should be performed under the protection of
     *  Document.render.
     */
    abstract object Iterator extends Object {

        /**  */
        @stub
        def apply() = ???

        /** Return the attributes for this tag. */
        def getAttributes(): AttributeSet

        /** Returns the end of the range for which the current occurrence of
         *  the tag is defined and has the same attributes.
         */
        def getEndOffset(): Int

        /** Returns the start of the range for which the current occurrence of
         *  the tag is defined and has the same attributes.
         */
        def getStartOffset(): Int

        /** Type of tag this iterator represents. */
        def getTag(): HTML.Tag

        /** Indicates if the iterator is currently
         *  representing an occurrence of a tag.
         */
        def isValid(): Boolean

        /** Move the iterator forward to the next occurrence
         *  of the tag it represents.
         */
        def next(): Unit
    }


    /** Document property key value. */
    @stub
    val AdditionalComments: String = ???
}
