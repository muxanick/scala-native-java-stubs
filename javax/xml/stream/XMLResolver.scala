package javax.xml.stream

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** This interface is used to resolve resources during an XML parse.  If an application wishes to
 *  perform custom entity resolution it must register an instance of this interface with
 *  the XMLInputFactory using the setXMLResolver method.
 */
trait XMLResolver {

    /** Retrieves a resource. */
    @stub
    def resolveEntity(publicID: String, systemID: String, baseURI: String, namespace: String): Any = ???
}
