package java.util.jar

import java.io.{FilterInputStream, InputStream}
import java.lang.{Object, String}
import java.util.zip.{InflaterInputStream, ZipEntry, ZipInputStream}

// The JarInputStream class is used to read the contents of
// a JAR file from any input stream. It extends the class
// java.util.zip.ZipInputStream with support for reading
// an optional Manifest entry. The Manifest
// can be used to store meta-information about the JAR file and its entries.
class JarInputStream extends ZipInputStream {

    @stub
    // Creates a new JarInputStream and reads the optional
    // manifest.
    def this(in: InputStream) = ???

    @stub
    // Creates a new JarEntry (ZipEntry) for the
    // specified JAR file entry name.
    protected def createZipEntry(name: String): ZipEntry = ???

    @stub
    // Returns the Manifest for this JAR file, or
    // null if none.
    def getManifest(): Manifest = ???

    @stub
    // Reads the next ZIP file entry and positions the stream at the
    // beginning of the entry data.
    def getNextEntry(): ZipEntry = ???

    @stub
    // Reads the next JAR file entry and positions the stream at the
    // beginning of the entry data.
    def getNextJarEntry(): JarEntry = ???
}

object JarInputStream {
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
