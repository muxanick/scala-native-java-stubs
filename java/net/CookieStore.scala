package java.net

import java.util.List

/** A CookieStore object represents a storage for cookie. Can store and retrieve
 *  cookies.
 * 
 *  CookieManager will call CookieStore.add to save cookies
 *  for every incoming HTTP response, and call CookieStore.get to
 *  retrieve cookie for every outgoing HTTP request. A CookieStore
 *  is responsible for removing HttpCookie instances which have expired.
 */
trait CookieStore {

    /** Adds one HTTP cookie to the store. */
    @stub
    def add(uri: URI, cookie: HttpCookie): Unit = ???

    /** Retrieve cookies associated with given URI, or whose domain matches the
     *  given URI.
     */
    @stub
    def get(uri: URI): List[HttpCookie] = ???

    /** Get all not-expired cookies in cookie store. */
    @stub
    def getCookies(): List[HttpCookie] = ???

    /** Get all URIs which identify the cookies in this cookie store. */
    @stub
    def getURIs(): List[URI] = ???

    /** Remove a cookie from store. */
    @stub
    def remove(uri: URI, cookie: HttpCookie): Boolean = ???
}
