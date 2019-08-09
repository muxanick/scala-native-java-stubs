package javax.print.attribute.standard

import java.lang.{Class, Object, String}
import javax.print.attribute.{Attribute, EnumSyntax, PrintJobAttribute, PrintRequestAttribute}

/** Class JobSheets is a printing attribute class, an enumeration, that
 *  determines which job start and end sheets, if any, must be printed with a
 *  job. Class JobSheets declares keywords for standard job sheets values.
 *  Implementation- or site-defined names for a job sheets attribute may also be
 *  created by defining a subclass of class JobSheets.
 *  
 *  The effect of a JobSheets attribute on multidoc print jobs (jobs with
 *  multiple documents) may be affected by the MultipleDocumentHandling job attribute, depending on the meaning of the
 *  particular JobSheets value.
 *  
 *  IPP Compatibility:  The category name returned by
 *  getName() is the IPP attribute name.  The
 *  enumeration's integer value is the IPP enum value.  The
 *  toString() method returns the IPP string representation of
 *  the attribute value. For a subclass, the attribute value must be
 *  localized to give the IPP name and natural language values.
 *  
 */
class JobSheets extends EnumSyntax with PrintRequestAttribute with PrintJobAttribute {

    /** Get the printing attribute class which is to be used as the "category"
     *  for this printing attribute value.
     */
    @stub
    def getCategory(): Class[_ <: Attribute] = ???

    /** Returns the enumeration value table for class JobSheets. */
    @stub
    protected def getEnumValueTable(): Array[EnumSyntax] = ???

    /** Get the name of the category of which this attribute value is an
     *  instance.
     */
    @stub
    def getName(): String = ???
}

object JobSheets {
    /** No job sheets are printed. */
    @stub
    val NONE: JobSheets = ???
}
