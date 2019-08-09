package java.net

import java.lang.Object

/** Represents channels for storing resources in the
 *  ResponseCache. Instances of such a class provide an
 *  OutputStream object which is called by protocol handlers to
 *  store the resource data into the cache, and also an abort() method
 *  which allows a cache store operation to be interrupted and
 *  abandoned. If an IOException is encountered while reading the
 *  response or writing to the cache, the current cache store operation
 *  will be aborted.
 */
abstract class CacheRequest extends Object {

    /** Aborts the attempt to cache the response. */
    def abort(): Unit
}
