package javax.xml.bind

import java.lang.{Object, String}
import javax.xml.transform.Result
import scala.scalanative.annotation.stub

/** Controls where a JAXB implementation puts the generates
 *  schema files.
 * 
 *  
 *  An implementation of this abstract class has to be provided by the calling
 *  application to generate schemas.
 * 
 *  
 *  This is a class, not an interface so as to allow future versions to evolve
 *  without breaking the compatibility.
 */
abstract class SchemaOutputResolver extends Object {

    /**  */
    @stub
    def this() = ???

    /** Decides where the schema file (of the given namespace URI)
     *  will be written, and return it as a Result object.
     */
    def createOutput(namespaceUri: String, suggestedFileName: String): Result
}
