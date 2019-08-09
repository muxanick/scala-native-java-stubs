package java.net

import java.lang.{Object, String}

// This class represents an Internet Protocol version 6 (IPv6) address.
// Defined by 
// RFC 2373: IP Version 6 Addressing Architecture.
//
//  Textual representation of IP addresses 
//
// Textual representation of IPv6 address used as input to methods
// takes one of the following forms:
//
// 
//    The preferred form is x:x:x:x:x:x:x:x,
//   where the 'x's are
//   the hexadecimal values of the eight 16-bit pieces of the
//   address. This is the full form.  For example,
//
//   
//   1080:0:0:0:8:800:200C:417A
//   
//
//    Note that it is not necessary to write the leading zeros in
//   an individual field. However, there must be at least one numeral
//   in every field, except as described below.
//
//    Due to some methods of allocating certain styles of IPv6
//   addresses, it will be common for addresses to contain long
//   strings of zero bits. In order to make writing addresses
//   containing zero bits easier, a special syntax is available to
//   compress the zeros. The use of "::" indicates multiple groups
//   of 16-bits of zeros. The "::" can only appear once in an address.
//   The "::" can also be used to compress the leading and/or trailing
//   zeros in an address. For example,
//
//   
//   1080::8:800:200C:417A
//   
//
//    An alternative form that is sometimes more convenient
//   when dealing with a mixed environment of IPv4 and IPv6 nodes is
//   x:x:x:x:x:x:d.d.d.d, where the 'x's are the hexadecimal values
//   of the six high-order 16-bit pieces of the address, and the 'd's
//   are the decimal values of the four low-order 8-bit pieces of the
//   standard IPv4 representation address, for example,
//
//   
//   ::FFFF:129.144.52.38
//   ::129.144.52.38
//   
//
//    where "::FFFF:d.d.d.d" and "::d.d.d.d" are, respectively, the
//   general forms of an IPv4-mapped IPv6 address and an
//   IPv4-compatible IPv6 address. Note that the IPv4 portion must be
//   in the "d.d.d.d" form. The following forms are invalid:
//
//   
//   ::FFFF:d.d.d
//   ::FFFF:d.d
//   ::d.d.d
//   ::d.d
//   
//
//    The following form:
//
//   
//   ::FFFF:d
//   
//
//    is valid, however it is an unconventional representation of
//   the IPv4-compatible IPv6 address,
//
//   
//   ::255.255.0.d
//   
//
//    while "::d" corresponds to the general IPv6 address
//   "0:0:0:0:0:0:0:d".
// 
//
//  For methods that return a textual representation as output
// value, the full form is used. Inet6Address will return the full
// form because it is unambiguous when used in combination with other
// textual data.
//
//  Special IPv6 address 
//
// 
// 
// IPv4-mapped address
//         Of the form::ffff:w.x.y.z, this IPv6 address is used to
//         represent an IPv4 address. It allows the native program to
//         use the same address data structure and also the same
//         socket when communicating with both IPv4 and IPv6 nodes.
//
//         In InetAddress and Inet6Address, it is used for internal
//         representation; it has no functional role. Java will never
//         return an IPv4-mapped address.  These classes can take an
//         IPv4-mapped address as input, both in byte array and text
//         representation. However, it will be converted into an IPv4
//         address.
// 
//
// Textual representation of IPv6 scoped addresses
//
//  The textual representation of IPv6 addresses as described above can be
// extended to specify IPv6 scoped addresses. This extension to the basic
// addressing architecture is described in [draft-ietf-ipngwg-scoping-arch-04.txt].
//
//  Because link-local and site-local addresses are non-global, it is possible
// that different hosts may have the same destination address and may be
// reachable through different interfaces on the same originating system. In
// this case, the originating system is said to be connected to multiple zones
// of the same scope. In order to disambiguate which is the intended destination
// zone, it is possible to append a zone identifier (or scope_id) to an
// IPv6 address.
//
//  The general format for specifying the scope_id is the following:
//
// IPv6-address%scope_id
//  The IPv6-address is a literal IPv6 address as described above.
// The scope_id refers to an interface on the local system, and it can be
// specified in two ways.
// As a numeric identifier. This must be a positive integer
// that identifies the particular interface and scope as understood by the
// system. Usually, the numeric values can be determined through administration
// tools on the system. Each interface may have multiple values, one for each
// scope. If the scope is unspecified, then the default value used is zero.
// As a string. This must be the exact string that is returned by
// NetworkInterface.getName() for the particular interface in
// question. When an Inet6Address is created in this way, the numeric scope-id
// is determined at the time the object is created by querying the relevant
// NetworkInterface.
//
//  Note also, that the numeric scope_id can be retrieved from
// Inet6Address instances returned from the NetworkInterface class. This can be
// used to find out the current scope ids configured on the system.
final class Inet6Address extends InetAddress {

    @stub
    // Compares this object against the specified object.
    def equals(obj: Object): Boolean = ???

    @stub
    // Returns the raw IP address of this InetAddress object.
    def getAddress(): Array[Byte] = ???

    @stub
    // Returns the IP address string in textual presentation.
    def getHostAddress(): String = ???

    @stub
    // Returns the scoped interface, if this instance was created with
    // with a scoped interface.
    def getScopedInterface(): NetworkInterface = ???

    @stub
    // Returns the numeric scopeId, if this instance is associated with
    // an interface.
    def getScopeId(): Int = ???

    @stub
    // Returns a hashcode for this IP address.
    def hashCode(): Int = ???

    @stub
    // Utility routine to check if the InetAddress in a wildcard address.
    def isAnyLocalAddress(): Boolean = ???

    @stub
    // Utility routine to check if the InetAddress is an
    // IPv4 compatible IPv6 address.
    def isIPv4CompatibleAddress(): Boolean = ???

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
    // Utility routine to check if the InetAddress is an IP multicast
    // address.
    def isMulticastAddress(): Boolean = ???
}

object Inet6Address {
    @stub
    // Create an Inet6Address in the exact manner of InetAddress.getByAddress(String,byte[]) except that the IPv6 scope_id is
    // set to the given numeric value.
    def getByAddress(host: String, addr: Array[Byte], scope_id: Int): Inet6Address = ???

    @stub
    // Create an Inet6Address in the exact manner of InetAddress.getByAddress(String,byte[]) except that the IPv6 scope_id is
    // set to the value corresponding to the given interface for the address
    // type specified in addr.
    def getByAddress(host: String, addr: Array[Byte], nif: NetworkInterface): Inet6Address = ???
}
