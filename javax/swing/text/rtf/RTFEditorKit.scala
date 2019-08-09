package javax.swing.text.rtf

import java.io.{InputStream, OutputStream, Reader, Writer}
import java.lang.{Object, String}
import javax.swing.text.{DefaultEditorKit, Document, EditorKit, StyledEditorKit}
import scala.scalanative.annotation.stub

/** This is the default implementation of RTF editing
 *  functionality.  The RTF support was not written by the
 *  Swing team.  In the future we hope to improve the support
 *  provided.
 */
class RTFEditorKit extends StyledEditorKit {

    /** Constructs an RTFEditorKit. */
    @stub
    def this() = ???

    /** Get the MIME type of the data that this
     *  kit represents support for.
     */
    @stub
    def getContentType(): String = ???

    /** Insert content from the given stream which is expected
     *  to be in a format appropriate for this kind of content
     *  handler.
     */
    @stub
    def read(in: InputStream, doc: Document, pos: Int): Unit = ???

    /** Insert content from the given stream, which will be
     *  treated as plain text.
     */
    @stub
    def read(in: Reader, doc: Document, pos: Int): Unit = ???

    /** Write content from a document to the given stream
     *  in a format appropriate for this kind of content handler.
     */
    @stub
    def write(out: OutputStream, doc: Document, pos: Int, len: Int): Unit = ???

    /** Write content from a document to the given stream
     *  as plain text.
     */
    @stub
    def write(out: Writer, doc: Document, pos: Int, len: Int): Unit = ???
}
