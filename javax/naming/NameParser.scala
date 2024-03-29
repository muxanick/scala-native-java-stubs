package javax.naming

import java.lang.String
import scala.scalanative.annotation.stub

/** This interface is used for parsing names from a hierarchical
 *  namespace.  The NameParser contains knowledge of the syntactic
 *  information (like left-to-right orientation, name separator, etc.)
 *  needed to parse names.
 * 
 *  The equals() method, when used to compare two NameParsers, returns
 *  true if and only if they serve the same namespace.
 */
trait NameParser {

    /** Parses a name into its components. */
    @stub
    def parse(name: String): Name = ???
}
