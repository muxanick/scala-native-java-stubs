package javax.xml.crypto

import java.lang.String
import scala.scalanative.annotation.stub

/** A representation of an XML structure from any namespace. The purpose of
 *  this interface is to group (and provide type safety for) all
 *  representations of XML structures.
 */
trait XMLStructure {

    /** Indicates whether a specified feature is supported. */
    @stub
    def isFeatureSupported(feature: String): Boolean = ???
}
