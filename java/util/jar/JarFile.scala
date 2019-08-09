package java.util.jar

import java.io.{File, InputStream}
import java.lang.{Object, String}
import java.util.Enumeration
import java.util.zip.{ZipEntry, ZipFile}

// The JarFile class is used to read the contents of a jar file
// from any file that can be opened with java.io.RandomAccessFile.
// It extends the class java.util.zip.ZipFile with support
// for reading an optional Manifest entry. The
// Manifest can be used to specify meta-information about the
// jar file and its entries.
//
//  Unless otherwise noted, passing a null argument to a constructor
// or method in this class will cause a NullPointerException to be
// thrown.
//
// If the verify flag is on when opening a signed jar file, the content of the
// file is verified against its signature embedded inside the file. Please note
// that the verification process does not include validating the signer's
// certificate. A caller should inspect the return value of
// JarEntry.getCodeSigners() to further determine if the signature
// can be trusted.
class JarFile extends ZipFile {

    @stub
    // Creates a new JarFile to read from the specified
    // File object.
    def this(file: File) = ???

    @stub
    // Creates a new JarFile to read from the specified
    // File object.
    def this(file: File, verify: Boolean) = ???

    @stub
    // Creates a new JarFile to read from the specified
    // File object in the specified mode.
    def this(file: File, verify: Boolean, mode: Int) = ???

    @stub
    // Creates a new JarFile to read from the specified
    // file name.
    def this(name: String) = ???

    @stub
    // Returns an enumeration of the zip file entries.
    def entries(): Enumeration[JarEntry] = ???

    @stub
    // Returns the ZipEntry for the given entry name or
    // null if not found.
    def getEntry(name: String): ZipEntry = ???

    @stub
    // Returns an input stream for reading the contents of the specified
    // zip file entry.
    def getInputStream(ze: ZipEntry): InputStream = ???

    @stub
    // Returns the JarEntry for the given entry name or
    // null if not found.
    def getJarEntry(name: String): JarEntry = ???

    @stub
    // Returns the jar file manifest, or null if none.
    def getManifest(): Manifest = ???
}

object JarFile {
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
}
