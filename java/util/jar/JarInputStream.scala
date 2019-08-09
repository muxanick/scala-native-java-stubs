package java.util.jar

import java.io.{FilterInputStream, InputStream}
import java.lang.{Object, String}
import java.util.zip.{InflaterInputStream, ZipEntry, ZipInputStream}

/** The JarInputStream class is used to read the contents of
 *  a JAR file from any input stream. It extends the class
 *  java.util.zip.ZipInputStream with support for reading
 *  an optional Manifest entry. The Manifest
 *  can be used to store meta-information about the JAR file and its entries.
 */
class JarInputStream extends ZipInputStream {

    /** Creates a new JarInputStream and reads the optional
     *  manifest.
     */
    @stub
    def this(in: InputStream) = ???

    /** Creates a new JarEntry (ZipEntry) for the
     *  specified JAR file entry name.
     */
    @stub
    protected def createZipEntry(name: String): ZipEntry = ???

    /** Returns the Manifest for this JAR file, or
     *  null if none.
     */
    @stub
    def getManifest(): Manifest = ???

    /** Reads the next ZIP file entry and positions the stream at the
     *  beginning of the entry data.
     */
    @stub
    def getNextEntry(): ZipEntry = ???

    /** Reads the next JAR file entry and positions the stream at the
     *  beginning of the entry data.
     */
    @stub
    def getNextJarEntry(): JarEntry = ???
}

object JarInputStream {
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
