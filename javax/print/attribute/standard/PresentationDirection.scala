package javax.print.attribute.standard

import java.lang.{Class, Object, String}
import javax.print.attribute.{Attribute, EnumSyntax, PrintJobAttribute, PrintRequestAttribute}
import scala.scalanative.annotation.stub

/** Class PresentationDirection is a printing attribute class, an enumeration,
 *  that is used in conjunction with the NumberUp attribute to
 *  indicate the layout of multiple print-stream pages to impose upon a
 *  single side of an instance of a selected medium.
 *  This is useful to mirror the text layout conventions of different scripts.
 *  For example, English is "toright-tobottom", Hebrew is "toleft-tobottom"
 *   and Japanese is usually "tobottom-toleft".
 *  
 *  IPP Compatibility:  This attribute is not an IPP 1.1
 *  attribute; it is an attribute in the Production Printing Extension
 *  (PDF)
 *  of IPP 1.1.  The category name returned by
 *  getName() is the IPP attribute name.  The enumeration's
 *  integer value is the IPP enum value.  The toString() method
 *  returns the IPP string representation of the attribute value.
 *  
 */
final class PresentationDirection extends EnumSyntax with PrintJobAttribute with PrintRequestAttribute {

    /** Get the printing attribute class which is to be used as the "category"
     *  for this printing attribute value.
     */
    @stub
    def getCategory(): Class[_ <: Attribute] = ???

    /** Returns the enumeration value table for class PresentationDirection. */
    @stub
    protected def getEnumValueTable(): Array[EnumSyntax] = ???

    /** Get the name of the category of which this attribute value is an
     *  instance.
     */
    @stub
    def getName(): String = ???

    /** Returns the string table for class PresentationDirection. */
    @stub
    protected def getStringTable(): Array[String] = ???
}

object PresentationDirection {
    /** Pages are laid out in columns starting at the top right,
     *  proceeding towards the bottom & left.
     */
    @stub
    val TOBOTTOM_TOLEFT: PresentationDirection = ???

    /** Pages are laid out in columns starting at the top left,
     *  proceeding towards the bottom & right.
     */
    @stub
    val TOBOTTOM_TORIGHT: PresentationDirection = ???

    /** Pages are laid out in rows starting at the top right,
     *  proceeding towards the left & bottom.
     */
    @stub
    val TOLEFT_TOBOTTOM: PresentationDirection = ???

    /** Pages are laid out in rows starting at the bottom right,
     *  proceeding towards the left & top.
     */
    @stub
    val TOLEFT_TOTOP: PresentationDirection = ???

    /** Pages are laid out in rows starting at the top left,
     *  proceeding towards the right & bottom.
     */
    @stub
    val TORIGHT_TOBOTTOM: PresentationDirection = ???

    /** Pages are laid out in rows starting at the bottom left,
     *  proceeding towards the right & top.
     */
    @stub
    val TORIGHT_TOTOP: PresentationDirection = ???

    /** Pages are laid out in columns starting at the bottom right,
     *  proceeding towards the top & left.
     */
    @stub
    val TOTOP_TOLEFT: PresentationDirection = ???

    /** Pages are laid out in columns starting at the bottom left,
     *  proceeding towards the top & right.
     */
    @stub
    val TOTOP_TORIGHT: PresentationDirection = ???
}
