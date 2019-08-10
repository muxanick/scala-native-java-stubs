package java.awt

import java.lang.{Cloneable, Object, String}
import scala.scalanative.annotation.stub

/** A set of attributes which control the output of a printed page.
 *  
 *  Instances of this class control the color state, paper size (media type),
 *  orientation, logical origin, print quality, and resolution of every
 *  page which uses the instance. Attribute names are compliant with the
 *  Internet Printing Protocol (IPP) 1.1 where possible. Attribute values
 *  are partially compliant where possible.
 *  
 *  To use a method which takes an inner class type, pass a reference to
 *  one of the constant fields of the inner class. Client code cannot create
 *  new instances of the inner class types because none of those classes
 *  has a public constructor. For example, to set the color state to
 *  monochrome, use the following code:
 *  
 *  import java.awt.PageAttributes;
 * 
 *  public class MonochromeExample {
 *      public void setMonochrome(PageAttributes pageAttributes) {
 *          pageAttributes.setColor(PageAttributes.ColorType.MONOCHROME);
 *      }
 *  }
 *  
 *  
 *  Every IPP attribute which supports an attributeName-default value
 *  has a corresponding setattributeNameToDefault method.
 *  Default value fields are not provided.
 */
final class PageAttributes extends Object with Cloneable {

    /** Constructs a PageAttributes instance with default values for every
     *  attribute.
     */
    @stub
    def this() = ???

    /** Constructs a PageAttributes instance with the specified values for
     *  every attribute.
     */
    @stub
    def this(color: PageAttributes.ColorType, media: PageAttributes.MediaType, orientationRequested: PageAttributes.OrientationRequestedType, origin: PageAttributes.OriginType, printQuality: PageAttributes.PrintQualityType, printerResolution: Array[Int]) = ???

    /** Constructs a PageAttributes instance which is a copy of the supplied
     *  PageAttributes.
     */
    @stub
    def this(obj: PageAttributes) = ???

    /** Creates and returns a copy of this PageAttributes. */
    @stub
    def clone(): Any = ???

    /** Determines whether two PageAttributes are equal to each other. */
    @stub
    def equals(obj: Any): Boolean = ???

    /** Returns whether pages using these attributes will be rendered in
     *  color or monochrome.
     */
    @stub
    def getColor(): PageAttributes.ColorType = ???

    /** Returns the paper size for pages using these attributes. */
    @stub
    def getMedia(): PageAttributes.MediaType = ???

    /** Returns the print orientation for pages using these attributes. */
    @stub
    def getOrientationRequested(): PageAttributes.OrientationRequestedType = ???

    /** Returns whether drawing at (0, 0) to pages using these attributes
     *  draws at the upper-left corner of the physical page, or at the
     *  upper-left corner of the printable area.
     */
    @stub
    def getOrigin(): PageAttributes.OriginType = ???

    /** Returns the print resolution for pages using these attributes. */
    @stub
    def getPrinterResolution(): Array[Int] = ???

    /** Returns the print quality for pages using these attributes. */
    @stub
    def getPrintQuality(): PageAttributes.PrintQualityType = ???

    /** Returns a hash code value for this PageAttributes. */
    @stub
    def hashCode(): Int = ???

    /** Sets all of the attributes of this PageAttributes to the same values as
     *  the attributes of obj.
     */
    @stub
    def set(obj: PageAttributes): Unit = ???

    /** Specifies whether pages using these attributes will be rendered in
     *  color or monochrome.
     */
    @stub
    def setColor(color: PageAttributes.ColorType): Unit = ???

    /** Specifies the desired paper size for pages using these attributes. */
    @stub
    def setMedia(media: PageAttributes.MediaType): Unit = ???

    /** Sets the paper size for pages using these attributes to the default
     *  size for the default locale.
     */
    @stub
    def setMediaToDefault(): Unit = ???

    /** Specifies the print orientation for pages using these attributes. */
    @stub
    def setOrientationRequested(orientationRequested: Int): Unit = ???

    /** Specifies the print orientation for pages using these attributes. */
    @stub
    def setOrientationRequested(orientationRequested: PageAttributes.OrientationRequestedType): Unit = ???

    /** Sets the print orientation for pages using these attributes to the
     *  default.
     */
    @stub
    def setOrientationRequestedToDefault(): Unit = ???

    /** Specifies whether drawing at (0, 0) to pages using these attributes
     *  draws at the upper-left corner of the physical page, or at the
     *  upper-left corner of the printable area.
     */
    @stub
    def setOrigin(origin: PageAttributes.OriginType): Unit = ???

    /** Specifies the desired cross feed and feed print resolutions in dots per
     *  inch for pages using these attributes.
     */
    @stub
    def setPrinterResolution(printerResolution: Int): Unit = ???

    /** Specifies the desired print resolution for pages using these attributes. */
    @stub
    def setPrinterResolution(printerResolution: Array[Int]): Unit = ???

    /** Sets the printer resolution for pages using these attributes to the
     *  default.
     */
    @stub
    def setPrinterResolutionToDefault(): Unit = ???

    /** Specifies the print quality for pages using these attributes. */
    @stub
    def setPrintQuality(printQuality: Int): Unit = ???

    /** Specifies the print quality for pages using these attributes. */
    @stub
    def setPrintQuality(printQuality: PageAttributes.PrintQualityType): Unit = ???

    /** Sets the print quality for pages using these attributes to the default. */
    @stub
    def setPrintQualityToDefault(): Unit = ???

    /** Returns a string representation of this PageAttributes. */
    @stub
    def toString(): String = ???
}

object PageAttributes {
    /** A type-safe enumeration of possible color states. */
    type ColorType = PageAttributes_ColorType

    /** A type-safe enumeration of possible paper sizes. */
    type MediaType = PageAttributes_MediaType

    /** A type-safe enumeration of possible orientations. */
    type OrientationRequestedType = PageAttributes_OrientationRequestedType

    /** A type-safe enumeration of possible origins. */
    type OriginType = PageAttributes_OriginType

    /** A type-safe enumeration of possible print qualities. */
    type PrintQualityType = PageAttributes_PrintQualityType
}
