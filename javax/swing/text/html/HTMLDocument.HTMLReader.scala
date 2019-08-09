package javax.swing.text.html

import java.lang.{Object, String}
import javax.swing.text.MutableAttributeSet

// An HTML reader to load an HTML document with an HTML
// element structure.  This is a set of callbacks from
// the parser, implemented to create a set of elements
// tagged with attributes.  The parse builds up tokens
// (ElementSpec) that describe the element subtree desired,
// and burst it into the document under the protection of
// a write lock using the insert method on the document
// outer class.
// 
// The reader can be configured by registering actions
// (of type HTMLDocument.HTMLReader.TagAction)
// that describe how to handle the action.  The idea behind
// the actions provided is that the most natural text editing
// operations can be provided if the element structure boils
// down to paragraphs with runs of some kind of style
// in them.  Some things are more naturally specified
// structurally, so arbitrary structure should be allowed
// above the paragraphs, but will need to be edited with structural
// actions.  The implication of this is that some of the
// HTML elements specified in the stream being parsed will
// be collapsed into attributes, and in some cases paragraphs
// will be synthesized.  When HTML elements have been
// converted to attributes, the attribute key will be of
// type HTML.Tag, and the value will be of type AttributeSet
// so that no information is lost.  This enables many of the
// existing actions to work so that the user can type input,
// hit the return key, backspace, delete, etc and have a
// reasonable result.  Selections can be created, and attributes
// applied or removed, etc.  With this in mind, the work done
// by the reader can be categorized into the following kinds
// of tasks:
// 
// Block
// Build the structure like it's specified in the stream.
// This produces elements that contain other elements.
// Paragraph
// Like block except that it's expected that the element
// will be used with a paragraph view so a paragraph element
// won't need to be synthesized.
// Character
// Contribute the element as an attribute that will start
// and stop at arbitrary text locations.  This will ultimately
// be mixed into a run of text, with all of the currently
// flattened HTML character elements.
// Special
// Produce an embedded graphical element.
// Form
// Produce an element that is like the embedded graphical
// element, except that it also has a component model associated
// with it.
// Hidden
// Create an element that is hidden from view when the
// document is being viewed read-only, and visible when the
// document is being edited.  This is useful to keep the
// model from losing information, and used to store things
// like comments and unrecognized tags.
//
// 
// 
// Currently, <APPLET>, <PARAM>, <MAP>, <AREA>, <LINK>,
// <SCRIPT> and <STYLE> are unsupported.
//
// 
// The assignment of the actions described is shown in the
// following table for the tags defined in HTML.Tag.
// 
// TagAction
// HTML.Tag.A         CharacterAction
// HTML.Tag.ADDRESS   CharacterAction
// HTML.Tag.APPLET    HiddenAction
// HTML.Tag.AREA      AreaAction
// HTML.Tag.B         CharacterAction
// HTML.Tag.BASE      BaseAction
// HTML.Tag.BASEFONT  CharacterAction
// HTML.Tag.BIG       CharacterAction
// HTML.Tag.BLOCKQUOTEBlockAction
// HTML.Tag.BODY      BlockAction
// HTML.Tag.BR        SpecialAction
// HTML.Tag.CAPTION   BlockAction
// HTML.Tag.CENTER    BlockAction
// HTML.Tag.CITE      CharacterAction
// HTML.Tag.CODE      CharacterAction
// HTML.Tag.DD        BlockAction
// HTML.Tag.DFN       CharacterAction
// HTML.Tag.DIR       BlockAction
// HTML.Tag.DIV       BlockAction
// HTML.Tag.DL        BlockAction
// HTML.Tag.DT        ParagraphAction
// HTML.Tag.EM        CharacterAction
// HTML.Tag.FONT      CharacterAction
// HTML.Tag.FORM      As of 1.4 a BlockAction
// HTML.Tag.FRAME     SpecialAction
// HTML.Tag.FRAMESET  BlockAction
// HTML.Tag.H1        ParagraphAction
// HTML.Tag.H2        ParagraphAction
// HTML.Tag.H3        ParagraphAction
// HTML.Tag.H4        ParagraphAction
// HTML.Tag.H5        ParagraphAction
// HTML.Tag.H6        ParagraphAction
// HTML.Tag.HEAD      HeadAction
// HTML.Tag.HR        SpecialAction
// HTML.Tag.HTML      BlockAction
// HTML.Tag.I         CharacterAction
// HTML.Tag.IMG       SpecialAction
// HTML.Tag.INPUT     FormAction
// HTML.Tag.ISINDEX   IsndexAction
// HTML.Tag.KBD       CharacterAction
// HTML.Tag.LI        BlockAction
// HTML.Tag.LINK      LinkAction
// HTML.Tag.MAP       MapAction
// HTML.Tag.MENU      BlockAction
// HTML.Tag.META      MetaAction
// HTML.Tag.NOFRAMES  BlockAction
// HTML.Tag.OBJECT    SpecialAction
// HTML.Tag.OL        BlockAction
// HTML.Tag.OPTION    FormAction
// HTML.Tag.P         ParagraphAction
// HTML.Tag.PARAM     HiddenAction
// HTML.Tag.PRE       PreAction
// HTML.Tag.SAMP      CharacterAction
// HTML.Tag.SCRIPT    HiddenAction
// HTML.Tag.SELECT    FormAction
// HTML.Tag.SMALL     CharacterAction
// HTML.Tag.STRIKE    CharacterAction
// HTML.Tag.S         CharacterAction
// HTML.Tag.STRONG    CharacterAction
// HTML.Tag.STYLE     StyleAction
// HTML.Tag.SUB       CharacterAction
// HTML.Tag.SUP       CharacterAction
// HTML.Tag.TABLE     BlockAction
// HTML.Tag.TD        BlockAction
// HTML.Tag.TEXTAREA  FormAction
// HTML.Tag.TH        BlockAction
// HTML.Tag.TITLE     TitleAction
// HTML.Tag.TR        BlockAction
// HTML.Tag.TT        CharacterAction
// HTML.Tag.U         CharacterAction
// HTML.Tag.UL        BlockAction
// HTML.Tag.VAR       CharacterAction
// 
// 
// Once </html> is encountered, the Actions are no longer notified.
class HTMLDocument.HTMLReader extends HTMLEditorKit.ParserCallback {

    @stub
    // 
    def HTMLReader(offset: Int) = ???

    @stub
    // 
    def HTMLDocument.HTMLReader.BlockAction: class = ???

    @stub
    // 
    def HTMLDocument.HTMLReader.CharacterAction: class = ???

    @stub
    // Action to support forms by building all of the elements
    // used to represent form controls.
    def HTMLDocument.HTMLReader.FormAction: class = ???

    @stub
    // 
    def HTMLDocument.HTMLReader.HiddenAction: class = ???

    @stub
    // 
    def HTMLDocument.HTMLReader.IsindexAction: class = ???

    @stub
    // 
    def HTMLDocument.HTMLReader.ParagraphAction: class = ???

    @stub
    // 
    def HTMLDocument.HTMLReader.PreAction: class = ???

    @stub
    // 
    def HTMLDocument.HTMLReader.SpecialAction: class = ???

    @stub
    // 
    protected def charAttr: MutableAttributeSet = ???

    @stub
    // Adds some text with the current character attributes.
    protected def addContent(data: Array[Char], offs: Int, length: Int): Unit = ???

    @stub
    // Adds some text with the current character attributes.
    protected def addContent(data: Array[Char], offs: Int, length: Int, generateImpliedPIfNecessary: Boolean): Unit = ???

    @stub
    // Adds content that is basically specified entirely
    // in the attribute set.
    protected def addSpecialElement(t: HTML.Tag, a: MutableAttributeSet): Unit = ???

    @stub
    // Adds an instruction to the parse buffer to close out
    // a block element of the given type.
    protected def blockClose(t: HTML.Tag): Unit = ???

    @stub
    // Adds an instruction to the parse buffer to create a
    // block element with the given attributes.
    protected def blockOpen(t: HTML.Tag, attr: MutableAttributeSet): Unit = ???

    @stub
    // The last method called on the reader.
    def flush(): Unit = ???

    @stub
    // 
    def handleComment(data: Array[Char], pos: Int): Unit = ???

    @stub
    // This is invoked after the stream has been parsed, but before
    // flush.
    def handleEndOfLineString(eol: String): Unit = ???

    @stub
    // Callback from the parser.
    def handleEndTag(t: HTML.Tag, pos: Int): Unit = ???

    @stub
    // Callback from the parser.
    def handleSimpleTag(t: HTML.Tag, a: MutableAttributeSet, pos: Int): Unit = ???

    @stub
    // Callback from the parser.
    def handleStartTag(t: HTML.Tag, a: MutableAttributeSet, pos: Int): Unit = ???

    @stub
    // Called by the parser to indicate a block of text was
    // encountered.
    def handleText(data: Array[Char], pos: Int): Unit = ???

    @stub
    // Pops a previously pushed character style off the stack
    // to return to a previous style.
    protected def popCharacterStyle(): Unit = ???

    @stub
    // Adds the given content that was encountered in a
    // PRE element.
    protected def preContent(data: Array[Char]): Unit = ???

    @stub
    // Pushes the current character style on a stack in preparation
    // for forming a new nested character style.
    protected def pushCharacterStyle(): Unit = ???

    @stub
    // Registers a handler for the given tag.
    protected def registerTag(t: HTML.Tag, a: HTMLDocument.HTMLReader.TagAction): Unit = ???
}
