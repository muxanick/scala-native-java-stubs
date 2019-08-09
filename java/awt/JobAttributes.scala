package java.awt

import java.lang.{Cloneable, Object, String}

/** A set of attributes which control a print job.
 *  
 *  Instances of this class control the number of copies, default selection,
 *  destination, print dialog, file and printer names, page ranges, multiple
 *  document handling (including collation), and multi-page imposition (such
 *  as duplex) of every print job which uses the instance. Attribute names are
 *  compliant with the Internet Printing Protocol (IPP) 1.1 where possible.
 *  Attribute values are partially compliant where possible.
 *  
 *  To use a method which takes an inner class type, pass a reference to
 *  one of the constant fields of the inner class. Client code cannot create
 *  new instances of the inner class types because none of those classes
 *  has a public constructor. For example, to set the print dialog type to
 *  the cross-platform, pure Java print dialog, use the following code:
 *  
 *  import java.awt.JobAttributes;
 * 
 *  public class PureJavaPrintDialogExample {
 *      public void setPureJavaPrintDialog(JobAttributes jobAttributes) {
 *          jobAttributes.setDialog(JobAttributes.DialogType.COMMON);
 *      }
 *  }
 *  
 *  
 *  Every IPP attribute which supports an attributeName-default value
 *  has a corresponding setattributeNameToDefault method.
 *  Default value fields are not provided.
 */
final class JobAttributes extends Object with Cloneable {

    /** Constructs a JobAttributes instance with default
     *  values for every attribute.
     */
    @stub
    def this() = ???

    /** Constructs a JobAttributes instance with the
     *  specified values for every attribute.
     */
    @stub
    def this(copies: Int, defaultSelection: JobAttributes.DefaultSelectionType, destination: JobAttributes.DestinationType, dialog: JobAttributes.DialogType, fileName: String, maxPage: Int, minPage: Int, multipleDocumentHandling: JobAttributes.MultipleDocumentHandlingType, pageRanges: Array[Array[Int]], printer: String, sides: JobAttributes.SidesType) = ???

    /** Creates and returns a copy of this JobAttributes. */
    @stub
    def clone(): Object = ???

    /** Determines whether two JobAttributes are equal to each other. */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Returns the number of copies the application should render for jobs
     *  using these attributes.
     */
    @stub
    def getCopies(): Int = ???

    /** Specifies whether, for jobs using these attributes, the application
     *  should print all pages, the range specified by the return value of
     *  getPageRanges, or the current selection.
     */
    @stub
    def getDefaultSelection(): JobAttributes.DefaultSelectionType = ???

    /** Specifies whether output will be to a printer or a file for jobs using
     *  these attributes.
     */
    @stub
    def getDestination(): JobAttributes.DestinationType = ???

    /** Returns whether, for jobs using these attributes, the user should see
     *  a print dialog in which to modify the print settings, and which type of
     *  print dialog should be displayed.
     */
    @stub
    def getDialog(): JobAttributes.DialogType = ???

    /** Specifies the file name for the output file for jobs using these
     *  attributes.
     */
    @stub
    def getFileName(): String = ???

    /** Returns, for jobs using these attributes, the first page to be
     *  printed, if a range of pages is to be printed.
     */
    @stub
    def getFromPage(): Int = ???

    /** Specifies the maximum value the user can specify as the last page to
     *  be printed for jobs using these attributes.
     */
    @stub
    def getMaxPage(): Int = ???

    /** Specifies the minimum value the user can specify as the first page to
     *  be printed for jobs using these attributes.
     */
    @stub
    def getMinPage(): Int = ???

    /** Specifies the handling of multiple copies, including collation, for
     *  jobs using these attributes.
     */
    @stub
    def getMultipleDocumentHandling(): JobAttributes.MultipleDocumentHandlingType = ???

    /** Specifies, for jobs using these attributes, the ranges of pages to be
     *  printed, if a range of pages is to be printed.
     */
    @stub
    def getPageRanges(): Array[Array[Int]] = ???

    /** Returns the destination printer for jobs using these attributes. */
    @stub
    def getPrinter(): String = ???

    /** Returns how consecutive pages should be imposed upon the sides of the
     *  print medium for jobs using these attributes.
     */
    @stub
    def getSides(): JobAttributes.SidesType = ???

    /** Returns, for jobs using these attributes, the last page (inclusive)
     *  to be printed, if a range of pages is to be printed.
     */
    @stub
    def getToPage(): Int = ???

    /** Returns a hash code value for this JobAttributes. */
    @stub
    def hashCode(): Int = ???

    /** Sets all of the attributes of this JobAttributes to
     *  the same values as the attributes of obj.
     */
    @stub
    def set(obj: JobAttributes): Unit = ???

    /** Specifies the number of copies the application should render for jobs
     *  using these attributes.
     */
    @stub
    def setCopies(copies: Int): Unit = ???

    /** Sets the number of copies the application should render for jobs using
     *  these attributes to the default.
     */
    @stub
    def setCopiesToDefault(): Unit = ???

    /** Specifies whether, for jobs using these attributes, the application
     *  should print all pages, the range specified by the return value of
     *  getPageRanges, or the current selection.
     */
    @stub
    def setDefaultSelection(defaultSelection: JobAttributes.DefaultSelectionType): Unit = ???

    /** Specifies whether output will be to a printer or a file for jobs using
     *  these attributes.
     */
    @stub
    def setDestination(destination: JobAttributes.DestinationType): Unit = ???

    /** Specifies whether, for jobs using these attributes, the user should see
     *  a print dialog in which to modify the print settings, and which type of
     *  print dialog should be displayed.
     */
    @stub
    def setDialog(dialog: JobAttributes.DialogType): Unit = ???

    /** Specifies the file name for the output file for jobs using these
     *  attributes.
     */
    @stub
    def setFileName(fileName: String): Unit = ???

    /** Specifies, for jobs using these attributes, the first page to be
     *  printed, if a range of pages is to be printed.
     */
    @stub
    def setFromPage(fromPage: Int): Unit = ???

    /** Specifies the maximum value the user can specify as the last page to
     *  be printed for jobs using these attributes.
     */
    @stub
    def setMaxPage(maxPage: Int): Unit = ???

    /** Specifies the minimum value the user can specify as the first page to
     *  be printed for jobs using these attributes.
     */
    @stub
    def setMinPage(minPage: Int): Unit = ???

    /** Specifies the handling of multiple copies, including collation, for
     *  jobs using these attributes.
     */
    @stub
    def setMultipleDocumentHandling(multipleDocumentHandling: JobAttributes.MultipleDocumentHandlingType): Unit = ???

    /** Sets the handling of multiple copies, including collation, for jobs
     *  using these attributes to the default.
     */
    @stub
    def setMultipleDocumentHandlingToDefault(): Unit = ???

    /** Specifies, for jobs using these attributes, the ranges of pages to be
     *  printed, if a range of pages is to be printed.
     */
    @stub
    def setPageRanges(pageRanges: Array[Array[Int]]): Unit = ???

    /** Specifies the destination printer for jobs using these attributes. */
    @stub
    def setPrinter(printer: String): Unit = ???

    /** Specifies how consecutive pages should be imposed upon the sides of the
     *  print medium for jobs using these attributes.
     */
    @stub
    def setSides(sides: JobAttributes.SidesType): Unit = ???

    /** Sets how consecutive pages should be imposed upon the sides of the
     *  print medium for jobs using these attributes to the default.
     */
    @stub
    def setSidesToDefault(): Unit = ???

    /** Specifies, for jobs using these attributes, the last page (inclusive)
     *  to be printed, if a range of pages is to be printed.
     */
    @stub
    def setToPage(toPage: Int): Unit = ???
}

object JobAttributes {
    /** A type-safe enumeration of possible default selection states. */
    @stub
    object DefaultSelectionType extends JobAttributes.DefaultSelectionType

    /** A type-safe enumeration of possible job destinations. */
    @stub
    object DestinationType extends JobAttributes.DestinationType

    /** A type-safe enumeration of possible dialogs to display to the user. */
    @stub
    object DialogType extends JobAttributes.DialogType

    /** A type-safe enumeration of possible multiple copy handling states. */
    @stub
    object MultipleDocumentHandlingType extends JobAttributes.MultipleDocumentHandlingType
}
