package java.awt

import java.lang.{Cloneable, Object}

// A set of attributes which control the output of a printed page.
// 
// Instances of this class control the color state, paper size (media type),
// orientation, logical origin, print quality, and resolution of every
// page which uses the instance. Attribute names are compliant with the
// Internet Printing Protocol (IPP) 1.1 where possible. Attribute values
// are partially compliant where possible.
// 
// To use a method which takes an inner class type, pass a reference to
// one of the constant fields of the inner class. Client code cannot create
// new instances of the inner class types because none of those classes
// has a public constructor. For example, to set the color state to
// monochrome, use the following code:
// 
// import java.awt.PageAttributes;
//
// public class MonochromeExample {
//     public void setMonochrome(PageAttributes pageAttributes) {
//         pageAttributes.setColor(PageAttributes.ColorType.MONOCHROME);
//     }
// }
// 
// 
// Every IPP attribute which supports an attributeName-default value
// has a corresponding setattributeNameToDefault method.
// Default value fields are not provided.
final class PageAttributes extends Object with Cloneable {

    @stub
    // Constructs a PageAttributes instance with default values for every
    // attribute.
    def this() = ???

    @stub
    // Constructs a PageAttributes instance with the specified values for
    // every attribute.
    def this(color: PageAttributes.ColorType, media: PageAttributes.MediaType, orientationRequested: PageAttributes.OrientationRequestedType, origin: PageAttributes.OriginType, printQuality: PageAttributes.PrintQualityType, printerResolution: Array[Int]) = ???

    @stub
    // Creates and returns a copy of this PageAttributes.
    def clone(): Object = ???

    @stub
    // Determines whether two PageAttributes are equal to each other.
    def equals(obj: Object): Boolean = ???

    @stub
    // Returns whether pages using these attributes will be rendered in
    // color or monochrome.
    def getColor(): PageAttributes.ColorType = ???

    @stub
    // Returns the paper size for pages using these attributes.
    def getMedia(): PageAttributes.MediaType = ???

    @stub
    // Returns the print orientation for pages using these attributes.
    def getOrientationRequested(): PageAttributes.OrientationRequestedType = ???

    @stub
    // Returns whether drawing at (0, 0) to pages using these attributes
    // draws at the upper-left corner of the physical page, or at the
    // upper-left corner of the printable area.
    def getOrigin(): PageAttributes.OriginType = ???

    @stub
    // Returns the print resolution for pages using these attributes.
    def getPrinterResolution(): Array[Int] = ???

    @stub
    // Returns the print quality for pages using these attributes.
    def getPrintQuality(): PageAttributes.PrintQualityType = ???

    @stub
    // Returns a hash code value for this PageAttributes.
    def hashCode(): Int = ???

    @stub
    // Sets all of the attributes of this PageAttributes to the same values as
    // the attributes of obj.
    def set(obj: PageAttributes): Unit = ???

    @stub
    // Specifies whether pages using these attributes will be rendered in
    // color or monochrome.
    def setColor(color: PageAttributes.ColorType): Unit = ???

    @stub
    // Specifies the desired paper size for pages using these attributes.
    def setMedia(media: PageAttributes.MediaType): Unit = ???

    @stub
    // Sets the paper size for pages using these attributes to the default
    // size for the default locale.
    def setMediaToDefault(): Unit = ???

    @stub
    // Specifies the print orientation for pages using these attributes.
    def setOrientationRequested(orientationRequested: Int): Unit = ???

    @stub
    // Specifies the print orientation for pages using these attributes.
    def setOrientationRequested(orientationRequested: PageAttributes.OrientationRequestedType): Unit = ???

    @stub
    // Sets the print orientation for pages using these attributes to the
    // default.
    def setOrientationRequestedToDefault(): Unit = ???

    @stub
    // Specifies whether drawing at (0, 0) to pages using these attributes
    // draws at the upper-left corner of the physical page, or at the
    // upper-left corner of the printable area.
    def setOrigin(origin: PageAttributes.OriginType): Unit = ???

    @stub
    // Specifies the desired cross feed and feed print resolutions in dots per
    // inch for pages using these attributes.
    def setPrinterResolution(printerResolution: Int): Unit = ???

    @stub
    // Specifies the desired print resolution for pages using these attributes.
    def setPrinterResolution(printerResolution: Array[Int]): Unit = ???

    @stub
    // Sets the printer resolution for pages using these attributes to the
    // default.
    def setPrinterResolutionToDefault(): Unit = ???

    @stub
    // Specifies the print quality for pages using these attributes.
    def setPrintQuality(printQuality: Int): Unit = ???

    @stub
    // Specifies the print quality for pages using these attributes.
    def setPrintQuality(printQuality: PageAttributes.PrintQualityType): Unit = ???

    @stub
    // Sets the print quality for pages using these attributes to the default.
    def setPrintQualityToDefault(): Unit = ???
}

object PageAttributes {
    @stub
    // A type-safe enumeration of possible color states.
    def PageAttributes.ColorType: class = ???

    @stub
    // A type-safe enumeration of possible paper sizes.
    def PageAttributes.MediaType: class = ???

    @stub
    // A type-safe enumeration of possible orientations.
    def PageAttributes.OrientationRequestedType: class = ???

    @stub
    // A type-safe enumeration of possible origins.
    def PageAttributes.OriginType: class = ???
}
