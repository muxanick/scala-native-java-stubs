package javax.net.ssl

import java.lang.{Object, String}

/** This class defines the Service Provider Interface (SPI)
 *  for the SSLContext class.
 * 
 *   All the abstract methods in this class must be implemented by each
 *  cryptographic service provider who wishes to supply the implementation
 *  of a particular SSL context.
 */
abstract class SSLContextSpi extends Object {

    /** Creates a new SSLEngine using this context. */
    protected def engineCreateSSLEngine(): SSLEngine

    /** Creates a SSLEngine using this context. */
    protected def engineCreateSSLEngine(host: String, port: Int): SSLEngine

    /** Returns a client SSLSessionContext object for
     *  this context.
     */
    protected def engineGetClientSessionContext(): SSLSessionContext

    /** Returns a copy of the SSLParameters indicating the default
     *  settings for this SSL context.
     */
    protected def engineGetDefaultSSLParameters(): SSLParameters

    /** Returns a server SSLSessionContext object for
     *  this context.
     */
    protected def engineGetServerSessionContext(): SSLSessionContext

    /** Returns a ServerSocketFactory object for
     *  this context.
     */
    protected def engineGetServerSocketFactory(): SSLServerSocketFactory

    /** Returns a SocketFactory object for this
     *  context.
     */
    protected def engineGetSocketFactory(): SSLSocketFactory

    /** Returns a copy of the SSLParameters indicating the maximum supported
     *  settings for this SSL context.
     */
    protected def engineGetSupportedSSLParameters(): SSLParameters
}
