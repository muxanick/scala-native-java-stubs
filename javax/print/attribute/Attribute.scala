package javax.print.attribute

import java.io.Serializable
import java.lang.Class

// Interface Attribute is the base interface implemented by any and every
// printing attribute class to indicate that the class represents a
// printing attribute. All printing attributes are serializable.
// 
trait Attribute extends Serializable {

    @stub
    // Get the printing attribute class which is to be used as the "category"
    // for this printing attribute value when it is added to an attribute set.
    def getCategory(): Class[_ <: Attribute] = ???
}
