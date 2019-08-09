package javax.print.attribute.standard

import java.lang.{Class, Object, String}
import javax.print.attribute.{Attribute, IntegerSyntax, PrintJobAttribute, PrintRequestAttribute}
import scala.scalanative.annotation.stub

/** Class JobImpressions is an integer valued printing attribute class that
 *  specifies the total size in number of impressions of the document(s) being
 *  submitted. An "impression" is the image (possibly many print-stream pages in
 *  different configurations) imposed onto a single media page.
 *  
 *  The JobImpressions attribute describes the size of the job. This attribute is
 *  not intended to be a counter; it is intended to be useful routing and
 *  scheduling information if known. The printer may try to compute the
 *  JobImpressions attribute's value if it is not supplied in the Print Request.
 *  Even if the client does supply a value for the JobImpressions attribute in
 *  the Print Request, the printer may choose to change the value if the printer
 *  is able to compute a value which is more accurate than the client supplied
 *  value. The printer may be able to determine the correct value for the
 *  JobImpressions attribute either right at job submission time or at any later
 *  point in time.
 *  
 *  As with JobKOctets, the JobImpressions value must not
 *  include the multiplicative factors contributed by the number of copies
 *  specified by the Copies attribute, independent of whether the
 *  device can process multiple copies without making multiple passes over the
 *  job or document data and independent of whether the output is collated or
 *  not. Thus the value is independent of the implementation and reflects the
 *  size of the document(s) measured in impressions independent of the number of
 *  copies.
 *  
 *  As with JobKOctets, the JobImpressions value must also not
 *  include the multiplicative factor due to a copies instruction embedded in the
 *  document data. If the document data actually includes replications of the
 *  document data, this value will include such replication. In other words, this
 *  value is always the number of impressions in the source document data, rather
 *  than a measure of the number of impressions to be produced by the job.
 *  
 *  IPP Compatibility: The integer value gives the IPP integer value. The
 *  category name returned by getName() gives the IPP attribute
 *  name.
 *  
 */
final class JobImpressions extends IntegerSyntax with PrintRequestAttribute with PrintJobAttribute {

    /** Construct a new job impressions attribute with the given integer value. */
    @stub
    def this(value: Int) = ???

    /** Returns whether this job impressions attribute is equivalent to the
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
