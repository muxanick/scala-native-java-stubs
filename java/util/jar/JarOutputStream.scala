package java.util.jar

import java.io.{FilterOutputStream, OutputStream}
import java.lang.Object
import java.util.zip.{DeflaterOutputStream, ZipOutputStream}

/** The JarOutputStream class is used to write the contents
 *  of a JAR file to any output stream. It extends the class
 *  java.util.zip.ZipOutputStream with support
 *  for writing an optional Manifest entry. The
 *  Manifest can be used to specify meta-information about
 *  the JAR file and its entries.
 */
class JarOutputStream extends ZipOutputStream {

    /** Creates a new JarOutputStream with no manifest. */
    @stub
    def this(out: OutputStream) = ???
}

object JarOutputStream {
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
