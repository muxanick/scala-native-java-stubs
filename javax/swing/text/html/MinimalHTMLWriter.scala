package javax.swing.text.html

import java.io.Writer
import java.lang.{Object, String}
import javax.swing.text.{AbstractWriter, AttributeSet, Element, StyledDocument}

// MinimalHTMLWriter is a fallback writer used by the
// HTMLEditorKit to write out HTML for a document that
// is a not produced by the EditorKit.
//
// The format for the document is:
// 
// <html>
//   <head>
//     <style>
//        <!-- list of named styles
//         p.normal {
//            font-family: SansSerif;
//            margin-height: 0;
//            font-size: 14
//         }
//        -->
//      </style>
//   </head>
//   <body>
//    <p style=normal>
//        Bold, italic, and underline attributes
//        of the run are emitted as HTML tags.
//        The remaining attributes are emitted as
//        part of the style attribute of a <span> tag.
//        The syntax is similar to inline styles.
//    </p>
//   </body>
// </html>
// 
class MinimalHTMLWriter extends AbstractWriter {

    @stub
    // Creates a new MinimalHTMLWriter.
    def this(w: Writer, doc: StyledDocument) = ???

    @stub
    // This is no longer used, instead <span> will be written out.
    protected def endFontTag(): Unit = ???

    @stub
    // Returns true if we are currently in a <font> tag.
    protected def inFontTag(): Boolean = ???

    @stub
    // Returns true if the element is a text element.
    protected def isText(elem: Element): Boolean = ???

    @stub
    // This is no longer used, instead <span> will be written out.
    protected def startFontTag(style: String): Unit = ???

    @stub
    // Writes out text.
    protected def text(elem: Element): Unit = ???

    @stub
    // Generates HTML output
    // from a StyledDocument.
    def write(): Unit = ???

    @stub
    // Writes out all the attributes for the
    // following types:
    //  StyleConstants.ParagraphConstants,
    //  StyleConstants.CharacterConstants,
    //  StyleConstants.FontConstants,
    //  StyleConstants.ColorConstants.
    protected def writeAttributes(attr: AttributeSet): Unit = ???

    @stub
    // Iterates over the elements in the document
    // and processes elements based on whether they are
    // branch elements or leaf elements.
    protected def writeBody(): Unit = ???

    @stub
    // Responsible for handling Component Elements;
    // deliberately unimplemented.
    protected def writeComponent(elem: Element): Unit = ???

    @stub
    // Writes out the attribute set
    // in an HTML-compliant manner.
    protected def writeContent(elem: Element, needsIndenting: Boolean): Unit = ???

    @stub
    // Emits an end tag for a <p>
    // tag.
    protected def writeEndParagraph(): Unit = ???

    @stub
    // Writes out an end tag appropriately
    // indented.
    protected def writeEndTag(endTag: String): Unit = ???

    @stub
    // Writes out the <head> and <style>
    // tags, and then invokes writeStyles() to write
    // out all the named styles as the content of the
    // <style> tag.
    protected def writeHeader(): Unit = ???

    @stub
    // Generates
    // bold <b>, italic <i>, and <u> tags for the
    // text based on its attribute settings.
    protected def writeHTMLTags(attr: AttributeSet): Unit = ???

    @stub
    // Responsible for handling Icon Elements;
    // deliberately unimplemented.
    protected def writeImage(elem: Element): Unit = ???

    @stub
    // Responsible for writing out other non-text leaf
    // elements.
    protected def writeLeaf(elem: Element): Unit = ???

    @stub
    // Writes out the remaining
    // character-level attributes (attributes other than bold,
    // italic, and underline) in an HTML-compliant way.
    protected def writeNonHTMLAttributes(attr: AttributeSet): Unit = ???

    @stub
    // Emits the start tag for a paragraph.
    protected def writeStartParagraph(elem: Element): Unit = ???

    @stub
    // Writes out a start tag appropriately
    // indented.
    protected def writeStartTag(tag: String): Unit = ???
}
