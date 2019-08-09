package javax.swing.text.html

import java.lang.{Object, String}
import java.net.URL
import javax.swing.event.{DocumentEvent, UndoableEditEvent}
import javax.swing.text.{AbstractDocument, AbstractDocument.AbstractElement, AbstractDocument.Content, AbstractDocument.DefaultDocumentEvent, AttributeSet, DefaultStyledDocument, DefaultStyledDocument.ElementSpec, Element}

// A document that models HTML.  The purpose of this model is to
// support both browsing and editing.  As a result, the structure
// described by an HTML document is not exactly replicated by default.
// The element structure that is modeled by default, is built by the
// class HTMLDocument.HTMLReader, which implements the
// HTMLEditorKit.ParserCallback protocol that the parser
// expects.  To change the structure one can subclass
// HTMLReader, and reimplement the method getReader(int) to return the new reader implementation.  The
// documentation for HTMLReader should be consulted for
// the details of the default structure created.  The intent is that
// the document be non-lossy (although reproducing the HTML format may
// result in a different format).
//
// The document models only HTML, and makes no attempt to store
// view attributes in it.  The elements are identified by the
// StyleContext.NameAttribute attribute, which should
// always have a value of type HTML.Tag that identifies
// the kind of element.  Some of the elements (such as comments) are
// synthesized.  The HTMLFactory uses this attribute to
// determine what kind of view to build.
//
// This document supports incremental loading.  The
// TokenThreshold property controls how much of the parse
// is buffered before trying to update the element structure of the
// document.  This property is set by the EditorKit so
// that subclasses can disable it.
//
// The Base property determines the URL against which
// relative URLs are resolved.  By default, this will be the
// Document.StreamDescriptionProperty if the value of the
// property is a URL.  If a <BASE> tag is encountered, the base
// will become the URL specified by that tag.  Because the base URL is
// a property, it can of course be set directly.
//
// The default content storage mechanism for this document is a gap
// buffer (GapContent).  Alternatives can be supplied by
// using the constructor that takes a Content
// implementation.
//
// Modifying HTMLDocument
//
// In addition to the methods provided by Document and
// StyledDocument for mutating an HTMLDocument, HTMLDocument provides
// a number of convenience methods.  The following methods can be used
// to insert HTML content into an existing document.
//
// 
//   setInnerHTML(Element, String)
//   setOuterHTML(Element, String)
//   insertBeforeStart(Element, String)
//   insertAfterStart(Element, String)
//   insertBeforeEnd(Element, String)
//   insertAfterEnd(Element, String)
// 
//
// The following examples illustrate using these methods.  Each
// example assumes the HTML document is initialized in the following
// way:
//
// 
// JEditorPane p = new JEditorPane();
// p.setContentType("text/html");
// p.setText("..."); // Document text is provided below.
// HTMLDocument d = (HTMLDocument) p.getDocument();
// 
//
// With the following HTML content:
//
// 
// <html>
//   <head>
//     <title>An example HTMLDocument</title>
//     <style type="text/css">
//       div { background-color: silver; }
//       ul { color: red; }
//     </style>
//   </head>
//   <body>
//     <div id="BOX">
//       <p>Paragraph 1</p>
//       <p>Paragraph 2</p>
//     </div>
//   </body>
// </html>
// 
//
// All the methods for modifying an HTML document require an Element.  Elements can be obtained from an HTML document by using
// the method getElement(Element e, Object attribute, Object
// value).  It returns the first descendant element that contains the
// specified attribute with the given value, in depth-first order.
// For example, d.getElement(d.getDefaultRootElement(),
// StyleConstants.NameAttribute, HTML.Tag.P) returns the first
// paragraph element.
//
// A convenient shortcut for locating elements is the method getElement(String); returns an element whose ID
// attribute matches the specified value.  For example,
// d.getElement("BOX") returns the DIV
// element.
//
// The getIterator(HTML.Tag t) method can also be used for
// finding all occurrences of the specified HTML tag in the
// document.
//
// Inserting elements
//
// Elements can be inserted before or after the existing children
// of any non-leaf element by using the methods
// insertAfterStart and insertBeforeEnd.
// For example, if e is the DIV element,
// d.insertAfterStart(e, "<ul><li>List
// Item</li></ul>") inserts the list before the first
// paragraph, and d.insertBeforeEnd(e, "<ul><li>List
// Item</li></ul>") inserts the list after the last
// paragraph.  The DIV block becomes the parent of the
// newly inserted elements.
//
// Sibling elements can be inserted before or after any element by
// using the methods insertBeforeStart and
// insertAfterEnd.  For example, if e is the
// DIV element, d.insertBeforeStart(e,
// "<ul><li>List Item</li></ul>") inserts the list
// before the DIV element, and d.insertAfterEnd(e,
// "<ul><li>List Item</li></ul>") inserts the list
// after the DIV element.  The newly inserted elements
// become siblings of the DIV element.
//
// Replacing elements
//
// Elements and all their descendants can be replaced by using the
// methods setInnerHTML and setOuterHTML.
// For example, if e is the DIV element,
// d.setInnerHTML(e, "<ul><li>List
// Item</li></ul>") replaces all children paragraphs with
// the list, and d.setOuterHTML(e, "<ul><li>List
// Item</li></ul>") replaces the DIV element
// itself.  In latter case the parent of the list is the
// BODY element.
//
// Summary
//
// The following table shows the example document and the results
// of various methods described above.
//
// 
//   
//     Example
//     insertAfterStart
//     insertBeforeEnd
//     insertBeforeStart
//     insertAfterEnd
//     setInnerHTML
//     setOuterHTML
//   
//   
//     
//       
//         Paragraph 1
//         Paragraph 2
//       
//     
// <!-- insertAfterStart -->
//     
//       
//         
//           List Item
//         
//         Paragraph 1
//         Paragraph 2
//       
//     
// <!-- insertBeforeEnd -->
//     
//       
//         Paragraph 1
//         Paragraph 2
//         
//           List Item
//         
//       
//     
// <!-- insertBeforeStart -->
//     
//       
//         List Item
//       
//       
//         Paragraph 1
//         Paragraph 2
//       
//     
// <!-- insertAfterEnd -->
//     
//       
//         Paragraph 1
//         Paragraph 2
//       
//       
//         List Item
//       
//     
// <!-- setInnerHTML -->
//     
//       
//         
//           List Item
//         
//       
//     
// <!-- setOuterHTML -->
//     
//       
//         List Item
//       
//     
//   
// 
//
// Warning: Serialized objects of this class will
// not be compatible with future Swing releases. The current
// serialization support is appropriate for short term storage or RMI
// between applications running the same version of Swing.  As of 1.4,
// support for long term storage of all JavaBeans™
// has been added to the
// java.beans package.  Please see XMLEncoder.
class HTMLDocument extends DefaultStyledDocument {

    @stub
    // Constructs an HTML document using the default buffer size
    // and a default StyleSheet.
    def this() = ???

    @stub
    // Constructs an HTML document with the given content
    // storage implementation and the given style/attribute
    // storage mechanism.
    def this(c: AbstractDocument.Content, styles: StyleSheet) = ???

    @stub
    // An element that represents a structural block of
    // HTML.
    def HTMLDocument.BlockElement: class = ???

    @stub
    // An HTML reader to load an HTML document with an HTML
    // element structure.
    def HTMLDocument.HTMLReader: class = ???

    @stub
    // Replaces the contents of the document with the given
    // element specifications.
    protected def create(data: Array[DefaultStyledDocument.ElementSpec]): Unit = ???

    @stub
    // Creates a document branch element, that can contain other elements.
    protected def createBranchElement(parent: Element, a: AttributeSet): Element = ???

    @stub
    // Creates the root element to be used to represent the
    // default document structure.
    protected def createDefaultRoot(): AbstractDocument.AbstractElement = ???

    @stub
    // Creates a document leaf element that directly represents
    // text (doesn't have any children).
    protected def createLeafElement(parent: Element, a: AttributeSet, p0: Int, p1: Int): Element = ???

    @stub
    // Notifies all listeners that have registered interest for
    // notification on this event type.
    protected def fireChangedUpdate(e: DocumentEvent): Unit = ???

    @stub
    // Notifies all listeners that have registered interest for
    // notification on this event type.
    protected def fireUndoableEditUpdate(e: UndoableEditEvent): Unit = ???

    @stub
    // Returns the location to resolve relative URLs against.
    def getBase(): URL = ???

    @stub
    // Returns the child element of e that contains the
    // attribute, attribute with value value, or
    // null if one isn't found.
    def getElement(e: Element, attribute: Object, value: Object): Element = ???

    @stub
    // Returns the element that has the given id Attribute.
    def getElement(id: String): Element = ???

    @stub
    // Fetches an iterator for the specified HTML tag.
    def getIterator(t: HTML.Tag): HTMLDocument.Iterator = ???

    @stub
    // Returns the parser that is used when inserting HTML into the existing
    // document.
    def getParser(): HTMLEditorKit.Parser = ???

    @stub
    // Returns the behavior the parser observes when encountering
    // unknown tags.
    def getPreservesUnknownTags(): Boolean = ???

    @stub
    // Fetches the reader for the parser to use when loading the document
    // with HTML.
    def getReader(pos: Int): HTMLEditorKit.ParserCallback = ???

    @stub
    // Returns the reader for the parser to use to load the document
    // with HTML.
    def getReader(pos: Int, popDepth: Int, pushDepth: Int, insertTag: HTML.Tag): HTMLEditorKit.ParserCallback = ???

    @stub
    // Fetches the StyleSheet with the document-specific display
    // rules (CSS) that were specified in the HTML document itself.
    def getStyleSheet(): StyleSheet = ???

    @stub
    // Gets the number of tokens to buffer before trying to update
    // the documents element structure.
    def getTokenThreshold(): Int = ???

    @stub
    // Inserts new elements in bulk.
    protected def insert(offset: Int, data: Array[DefaultStyledDocument.ElementSpec]): Unit = ???

    @stub
    // Inserts the HTML specified as a string after the the end of the
    // given element.
    def insertAfterEnd(elem: Element, htmlText: String): Unit = ???

    @stub
    // Inserts the HTML specified as a string at the start
    // of the element.
    def insertAfterStart(elem: Element, htmlText: String): Unit = ???

    @stub
    // Inserts the HTML specified as a string at the end of
    // the element.
    def insertBeforeEnd(elem: Element, htmlText: String): Unit = ???

    @stub
    // Inserts the HTML specified as a string before the start of
    // the given element.
    def insertBeforeStart(elem: Element, htmlText: String): Unit = ???

    @stub
    // Updates document structure as a result of text insertion.
    protected def insertUpdate(chng: AbstractDocument.DefaultDocumentEvent, attr: AttributeSet): Unit = ???

    @stub
    // Processes HyperlinkEvents that
    // are generated by documents in an HTML frame.
    def processHTMLFrameHyperlinkEvent(e: HTMLFrameHyperlinkEvent): Unit = ???

    @stub
    // Sets the location to resolve relative URLs against.
    def setBase(u: URL): Unit = ???

    @stub
    // Replaces the children of the given element with the contents
    // specified as an HTML string.
    def setInnerHTML(elem: Element, htmlText: String): Unit = ???

    @stub
    // Replaces the given element in the parent with the contents
    // specified as an HTML string.
    def setOuterHTML(elem: Element, htmlText: String): Unit = ???

    @stub
    // Sets attributes for a paragraph.
    def setParagraphAttributes(offset: Int, length: Int, s: AttributeSet, replace: Boolean): Unit = ???

    @stub
    // Sets the parser that is used by the methods that insert html
    // into the existing document, such as setInnerHTML,
    // and setOuterHTML.
    def setParser(parser: HTMLEditorKit.Parser): Unit = ???

    @stub
    // Determines how unknown tags are handled by the parser.
    def setPreservesUnknownTags(preservesTags: Boolean): Unit = ???
}

object HTMLDocument {
    @stub
    // An iterator to iterate over a particular type of
    // tag.
    def HTMLDocument.Iterator: class = ???
}