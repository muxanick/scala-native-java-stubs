package javax.print.attribute.standard

import java.lang.{Class, Object, String}
import javax.print.attribute.{EnumSyntax, PrintRequestAttribute}

// Class DialogTypeSelection is a printing attribute class, an enumeration,
// that indicates the user dialog type to be used for specifying
// printing options.
// If NATIVE is specified, then where available, a native
// platform dialog is displayed.
// If COMMON is specified, a cross-platform print dialog is displayed.
//
// This option to specify a native dialog for use with an IPP attribute
// set provides a standard way to reflect back of the setting and option
// changes made by a user to the calling application, and integrates
// the native dialog into the Java printing APIs.
// But note that some options and settings in a native dialog may not
// necessarily map to IPP attributes as they may be non-standard platform,
// or even printer specific options.
// 
// IPP Compatibility: This is not an IPP attribute.
// 
final class DialogTypeSelection extends EnumSyntax with PrintRequestAttribute {

    @stub
    // Get the printing attribute class which is to be used as the "category"
    // for this printing attribute value.
    def getCategory(): Class = ???

    @stub
    // Returns the enumeration value table for class DialogTypeSelection.
    protected def getEnumValueTable(): Array[EnumSyntax] = ???

    @stub
    // Get the name of the category of which this attribute value is an
    // instance.
    def getName(): String = ???
}

object DialogTypeSelection {
    @stub
    // 
    def COMMON: DialogTypeSelection = ???
}
