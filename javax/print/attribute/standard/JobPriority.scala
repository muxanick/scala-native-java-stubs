package javax.print.attribute.standard

import java.lang.{Class, Object, String}
import javax.print.attribute.{Attribute, IntegerSyntax, PrintJobAttribute, PrintRequestAttribute}
import scala.scalanative.annotation.stub

/** Class JobPriority is an integer valued printing attribute class that
 *  specifies a print job's priority.
 *  
 *  If a JobPriority attribute is specified for a Print Job, it specifies a
 *  priority for scheduling the job. A higher value specifies a higher priority.
 *  The value 1 indicates the lowest possible priority. The value 100 indicates
 *  the highest possible priority. Among those jobs that are ready to print, a
 *  printer must print all jobs with a priority value of n before printing
 *  those with a priority value of n-1 for all n.
 *  
 *  If the client does not specify a JobPriority attribute for a Print Job and
 *  the printer does support the JobPriority attribute, the printer must use an
 *  implementation-defined default JobPriority value.
 *  
 *  The client can always specify any job priority value from 1 to 100 for a job.
 *  However, a Print Service instance may support fewer than 100 different
 *  job priority levels. If this is the case, the Print Service instance
 *  automatically maps the client-specified job priority value to one of the
 *  supported job priority levels, dividing the 100 job priority values equally
 *  among the available job priority levels.
 *  
 *  IPP Compatibility: The integer value gives the IPP integer value. The
 *  category name returned by getName() gives the IPP attribute
 *  name.
 *  
 */
final class JobPriority extends IntegerSyntax with PrintRequestAttribute with PrintJobAttribute {

    /** Construct a new job priority attribute with the given integer value. */
    @stub
    def this(value: Int) = ???

    /** Returns whether this job priority attribute is equivalent to the passed
     *  in object.
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
