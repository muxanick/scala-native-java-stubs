package java.awt

import java.lang.{Cloneable, Object, String}

// A set of attributes which control a print job.
// 
// Instances of this class control the number of copies, default selection,
// destination, print dialog, file and printer names, page ranges, multiple
// document handling (including collation), and multi-page imposition (such
// as duplex) of every print job which uses the instance. Attribute names are
// compliant with the Internet Printing Protocol (IPP) 1.1 where possible.
// Attribute values are partially compliant where possible.
// 
// To use a method which takes an inner class type, pass a reference to
// one of the constant fields of the inner class. Client code cannot create
// new instances of the inner class types because none of those classes
// has a public constructor. For example, to set the print dialog type to
// the cross-platform, pure Java print dialog, use the following code:
// 
// import java.awt.JobAttributes;
//
// public class PureJavaPrintDialogExample {
//     public void setPureJavaPrintDialog(JobAttributes jobAttributes) {
//         jobAttributes.setDialog(JobAttributes.DialogType.COMMON);
//     }
// }
// 
// 
// Every IPP attribute which supports an attributeName-default value
// has a corresponding setattributeNameToDefault method.
// Default value fields are not provided.
final class JobAttributes extends Object with Cloneable {

    @stub
    // Constructs a JobAttributes instance with default
    // values for every attribute.
    def this() = ???

    @stub
    // Constructs a JobAttributes instance with the
    // specified values for every attribute.
    def this(copies: Int, defaultSelection: JobAttributes.DefaultSelectionType, destination: JobAttributes.DestinationType, dialog: JobAttributes.DialogType, fileName: String, maxPage: Int, minPage: Int, multipleDocumentHandling: JobAttributes.MultipleDocumentHandlingType, pageRanges: Array[Array[Int]], printer: String, sides: JobAttributes.SidesType) = ???

    @stub
    // Creates and returns a copy of this JobAttributes.
    def clone(): Object = ???

    @stub
    // Determines whether two JobAttributes are equal to each other.
    def equals(obj: Object): Boolean = ???

    @stub
    // Returns the number of copies the application should render for jobs
    // using these attributes.
    def getCopies(): Int = ???

    @stub
    // Specifies whether, for jobs using these attributes, the application
    // should print all pages, the range specified by the return value of
    // getPageRanges, or the current selection.
    def getDefaultSelection(): JobAttributes.DefaultSelectionType = ???

    @stub
    // Specifies whether output will be to a printer or a file for jobs using
    // these attributes.
    def getDestination(): JobAttributes.DestinationType = ???

    @stub
    // Returns whether, for jobs using these attributes, the user should see
    // a print dialog in which to modify the print settings, and which type of
    // print dialog should be displayed.
    def getDialog(): JobAttributes.DialogType = ???

    @stub
    // Specifies the file name for the output file for jobs using these
    // attributes.
    def getFileName(): String = ???

    @stub
    // Returns, for jobs using these attributes, the first page to be
    // printed, if a range of pages is to be printed.
    def getFromPage(): Int = ???

    @stub
    // Specifies the maximum value the user can specify as the last page to
    // be printed for jobs using these attributes.
    def getMaxPage(): Int = ???

    @stub
    // Specifies the minimum value the user can specify as the first page to
    // be printed for jobs using these attributes.
    def getMinPage(): Int = ???

    @stub
    // Specifies the handling of multiple copies, including collation, for
    // jobs using these attributes.
    def getMultipleDocumentHandling(): JobAttributes.MultipleDocumentHandlingType = ???

    @stub
    // Specifies, for jobs using these attributes, the ranges of pages to be
    // printed, if a range of pages is to be printed.
    def getPageRanges(): Array[Array[Int]] = ???

    @stub
    // Returns the destination printer for jobs using these attributes.
    def getPrinter(): String = ???

    @stub
    // Returns how consecutive pages should be imposed upon the sides of the
    // print medium for jobs using these attributes.
    def getSides(): JobAttributes.SidesType = ???

    @stub
    // Returns, for jobs using these attributes, the last page (inclusive)
    // to be printed, if a range of pages is to be printed.
    def getToPage(): Int = ???

    @stub
    // Returns a hash code value for this JobAttributes.
    def hashCode(): Int = ???

    @stub
    // Sets all of the attributes of this JobAttributes to
    // the same values as the attributes of obj.
    def set(obj: JobAttributes): Unit = ???

    @stub
    // Specifies the number of copies the application should render for jobs
    // using these attributes.
    def setCopies(copies: Int): Unit = ???

    @stub
    // Sets the number of copies the application should render for jobs using
    // these attributes to the default.
    def setCopiesToDefault(): Unit = ???

    @stub
    // Specifies whether, for jobs using these attributes, the application
    // should print all pages, the range specified by the return value of
    // getPageRanges, or the current selection.
    def setDefaultSelection(defaultSelection: JobAttributes.DefaultSelectionType): Unit = ???

    @stub
    // Specifies whether output will be to a printer or a file for jobs using
    // these attributes.
    def setDestination(destination: JobAttributes.DestinationType): Unit = ???

    @stub
    // Specifies whether, for jobs using these attributes, the user should see
    // a print dialog in which to modify the print settings, and which type of
    // print dialog should be displayed.
    def setDialog(dialog: JobAttributes.DialogType): Unit = ???

    @stub
    // Specifies the file name for the output file for jobs using these
    // attributes.
    def setFileName(fileName: String): Unit = ???

    @stub
    // Specifies, for jobs using these attributes, the first page to be
    // printed, if a range of pages is to be printed.
    def setFromPage(fromPage: Int): Unit = ???

    @stub
    // Specifies the maximum value the user can specify as the last page to
    // be printed for jobs using these attributes.
    def setMaxPage(maxPage: Int): Unit = ???

    @stub
    // Specifies the minimum value the user can specify as the first page to
    // be printed for jobs using these attributes.
    def setMinPage(minPage: Int): Unit = ???

    @stub
    // Specifies the handling of multiple copies, including collation, for
    // jobs using these attributes.
    def setMultipleDocumentHandling(multipleDocumentHandling: JobAttributes.MultipleDocumentHandlingType): Unit = ???

    @stub
    // Sets the handling of multiple copies, including collation, for jobs
    // using these attributes to the default.
    def setMultipleDocumentHandlingToDefault(): Unit = ???

    @stub
    // Specifies, for jobs using these attributes, the ranges of pages to be
    // printed, if a range of pages is to be printed.
    def setPageRanges(pageRanges: Array[Array[Int]]): Unit = ???

    @stub
    // Specifies the destination printer for jobs using these attributes.
    def setPrinter(printer: String): Unit = ???

    @stub
    // Specifies how consecutive pages should be imposed upon the sides of the
    // print medium for jobs using these attributes.
    def setSides(sides: JobAttributes.SidesType): Unit = ???

    @stub
    // Sets how consecutive pages should be imposed upon the sides of the
    // print medium for jobs using these attributes to the default.
    def setSidesToDefault(): Unit = ???

    @stub
    // Specifies, for jobs using these attributes, the last page (inclusive)
    // to be printed, if a range of pages is to be printed.
    def setToPage(toPage: Int): Unit = ???
}

object JobAttributes {
    @stub
    // A type-safe enumeration of possible default selection states.
    def JobAttributes.DefaultSelectionType: class = ???

    @stub
    // A type-safe enumeration of possible job destinations.
    def JobAttributes.DestinationType: class = ???

    @stub
    // A type-safe enumeration of possible dialogs to display to the user.
    def JobAttributes.DialogType: class = ???

    @stub
    // A type-safe enumeration of possible multiple copy handling states.
    def JobAttributes.MultipleDocumentHandlingType: class = ???
}
