package javax.print.attribute.standard

import java.lang.{Class, Object}
import javax.print.attribute.{Attribute, DocAttribute, EnumSyntax, PrintJobAttribute, PrintRequestAttribute}

/** Class Media is a printing attribute class that specifies the
 *  medium on which to print.
 *  
 *  Media may be specified in different ways.
 *  
 *   it may be specified by paper source - eg paper tray
 *   it may be specified by a standard size - eg "A4"
 *   it may be specified by a name - eg "letterhead"
 *  
 *  Each of these corresponds to the IPP "media" attribute.
 *  The current API does not support describing media by characteristics
 *  (eg colour, opacity).
 *  This may be supported in a later revision of the specification.
 *  
 *  A Media object is constructed with a value which represents
 *  one of the ways in which the Media attribute can be specified.
 *  
 *  IPP Compatibility:  The category name returned by
 *  getName() is the IPP attribute name.  The enumeration's
 *  integer value is the IPP enum value.  The toString() method
 *  returns the IPP string representation of the attribute value.
 *  
 */
abstract class Media extends EnumSyntax with DocAttribute with PrintRequestAttribute with PrintJobAttribute {

    /** Returns whether this media attribute is equivalent to the passed in
     *  object.
     */
    def equals(object: Object): Boolean

    /** Get the printing attribute class which is to be used as the "category"
     *  for this printing attribute value.
     */
    def getCategory(): Class[_ <: Attribute]
}
