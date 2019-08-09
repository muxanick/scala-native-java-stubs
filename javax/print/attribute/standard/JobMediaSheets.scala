package javax.print.attribute.standard

import java.lang.{Class, Object}
import javax.print.attribute.{Attribute, IntegerSyntax, PrintJobAttribute, PrintRequestAttribute}

/** Class JobMediaSheets is an integer valued printing attribute class that
 *  specifies the total number of media sheets to be produced for this job.
 *  
 *  The JobMediaSheets attribute describes the size of the job. This attribute is
 *  not intended to be a counter; it is intended to be useful routing and
 *  scheduling information if known. The printer may try to compute the
 *  JobMediaSheets attribute's value if it is not supplied in the Print Request.
 *  Even if the client does supply a value for the JobMediaSheets attribute in
 *  the Print Request, the printer may choose to change the value if the printer
 *  is able to compute a value which is more accurate than the client supplied
 *  value. The printer may be able to determine the correct value for the
 *  JobMediaSheets attribute either right at job submission time or at any later
 *  point in time.
 *  
 *  Unlike the JobKOctets and JobImpressions attributes, the JobMediaSheets value must include the
 *  multiplicative factors contributed by the number of copies specified by the
 *  Copies attribute and a "number of copies" instruction embedded
 *  in the document data, if any. This difference allows the system administrator
 *  to control the lower and upper bounds of both (1) the size of the document(s)
 *  with JobKOctetsSupported and JobImpressionsSupported and (2) the size of the job
 *  with JobMediaSheetsSupported.
 *  
 *  IPP Compatibility: The integer value gives the IPP integer value. The
 *  category name returned by getName() gives the IPP attribute
 *  name.
 *  
 */
class JobMediaSheets extends IntegerSyntax with PrintRequestAttribute with PrintJobAttribute {

    /** Returns whether this job media sheets attribute is equivalent to the
     *  passed in object.
     */
    @stub
    def equals(object: Object): Boolean = ???

    /** Get the printing attribute class which is to be used as the "category"
     *  for this printing attribute value.
     */
    @stub
    def getCategory(): Class[_ <: Attribute] = ???
}
