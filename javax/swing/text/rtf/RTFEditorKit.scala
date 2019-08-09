package javax.swing.text.rtf

import java.io.{InputStream, OutputStream, Reader}
import java.lang.{Object, String}
import javax.swing.text.{DefaultEditorKit, Document, EditorKit, StyledEditorKit}

// This is the default implementation of RTF editing
// functionality.  The RTF support was not written by the
// Swing team.  In the future we hope to improve the support
// provided.
class RTFEditorKit extends StyledEditorKit {

    @stub
    // Get the MIME type of the data that this
    // kit represents support for.
    def getContentType(): String = ???

    @stub
    // Insert content from the given stream which is expected
    // to be in a format appropriate for this kind of content
    // handler.
    def read(in: InputStream, doc: Document, pos: Int): Unit = ???

    @stub
    // Insert content from the given stream, which will be
    // treated as plain text.
    def read(in: Reader, doc: Document, pos: Int): Unit = ???

    @stub
    // Write content from a document to the given stream
    // in a format appropriate for this kind of content handler.
    def write(out: OutputStream, doc: Document, pos: Int, len: Int): Unit = ???
}
