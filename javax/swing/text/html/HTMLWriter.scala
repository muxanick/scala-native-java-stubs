package javax.swing.text.html

import java.io.Writer
import java.lang.Object
import javax.swing.text.{AbstractWriter, AttributeSet, Element}

/** This is a writer for HTMLDocuments. */
class HTMLWriter extends AbstractWriter {

    /** Creates a new HTMLWriter. */
    @stub
    def this(w: Writer, doc: HTMLDocument) = ???

    /** Searches the attribute set and for each tag
     *  that is stored in the tag vector.
     */
    @stub
    protected def closeOutUnwantedEmbeddedTags(attr: AttributeSet): Unit = ???

    /** Writes out comments. */
    @stub
    protected def comment(elem: Element): Unit = ???

    /** Writes out all empty elements (all tags that have no
     *  corresponding end tag).
     */
    @stub
    protected def emptyTag(elem: Element): Unit = ???

    /** Writes out an end tag for the element. */
    @stub
    protected def endTag(elem: Element): Unit = ???

    /** Determines if the HTML.Tag associated with the
     *  element is a block tag.
     */
    @stub
    protected def isBlockTag(attr: AttributeSet): Boolean = ???

    /** Returns true if the StyleConstants.NameAttribute is
     *  equal to the tag that is passed in as a parameter.
     */
    @stub
    protected def matchNameAttribute(attr: AttributeSet, tag: HTML.Tag): Boolean = ???

    /** This method is overriden to map any character entities, such as
     *  < to &lt;.
     */
    @stub
    protected def output(chars: Array[Char], start: Int, length: Int): Unit = ???

    /** Writes out the content of the SELECT form element. */
    @stub
    protected def selectContent(attr: AttributeSet): Unit = ???

    /** Writes out a start tag for the element. */
    @stub
    protected def startTag(elem: Element): Unit = ???

    /** Returns true if the element is a
     *  synthesized element.
     */
    @stub
    protected def synthesizedElement(elem: Element): Boolean = ???

    /** Writes out text. */
    @stub
    protected def text(elem: Element): Unit = ???

    /** Writes out text that is contained in a TEXTAREA form
     *  element.
     */
    @stub
    protected def textAreaContent(attr: AttributeSet): Unit = ???

    /** Iterates over the
     *  Element tree and controls the writing out of
     *  all the tags and its attributes.
     */
    @stub
    def write(): Unit = ???

    /** Writes out the attribute set. */
    @stub
    protected def writeAttributes(attr: AttributeSet): Unit = ???

    /** Searches for embedded tags in the AttributeSet
     *  and writes them out.
     */
    @stub
    protected def writeEmbeddedTags(attr: AttributeSet): Unit = ???

    /** Writes the line separator. */
    @stub
    protected def writeLineSeparator(): Unit = ???
}
