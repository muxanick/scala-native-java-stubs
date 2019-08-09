package java.util.jar

import java.io.{File, InputStream}
import java.lang.{Object, String}
import java.util.Enumeration
import java.util.zip.{ZipEntry, ZipFile}

/** The JarFile class is used to read the contents of a jar file
 *  from any file that can be opened with java.io.RandomAccessFile.
 *  It extends the class java.util.zip.ZipFile with support
 *  for reading an optional Manifest entry. The
 *  Manifest can be used to specify meta-information about the
 *  jar file and its entries.
 * 
 *   Unless otherwise noted, passing a null argument to a constructor
 *  or method in this class will cause a NullPointerException to be
 *  thrown.
 * 
 *  If the verify flag is on when opening a signed jar file, the content of the
 *  file is verified against its signature embedded inside the file. Please note
 *  that the verification process does not include validating the signer's
 *  certificate. A caller should inspect the return value of
 *  JarEntry.getCodeSigners() to further determine if the signature
 *  can be trusted.
 */
class JarFile extends ZipFile {

    /** Creates a new JarFile to read from the specified
     *  File object.
     */
    @stub
    def this(file: File) = ???

    /** Creates a new JarFile to read from the specified
     *  File object.
     */
    @stub
    def this(file: File, verify: Boolean) = ???

    /** Creates a new JarFile to read from the specified
     *  File object in the specified mode.
     */
    @stub
    def this(file: File, verify: Boolean, mode: Int) = ???

    /** Creates a new JarFile to read from the specified
     *  file name.
     */
    @stub
    def this(name: String) = ???

    /** Returns an enumeration of the zip file entries. */
    @stub
    def entries(): Enumeration[JarEntry] = ???

    /** Returns the ZipEntry for the given entry name or
     *  null if not found.
     */
    @stub
    def getEntry(name: String): ZipEntry = ???

    /** Returns an input stream for reading the contents of the specified
     *  zip file entry.
     */
    @stub
    def getInputStream(ze: ZipEntry): InputStream = ???

    /** Returns the JarEntry for the given entry name or
     *  null if not found.
     */
    @stub
    def getJarEntry(name: String): JarEntry = ???

    /** Returns the jar file manifest, or null if none. */
    @stub
    def getManifest(): Manifest = ???
}

object JarFile {
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
}
