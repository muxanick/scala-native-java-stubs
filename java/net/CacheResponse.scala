package java.net

import java.io.InputStream
import java.lang.{Object, String}
import java.util.{List, Map}
import scala.scalanative.annotation.stub

/** Represent channels for retrieving resources from the
 *  ResponseCache. Instances of such a class provide an
 *  InputStream that returns the entity body, and also a
 *  getHeaders() method which returns the associated response headers.
 */
abstract class CacheResponse extends Object {

    /**  */
    @stub
    def this() = ???

    /** Returns the response body as an InputStream. */
    def getBody(): InputStream

    /** Returns the response headers as a Map. */
    def getHeaders(): Map[String, List[String]]
}
