package java.net

import java.io.Serializable
import java.lang.{Object, String}

// This class represents an Internet Protocol (IP) address.
//
//  An IP address is either a 32-bit or 128-bit unsigned number
// used by IP, a lower-level protocol on which protocols like UDP and
// TCP are built. The IP address architecture is defined by RFC 790:
// Assigned Numbers,  RFC 1918:
// Address Allocation for Private Internets, RFC 2365:
// Administratively Scoped IP Multicast, and RFC 2373: IP
// Version 6 Addressing Architecture. An instance of an
// InetAddress consists of an IP address and possibly its
// corresponding host name (depending on whether it is constructed
// with a host name or whether it has already done reverse host name
// resolution).
//
//  Address types 
//
// 
//   unicast
//       An identifier for a single interface. A packet sent to
//         a unicast address is delivered to the interface identified by
//         that address.
//
//          The Unspecified Address -- Also called anylocal or wildcard
//         address. It must never be assigned to any node. It indicates the
//         absence of an address. One example of its use is as the target of
//         bind, which allows a server to accept a client connection on any
//         interface, in case the server host has multiple interfaces.
//
//          The unspecified address must not be used as
//         the destination address of an IP packet.
//
//          The Loopback Addresses -- This is the address
//         assigned to the loopback interface. Anything sent to this
//         IP address loops around and becomes IP input on the local
//         host. This address is often used when testing a
//         client.
//   multicast
//       An identifier for a set of interfaces (typically belonging
//         to different nodes). A packet sent to a multicast address is
//         delivered to all interfaces identified by that address.
// 
//
//  IP address scope 
//
//  Link-local addresses are designed to be used for addressing
// on a single link for purposes such as auto-address configuration,
// neighbor discovery, or when no routers are present.
//
//  Site-local addresses are designed to be used for addressing
// inside of a site without the need for a global prefix.
//
//  Global addresses are unique across the internet.
//
//  Textual representation of IP addresses 
//
// The textual representation of an IP address is address family specific.
//
// 
//
// For IPv4 address format, please refer to Inet4Address#format; For IPv6
// address format, please refer to Inet6Address#format.
//
// There is a couple of
// System Properties affecting how IPv4 and IPv6 addresses are used.
//
//  Host Name Resolution 
//
// Host name-to-IP address resolution is accomplished through
// the use of a combination of local machine configuration information
// and network naming services such as the Domain Name System (DNS)
// and Network Information Service(NIS). The particular naming
// services(s) being used is by default the local machine configured
// one. For any host name, its corresponding IP address is returned.
//
//  Reverse name resolution means that for any IP address,
// the host associated with the IP address is returned.
//
//  The InetAddress class provides methods to resolve host names to
// their IP addresses and vice versa.
//
//  InetAddress Caching 
//
// The InetAddress class has a cache to store successful as well as
// unsuccessful host name resolutions.
//
//  By default, when a security manager is installed, in order to
// protect against DNS spoofing attacks,
// the result of positive host name resolutions are
// cached forever. When a security manager is not installed, the default
// behavior is to cache entries for a finite (implementation dependent)
// period of time. The result of unsuccessful host
// name resolution is cached for a very short period of time (10
// seconds) to improve performance.
//
//  If the default behavior is not desired, then a Java security property
// can be set to a different Time-to-live (TTL) value for positive
// caching. Likewise, a system admin can configure a different
// negative caching TTL value when needed.
//
//  Two Java security properties control the TTL values used for
//  positive and negative host name resolution caching:
//
// 
// 
// networkaddress.cache.ttl
// Indicates the caching policy for successful name lookups from
// the name service. The value is specified as as integer to indicate
// the number of seconds to cache the successful lookup. The default
// setting is to cache for an implementation specific period of time.
// 
// A value of -1 indicates "cache forever".
// 
// networkaddress.cache.negative.ttl (default: 10)
// Indicates the caching policy for un-successful name lookups
// from the name service. The value is specified as as integer to
// indicate the number of seconds to cache the failure for
// un-successful lookups.
// 
// A value of 0 indicates "never cache".
// A value of -1 indicates "cache forever".
// 
// 
// 
class InetAddress extends Object with Serializable {

    @stub
    // Compares this object against the specified object.
    def equals(obj: Object): Boolean = ???

    @stub
    // Returns the raw IP address of this InetAddress
    // object.
    def getAddress(): Array[Byte] = ???

    @stub
    // Gets the fully qualified domain name for this IP address.
    def getCanonicalHostName(): String = ???

    @stub
    // Returns the IP address string in textual presentation.
    def getHostAddress(): String = ???

    @stub
    // Gets the host name for this IP address.
    def getHostName(): String = ???

    @stub
    // Returns a hashcode for this IP address.
    def hashCode(): Int = ???

    @stub
    // Utility routine to check if the InetAddress in a wildcard address.
    def isAnyLocalAddress(): Boolean = ???

    @stub
    // Utility routine to check if the InetAddress is an link local address.
    def isLinkLocalAddress(): Boolean = ???

    @stub
    // Utility routine to check if the InetAddress is a loopback address.
    def isLoopbackAddress(): Boolean = ???

    @stub
    // Utility routine to check if the multicast address has global scope.
    def isMCGlobal(): Boolean = ???

    @stub
    // Utility routine to check if the multicast address has link scope.
    def isMCLinkLocal(): Boolean = ???

    @stub
    // Utility routine to check if the multicast address has node scope.
    def isMCNodeLocal(): Boolean = ???

    @stub
    // Utility routine to check if the multicast address has organization scope.
    def isMCOrgLocal(): Boolean = ???

    @stub
    // Utility routine to check if the multicast address has site scope.
    def isMCSiteLocal(): Boolean = ???

    @stub
    // Utility routine to check if the InetAddress is an
    // IP multicast address.
    def isMulticastAddress(): Boolean = ???

    @stub
    // Test whether that address is reachable.
    def isReachable(timeout: Int): Boolean = ???

    @stub
    // Test whether that address is reachable.
    def isReachable(netif: NetworkInterface, ttl: Int, timeout: Int): Boolean = ???

    @stub
    // Utility routine to check if the InetAddress is a site local address.
    def isSiteLocalAddress(): Boolean = ???
}

object InetAddress {
    @stub
    // Given the name of a host, returns an array of its IP addresses,
    // based on the configured name service on the system.
    def getAllByName(host: String): Array[InetAddress] = ???

    @stub
    // Returns an InetAddress object given the raw IP address .
    def getByAddress(addr: Array[Byte]): InetAddress = ???

    @stub
    // Creates an InetAddress based on the provided host name and IP address.
    def getByAddress(host: String, addr: Array[Byte]): InetAddress = ???

    @stub
    // Determines the IP address of a host, given the host's name.
    def getByName(host: String): InetAddress = ???

    @stub
    // Returns the address of the local host.
    def getLocalHost(): InetAddress = ???

    @stub
    // Returns the loopback address.
    def getLoopbackAddress(): InetAddress = ???
}
