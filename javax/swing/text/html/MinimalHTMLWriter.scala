package javax.swing.text.html

import java.io.Writer
import java.lang.{Object, String}
import javax.swing.text.{AbstractWriter, AttributeSet, Element, StyledDocument}
import scala.scalanative.annotation.stub

/** MinimalHTMLWriter is a fallback writer used by the
 *  HTMLEditorKit to write out HTML for a document that
 *  is a not produced by the EditorKit.
 * 
 *  The format for the document is:
 *  
 *  <html>
 *    <head>
 *      <style>
 *         <!-- list of named styles
 *          p.normal {
 *             font-family: SansSerif;
 *             margin-height: 0;
 *             font-size: 14
 *          }
 *         -->
 *       </style>
 *    </head>
 *    <body>
 *     <p style=normal>
 *         Bold, italic, and underline attributes
 *         of the run are emitted as HTML tags.
 *         The remaining attributes are emitted as
 *         part of the style attribute of a <span> tag.
 *         The syntax is similar to inline styles.
 *     </p>
 *    </body>
 *  </html>
 *  
 */
class MinimalHTMLWriter extends AbstractWriter {

    /** Creates a new MinimalHTMLWriter. */
    @stub
    def this(w: Writer, doc: StyledDocument) = ???

    /** Creates a new MinimalHTMLWriter. */
    @stub
    def this(w: Writer, doc: StyledDocument, pos: Int, len: Int) = ???

    /** This is no longer used, instead <span> will be written out. */
    @stub
    protected def endFontTag(): Unit = ???

    /** Returns true if we are currently in a <font> tag. */
    @stub
    protected def inFontTag(): Boolean = ???

    /** Returns true if the element is a text element. */
    @stub
    protected def isText(elem: Element): Boolean = ???

    /** This is no longer used, instead <span> will be written out. */
    @stub
    protected def startFontTag(style: String): Unit = ???

    /** Writes out text. */
    @stub
    protected def text(elem: Element): Unit = ???

    /** Generates HTML output
     *  from a StyledDocument.
     */
    @stub
    def write(): Unit = ???

    /** Writes out all the attributes for the
     *  following types:
     *   StyleConstants.ParagraphConstants,
     *   StyleConstants.CharacterConstants,
     *   StyleConstants.FontConstants,
     *   StyleConstants.ColorConstants.
     */
    @stub
    protected def writeAttributes(attr: AttributeSet): Unit = ???

    /** Iterates over the elements in the document
     *  and processes elements based on whether they are
     *  branch elements or leaf elements.
     */
    @stub
    protected def writeBody(): Unit = ???

    /** Responsible for handling Component Elements;
     *  deliberately unimplemented.
     */
    @stub
    protected def writeComponent(elem: Element): Unit = ???

    /** Writes out the attribute set
     *  in an HTML-compliant manner.
     */
    @stub
    protected def writeContent(elem: Element, needsIndenting: Boolean): Unit = ???

    /** Emits an end tag for a <p>
     *  tag.
     */
    @stub
    protected def writeEndParagraph(): Unit = ???

    /** Writes out an end tag appropriately
     *  indented.
     */
    @stub
    protected def writeEndTag(endTag: String): Unit = ???

    /** Writes out the <head> and <style>
     *  tags, and then invokes writeStyles() to write
     *  out all the named styles as the content of the
     *  <style> tag.
     */
    @stub
    protected def writeHeader(): Unit = ???

    /** Generates
     *  bold <b>, italic <i>, and <u> tags for the
     *  text based on its attribute settings.
     */
    @stub
    protected def writeHTMLTags(attr: AttributeSet): Unit = ???

    /** Responsible for handling Icon Elements;
     *  deliberately unimplemented.
     */
    @stub
    protected def writeImage(elem: Element): Unit = ???

    /** Responsible for writing out other non-text leaf
     *  elements.
     */
    @stub
    protected def writeLeaf(elem: Element): Unit = ???

    /** Writes out the remaining
     *  character-level attributes (attributes other than bold,
     *  italic, and underline) in an HTML-compliant way.
     */
    @stub
    protected def writeNonHTMLAttributes(attr: AttributeSet): Unit = ???

    /** Emits the start tag for a paragraph. */
    @stub
    protected def writeStartParagraph(elem: Element): Unit = ???

    /** Writes out a start tag appropriately
     *  indented.
     */
    @stub
    protected def writeStartTag(tag: String): Unit = ???

    /** Writes out all the named styles as the
     *  content of the <style> tag.
     */
    @stub
    protected def writeStyles(): Unit = ???
}
