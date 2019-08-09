package javax.xml.transform

import java.lang.String
import scala.scalanative.annotation.stub

/** An object that implements this interface that can be called by the processor
 *  to turn a URI used in document(), xsl:import, or xsl:include into a Source object.
 */
trait URIResolver {

    /** Called by the processor when it encounters
     *  an xsl:include, xsl:import, or document() function.
     */
    @stub
    def resolve(href: String, base: String): Source = ???
}
