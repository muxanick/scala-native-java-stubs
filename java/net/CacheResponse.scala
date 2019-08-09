package java.net

import java.io.InputStream
import java.lang.Object

// Represent channels for retrieving resources from the
// ResponseCache. Instances of such a class provide an
// InputStream that returns the entity body, and also a
// getHeaders() method which returns the associated response headers.
abstract class CacheResponse extends Object {

    // Returns the response body as an InputStream.
    def getBody(): InputStream
}
