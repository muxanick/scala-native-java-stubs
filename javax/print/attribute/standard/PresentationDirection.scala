package javax.print.attribute.standard

import java.lang.{Class, Object, String}
import javax.print.attribute.{Attribute, EnumSyntax, PrintJobAttribute, PrintRequestAttribute}

// Class PresentationDirection is a printing attribute class, an enumeration,
// that is used in conjunction with the NumberUp attribute to
// indicate the layout of multiple print-stream pages to impose upon a
// single side of an instance of a selected medium.
// This is useful to mirror the text layout conventions of different scripts.
// For example, English is "toright-tobottom", Hebrew is "toleft-tobottom"
//  and Japanese is usually "tobottom-toleft".
// 
// IPP Compatibility:  This attribute is not an IPP 1.1
// attribute; it is an attribute in the Production Printing Extension
// (PDF)
// of IPP 1.1.  The category name returned by
// getName() is the IPP attribute name.  The enumeration's
// integer value is the IPP enum value.  The toString() method
// returns the IPP string representation of the attribute value.
// 
final class PresentationDirection extends EnumSyntax with PrintJobAttribute, with PrintRequestAttribute {

    @stub
    // Get the printing attribute class which is to be used as the "category"
    // for this printing attribute value.
    def getCategory(): Class[_ <: Attribute] = ???

    @stub
    // Returns the enumeration value table for class PresentationDirection.
    protected def getEnumValueTable(): Array[EnumSyntax] = ???

    @stub
    // Get the name of the category of which this attribute value is an
    // instance.
    def getName(): String = ???
}

object PresentationDirection {
    @stub
    // Pages are laid out in columns starting at the top right,
    // proceeding towards the bottom & left.
    def TOBOTTOM_TOLEFT: PresentationDirection = ???

    @stub
    // Pages are laid out in columns starting at the top left,
    // proceeding towards the bottom & right.
    def TOBOTTOM_TORIGHT: PresentationDirection = ???

    @stub
    // Pages are laid out in rows starting at the top right,
    // proceeding towards the left & bottom.
    def TOLEFT_TOBOTTOM: PresentationDirection = ???

    @stub
    // Pages are laid out in rows starting at the bottom right,
    // proceeding towards the left & top.
    def TOLEFT_TOTOP: PresentationDirection = ???

    @stub
    // Pages are laid out in rows starting at the top left,
    // proceeding towards the right & bottom.
    def TORIGHT_TOBOTTOM: PresentationDirection = ???

    @stub
    // Pages are laid out in rows starting at the bottom left,
    // proceeding towards the right & top.
    def TORIGHT_TOTOP: PresentationDirection = ???

    @stub
    // Pages are laid out in columns starting at the bottom right,
    // proceeding towards the top & left.
    def TOTOP_TOLEFT: PresentationDirection = ???
}
