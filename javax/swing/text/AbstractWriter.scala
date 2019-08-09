package javax.swing.text

import java.io.Writer
import java.lang.{Object, String}

/** AbstractWriter is an abstract class that actually
 *  does the work of writing out the element tree
 *  including the attributes.  In terms of how much is
 *  written out per line, the writer defaults to 100.
 *  But this value can be set by subclasses.
 */
abstract class AbstractWriter extends Object {

    /** Creates a new AbstractWriter. */
    @stub
    protected def this(w: Writer, doc: Document) = ???

    /** Creates a new AbstractWriter. */
    @stub
    protected def this(w: Writer, doc: Document, pos: Int, len: Int) = ???

    /** Creates a new AbstractWriter. */
    @stub
    protected def this(w: Writer, root: Element) = ???

    /** Decrements the indent level. */
    protected def decrIndent(): Unit

    /** Returns whether or not the lines can be wrapped. */
    protected def getCanWrapLines(): Boolean

    /** Returns the current line length. */
    protected def getCurrentLineLength(): Int

    /** Fetches the document. */
    protected def getDocument(): Document

    /** Fetches the ElementIterator. */
    protected def getElementIterator(): ElementIterator

    /** Returns the last offset to be output. */
    def getEndOffset(): Int

    /** Returns the current indentation level. */
    protected def getIndentLevel(): Int

    /** Returns the amount of space to indent. */
    protected def getIndentSpace(): Int

    /** Returns the maximum line length. */
    protected def getLineLength(): Int

    /** Returns the string used to represent newlines. */
    def getLineSeparator(): String

    /** Returns the first offset to be output. */
    def getStartOffset(): Int

    /** Returns the text associated with the element. */
    protected def getText(elem: Element): String

    /** Returns the Writer that is used to output the content. */
    protected def getWriter(): Writer

    /** Increments the indent level. */
    protected def incrIndent(): Unit

    /** Does indentation. */
    protected def indent(): Unit

    /** This method determines whether the current element
     *  is in the range specified.
     */
    protected def inRange(next: Element): Boolean

    /** Returns true if the current line should be considered empty. */
    protected def isLineEmpty(): Boolean

    /** The last stop in writing out content. */
    protected def output(content: Array[Char], start: Int, length: Int): Unit

    /** Sets whether or not lines can be wrapped. */
    protected def setCanWrapLines(newValue: Boolean): Unit

    /** Sets the current line length. */
    protected def setCurrentLineLength(length: Int): Unit

    /** Enables subclasses to specify how many spaces an indent
     *  maps to.
     */
    protected def setIndentSpace(space: Int): Unit

    /** Enables subclasses to set the number of characters they
     *  want written per line.
     */
    protected def setLineLength(l: Int): Unit

    /** Sets the String used to represent newlines. */
    def setLineSeparator(value: String): Unit

    /** Writes out text. */
    protected def text(elem: Element): Unit

    /** This abstract method needs to be implemented
     *  by subclasses.
     */
    protected def write(): Unit

    /** Writes out a character. */
    protected def write(ch: Char): Unit

    /** All write methods call into this one. */
    protected def write(chars: Array[Char], startIndex: Int, length: Int): Unit

    /** Writes out a string. */
    protected def write(content: String): Unit

    /** Writes out the set of attributes as " <name>=<value>"
     *  pairs.
     */
    protected def writeAttributes(attr: AttributeSet): Unit
}
