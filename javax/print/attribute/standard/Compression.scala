package javax.print.attribute.standard

import java.lang.{Class, Object, String}
import javax.print.attribute.{Attribute, DocAttribute, EnumSyntax}
import scala.scalanative.annotation.stub

/** Class Compression is a printing attribute class, an enumeration, that
 *  specifies how print data is compressed. Compression is an attribute of the
 *  print data (the doc), not of the Print Job. If a Compression attribute is not
 *  specified for a doc, the printer assumes the doc's print data is uncompressed
 *  (i.e., the default Compression value is always NONE).
 *  
 *  IPP Compatibility: The category name returned by
 *  getName() is the IPP attribute name.  The enumeration's
 *  integer value is the IPP enum value.  The toString() method
 *  returns the IPP string representation of the attribute value.
 *  
 */
class Compression extends EnumSyntax with DocAttribute {

    /** Construct a new compression enumeration value with the given integer
     *  value.
     */
    @stub
    protected def this(value: Int) = ???

    /** Get the printing attribute class which is to be used as the "category"
     *  for this printing attribute value.
     */
    @stub
    def getCategory(): Class[_ <: Attribute] = ???

    /** Returns the enumeration value table for class Compression. */
    @stub
    protected def getEnumValueTable(): Array[EnumSyntax] = ???

    /** Get the name of the category of which this attribute value is an
     *  instance.
     */
    @stub
    def getName(): String = ???

    /** Returns the string table for class Compression. */
    @stub
    protected def getStringTable(): Array[String] = ???
}

object Compression {
    /** UNIX compression technology. */
    @stub
    val COMPRESS: Compression = ???

    /** ZIP public domain inflate/deflate compression technology. */
    @stub
    val DEFLATE: Compression = ???

    /** GNU zip compression technology described in
     *  RFC 1952.
     */
    @stub
    val GZIP: Compression = ???

    /** No compression is used. */
    @stub
    val NONE: Compression = ???
}
