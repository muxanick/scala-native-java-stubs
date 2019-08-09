package java.util.zip

import java.io.{FilterInputStream, InputStream}
import java.lang.{Object, String}

/** This class implements an input stream filter for reading files in the
 *  ZIP file format. Includes support for both compressed and uncompressed
 *  entries.
 */
class ZipInputStream extends InflaterInputStream {

    /** Creates a new ZIP input stream. */
    @stub
    def this(in: InputStream) = ???

    /** Returns 0 after EOF has reached for the current entry data,
     *  otherwise always return 1.
     */
    @stub
    def available(): Int = ???

    /** Closes this input stream and releases any system resources associated
     *  with the stream.
     */
    @stub
    def close(): Unit = ???

    /** Closes the current ZIP entry and positions the stream for reading the
     *  next entry.
     */
    @stub
    def closeEntry(): Unit = ???

    /** Creates a new ZipEntry object for the specified
     *  entry name.
     */
    @stub
    protected def createZipEntry(name: String): ZipEntry = ???

    /** Reads the next ZIP file entry and positions the stream at the
     *  beginning of the entry data.
     */
    @stub
    def getNextEntry(): ZipEntry = ???

    /** Reads from the current ZIP entry into an array of bytes. */
    @stub
    def read(b: Array[Byte], off: Int, len: Int): Int = ???
}

object ZipInputStream {
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
}
