package javax.print.attribute.standard

import java.lang.{Class, Object}
import javax.print.attribute.{Attribute, PrintJobAttribute, TextSyntax}

/** Class JobMessageFromOperator is a printing attribute class, a text attribute,
 *  that provides a message from an operator, system administrator, or
 *  "intelligent" process to indicate to the end user the reasons for
 *  modification or other management action taken on a job.
 *  
 *  A Print Job's attribute set includes zero instances or one instance of a
 *  JobMessageFromOperator attribute, not more than one instance. A new
 *  JobMessageFromOperator attribute replaces an existing JobMessageFromOperator
 *  attribute, if any. In other words, JobMessageFromOperator is not intended to
 *  be a history log. If it wishes, the client can detect changes to a Print
 *  Job's JobMessageFromOperator attribute and maintain the client's own history
 *  log of the JobMessageFromOperator attribute values.
 *  
 *  IPP Compatibility: The string value gives the IPP name value. The
 *  locale gives the IPP natural language. The category name returned by
 *  getName() gives the IPP attribute name.
 *  
 */
final class JobMessageFromOperator extends TextSyntax with PrintJobAttribute {

    /** Returns whether this job message from operator attribute is equivalent to
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
