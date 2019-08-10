package javax.print.attribute.standard

import java.lang.{Class, Object, String}
import javax.print.attribute.{Attribute, IntegerSyntax, PrintServiceAttribute}
import scala.scalanative.annotation.stub

/** Class QueuedJobCount is an integer valued printing attribute that indicates
 *  the number of jobs in the printer whose JobState is either
 *  PENDING, PENDING_HELD, PROCESSING, or PROCESSING_STOPPED.
 *  
 *  IPP Compatibility: The integer value gives the IPP integer value.
 *  The category name returned by getName() gives the IPP
 *  attribute name.
 *  
 */
final class QueuedJobCount extends IntegerSyntax with PrintServiceAttribute {

    /** Construct a new queued job count attribute with the given integer
     *  value.
     */
    @stub
    def this(value: Int) = ???

    /** Returns whether this queued job count attribute is equivalent to the
     *  passed in object.
     */
    @stub
    def equals(object: Any): Boolean = ???

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
