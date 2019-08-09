package javax.print.attribute.standard

import java.lang.{Class, Object}
import javax.print.attribute.{Attribute, IntegerSyntax, PrintJobAttribute, PrintRequestAttribute}

/** Class JobKOctets is an integer valued printing attribute class that specifies
 *  the total size of the document(s) in K octets, i.e., in units of 1024 octets
 *  requested to be processed in the job. The value must be rounded up, so that a
 *  job between 1 and 1024 octets must be indicated as being 1K octets, 1025 to
 *  2048 must be 2K octets, etc. For a multidoc print job (a job with multiple
 *  documents), the JobKOctets value is computed by adding up the individual
 *  documents' sizes in octets, then rounding up to the next K octets value.
 *  
 *  The JobKOctets attribute describes the size of the job. This attribute is not
 *  intended to be a counter; it is intended to be useful routing and scheduling
 *  information if known. The printer may try to compute the JobKOctets
 *  attribute's value if it is not supplied in the Print Request. Even if the
 *  client does supply a value for the JobKOctets attribute in the Print Request,
 *  the printer may choose to change the value if the printer is able to compute
 *  a value which is more accurate than the client supplied value. The printer
 *  may be able to determine the correct value for the JobKOctets attribute
 *  either right at job submission time or at any later point in time.
 *  
 *  The JobKOctets value must not include the multiplicative factors contributed
 *  by the number of copies specified by the Copies attribute,
 *  independent of whether the device can process multiple copies without making
 *  multiple passes over the job or document data and independent of whether the
 *  output is collated or not. Thus the value is independent of the
 *  implementation and indicates the size of the document(s) measured in K octets
 *  independent of the number of copies.
 *  
 *  The JobKOctets value must also not include the multiplicative factor due to a
 *  copies instruction embedded in the document data. If the document data
 *  actually includes replications of the document data, this value will include
 *  such replication. In other words, this value is always the size of the source
 *  document data, rather than a measure of the hardcopy output to be produced.
 *  
 *  The size of a doc is computed based on the print data representation class as
 *  specified by the doc's DocFlavor, as
 *  shown in the table below.
 *  
 *  
 *  
 *  Representation Class
 *  Document Size
 *  
 *  
 *  byte[]
 *  Length of the byte array
 *  
 *  
 *  java.io.InputStream
 *  Number of bytes read from the stream
 *  
 *  
 *  char[]
 *  Length of the character array x 2
 *  
 *  
 *  java.lang.String
 *  Length of the string x 2
 *  
 *  
 *  java.io.Reader
 *  Number of characters read from the stream x 2
 *  
 *  
 *  java.net.URL
 *  Number of bytes read from the file at the given URL address
 *  
 *  
 *  java.awt.image.renderable.RenderableImage
 *  Implementation dependent*
 *  
 *  
 *  java.awt.print.Printable
 *  Implementation dependent*
 *  
 *  
 *  java.awt.print.Pageable
 *  Implementation dependent*
 *  
 *  
 *  
 *  * In these cases the Print Service itself generates the print data sent
 *  to the printer. If the Print Service supports the JobKOctets attribute, for
 *  these cases the Print Service itself must calculate the size of the print
 *  data, replacing any JobKOctets value the client specified.
 *  
 *  IPP Compatibility: The integer value gives the IPP integer value. The
 *  category name returned by getName() gives the IPP attribute
 *  name.
 *  
 */
final class JobKOctets extends IntegerSyntax with PrintRequestAttribute with PrintJobAttribute {

    /** Returns whether this job K octets attribute is equivalent to the passed
     *  in object.
     */
    @stub
    def equals(object: Object): Boolean = ???

    /** Get the printing attribute class which is to be used as the "category"
     *  for this printing attribute value.
     */
    @stub
    def getCategory(): Class[_ <: Attribute] = ???
}
