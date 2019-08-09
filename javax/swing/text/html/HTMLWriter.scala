package javax.swing.text.html

import java.io.Writer
import java.lang.Object
import javax.swing.text.{AbstractWriter, AttributeSet, Element}

// This is a writer for HTMLDocuments.
class HTMLWriter extends AbstractWriter {

    @stub
    // Creates a new HTMLWriter.
    def this(w: Writer, doc: HTMLDocument) = ???

    @stub
    // Searches the attribute set and for each tag
    // that is stored in the tag vector.
    protected def closeOutUnwantedEmbeddedTags(attr: AttributeSet): Unit = ???

    @stub
    // Writes out comments.
    protected def comment(elem: Element): Unit = ???

    @stub
    // Writes out all empty elements (all tags that have no
    // corresponding end tag).
    protected def emptyTag(elem: Element): Unit = ???

    @stub
    // Writes out an end tag for the element.
    protected def endTag(elem: Element): Unit = ???

    @stub
    // Determines if the HTML.Tag associated with the
    // element is a block tag.
    protected def isBlockTag(attr: AttributeSet): Boolean = ???

    @stub
    // Returns true if the StyleConstants.NameAttribute is
    // equal to the tag that is passed in as a parameter.
    protected def matchNameAttribute(attr: AttributeSet, tag: HTML.Tag): Boolean = ???

    @stub
    // This method is overriden to map any character entities, such as
    // < to &lt;.
    protected def output(chars: Array[Char], start: Int, length: Int): Unit = ???

    @stub
    // Writes out the content of the SELECT form element.
    protected def selectContent(attr: AttributeSet): Unit = ???

    @stub
    // Writes out a start tag for the element.
    protected def startTag(elem: Element): Unit = ???

    @stub
    // Returns true if the element is a
    // synthesized element.
    protected def synthesizedElement(elem: Element): Boolean = ???

    @stub
    // Writes out text.
    protected def text(elem: Element): Unit = ???

    @stub
    // Writes out text that is contained in a TEXTAREA form
    // element.
    protected def textAreaContent(attr: AttributeSet): Unit = ???

    @stub
    // Iterates over the
    // Element tree and controls the writing out of
    // all the tags and its attributes.
    def write(): Unit = ???

    @stub
    // Writes out the attribute set.
    protected def writeAttributes(attr: AttributeSet): Unit = ???

    @stub
    // Searches for embedded tags in the AttributeSet
    // and writes them out.
    protected def writeEmbeddedTags(attr: AttributeSet): Unit = ???

    @stub
    // Writes the line separator.
    protected def writeLineSeparator(): Unit = ???
}
