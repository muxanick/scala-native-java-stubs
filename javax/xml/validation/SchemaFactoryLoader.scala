package javax.xml.validation

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** Factory that creates SchemaFactory.
 * 
 *  DO NOT USE THIS CLASS
 * 
 *  
 *  This class was introduced as a part of an early proposal during the
 *  JSR-206 standardization process. The proposal was eventually abandoned
 *  but this class accidentally remained in the source tree, and made its
 *  way into the final version.
 *  
 *  This class does not participate in any JAXP 1.3 or JAXP 1.4 processing.
 *  It must not be used by users or JAXP implementations.
 *  
 */
abstract class SchemaFactoryLoader extends Object {

    /** A do-nothing constructor. */
    @stub
    protected def this() = ???

    /** Creates a new SchemaFactory object for the specified
     *  schema language.
     */
    def newFactory(schemaLanguage: String): SchemaFactory
}
