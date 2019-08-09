package javax.net.ssl

import java.util.Enumeration
import scala.scalanative.annotation.stub

/** A SSLSessionContext represents a set of
 *  SSLSessions associated with a single entity. For example,
 *  it could be associated with a server or client who participates in many
 *  sessions concurrently.
 *  
 *  Not all environments will contain session contexts.
 *  
 *  There are SSLSessionContext parameters that affect how
 *  sessions are stored:
 *  
 *       Sessions can be set to expire after a specified
 *       time limit.
 *       The number of sessions that can be stored in context
 *       can be limited.
 *  
 *  A session can be retrieved based on its session id, and all session id's
 *  in a SSLSessionContext can be listed.
 */
trait SSLSessionContext {

    /** Returns an Enumeration of all session id's grouped under this
     *  SSLSessionContext.
     */
    @stub
    def getIds(): Enumeration[Array[Byte]] = ???

    /** Returns the SSLSession bound to the specified session id. */
    @stub
    def getSession(sessionId: Array[Byte]): SSLSession = ???

    /** Returns the size of the cache used for storing
     *  SSLSession objects grouped under this
     *  SSLSessionContext.
     */
    @stub
    def getSessionCacheSize(): Int = ???

    /** Returns the timeout limit of SSLSession objects grouped
     *  under this SSLSessionContext.
     */
    @stub
    def getSessionTimeout(): Int = ???

    /** Sets the size of the cache used for storing
     *  SSLSession objects grouped under this
     *  SSLSessionContext.
     */
    @stub
    def setSessionCacheSize(size: Int): Unit = ???

    /** Sets the timeout limit for SSLSession objects grouped
     *  under this SSLSessionContext.
     */
    @stub
    def setSessionTimeout(seconds: Int): Unit = ???
}
