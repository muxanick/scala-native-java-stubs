package javax.print

import java.lang.Class

// Interface AttributeException is a mixin interface which a subclass of
// PrintException can implement to report an error condition
// involving one or more printing attributes that a particular Print
// Service instance does not support. Either the attribute is not supported at
// all, or the attribute is supported but the particular specified value is not
// supported. The Print Service API does not define any print exception
// classes that implement interface AttributeException, that being left to the
// Print Service implementor's discretion.
trait AttributeException {

    @stub
    // Returns the array of printing attribute classes for which the Print
    // Service instance does not support the attribute at all, or null if
    // there are no such attributes.
    def getUnsupportedAttributes(): Array[Class] = ???
}
