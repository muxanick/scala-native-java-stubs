package java.util.zip

import java.io.{FilterOutputStream, OutputStream}
import java.lang.{Object, String}
import java.nio.charset.Charset
import scala.scalanative.annotation.stub

/** This class implements an output stream filter for writing files in the
 *  ZIP file format. Includes support for both compressed and uncompressed
 *  entries.
 */
class ZipOutputStream extends DeflaterOutputStream {

    /** Creates a new ZIP output stream. */
    @stub
    def this(out: OutputStream) = ???

    /** Creates a new ZIP output stream. */
    @stub
    def this(out: OutputStream, charset: Charset) = ???

    /** Closes the ZIP output stream as well as the stream being filtered. */
    @stub
    def close(): Unit = ???

    /** Closes the current ZIP entry and positions the stream for writing
     *  the next entry.
     */
    @stub
    def closeEntry(): Unit = ???

    /** Finishes writing the contents of the ZIP output stream without closing
     *  the underlying stream.
     */
    @stub
    def finish(): Unit = ???

    /** Begins writing a new ZIP file entry and positions the stream to the
     *  start of the entry data.
     */
    @stub
    def putNextEntry(e: ZipEntry): Unit = ???

    /** Sets the ZIP file comment. */
    @stub
    def setComment(comment: String): Unit = ???

    /** Sets the compression level for subsequent entries which are DEFLATED. */
    @stub
    def setLevel(level: Int): Unit = ???

    /** Sets the default compression method for subsequent entries. */
    @stub
    def setMethod(method: Int): Unit = ???

    /** Writes an array of bytes to the current ZIP entry data. */
    @stub
    def write(b: Array[Byte], off: Int, len: Int): Unit = ???
}

object ZipOutputStream {
    /**  */
    @stub
    val CENATT: Int = ???

    /**  */
    @stub
    val CENATX: Int = ???

    /**  */
    @stub
    val CENCOM: Int = ???

    /**  */
    @stub
    val CENCRC: Int = ???

    /**  */
    @stub
    val CENDSK: Int = ???

    /**  */
    @stub
    val CENEXT: Int = ???

    /**  */
    @stub
    val CENFLG: Int = ???

    /**  */
    @stub
    val CENHDR: Int = ???

    /**  */
    @stub
    val CENHOW: Int = ???

    /**  */
    @stub
    val CENLEN: Int = ???

    /**  */
    @stub
    val CENNAM: Int = ???

    /**  */
    @stub
    val CENOFF: Int = ???

    /**  */
    @stub
    val CENSIG: Long = ???

    /**  */
    @stub
    val CENSIZ: Int = ???

    /**  */
    @stub
    val CENTIM: Int = ???

    /**  */
    @stub
    val CENVEM: Int = ???

    /**  */
    @stub
    val CENVER: Int = ???

    /** Compression method for compressed (DEFLATED) entries. */
    @stub
    val DEFLATED: Int = ???

    /**  */
    @stub
    val ENDCOM: Int = ???

    /**  */
    @stub
    val ENDHDR: Int = ???

    /**  */
    @stub
    val ENDOFF: Int = ???

    /**  */
    @stub
    val ENDSIG: Long = ???

    /**  */
    @stub
    val ENDSIZ: Int = ???

    /**  */
    @stub
    val ENDSUB: Int = ???

    /**  */
    @stub
    val ENDTOT: Int = ???

    /**  */
    @stub
    val EXTCRC: Int = ???

    /**  */
    @stub
    val EXTHDR: Int = ???

    /**  */
    @stub
    val EXTLEN: Int = ???

    /**  */
    @stub
    val EXTSIG: Long = ???

    /**  */
    @stub
    val EXTSIZ: Int = ???

    /**  */
    @stub
    val LOCCRC: Int = ???

    /**  */
    @stub
    val LOCEXT: Int = ???

    /**  */
    @stub
    val LOCFLG: Int = ???

    /**  */
    @stub
    val LOCHDR: Int = ???

    /**  */
    @stub
    val LOCHOW: Int = ???

    /**  */
    @stub
    val LOCLEN: Int = ???

    /**  */
    @stub
    val LOCNAM: Int = ???

    /**  */
    @stub
    val LOCSIG: Long = ???

    /**  */
    @stub
    val LOCSIZ: Int = ???

    /**  */
    @stub
    val LOCTIM: Int = ???

    /**  */
    @stub
    val LOCVER: Int = ???

    /** Compression method for uncompressed (STORED) entries. */
    @stub
    val STORED: Int = ???
}
