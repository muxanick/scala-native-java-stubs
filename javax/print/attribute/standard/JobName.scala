package javax.print.attribute.standard

import java.lang.{Class, Object}
import javax.print.attribute.{Attribute, PrintJobAttribute, PrintRequestAttribute, TextSyntax}

/** Class JobName is a printing attribute class, a text attribute, that specifies
 *  the name of a print job. A job's name is an arbitrary string defined by the
 *  client. It does not need to be unique between different jobs. A Print Job's
 *  JobName attribute is set to the value supplied by the client in the Print
 *  Request's attribute set. If, however, the client does not supply a JobName
 *  attribute in the Print Request, the printer, when it creates the Print Job,
 *  must generate a JobName. The printer should generate the value of the Print
 *  Job's JobName attribute from the first of the following sources that produces
 *  a value: (1) the DocumentName attribute of the first (or
 *  only) doc in the job, (2) the URL of the first (or only) doc in the job, if
 *  the doc's print data representation object is a URL, or (3) any other piece
 *  of Print Job specific and/or document content information.
 *  
 *  IPP Compatibility: The string value gives the IPP name value. The
 *  locale gives the IPP natural language. The category name returned by
 *  getName() gives the IPP attribute name.
 *  
 */
final class JobName extends TextSyntax with PrintRequestAttribute with PrintJobAttribute {

    /** Returns whether this job name attribute is equivalent to the passed in
     *  object.
     */
    @stub
    def equals(object: Object): Boolean = ???

    /** Get the printing attribute class which is to be used as the "category"
     *  for this printing attribute value.
     */
    @stub
    def getCategory(): Class[_ <: Attribute] = ???
}
