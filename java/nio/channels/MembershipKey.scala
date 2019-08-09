package java.nio.channels

import java.lang.Object
import java.net.{InetAddress, NetworkInterface}

// A token representing the membership of an Internet Protocol (IP) multicast
// group.
//
//  A membership key may represent a membership to receive all datagrams sent
// to the group, or it may be source-specific, meaning that it
// represents a membership that receives only datagrams from a specific source
// address. Whether or not a membership key is source-specific may be determined
// by invoking its sourceAddress method.
//
//  A membership key is valid upon creation and remains valid until the
// membership is dropped by invoking the drop method, or
// the channel is closed. The validity of the membership key may be tested
// by invoking its isValid method.
//
//  Where a membership key is not source-specific and the underlying operation
// system supports source filtering, then the block and unblock methods can be used to block or unblock multicast datagrams
// from particular source addresses.
abstract class MembershipKey extends Object {

    // Block multicast datagrams from the given source address.
    def block(source: InetAddress): MembershipKey

    // Returns the channel for which this membership key was created.
    def channel(): MulticastChannel

    // Drop membership.
    def drop(): Unit

    // Returns the multicast group for which this membership key was created.
    def group(): InetAddress

    // Tells whether or not this membership is valid.
    def isValid(): Boolean

    // Returns the network interface for which this membership key was created.
    def networkInterface(): NetworkInterface

    // Returns the source address if this membership key is source-specific,
    // or null if this membership is not source-specific.
    def sourceAddress(): InetAddress
}
