package java.util.jar

import java.beans.PropertyChangeListener
import java.io.OutputStream
import java.lang.String
import java.util.SortedMap

// The packer engine applies various transformations to the input JAR file,
// making the pack stream highly compressible by a compressor such as
// gzip or zip. An instance of the engine can be obtained
// using Pack200.newPacker().
//
// The high degree of compression is achieved
// by using a number of techniques described in the JSR 200 specification.
// Some of the techniques are sorting, re-ordering and co-location of the
// constant pool.
// 
// The pack engine is initialized to an initial state as described
// by their properties below.
// The initial state can be manipulated by getting the
// engine properties (using properties()) and storing
// the modified properties on the map.
// The resource files will be passed through with no changes at all.
// The class files will not contain identical bytes, since the unpacker
// is free to change minor class file features such as constant pool order.
// However, the class files will be semantically identical,
// as specified in
// The Java™ Virtual Machine Specification.
// 
// By default, the packer does not change the order of JAR elements.
// Also, the modification time and deflation hint of each
// JAR element is passed unchanged.
// (Any other ZIP-archive information, such as extra attributes
// giving Unix file permissions, are lost.)
// 
// Note that packing and unpacking a JAR will in general alter the
// bytewise contents of classfiles in the JAR.  This means that packing
// and unpacking will in general invalidate any digital signatures
// which rely on bytewise images of JAR elements.  In order both to sign
// and to pack a JAR, you must first pack and unpack the JAR to
// "normalize" it, then compute signatures on the unpacked JAR elements,
// and finally repack the signed JAR.
// Both packing steps should
// use precisely the same options, and the segment limit may also
// need to be set to "-1", to prevent accidental variation of segment
// boundaries as class file sizes change slightly.
// 
// (Here's why this works:  Any reordering the packer does
// of any classfile structures is idempotent, so the second packing
// does not change the orderings produced by the first packing.
// Also, the unpacker is guaranteed by the JSR 200 specification
// to produce a specific bytewise image for any given transmission
// ordering of archive elements.)
// 
// In order to maintain backward compatibility, the pack file's version is
// set to accommodate the class files present in the input JAR file. In
// other words, the pack file version will be the latest, if the class files
// are the latest and conversely the pack file version will be the oldest
// if the class file versions are also the oldest. For intermediate class
// file versions the corresponding pack file version will be used.
// For example:
//    If the input JAR-files are solely comprised of 1.5  (or  lesser)
// class files, a 1.5 compatible pack file is  produced. This will also be
// the case for archives that have no class files.
//    If the input JAR-files contains a 1.6 class file, then the pack file
// version will be set to 1.6.
// 
// Note: Unless otherwise noted, passing a null argument to a
// constructor or method in this class will cause a NullPointerException
// to be thrown.
// 
object trait Pack200.Packer {

    @stub
    // When concatenated with a class attribute name,
    // indicates the format of that attribute,
    // using the layout language specified in the JSR 200 specification.
    def CLASS_ATTRIBUTE_PFX: String = ???

    @stub
    // When concatenated with a code attribute name,
    // indicates the format of that attribute.
    def CODE_ATTRIBUTE_PFX: String = ???

    @stub
    // If this property is set to TRUE or FALSE, the packer
    // will set the deflation hint accordingly in the output archive, and
    // will not transmit the individual deflation hints of archive elements.
    def DEFLATE_HINT: String = ???

    @stub
    // If this property is set to a single decimal digit, the packer will
    // use the indicated amount of effort in compressing the archive.
    def EFFORT: String = ???

    @stub
    // The string "error", a possible value for certain properties.
    def ERROR: String = ???

    @stub
    // The string "false", a possible value for certain properties.
    def FALSE: String = ???

    @stub
    // When concatenated with a field attribute name,
    // indicates the format of that attribute.
    def FIELD_ATTRIBUTE_PFX: String = ???

    @stub
    // The string "keep", a possible value for certain properties.
    def KEEP: String = ???

    @stub
    // If this property is set to TRUE, the packer will transmit
    // all elements in their original order within the source archive.
    def KEEP_FILE_ORDER: String = ???

    @stub
    // The string "latest", a possible value for certain properties.
    def LATEST: String = ???

    @stub
    // When concatenated with a method attribute name,
    // indicates the format of that attribute.
    def METHOD_ATTRIBUTE_PFX: String = ???

    @stub
    // If this property is set to the special string LATEST,
    // the packer will attempt to determine the latest modification time,
    // among all the available entries in the original archive or the latest
    // modification time of all the available entries in each segment.
    def MODIFICATION_TIME: String = ???

    @stub
    // The string "pass", a possible value for certain properties.
    def PASS: String = ???

    @stub
    // Indicates that a file should be passed through bytewise, with no
    // compression.
    def PASS_FILE_PFX: String = ???

    @stub
    // The unpacker's progress as a percentage, as periodically
    // updated by the unpacker.
    def PROGRESS: String = ???

    @stub
    // This property is a numeral giving the estimated target size N
    // (in bytes) of each archive segment.
    def SEGMENT_LIMIT: String = ???

    @stub
    // The string "strip", a possible value for certain properties.
    def STRIP: String = ???

    @stub
    // The string "true", a possible value for certain properties.
    def TRUE: String = ???

    @stub
    // Deprecated. 
    //The dependency on PropertyChangeListener creates
    //             a significant impediment to future modularization of the
    //             Java platform. This method will be removed in a future
    //             release.
    //             Applications that need to monitor progress of the packer
    //             can poll the value of the PROGRESS
    //             property instead.
    //
    def Unit: default = ???

    @stub
    // Takes a JarFile and converts it into a Pack200 archive.
    def pack(in: JarFile, out: OutputStream): Unit = ???

    @stub
    // Takes a JarInputStream and converts it into a Pack200 archive.
    def pack(in: JarInputStream, out: OutputStream): Unit = ???

    @stub
    // Get the set of this engine's properties.
    def properties(): SortedMap[String, String] = ???
}