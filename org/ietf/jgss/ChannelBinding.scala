package org.ietf.jgss

import java.lang.Object
import java.net.InetAddress

// This class encapsulates the concept of caller-provided channel
// binding information. Channel bindings are used to strengthen the
// quality with which peer entity authentication is provided during
// context establishment.  They enable the GSS-API callers to bind the
// establishment of the security context to relevant characteristics
// like addresses or to application specific data.
//
// The caller initiating the security context must determine the
// appropriate channel binding values to set in the GSSContext object.
// The acceptor must provide an identical binding in order to validate
// that received tokens possess correct channel-related characteristics.
//
// Use of channel bindings is optional in GSS-API. ChannelBinding can be
// set for the GSSContext using the setChannelBinding method
// before the first call to initSecContext or acceptSecContext has been performed.  Unless the setChannelBinding
// method has been used to set the ChannelBinding for a GSSContext object,
// null ChannelBinding will be assumed. 
//
// Conceptually, the GSS-API concatenates the initiator and acceptor
// address information, and the application supplied byte array to form an
// octet string.  The mechanism calculates a MIC over this octet string and
// binds the MIC to the context establishment token emitted by
// initSecContext method of the GSSContext
// interface.  The same bindings are set by the context acceptor for its
// GSSContext object and during processing of the
// acceptSecContext method a MIC is calculated in the same
// way. The calculated MIC is compared with that found in the token, and if
// the MICs differ, accept will throw a GSSException with the
// major code set to BAD_BINDINGS, and
// the context will not be established. Some mechanisms may include the
// actual channel binding data in the token (rather than just a MIC);
// applications should therefore not use confidential data as
// channel-binding components.
//
//  Individual mechanisms may impose additional constraints on addresses
//  that may appear in channel bindings.  For example, a mechanism may
//  verify that the initiator address field of the channel binding
//  contains the correct network address of the host system.  Portable
//  applications should therefore ensure that they either provide correct
//  information for the address fields, or omit setting of the addressing
//  information.
class ChannelBinding extends Object {

    @stub
    // Creates a ChannelBinding object without any addressing information.
    def this(appData: Array[Byte]) = ???

    @stub
    // Compares two instances of ChannelBinding.
    def equals(obj: Object): Boolean = ???

    @stub
    // Get the acceptor's address for this channel binding.
    def getAcceptorAddress(): InetAddress = ???

    @stub
    // Get the application specified data for this channel binding.
    def getApplicationData(): Array[Byte] = ???

    @stub
    // Get the initiator's address for this channel binding.
    def getInitiatorAddress(): InetAddress = ???
}
