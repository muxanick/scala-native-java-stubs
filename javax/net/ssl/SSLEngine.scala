package javax.net.ssl

import java.lang.{Object, Runnable, String}
import java.nio.ByteBuffer

/** A class which enables secure communications using protocols such as
 *  the Secure Sockets Layer (SSL) or
 *   IETF RFC 2246 "Transport
 *  Layer Security" (TLS)  protocols, but is transport independent.
 *  
 *  The secure communications modes include: 
 * 
 *        Integrity Protection.  SSL/TLS protects against
 *       modification of messages by an active wiretapper.
 * 
 *        Authentication.  In most modes, SSL/TLS provides
 *       peer authentication.  Servers are usually authenticated, and
 *       clients may be authenticated as requested by servers.
 * 
 *        Confidentiality (Privacy Protection).  In most
 *       modes, SSL/TLS encrypts data being sent between client and
 *       server.  This protects the confidentiality of data, so that
 *       passive wiretappers won't see sensitive data such as financial
 *       information or personal information of many kinds.
 * 
 *       
 * 
 *  These kinds of protection are specified by a "cipher suite", which
 *  is a combination of cryptographic algorithms used by a given SSL
 *  connection.  During the negotiation process, the two endpoints must
 *  agree on a cipher suite that is available in both environments.  If
 *  there is no such suite in common, no SSL connection can be
 *  established, and no data can be exchanged.
 *  
 *  The cipher suite used is established by a negotiation process called
 *  "handshaking".  The goal of this process is to create or rejoin a
 *  "session", which may protect many connections over time.  After
 *  handshaking has completed, you can access session attributes by
 *  using the getSession() method.
 *  
 *  The SSLSocket class provides much of the same security
 *  functionality, but all of the inbound and outbound data is
 *  automatically transported using the underlying Socket, which by design uses a blocking model.
 *  While this is appropriate for many applications, this model does not
 *  provide the scalability required by large servers.
 *  
 *  The primary distinction of an SSLEngine is that it
 *  operates on inbound and outbound byte streams, independent of the
 *  transport mechanism.  It is the responsibility of the
 *  SSLEngine user to arrange for reliable I/O transport to
 *  the peer.  By separating the SSL/TLS abstraction from the I/O
 *  transport mechanism, the SSLEngine can be used for a
 *  wide variety of I/O types, such as non-blocking I/O (polling), selectable non-blocking I/O, Socket and the
 *  traditional Input/OutputStreams, local ByteBuffers or byte arrays,  future asynchronous
 *  I/O models , and so on.
 *  
 *  At a high level, the SSLEngine appears thus:
 * 
 *  
 *                    app data
 * 
 *                 |           ^
 *                 |     |     |
 *                 v     |     |
 *            +----+-----|-----+----+
 *            |          |          |
 *            |       SSL|Engine    |
 *    wrap()  |          |          |  unwrap()
 *            | OUTBOUND | INBOUND  |
 *            |          |          |
 *            +----+-----|-----+----+
 *                 |     |     ^
 *                 |     |     |
 *                 v           |
 * 
 *                    net data
 *  
 *  Application data (also known as plaintext or cleartext) is data which
 *  is produced or consumed by an application.  Its counterpart is
 *  network data, which consists of either handshaking and/or ciphertext
 *  (encrypted) data, and destined to be transported via an I/O
 *  mechanism.  Inbound data is data which has been received from the
 *  peer, and outbound data is destined for the peer.
 *  
 *  (In the context of an SSLEngine, the term "handshake
 *  data" is taken to mean any data exchanged to establish and control a
 *  secure connection.  Handshake data includes the SSL/TLS messages
 *  "alert", "change_cipher_spec," and "handshake.")
 *  
 *  There are five distinct phases to an SSLEngine.
 * 
 *  
 *       Creation - The SSLEngine has been created and
 *      initialized, but has not yet been used.  During this phase, an
 *      application may set any SSLEngine-specific settings
 *      (enabled cipher suites, whether the SSLEngine should
 *      handshake in client or server mode, and so on).  Once
 *      handshaking has begun, though, any new settings (except
 *      client/server mode, see below) will be used for
 *      the next handshake.
 * 
 *       Initial Handshake - The initial handshake is a procedure by
 *      which the two peers exchange communication parameters until an
 *      SSLSession is established.  Application data can not be sent during
 *      this phase.
 * 
 *       Application Data - Once the communication parameters have
 *      been established and the handshake is complete, application data
 *      may flow through the SSLEngine.  Outbound
 *      application messages are encrypted and integrity protected,
 *      and inbound messages reverse the process.
 * 
 *        Rehandshaking - Either side may request a renegotiation of
 *      the session at any time during the Application Data phase.  New
 *      handshaking data can be intermixed among the application data.
 *      Before starting the rehandshake phase, the application may
 *      reset the SSL/TLS communication parameters such as the list of
 *      enabled ciphersuites and whether to use client authentication,
 *      but can not change between client/server modes.  As before, once
 *      handshaking has begun, any new SSLEngine
 *      configuration settings will not be used until the next
 *      handshake.
 * 
 *        Closure - When the connection is no longer needed, the
 *      application should close the SSLEngine and should
 *      send/receive any remaining messages to the peer before
 *      closing the underlying transport mechanism.  Once an engine is
 *      closed, it is not reusable:  a new SSLEngine must
 *      be created.
 *  
 *  An SSLEngine is created by calling SSLContext.createSSLEngine() from an initialized
 *  SSLContext.  Any configuration
 *  parameters should be set before making the first call to
 *  wrap(), unwrap(), or
 *  beginHandshake().  These methods all trigger the
 *  initial handshake.
 *  
 *  Data moves through the engine by calling wrap() or unwrap() on outbound or inbound data, respectively.  Depending on
 *  the state of the SSLEngine, a wrap() call
 *  may consume application data from the source buffer and may produce
 *  network data in the destination buffer.  The outbound data
 *  may contain application and/or handshake data.  A call to
 *  unwrap() will examine the source buffer and may
 *  advance the handshake if the data is handshaking information, or
 *  may place application data in the destination buffer if the data
 *  is application.  The state of the underlying SSL/TLS algorithm
 *  will determine when data is consumed and produced.
 *  
 *  Calls to wrap() and unwrap() return an
 *  SSLEngineResult which indicates the status of the
 *  operation, and (optionally) how to interact with the engine to make
 *  progress.
 *  
 *  The SSLEngine produces/consumes complete SSL/TLS
 *  packets only, and does not store application data internally between
 *  calls to wrap()/unwrap().  Thus input and output
 *  ByteBuffers must be sized appropriately to hold the
 *  maximum record that can be produced.  Calls to SSLSession.getPacketBufferSize() and SSLSession.getApplicationBufferSize() should be used to determine
 *  the appropriate buffer sizes.  The size of the outbound application
 *  data buffer generally does not matter.  If buffer conditions do not
 *  allow for the proper consumption/production of data, the application
 *  must determine (via SSLEngineResult) and correct the
 *  problem, and then try the call again.
 *  
 *  For example, unwrap() will return a SSLEngineResult.Status.BUFFER_OVERFLOW result if the engine
 *  determines that there is not enough destination buffer space available.
 *  Applications should call SSLSession.getApplicationBufferSize()
 *  and compare that value with the space available in the destination buffer,
 *  enlarging the buffer if necessary.  Similarly, if unwrap()
 *  were to return a SSLEngineResult.Status.BUFFER_UNDERFLOW, the
 *  application should call SSLSession.getPacketBufferSize() to ensure
 *  that the source buffer has enough room to hold a record (enlarging if
 *  necessary), and then obtain more inbound data.
 * 
 *  
 *    SSLEngineResult r = engine.unwrap(src, dst);
 *    switch (r.getStatus()) {
 *    BUFFER_OVERFLOW:
 *        // Could attempt to drain the dst buffer of any already obtained
 *        // data, but we'll just increase it to the size needed.
 *        int appSize = engine.getSession().getApplicationBufferSize();
 *        ByteBuffer b = ByteBuffer.allocate(appSize + dst.position());
 *        dst.flip();
 *        b.put(dst);
 *        dst = b;
 *        // retry the operation.
 *        break;
 *    BUFFER_UNDERFLOW:
 *        int netSize = engine.getSession().getPacketBufferSize();
 *        // Resize buffer if needed.
 *        if (netSize > dst.capacity()) {
 *            ByteBuffer b = ByteBuffer.allocate(netSize);
 *            src.flip();
 *            b.put(src);
 *            src = b;
 *        }
 *        // Obtain more inbound network data for src,
 *        // then retry the operation.
 *        break;
 *    // other cases: CLOSED, OK.
 *    }
 *  
 * 
 *  
 *  Unlike SSLSocket, all methods of SSLEngine are
 *  non-blocking.  SSLEngine implementations may
 *  require the results of tasks that may take an extended period of
 *  time to complete, or may even block.  For example, a TrustManager
 *  may need to connect to a remote certificate validation service,
 *  or a KeyManager might need to prompt a user to determine which
 *  certificate to use as part of client authentication.  Additionally,
 *  creating cryptographic signatures and verifying them can be slow,
 *  seemingly blocking.
 *  
 *  For any operation which may potentially block, the
 *  SSLEngine will create a Runnable
 *  delegated task.  When SSLEngineResult indicates that a
 *  delegated task result is needed, the application must call getDelegatedTask() to obtain an outstanding delegated task and
 *  call its run() method (possibly using
 *  a different thread depending on the compute strategy).  The
 *  application should continue obtaining delegated tasks until no more
 *  exist, and try the original operation again.
 *  
 *  At the end of a communication session, applications should properly
 *  close the SSL/TLS link.  The SSL/TLS protocols have closure handshake
 *  messages, and these messages should be communicated to the peer
 *  before releasing the SSLEngine and closing the
 *  underlying transport mechanism.  A close can be initiated by one of:
 *  an SSLException, an inbound closure handshake message, or one of the
 *  close methods.  In all cases, closure handshake messages are
 *  generated by the engine, and wrap() should be repeatedly
 *  called until the resulting SSLEngineResult's status
 *  returns "CLOSED", or isOutboundDone() returns true.  All
 *  data obtained from the wrap() method should be sent to the
 *  peer.
 *  
 *  closeOutbound() is used to signal the engine that the
 *  application will not be sending any more data.
 *  
 *  A peer will signal its intent to close by sending its own closure
 *  handshake message.  After this message has been received and
 *  processed by the local SSLEngine's unwrap()
 *  call, the application can detect the close by calling
 *  unwrap() and looking for a SSLEngineResult
 *  with status "CLOSED", or if isInboundDone() returns true.
 *  If for some reason the peer closes the communication link without
 *  sending the proper SSL/TLS closure message, the application can
 *  detect the end-of-stream and can signal the engine via closeInbound() that there will no more inbound messages to
 *  process.  Some applications might choose to require orderly shutdown
 *  messages from a peer, in which case they can check that the closure
 *  was generated by a handshake message and not by an end-of-stream
 *  condition.
 *  
 *  There are two groups of cipher suites which you will need to know
 *  about when managing cipher suites:
 * 
 *  
 *        Supported cipher suites:  all the suites which are
 *       supported by the SSL implementation.  This list is reported
 *       using getSupportedCipherSuites().
 * 
 *        Enabled cipher suites, which may be fewer than
 *       the full set of supported suites.  This group is set using the
 *       setEnabledCipherSuites(String []) method, and
 *       queried using the getEnabledCipherSuites() method.
 *       Initially, a default set of cipher suites will be enabled on a
 *       new engine that represents the minimum suggested
 *       configuration.
 *  
 * 
 *  Implementation defaults require that only cipher suites which
 *  authenticate servers and provide confidentiality be enabled by
 *  default.  Only if both sides explicitly agree to unauthenticated
 *  and/or non-private (unencrypted) communications will such a
 *  cipher suite be selected.
 *  
 *  Each SSL/TLS connection must have one client and one server, thus
 *  each endpoint must decide which role to assume.  This choice determines
 *  who begins the handshaking process as well as which type of messages
 *  should be sent by each party.  The method setUseClientMode(boolean) configures the mode.  Once the initial
 *  handshaking has started, an SSLEngine can not switch
 *  between client and server modes, even when performing renegotiations.
 *  
 *  Applications might choose to process delegated tasks in different
 *  threads.  When an SSLEngine
 *  is created, the current AccessControlContext
 *  is saved.  All future delegated tasks will be processed using this
 *  context:  that is, all access control decisions will be made using the
 *  context captured at engine creation.
 * 
 *  
 * 
 *  Concurrency Notes:
 *  There are two concurrency issues to be aware of:
 * 
 *  
 *       The wrap() and unwrap() methods
 *       may execute concurrently of each other.
 * 
 *        The SSL/TLS protocols employ ordered packets.
 *       Applications must take care to ensure that generated packets
 *       are delivered in sequence.  If packets arrive
 *       out-of-order, unexpected or fatal results may occur.
 *  
 *       For example:
 * 
 *       
 *               synchronized (outboundLock) {
 *                   sslEngine.wrap(src, dst);
 *                   outboundQueue.put(dst);
 *               }
 *       
 * 
 *       As a corollary, two threads must not attempt to call the same method
 *       (either wrap() or unwrap()) concurrently,
 *       because there is no way to guarantee the eventual packet ordering.
 *  
 */
abstract class SSLEngine extends Object {

    /** Constructor for an SSLEngine providing no hints
     *  for an internal session reuse strategy.
     */
    @stub
    protected def this() = ???

    /** Initiates handshaking (initial or renegotiation) on this SSLEngine. */
    def beginHandshake(): Unit

    /** Signals that no more inbound network data will be sent
     *  to this SSLEngine.
     */
    def closeInbound(): Unit

    /** Signals that no more outbound application data will be sent
     *  on this SSLEngine.
     */
    def closeOutbound(): Unit

    /** Returns a delegated Runnable task for
     *  this SSLEngine.
     */
    def getDelegatedTask(): Runnable

    /** Returns the names of the SSL cipher suites which are currently
     *  enabled for use on this engine.
     */
    def getEnabledCipherSuites(): Array[String]

    /** Returns the names of the protocol versions which are currently
     *  enabled for use with this SSLEngine.
     */
    def getEnabledProtocols(): Array[String]

    /** Returns true if new SSL sessions may be established by this engine. */
    def getEnableSessionCreation(): Boolean

    /** Returns the SSLSession being constructed during a SSL/TLS
     *  handshake.
     */
    def getHandshakeSession(): SSLSession

    /** Returns the current handshake status for this SSLEngine. */
    def getHandshakeStatus(): SSLEngineResult.HandshakeStatus

    /** Returns true if the engine will require client authentication. */
    def getNeedClientAuth(): Boolean

    /** Returns the host name of the peer. */
    def getPeerHost(): String

    /** Returns the port number of the peer. */
    def getPeerPort(): Int

    /** Returns the SSLSession in use in this
     *  SSLEngine.
     */
    def getSession(): SSLSession

    /** Returns the SSLParameters in effect for this SSLEngine. */
    def getSSLParameters(): SSLParameters

    /** Returns the names of the cipher suites which could be enabled for use
     *  on this engine.
     */
    def getSupportedCipherSuites(): Array[String]

    /** Returns the names of the protocols which could be enabled for use
     *  with this SSLEngine.
     */
    def getSupportedProtocols(): Array[String]

    /** Returns true if the engine is set to use client mode when
     *  handshaking.
     */
    def getUseClientMode(): Boolean

    /** Returns true if the engine will request client authentication. */
    def getWantClientAuth(): Boolean

    /** Returns whether unwrap(ByteBuffer, ByteBuffer) will
     *  accept any more inbound data messages.
     */
    def isInboundDone(): Boolean

    /** Returns whether wrap(ByteBuffer, ByteBuffer) will
     *  produce any more outbound data messages.
     */
    def isOutboundDone(): Boolean

    /** Sets the cipher suites enabled for use on this engine. */
    def setEnabledCipherSuites(suites: Array[String]): Unit

    /** Set the protocol versions enabled for use on this engine. */
    def setEnabledProtocols(protocols: Array[String]): Unit

    /** Controls whether new SSL sessions may be established by this engine. */
    def setEnableSessionCreation(flag: Boolean): Unit

    /** Configures the engine to require client authentication. */
    def setNeedClientAuth(need: Boolean): Unit

    /** Applies SSLParameters to this engine. */
    def setSSLParameters(params: SSLParameters): Unit

    /** Configures the engine to use client (or server) mode when
     *  handshaking.
     */
    def setUseClientMode(mode: Boolean): Unit

    /** Configures the engine to request client authentication. */
    def setWantClientAuth(want: Boolean): Unit

    /** Attempts to decode SSL/TLS network data into a plaintext
     *  application data buffer.
     */
    def unwrap(src: ByteBuffer, dst: ByteBuffer): SSLEngineResult

    /** Attempts to decode SSL/TLS network data into a sequence of plaintext
     *  application data buffers.
     */
    def unwrap(src: ByteBuffer, dsts: Array[ByteBuffer]): SSLEngineResult

    /** Attempts to decode SSL/TLS network data into a subsequence of
     *  plaintext application data buffers.
     */
    def unwrap(src: ByteBuffer, dsts: Array[ByteBuffer], offset: Int, length: Int): SSLEngineResult

    /** Attempts to encode plaintext bytes from a sequence of data
     *  buffers into SSL/TLS network data.
     */
    def wrap(srcs: Array[ByteBuffer], dst: ByteBuffer): SSLEngineResult

    /** Attempts to encode plaintext bytes from a subsequence of data
     *  buffers into SSL/TLS network data.
     */
    def wrap(srcs: Array[ByteBuffer], offset: Int, length: Int, dst: ByteBuffer): SSLEngineResult
}
