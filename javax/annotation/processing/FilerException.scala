package javax.annotation.processing

import java.io.IOException
import java.lang.{Exception, Object, Throwable}

// Indicates a Filer detected an attempt to open a file that
// would violate the guarantees provided by the Filer.  Those
// guarantees include not creating the same file more than once, not
// creating multiple files corresponding to the same type, and not
// creating files for types with invalid names.
class FilerException extends IOException {
}
