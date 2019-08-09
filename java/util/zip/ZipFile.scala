package java.util.zip

import java.io.{Closeable, File, InputStream}
import java.lang.{Object, String}
import java.nio.charset.Charset
import java.util.Enumeration

/** This class is used to read entries from a zip file.
 * 
 *   Unless otherwise noted, passing a null argument to a constructor
 *  or method in this class will cause a NullPointerException to be
 *  thrown.
 */
class ZipFile extends Object with Closeable {

    /** Opens a ZIP file for reading given the specified File object. */
    @stub
    def this(file: File) = ???

    /** Opens a ZIP file for reading given the specified File object. */
    @stub
    def this(file: File, charset: Charset) = ???

    /** Opens a new ZipFile to read from the specified
     *  File object in the specified mode.
     */
    @stub
    def this(file: File, mode: Int) = ???

    /** Opens a new ZipFile to read from the specified
     *  File object in the specified mode.
     */
    @stub
    def this(file: File, mode: Int, charset: Charset) = ???

    /** Opens a zip file for reading. */
    @stub
    def this(name: String) = ???

    /** Closes the ZIP file. */
    @stub
    def close(): Unit = ???

    /** Returns an enumeration of the ZIP file entries. */
    @stub
    def entries(): Enumeration[_ <: ZipEntry] = ???

    /** Ensures that the system resources held by this ZipFile object are
     *  released when there are no more references to it.
     */
    @stub
    protected def finalize(): Unit = ???

    /** Returns the zip file comment, or null if none. */
    @stub
    def getComment(): String = ???

    /** Returns the zip file entry for the specified name, or null
     *  if not found.
     */
    @stub
    def getEntry(name: String): ZipEntry = ???

    /** Returns an input stream for reading the contents of the specified
     *  zip file entry.
     */
    @stub
    def getInputStream(entry: ZipEntry): InputStream = ???

    /** Returns the path name of the ZIP file. */
    @stub
    def getName(): String = ???

    /** Returns the number of entries in the ZIP file. */
    @stub
    def size(): Int = ???
}

object ZipFile {
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

    /**  */
    @stub
    val LOCVER: Int = ???

    /** Mode flag to open a zip file and mark it for deletion. */
    @stub
    val OPEN_DELETE: Int = ???
}
