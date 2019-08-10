package java.awt

import java.lang.{Cloneable, Object, String}
import scala.scalanative.annotation.stub

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

    /** Constructs a JobAttributes instance which is a copy
     *  of the supplied JobAttributes.
     */
    @stub
    def this(obj: JobAttributes) = ???

    /** Creates and returns a copy of this JobAttributes. */
    @stub
    def clone(): Any = ???

    /** Determines whether two JobAttributes are equal to each other. */
    @stub
    def equals(obj: Any): Boolean = ???

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

    /** Returns a string representation of this JobAttributes. */
    @stub
    def toString(): String = ???
}

object JobAttributes {
    /** A type-safe enumeration of possible default selection states. */
    final object DefaultSelectionType extends Object {

        /** The DefaultSelectionType instance to use for
         *  specifying that all pages of the job should be printed.
         */
        @stub
        val ALL: DefaultSelectionType = ???

        /** The DefaultSelectionType instance to use for
         *  specifying that a range of pages of the job should be printed.
         */
        @stub
        val RANGE: DefaultSelectionType = ???

        /** The DefaultSelectionType instance to use for
         *  specifying that the current selection should be printed.
         */
        @stub
        val SELECTION: DefaultSelectionType = ???

        /** Returns a hash code value for the object. */
        @stub
        def hashCode(): Int = ???

        /** Returns a string representation of the object. */
        @stub
        def toString(): String = ???
    }


    /** A type-safe enumeration of possible job destinations. */
    final object DestinationType extends Object {

        /** The DestinationType instance to use for
         *  specifying print to file.
         */
        @stub
        val FILE: DestinationType = ???

        /** The DestinationType instance to use for
         *  specifying print to printer.
         */
        @stub
        val PRINTER: DestinationType = ???

        /** Returns a hash code value for the object. */
        @stub
        def hashCode(): Int = ???

        /** Returns a string representation of the object. */
        @stub
        def toString(): String = ???
    }


    /** A type-safe enumeration of possible dialogs to display to the user. */
    final object DialogType extends Object {

        /** The DialogType instance to use for
         *  specifying the cross-platform, pure Java print dialog.
         */
        @stub
        val COMMON: DialogType = ???

        /** The DialogType instance to use for
         *  specifying the platform's native print dialog.
         */
        @stub
        val NATIVE: DialogType = ???

        /** The DialogType instance to use for
         *  specifying no print dialog.
         */
        @stub
        val NONE: DialogType = ???

        /** Returns a hash code value for the object. */
        @stub
        def hashCode(): Int = ???

        /** Returns a string representation of the object. */
        @stub
        def toString(): String = ???
    }


    /** A type-safe enumeration of possible multiple copy handling states.
     *  It is used to control how the sheets of multiple copies of a single
     *  document are collated.
     */
    final object MultipleDocumentHandlingType extends Object {

        /** The MultipleDocumentHandlingType instance to use for specifying
         *  that the job should be divided into separate, collated copies.
         */
        @stub
        val SEPARATE_DOCUMENTS_COLLATED_COPIES: MultipleDocumentHandlingType = ???

        /** The MultipleDocumentHandlingType instance to use for specifying
         *  that the job should be divided into separate, uncollated copies.
         */
        @stub
        val SEPARATE_DOCUMENTS_UNCOLLATED_COPIES: MultipleDocumentHandlingType = ???

        /** Returns a hash code value for the object. */
        @stub
        def hashCode(): Int = ???

        /** Returns a string representation of the object. */
        @stub
        def toString(): String = ???
    }


    /** A type-safe enumeration of possible multi-page impositions. These
     *  impositions are in compliance with IPP 1.1.
     */
    final object SidesType extends Object {

        /** The SidesType instance to use for specifying that
         *  consecutive job pages should be printed upon the same side of
         *  consecutive media sheets.
         */
        @stub
        val ONE_SIDED: SidesType = ???

        /** The SidesType instance to use for specifying that
         *  consecutive job pages should be printed upon front and back sides
         *  of consecutive media sheets, such that the orientation of each pair
         *  of pages on the medium would be correct for the reader as if for
         *  binding on the long edge.
         */
        @stub
        val TWO_SIDED_LONG_EDGE: SidesType = ???

        /** The SidesType instance to use for specifying that
         *  consecutive job pages should be printed upon front and back sides
         *  of consecutive media sheets, such that the orientation of each pair
         *  of pages on the medium would be correct for the reader as if for
         *  binding on the short edge.
         */
        @stub
        val TWO_SIDED_SHORT_EDGE: SidesType = ???

        /** Returns a hash code value for the object. */
        @stub
        def hashCode(): Int = ???

        /** Returns a string representation of the object. */
        @stub
        def toString(): String = ???
    }

}
