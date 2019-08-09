package java.util.zip

import java.lang.{Cloneable, Object, String}
import java.nio.file.attribute.FileTime

/** This class is used to represent a ZIP file entry. */
class ZipEntry extends Object with Cloneable {

    /** Creates a new zip entry with the specified name. */
    @stub
    def this(name: String) = ???

    /** Returns a copy of this entry. */
    @stub
    def clone(): Object = ???

    /** Returns the comment string for the entry. */
    @stub
    def getComment(): String = ???

    /** Returns the size of the compressed entry data. */
    @stub
    def getCompressedSize(): Long = ???

    /** Returns the CRC-32 checksum of the uncompressed entry data. */
    @stub
    def getCrc(): Long = ???

    /** Returns the creation time of the entry. */
    @stub
    def getCreationTime(): FileTime = ???

    /** Returns the extra field data for the entry. */
    @stub
    def getExtra(): Array[Byte] = ???

    /** Returns the last access time of the entry. */
    @stub
    def getLastAccessTime(): FileTime = ???

    /** Returns the last modification time of the entry. */
    @stub
    def getLastModifiedTime(): FileTime = ???

    /** Returns the compression method of the entry. */
    @stub
    def getMethod(): Int = ???

    /** Returns the name of the entry. */
    @stub
    def getName(): String = ???

    /** Returns the uncompressed size of the entry data. */
    @stub
    def getSize(): Long = ???

    /** Returns the last modification time of the entry. */
    @stub
    def getTime(): Long = ???

    /** Returns the hash code value for this entry. */
    @stub
    def hashCode(): Int = ???

    /** Returns true if this is a directory entry. */
    @stub
    def isDirectory(): Boolean = ???

    /** Sets the optional comment string for the entry. */
    @stub
    def setComment(comment: String): Unit = ???

    /** Sets the size of the compressed entry data. */
    @stub
    def setCompressedSize(csize: Long): Unit = ???

    /** Sets the CRC-32 checksum of the uncompressed entry data. */
    @stub
    def setCrc(crc: Long): Unit = ???

    /** Sets the creation time of the entry. */
    @stub
    def setCreationTime(time: FileTime): ZipEntry = ???

    /** Sets the optional extra field data for the entry. */
    @stub
    def setExtra(extra: Array[Byte]): Unit = ???

    /** Sets the last access time of the entry. */
    @stub
    def setLastAccessTime(time: FileTime): ZipEntry = ???

    /** Sets the last modification time of the entry. */
    @stub
    def setLastModifiedTime(time: FileTime): ZipEntry = ???

    /** Sets the compression method for the entry. */
    @stub
    def setMethod(method: Int): Unit = ???

    /** Sets the uncompressed size of the entry data. */
    @stub
    def setSize(size: Long): Unit = ???

    /** Sets the last modification time of the entry. */
    @stub
    def setTime(time: Long): Unit = ???
}

object ZipEntry {
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

    /** Compression method for compressed (deflated) entries. */
    @stub
    val DEFLATED: Int = ???

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
