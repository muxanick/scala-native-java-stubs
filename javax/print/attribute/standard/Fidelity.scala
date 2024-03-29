package javax.print.attribute.standard

import java.lang.{Class, Object, String}
import javax.print.attribute.{Attribute, EnumSyntax, PrintJobAttribute, PrintRequestAttribute}
import scala.scalanative.annotation.stub

/** Class Fidelity is a printing attribute class, an enumeration,
 *  that indicates whether total fidelity to client supplied print request
 *  attributes is required.
 *  If FIDELITY_TRUE is specified and a service cannot print the job exactly
 *  as specified it must reject the job.
 *  If FIDELITY_FALSE is specified a reasonable attempt to print the job is
 *  acceptable. If not supplied the default is FIDELITY_FALSE.
 * 
 *  
 *  IPP Compatibility: The IPP boolean value is "true" for FIDELITY_TRUE
 *  and "false" for FIDELITY_FALSE. The category name returned by
 *  getName() is the IPP attribute name.  The enumeration's
 *  integer value is the IPP enum value.  The toString() method
 *  returns the IPP string representation of the attribute value.
 *  See RFC 2911 Section 15.1 for
 *  a fuller description of the IPP fidelity attribute.
 *  
 */
final class Fidelity extends EnumSyntax with PrintJobAttribute with PrintRequestAttribute {

    /** Construct a new fidelity enumeration value with the
     *  given integer value.
     */
    @stub
    protected def this(value: Int) = ???

    /** Get the printing attribute class which is to be used as the "category"
     *  for this printing attribute value.
     */
    @stub
    def getCategory(): Class[_ <: Attribute] = ???

    /** Returns the enumeration value table for class Fidelity. */
    @stub
    protected def getEnumValueTable(): Array[EnumSyntax] = ???

    /** Get the name of the category of which this attribute value is an
     *  instance.
     */
    @stub
    def getName(): String = ???

    /** Returns the string table for class Fidelity. */
    @stub
    protected def getStringTable(): Array[String] = ???
}

object Fidelity {
    /** The printer should make reasonable attempts to print the job,
     *  even if it cannot print it exactly as specified.
     */
    @stub
    val FIDELITY_FALSE: Fidelity = ???

    /** The job must be printed exactly as specified. */
    @stub
    val FIDELITY_TRUE: Fidelity = ???
}
