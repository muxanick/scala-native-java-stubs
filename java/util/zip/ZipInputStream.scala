package java.util.zip

import java.io.{FilterInputStream, InputStream}
import java.lang.{Object, String}

// This class implements an input stream filter for reading files in the
// ZIP file format. Includes support for both compressed and uncompressed
// entries.
class ZipInputStream extends InflaterInputStream {

    @stub
    // Creates a new ZIP input stream.
    def this(in: InputStream) = ???

    @stub
    // Returns 0 after EOF has reached for the current entry data,
    // otherwise always return 1.
    def available(): Int = ???

    @stub
    // Closes this input stream and releases any system resources associated
    // with the stream.
    def close(): Unit = ???

    @stub
    // Closes the current ZIP entry and positions the stream for reading the
    // next entry.
    def closeEntry(): Unit = ???

    @stub
    // Creates a new ZipEntry object for the specified
    // entry name.
    protected def createZipEntry(name: String): ZipEntry = ???

    @stub
    // Reads the next ZIP file entry and positions the stream at the
    // beginning of the entry data.
    def getNextEntry(): ZipEntry = ???

    @stub
    // Reads from the current ZIP entry into an array of bytes.
    def read(b: Array[Byte], off: Int, len: Int): Int = ???
}

object ZipInputStream {
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
}
