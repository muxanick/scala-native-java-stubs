package java.util.zip

import java.lang.{Cloneable, Object, String}
import java.nio.file.attribute.FileTime

// This class is used to represent a ZIP file entry.
class ZipEntry extends Object with Cloneable {

    @stub
    // Creates a new zip entry with the specified name.
    def this(name: String) = ???

    @stub
    // Returns a copy of this entry.
    def clone(): Object = ???

    @stub
    // Returns the comment string for the entry.
    def getComment(): String = ???

    @stub
    // Returns the size of the compressed entry data.
    def getCompressedSize(): Long = ???

    @stub
    // Returns the CRC-32 checksum of the uncompressed entry data.
    def getCrc(): Long = ???

    @stub
    // Returns the creation time of the entry.
    def getCreationTime(): FileTime = ???

    @stub
    // Returns the extra field data for the entry.
    def getExtra(): Array[Byte] = ???

    @stub
    // Returns the last access time of the entry.
    def getLastAccessTime(): FileTime = ???

    @stub
    // Returns the last modification time of the entry.
    def getLastModifiedTime(): FileTime = ???

    @stub
    // Returns the compression method of the entry.
    def getMethod(): Int = ???

    @stub
    // Returns the name of the entry.
    def getName(): String = ???

    @stub
    // Returns the uncompressed size of the entry data.
    def getSize(): Long = ???

    @stub
    // Returns the last modification time of the entry.
    def getTime(): Long = ???

    @stub
    // Returns the hash code value for this entry.
    def hashCode(): Int = ???

    @stub
    // Returns true if this is a directory entry.
    def isDirectory(): Boolean = ???

    @stub
    // Sets the optional comment string for the entry.
    def setComment(comment: String): Unit = ???

    @stub
    // Sets the size of the compressed entry data.
    def setCompressedSize(csize: Long): Unit = ???

    @stub
    // Sets the CRC-32 checksum of the uncompressed entry data.
    def setCrc(crc: Long): Unit = ???

    @stub
    // Sets the creation time of the entry.
    def setCreationTime(time: FileTime): ZipEntry = ???

    @stub
    // Sets the optional extra field data for the entry.
    def setExtra(extra: Array[Byte]): Unit = ???

    @stub
    // Sets the last access time of the entry.
    def setLastAccessTime(time: FileTime): ZipEntry = ???

    @stub
    // Sets the last modification time of the entry.
    def setLastModifiedTime(time: FileTime): ZipEntry = ???

    @stub
    // Sets the compression method for the entry.
    def setMethod(method: Int): Unit = ???

    @stub
    // Sets the uncompressed size of the entry data.
    def setSize(size: Long): Unit = ???

    @stub
    // Sets the last modification time of the entry.
    def setTime(time: Long): Unit = ???
}

object ZipEntry {
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
    // Compression method for compressed (deflated) entries.
    def DEFLATED: Int = ???

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
