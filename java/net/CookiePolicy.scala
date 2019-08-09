package java.net

// CookiePolicy implementations decide which cookies should be accepted
// and which should be rejected. Three pre-defined policy implementations
// are provided, namely ACCEPT_ALL, ACCEPT_NONE and ACCEPT_ORIGINAL_SERVER.
//
// See RFC 2965 sec. 3.3 and 7 for more detail.
trait CookiePolicy {
}

object CookiePolicy {
    @stub
    // One pre-defined policy which accepts all cookies.
    def ACCEPT_ALL: CookiePolicy = ???

    @stub
    // One pre-defined policy which accepts no cookies.
    def ACCEPT_NONE: CookiePolicy = ???
}
