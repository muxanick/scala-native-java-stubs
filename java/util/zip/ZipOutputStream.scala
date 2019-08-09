package java.util.zip

import java.io.{FilterOutputStream, OutputStream}
import java.lang.{Object, String}

// This class implements an output stream filter for writing files in the
// ZIP file format. Includes support for both compressed and uncompressed
// entries.
class ZipOutputStream extends DeflaterOutputStream {

    @stub
    // Creates a new ZIP output stream.
    def this(out: OutputStream) = ???

    @stub
    // Closes the ZIP output stream as well as the stream being filtered.
    def close(): Unit = ???

    @stub
    // Closes the current ZIP entry and positions the stream for writing
    // the next entry.
    def closeEntry(): Unit = ???

    @stub
    // Finishes writing the contents of the ZIP output stream without closing
    // the underlying stream.
    def finish(): Unit = ???

    @stub
    // Begins writing a new ZIP file entry and positions the stream to the
    // start of the entry data.
    def putNextEntry(e: ZipEntry): Unit = ???

    @stub
    // Sets the ZIP file comment.
    def setComment(comment: String): Unit = ???

    @stub
    // Sets the compression level for subsequent entries which are DEFLATED.
    def setLevel(level: Int): Unit = ???

    @stub
    // Sets the default compression method for subsequent entries.
    def setMethod(method: Int): Unit = ???
}

object ZipOutputStream {
    @stub
    // 
    def CENATT: Int = ???

    @stub
    // 
    def CENATX: Int = ???

    @stub
    // 
    def CENCOM: Int = ???

    @stub
    // 
    def CENCRC: Int = ???

    @stub
    // 
    def CENDSK: Int = ???

    @stub
    // 
    def CENEXT: Int = ???

    @stub
    // 
    def CENFLG: Int = ???

    @stub
    // 
    def CENHDR: Int = ???

    @stub
    // 
    def CENHOW: Int = ???

    @stub
    // 
    def CENLEN: Int = ???

    @stub
    // 
    def CENNAM: Int = ???

    @stub
    // 
    def CENOFF: Int = ???

    @stub
    // 
    def CENSIG: Long = ???

    @stub
    // 
    def CENSIZ: Int = ???

    @stub
    // 
    def CENTIM: Int = ???

    @stub
    // 
    def CENVEM: Int = ???

    @stub
    // 
    def CENVER: Int = ???

    @stub
    // Compression method for compressed (DEFLATED) entries.
    def DEFLATED: Int = ???

    @stub
    // 
    def ENDCOM: Int = ???

    @stub
    // 
    def ENDHDR: Int = ???

    @stub
    // 
    def ENDOFF: Int = ???

    @stub
    // 
    def ENDSIG: Long = ???

    @stub
    // 
    def ENDSIZ: Int = ???

    @stub
    // 
    def ENDSUB: Int = ???

    @stub
    // 
    def ENDTOT: Int = ???

    @stub
    // 
    def EXTCRC: Int = ???

    @stub
    // 
    def EXTHDR: Int = ???

    @stub
    // 
    def EXTLEN: Int = ???

    @stub
    // 
    def EXTSIG: Long = ???

    @stub
    // 
    def EXTSIZ: Int = ???

    @stub
    // 
    def LOCCRC: Int = ???

    @stub
    // 
    def LOCEXT: Int = ???

    @stub
    // 
    def LOCFLG: Int = ???

    @stub
    // 
    def LOCHDR: Int = ???

    @stub
    // 
    def LOCHOW: Int = ???

    @stub
    // 
    def LOCLEN: Int = ???

    @stub
    // 
    def LOCNAM: Int = ???

    @stub
    // 
    def LOCSIG: Long = ???

    @stub
    // 
    def LOCSIZ: Int = ???

    @stub
    // 
    def LOCTIM: Int = ???

    @stub
    // 
    def LOCVER: Int = ???
}
