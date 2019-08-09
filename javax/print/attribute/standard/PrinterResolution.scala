package javax.print.attribute.standard

import java.lang.{Class, Object}
import javax.print.attribute.{Attribute, DocAttribute, PrintJobAttribute, PrintRequestAttribute, ResolutionSyntax}

/** Class PrinterResolution is a printing attribute class that specifies an
 *  exact resolution supported by a printer or to be used for a print job.
 *  This attribute assumes that printers have a small set of device resolutions
 *  at which they can operate rather than a continuum.
 *  
 *  PrinterResolution is used in multiple ways:
 *  
 *  
 *  When a client searches looking for a printer that supports the client's
 *  desired resolution exactly (no more, no less), the client specifies
 *  an instance of class PrinterResolution indicating the exact resolution the
 *  client wants. Only printers supporting that exact resolution will match the
 *  search.
 *  
 *  
 *  When a client needs to print a job using the client's desired resolution
 *  exactly (no more, no less), the client specifies an instance of class
 *  PrinterResolution as an attribute of the Print Job. This will fail if the
 *  Print Job doesn't support that exact resolution, and Fidelity is set to
 *  true.
 *  
 *  If a client wants to locate a printer supporting a resolution
 *  greater than some required minimum, then it may be necessary to exclude
 *  this attribute from a lookup request and to directly query the set of
 *  supported resolutions, and specify the one that most closely meets
 *  the client's requirements.
 *  In some cases this may be more simply achieved by specifying a
 *  PrintQuality attribute which often controls resolution.
 *  
 *  
 *  IPP Compatibility: The information needed to construct an IPP
 *  "printer-resolution" attribute can be obtained by calling
 *  methods on the PrinterResolution object. The category name returned by
 *  getName() gives the IPP attribute name.
 *  
 */
final class PrinterResolution extends ResolutionSyntax with DocAttribute with PrintRequestAttribute with PrintJobAttribute {

    /** Returns whether this printer resolution attribute is equivalent to the
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
