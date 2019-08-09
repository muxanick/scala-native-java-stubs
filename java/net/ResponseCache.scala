package java.net

import java.lang.{Object, String}
import java.util.{List, Map}
import scala.scalanative.annotation.stub

/** Represents implementations of URLConnection caches. An instance of
 *  such a class can be registered with the system by doing
 *  ResponseCache.setDefault(ResponseCache), and the system will call
 *  this object in order to:
 * 
 *     store resource data which has been retrieved from an
 *             external source into the cache
 *          try to fetch a requested resource that may have been
 *             stored in the cache
 *     
 * 
 *  The ResponseCache implementation decides which resources
 *  should be cached, and for how long they should be cached. If a
 *  request resource cannot be retrieved from the cache, then the
 *  protocol handlers will fetch the resource from its original
 *  location.
 * 
 *  The settings for URLConnection#useCaches controls whether the
 *  protocol is allowed to use a cached response.
 * 
 *  For more information on HTTP caching, see RFC 2616: Hypertext
 *  Transfer Protocol -- HTTP/1.1
 */
abstract class ResponseCache extends Object {

    /**  */
    @stub
    def this() = ???

    /** Retrieve the cached response based on the requesting uri,
     *  request method and request headers.
     */
    def get(uri: URI, rqstMethod: String, rqstHeaders: Map[String, List[String]]): CacheResponse

    /** The protocol handler calls this method after a resource has
     *  been retrieved, and the ResponseCache must decide whether or
     *  not to store the resource in its cache.
     */
    def put(uri: URI, conn: URLConnection): CacheRequest
}

object ResponseCache {
    /** Gets the system-wide response cache. */
    @stub
    def getDefault(): ResponseCache = ???

    /** Sets (or unsets) the system-wide cache. */
    @stub
    def setDefault(responseCache: ResponseCache): Unit = ???
}
