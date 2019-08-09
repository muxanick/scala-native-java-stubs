package java.util.zip

import java.io.{Closeable, File, InputStream}
import java.lang.{Object, String}
import java.nio.charset.Charset
import java.util.Enumeration

// This class is used to read entries from a zip file.
//
//  Unless otherwise noted, passing a null argument to a constructor
// or method in this class will cause a NullPointerException to be
// thrown.
class ZipFile extends Object with Closeable {

    @stub
    // Opens a ZIP file for reading given the specified File object.
    def this(file: File) = ???

    @stub
    // Opens a ZIP file for reading given the specified File object.
    def this(file: File, charset: Charset) = ???

    @stub
    // Opens a new ZipFile to read from the specified
    // File object in the specified mode.
    def this(file: File, mode: Int) = ???

    @stub
    // Opens a new ZipFile to read from the specified
    // File object in the specified mode.
    def this(file: File, mode: Int, charset: Charset) = ???

    @stub
    // Opens a zip file for reading.
    def this(name: String) = ???

    @stub
    // Closes the ZIP file.
    def close(): Unit = ???

    @stub
    // Returns an enumeration of the ZIP file entries.
    def entries(): Enumeration[_ <: ZipEntry] = ???

    @stub
    // Ensures that the system resources held by this ZipFile object are
    // released when there are no more references to it.
    protected def finalize(): Unit = ???

    @stub
    // Returns the zip file comment, or null if none.
    def getComment(): String = ???

    @stub
    // Returns the zip file entry for the specified name, or null
    // if not found.
    def getEntry(name: String): ZipEntry = ???

    @stub
    // Returns an input stream for reading the contents of the specified
    // zip file entry.
    def getInputStream(entry: ZipEntry): InputStream = ???

    @stub
    // Returns the path name of the ZIP file.
    def getName(): String = ???

    @stub
    // Returns the number of entries in the ZIP file.
    def size(): Int = ???
}

object ZipFile {
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

    @stub
    // Mode flag to open a zip file and mark it for deletion.
    def OPEN_DELETE: Int = ???
}
