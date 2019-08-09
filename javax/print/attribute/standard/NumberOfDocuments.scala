package javax.print.attribute.standard

import java.lang.{Class, Object, String}
import javax.print.attribute.{Attribute, IntegerSyntax, PrintJobAttribute}
import scala.scalanative.annotation.stub

/** Class NumberOfDocuments is an integer valued printing attribute that
 *  indicates the number of individual docs the printer has accepted for this
 *  job, regardless of whether the docs' print data has reached the printer or
 *  not.
 *  
 *  IPP Compatibility: The integer value gives the IPP integer value. The
 *  category name returned by getName() gives the IPP attribute
 *  name.
 *  
 */
final class NumberOfDocuments extends IntegerSyntax with PrintJobAttribute {

    /** Construct a new number of documents attribute with the given integer
     *  value.
     */
    @stub
    def this(value: Int) = ???

    /** Returns whether this number of documents attribute is equivalent to the
     *  passed in object.
     */
    @stub
    def equals(object: Object): Boolean = ???

    /** Get the printing attribute class which is to be used as the "category"
     *  for this printing attribute value.
     */
    @stub
    def getCategory(): Class[_ <: Attribute] = ???

    /** Get the name of the category of which this attribute value is an
     *  instance.
     */
    @stub
    def getName(): String = ???
}
