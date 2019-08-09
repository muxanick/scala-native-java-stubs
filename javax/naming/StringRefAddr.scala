package javax.naming

import java.lang.Object

// This class represents the string form of the address of
// a communications end-point.
// It consists of a type that describes the communication mechanism
// and a string contents specific to that communication mechanism.
// The format and interpretation of
// the address type and the contents of the address are based on
// the agreement of three parties: the client that uses the address,
// the object/server that can be reached using the address, and the
// administrator or program that creates the address.
//
//  An example of a string reference address is a host name.
// Another example of a string reference address is a URL.
//
//  A string reference address is immutable:
// once created, it cannot be changed.  Multithreaded access to
// a single StringRefAddr need not be synchronized.
class StringRefAddr extends RefAddr {
}
