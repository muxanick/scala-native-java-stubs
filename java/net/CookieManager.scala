package java.net

import java.lang.{Object, String}
import java.util.{List, Map}
import scala.scalanative.annotation.stub

/** CookieManager provides a concrete implementation of CookieHandler,
 *  which separates the storage of cookies from the policy surrounding accepting
 *  and rejecting cookies. A CookieManager is initialized with a CookieStore
 *  which manages storage, and a CookiePolicy object, which makes
 *  policy decisions on cookie acceptance/rejection.
 * 
 *   The HTTP cookie management in java.net package looks like:
 *  
 *  
 *                   use
 *  CookieHandler <------- HttpURLConnection
 *        ^
 *        | impl
 *        |         use
 *  CookieManager -------> CookiePolicy
 *              |   use
 *              |--------> HttpCookie
 *              |              ^
 *              |              | use
 *              |   use        |
 *              |--------> CookieStore
 *                             ^
 *                             | impl
 *                             |
 *                   Internal in-memory implementation
 *  
 *  
 *    
 *      CookieHandler is at the core of cookie management. User can call
 *      CookieHandler.setDefault to set a concrete CookieHanlder implementation
 *      to be used.
 *    
 *    
 *      CookiePolicy.shouldAccept will be called by CookieManager.put to see whether
 *      or not one cookie should be accepted and put into cookie store. User can use
 *      any of three pre-defined CookiePolicy, namely ACCEPT_ALL, ACCEPT_NONE and
 *      ACCEPT_ORIGINAL_SERVER, or user can define his own CookiePolicy implementation
 *      and tell CookieManager to use it.
 *    
 *    
 *      CookieStore is the place where any accepted HTTP cookie is stored in.
 *      If not specified when created, a CookieManager instance will use an internal
 *      in-memory implementation. Or user can implements one and tell CookieManager
 *      to use it.
 *    
 *    
 *      Currently, only CookieStore.add(URI, HttpCookie) and CookieStore.get(URI)
 *      are used by CookieManager. Others are for completeness and might be needed
 *      by a more sophisticated CookieStore implementation, e.g. a NetscapeCookieSotre.
 *    
 *  
 *  
 * 
 *  There're various ways user can hook up his own HTTP cookie management behavior, e.g.
 *  
 *  
 *    Use CookieHandler.setDefault to set a brand new CookieHandler implementation
 *    Let CookieManager be the default CookieHandler implementation,
 *        but implement user's own CookieStore and CookiePolicy
 *        and tell default CookieManager to use them:
 *      
 *        // this should be done at the beginning of an HTTP session
 *        CookieHandler.setDefault(new CookieManager(new MyCookieStore(), new MyCookiePolicy()));
 *      
 *    Let CookieManager be the default CookieHandler implementation, but
 *        use customized CookiePolicy:
 *      
 *        // this should be done at the beginning of an HTTP session
 *        CookieHandler.setDefault(new CookieManager());
 *        // this can be done at any point of an HTTP session
 *        ((CookieManager)CookieHandler.getDefault()).setCookiePolicy(new MyCookiePolicy());
 *      
 *  
 *  
 * 
 *  The implementation conforms to RFC 2965, section 3.3.
 */
class CookieManager extends CookieHandler {

    /** Create a new cookie manager. */
    @stub
    def this() = ???

    /** Create a new cookie manager with specified cookie store and cookie policy. */
    @stub
    def this(store: CookieStore, cookiePolicy: CookiePolicy) = ???

    /** Gets all the applicable cookies from a cookie cache for the
     *  specified uri in the request header.
     */
    @stub
    def get(uri: URI, requestHeaders: Map[String, List[String]]): Map[String, List[String]] = ???

    /** To retrieve current cookie store. */
    @stub
    def getCookieStore(): CookieStore = ???

    /** Sets all the applicable cookies, examples are response header
     *  fields that are named Set-Cookie2, present in the response
     *  headers into a cookie cache.
     */
    @stub
    def put(uri: URI, responseHeaders: Map[String, List[String]]): Unit = ???

    /** To set the cookie policy of this cookie manager. */
    @stub
    def setCookiePolicy(cookiePolicy: CookiePolicy): Unit = ???
}
