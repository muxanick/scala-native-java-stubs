package java.util.jar

import java.lang.{Object, String}
import java.security.cert.Certificate
import java.util.zip.ZipEntry

// This class is used to represent a JAR file entry.
class JarEntry extends ZipEntry {

    @stub
    // Creates a new JarEntry with fields taken from the
    // specified JarEntry object.
    def this(je: JarEntry) = ???

    @stub
    // Creates a new JarEntry for the specified JAR file
    // entry name.
    def this(name: String) = ???

    @stub
    // Returns the Manifest Attributes for this
    // entry, or null if none.
    def getAttributes(): Attributes = ???

    @stub
    // Returns the Certificate objects for this entry, or
    // null if none.
    def getCertificates(): Array[Certificate] = ???
}

object JarEntry {
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
