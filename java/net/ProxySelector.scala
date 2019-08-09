package java.net

import java.io.IOException
import java.lang.Object
import java.util.List

// Selects the proxy server to use, if any, when connecting to the
// network resource referenced by a URL. A proxy selector is a
// concrete sub-class of this class and is registered by invoking the
// setDefault method. The
// currently registered proxy selector can be retrieved by calling
// getDefault method.
//
//  When a proxy selector is registered, for instance, a subclass
// of URLConnection class should call the select
// method for each URL request so that the proxy selector can decide
// if a direct, or proxied connection should be used. The select method returns an iterator over a collection with
// the preferred connection approach.
//
//  If a connection cannot be established to a proxy (PROXY or
// SOCKS) servers then the caller should call the proxy selector's
// connectFailed method to notify the proxy
// selector that the proxy server is unavailable. 
//
// The default proxy selector does enforce a
// set of System Properties
// related to proxy settings.
abstract class ProxySelector extends Object {

    // Called to indicate that a connection could not be established
    // to a proxy/socks server.
    def connectFailed(uri: URI, sa: SocketAddress, ioe: IOException): Unit

    // Selects all the applicable proxies based on the protocol to
    // access the resource with and a destination address to access
    // the resource at.
    def select(uri: URI): List[Proxy]
}

object ProxySelector {
    @stub
    // Gets the system-wide proxy selector.
    def getDefault(): ProxySelector = ???
}
