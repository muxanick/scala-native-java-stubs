package javax.net.ssl

import java.lang.Object

// An encapsulation of the result state produced by
// SSLEngine I/O calls.
//
//  A SSLEngine provides a means for establishing
// secure communication sessions between two peers.  SSLEngine
// operations typically consume bytes from an input buffer and produce
// bytes in an output buffer.  This class provides operational result
// values describing the state of the SSLEngine, including
// indications of what operations are needed to finish an
// ongoing handshake.  Lastly, it reports the number of bytes consumed
// and produced as a result of this operation.
class SSLEngineResult extends Object {

    @stub
    // Returns the number of bytes consumed from the input buffer.
    def bytesConsumed(): Int = ???

    @stub
    // Returns the number of bytes written to the output buffer.
    def bytesProduced(): Int = ???

    @stub
    // Gets the handshake status of this SSLEngine
    // operation.
    def getHandshakeStatus(): SSLEngineResult.HandshakeStatus = ???

    @stub
    // Gets the return value of this SSLEngine operation.
    def getStatus(): SSLEngineResult.Status = ???
}

object SSLEngineResult {
    @stub
    // An SSLEngineResult enum describing the current
    // handshaking state of this SSLEngine.
    def SSLEngineResult.HandshakeStatus: class = ???
}
