package javax.print.attribute.standard

import java.lang.{Class, Object, String}
import javax.print.attribute.{Attribute, DocAttribute, EnumSyntax}

// Class Compression is a printing attribute class, an enumeration, that
// specifies how print data is compressed. Compression is an attribute of the
// print data (the doc), not of the Print Job. If a Compression attribute is not
// specified for a doc, the printer assumes the doc's print data is uncompressed
// (i.e., the default Compression value is always NONE).
// 
// IPP Compatibility: The category name returned by
// getName() is the IPP attribute name.  The enumeration's
// integer value is the IPP enum value.  The toString() method
// returns the IPP string representation of the attribute value.
// 
class Compression extends EnumSyntax with DocAttribute {

    @stub
    // Get the printing attribute class which is to be used as the "category"
    // for this printing attribute value.
    def getCategory(): Class[_ <: Attribute] = ???

    @stub
    // Returns the enumeration value table for class Compression.
    protected def getEnumValueTable(): Array[EnumSyntax] = ???

    @stub
    // Get the name of the category of which this attribute value is an
    // instance.
    def getName(): String = ???
}

object Compression {
    @stub
    // UNIX compression technology.
    def COMPRESS: Compression = ???

    @stub
    // ZIP public domain inflate/deflate compression technology.
    def DEFLATE: Compression = ???

    @stub
    // GNU zip compression technology described in
    // RFC 1952.
    def GZIP: Compression = ???
}
