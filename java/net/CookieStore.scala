package java.net

import java.util.List

// A CookieStore object represents a storage for cookie. Can store and retrieve
// cookies.
//
// CookieManager will call CookieStore.add to save cookies
// for every incoming HTTP response, and call CookieStore.get to
// retrieve cookie for every outgoing HTTP request. A CookieStore
// is responsible for removing HttpCookie instances which have expired.
trait CookieStore {

    @stub
    // Adds one HTTP cookie to the store.
    def add(uri: URI, cookie: HttpCookie): Unit = ???

    @stub
    // Retrieve cookies associated with given URI, or whose domain matches the
    // given URI.
    def get(uri: URI): List[HttpCookie] = ???

    @stub
    // Get all not-expired cookies in cookie store.
    def getCookies(): List[HttpCookie] = ???

    @stub
    // Get all URIs which identify the cookies in this cookie store.
    def getURIs(): List[URI] = ???

    @stub
    // Remove a cookie from store.
    def remove(uri: URI, cookie: HttpCookie): Boolean = ???
}
