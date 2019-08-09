package javax.print.attribute.standard

import java.lang.{Class, Object}
import javax.print.attribute.{Attribute, IntegerSyntax, SupportedValuesAttribute}

/** Class JobPrioritySupported is an integer valued printing attribute class
 *  that specifies whether a Print Service instance supports the JobPriority attribute and the number of different job priority
 *  levels supported.
 *  
 *  The client can always specify any JobPriority value
 *  from 1 to 100 for a job. However, the Print Service instance may support
 *  fewer than 100 different job priority levels. If this is the case, the
 *  Print Service instance automatically maps the client-specified job priority
 *  value to one of the supported job priority levels, dividing the 100 job
 *  priority values equally among the available job priority levels.
 *  
 *  IPP Compatibility: The integer value gives the IPP integer value.
 *  The category name returned by getName() gives the IPP
 *  attribute name.
 *  
 */
final class JobPrioritySupported extends IntegerSyntax with SupportedValuesAttribute {

    /** Returns whether this job priority supported attribute is equivalent to
     *  the passed in object.
     */
    @stub
    def equals(object: Object): Boolean = ???

    /** Get the printing attribute class which is to be used as the "category"
     *  for this printing attribute value.
     */
    @stub
    def getCategory(): Class[_ <: Attribute] = ???
}
