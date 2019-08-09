package java.net

import java.io.Serializable
import java.lang.{Comparable, Object, String}
import scala.scalanative.annotation.stub

/** Represents a Uniform Resource Identifier (URI) reference.
 * 
 *   Aside from some minor deviations noted below, an instance of this
 *  class represents a URI reference as defined by
 *  RFC 2396: Uniform
 *  Resource Identifiers (URI): Generic Syntax, amended by RFC 2732: Format for
 *  Literal IPv6 Addresses in URLs. The Literal IPv6 address format
 *  also supports scope_ids. The syntax and usage of scope_ids is described
 *  here.
 *  This class provides constructors for creating URI instances from
 *  their components or by parsing their string forms, methods for accessing the
 *  various components of an instance, and methods for normalizing, resolving,
 *  and relativizing URI instances.  Instances of this class are immutable.
 * 
 * 
 *   URI syntax and components 
 * 
 *  At the highest level a URI reference (hereinafter simply "URI") in string
 *  form has the syntax
 * 
 *  
 *  [scheme:]scheme-specific-part[#fragment]
 *  
 * 
 *  where square brackets [...] delineate optional components and the characters
 *  : and # stand for themselves.
 * 
 *   An absolute URI specifies a scheme; a URI that is not absolute is
 *  said to be relative.  URIs are also classified according to whether
 *  they are opaque or hierarchical.
 * 
 *   An opaque URI is an absolute URI whose scheme-specific part does
 *  not begin with a slash character ('/').  Opaque URIs are not
 *  subject to further parsing.  Some examples of opaque URIs are:
 * 
 *  
 *  mailto:java-net@java.sun.com
 *  news:comp.lang.java
 *  urn:isbn:096139210x
 *  
 * 
 *   A hierarchical URI is either an absolute URI whose
 *  scheme-specific part begins with a slash character, or a relative URI, that
 *  is, a URI that does not specify a scheme.  Some examples of hierarchical
 *  URIs are:
 * 
 *  
 *  http://java.sun.com/j2se/1.3/
 *  docs/guide/collections/designfaq.html#28
 *  ../../../demo/jfc/SwingSet2/src/SwingSet2.java
 *  file:///~/calendar
 *  
 * 
 *   A hierarchical URI is subject to further parsing according to the syntax
 * 
 *  
 *  [scheme:][//authority][path][?query][#fragment]
 *  
 * 
 *  where the characters :, /,
 *  ?, and # stand for themselves.  The
 *  scheme-specific part of a hierarchical URI consists of the characters
 *  between the scheme and fragment components.
 * 
 *   The authority component of a hierarchical URI is, if specified, either
 *  server-based or registry-based.  A server-based authority
 *  parses according to the familiar syntax
 * 
 *  
 *  [user-info@]host[:port]
 *  
 * 
 *  where the characters @ and : stand for
 *  themselves.  Nearly all URI schemes currently in use are server-based.  An
 *  authority component that does not parse in this way is considered to be
 *  registry-based.
 * 
 *   The path component of a hierarchical URI is itself said to be absolute
 *  if it begins with a slash character ('/'); otherwise it is
 *  relative.  The path of a hierarchical URI that is either absolute or
 *  specifies an authority is always absolute.
 * 
 *   All told, then, a URI instance has the following nine components:
 * 
 *  
 *  ComponentType
 *  schemeString
 *  scheme-specific-part    String
 *  authorityString
 *  user-infoString
 *  hostString
 *  portint
 *  pathString
 *  queryString
 *  fragmentString
 *  
 * 
 *  In a given instance any particular component is either undefined or
 *  defined with a distinct value.  Undefined string components are
 *  represented by null, while undefined integer components are
 *  represented by -1.  A string component may be defined to have the
 *  empty string as its value; this is not equivalent to that component being
 *  undefined.
 * 
 *   Whether a particular component is or is not defined in an instance
 *  depends upon the type of the URI being represented.  An absolute URI has a
 *  scheme component.  An opaque URI has a scheme, a scheme-specific part, and
 *  possibly a fragment, but has no other components.  A hierarchical URI always
 *  has a path (though it may be empty) and a scheme-specific-part (which at
 *  least contains the path), and may have any of the other components.  If the
 *  authority component is present and is server-based then the host component
 *  will be defined and the user-information and port components may be defined.
 * 
 * 
 *   Operations on URI instances 
 * 
 *  The key operations supported by this class are those of
 *  normalization, resolution, and relativization.
 * 
 *   Normalization is the process of removing unnecessary "."
 *  and ".." segments from the path component of a hierarchical URI.
 *  Each "." segment is simply removed.  A ".." segment is
 *  removed only if it is preceded by a non-".." segment.
 *  Normalization has no effect upon opaque URIs.
 * 
 *   Resolution is the process of resolving one URI against another,
 *  base URI.  The resulting URI is constructed from components of both
 *  URIs in the manner specified by RFC 2396, taking components from the
 *  base URI for those not specified in the original.  For hierarchical URIs,
 *  the path of the original is resolved against the path of the base and then
 *  normalized.  The result, for example, of resolving
 * 
 *  
 *  docs/guide/collections/designfaq.html#28
 *              
 *      (1)
 *  
 * 
 *  against the base URI http://java.sun.com/j2se/1.3/ is the result
 *  URI
 * 
 *  
 *  https://docs.oracle.com/javase/1.3/docs/guide/collections/designfaq.html#28
 *  
 * 
 *  Resolving the relative URI
 * 
 *  
 *  ../../../demo/jfc/SwingSet2/src/SwingSet2.java    (2)
 *  
 * 
 *  against this result yields, in turn,
 * 
 *  
 *  http://java.sun.com/j2se/1.3/demo/jfc/SwingSet2/src/SwingSet2.java
 *  
 * 
 *  Resolution of both absolute and relative URIs, and of both absolute and
 *  relative paths in the case of hierarchical URIs, is supported.  Resolving
 *  the URI file:///~calendar against any other URI simply yields the
 *  original URI, since it is absolute.  Resolving the relative URI (2) above
 *  against the relative base URI (1) yields the normalized, but still relative,
 *  URI
 * 
 *  
 *  demo/jfc/SwingSet2/src/SwingSet2.java
 *  
 * 
 *   Relativization, finally, is the inverse of resolution: For any
 *  two normalized URIs u and v,
 * 
 *  
 *    u.relativize(u.resolve(v)).equals(v)  and
 *    u.resolve(u.relativize(v)).equals(v)  .
 *  
 * 
 *  This operation is often useful when constructing a document containing URIs
 *  that must be made relative to the base URI of the document wherever
 *  possible.  For example, relativizing the URI
 * 
 *  
 *  https://docs.oracle.com/javase/1.3/docs/guide/index.html
 *  
 * 
 *  against the base URI
 * 
 *  
 *  http://java.sun.com/j2se/1.3
 *  
 * 
 *  yields the relative URI docs/guide/index.html.
 * 
 * 
 *   Character categories 
 * 
 *  RFC 2396 specifies precisely which characters are permitted in the
 *  various components of a URI reference.  The following categories, most of
 *  which are taken from that specification, are used below to describe these
 *  constraints:
 * 
 *  
 *    alpha
 *        The US-ASCII alphabetic characters,
 *         'A' through 'Z'
 *         and 'a' through 'z'
 *    digit
 *        The US-ASCII decimal digit characters,
 *        '0' through '9'
 *    alphanum
 *        All alpha and digit characters
 *    unreserved    
 *        All alphanum characters together with those in the string
 *         "_-!.~'()*"
 *    punct
 *        The characters in the string ",;:$&+="
 *    reserved
 *        All punct characters together with those in the string
 *         "?/[]@"
 *    escaped
 *        Escaped octets, that is, triplets consisting of the percent
 *            character ('%') followed by two hexadecimal digits
 *            ('0'-'9', 'A'-'F', and
 *            'a'-'f')
 *    other
 *        The Unicode characters that are not in the US-ASCII character set,
 *            are not control characters (according to the Character.isISOControl
 *            method), and are not space characters (according to the Character.isSpaceChar
 *            method)  (Deviation from RFC 2396, which is
 *            limited to US-ASCII)
 *  
 * 
 *   The set of all legal URI characters consists of
 *  the unreserved, reserved, escaped, and other
 *  characters.
 * 
 * 
 *   Escaped octets, quotation, encoding, and decoding 
 * 
 *  RFC 2396 allows escaped octets to appear in the user-info, path, query, and
 *  fragment components.  Escaping serves two purposes in URIs:
 * 
 *  
 * 
 *     To encode non-US-ASCII characters when a URI is required to
 *    conform strictly to RFC 2396 by not containing any other
 *    characters.  
 * 
 *     To quote characters that are otherwise illegal in a
 *    component.  The user-info, path, query, and fragment components differ
 *    slightly in terms of which characters are considered legal and illegal.
 *    
 * 
 *  
 * 
 *  These purposes are served in this class by three related operations:
 * 
 *  
 * 
 *     A character is encoded by replacing it
 *    with the sequence of escaped octets that represent that character in the
 *    UTF-8 character set.  The Euro currency symbol ('\u20AC'),
 *    for example, is encoded as "%E2%82%AC".  (Deviation from
 *    RFC 2396, which does not specify any particular character
 *    set.) 
 * 
 *     An illegal character is quoted simply by
 *    encoding it.  The space character, for example, is quoted by replacing it
 *    with "%20".  UTF-8 contains US-ASCII, hence for US-ASCII
 *    characters this transformation has exactly the effect required by
 *    RFC 2396. 
 * 
 *    
 *    A sequence of escaped octets is decoded by
 *    replacing it with the sequence of characters that it represents in the
 *    UTF-8 character set.  UTF-8 contains US-ASCII, hence decoding has the
 *    effect of de-quoting any quoted US-ASCII characters as well as that of
 *    decoding any encoded non-US-ASCII characters.  If a decoding error occurs
 *    when decoding the escaped octets then the erroneous octets are replaced by
 *    '\uFFFD', the Unicode replacement character.  
 * 
 *  
 * 
 *  These operations are exposed in the constructors and methods of this class
 *  as follows:
 * 
 *  
 * 
 *     The single-argument
 *    constructor requires any illegal characters in its argument to be
 *    quoted and preserves any escaped octets and other characters that
 *    are present.  
 * 
 *     The multi-argument constructors quote illegal characters as
 *    required by the components in which they appear.  The percent character
 *    ('%') is always quoted by these constructors.  Any other
 *    characters are preserved.  
 * 
 *     The getRawUserInfo, getRawPath, getRawQuery, getRawFragment, getRawAuthority, and getRawSchemeSpecificPart methods return the
 *    values of their corresponding components in raw form, without interpreting
 *    any escaped octets.  The strings returned by these methods may contain
 *    both escaped octets and other characters, and will not contain any
 *    illegal characters.  
 * 
 *     The getUserInfo, getPath, getQuery, getFragment, getAuthority, and getSchemeSpecificPart methods decode any escaped
 *    octets in their corresponding components.  The strings returned by these
 *    methods may contain both other characters and illegal characters,
 *    and will not contain any escaped octets.  
 * 
 *     The toString method returns a URI string with
 *    all necessary quotation but which may contain other characters.
 *    
 * 
 *     The toASCIIString method returns a fully
 *    quoted and encoded URI string that does not contain any other
 *    characters.  
 * 
 *  
 * 
 * 
 *   Identities 
 * 
 *  For any URI u, it is always the case that
 * 
 *  
 *  new URI(u.toString()).equals(u) .
 *  
 * 
 *  For any URI u that does not contain redundant syntax such as two
 *  slashes before an empty authority (as in file:///tmp/ ) or a
 *  colon following a host name but no port (as in
 *  http://java.sun.com: ), and that does not encode characters
 *  except those that must be quoted, the following identities also hold:
 *  
 *      new URI(u.getScheme(),
 *              u.getSchemeSpecificPart(),
 *              u.getFragment())
 *      .equals(u)
 *  in all cases,
 *  
 *      new URI(u.getScheme(),
 *              u.getUserInfo(), u.getAuthority(),
 *              u.getPath(), u.getQuery(),
 *              u.getFragment())
 *      .equals(u)
 *  if u is hierarchical, and
 *  
 *      new URI(u.getScheme(),
 *              u.getUserInfo(), u.getHost(), u.getPort(),
 *              u.getPath(), u.getQuery(),
 *              u.getFragment())
 *      .equals(u)
 *  if u is hierarchical and has either no authority or a server-based
 *  authority.
 * 
 * 
 *   URIs, URLs, and URNs 
 * 
 *  A URI is a uniform resource identifier while a URL is a uniform
 *  resource locator.  Hence every URL is a URI, abstractly speaking, but
 *  not every URI is a URL.  This is because there is another subcategory of
 *  URIs, uniform resource names (URNs), which name resources but do not
 *  specify how to locate them.  The mailto, news, and
 *  isbn URIs shown above are examples of URNs.
 * 
 *   The conceptual distinction between URIs and URLs is reflected in the
 *  differences between this class and the URL class.
 * 
 *   An instance of this class represents a URI reference in the syntactic
 *  sense defined by RFC 2396.  A URI may be either absolute or relative.
 *  A URI string is parsed according to the generic syntax without regard to the
 *  scheme, if any, that it specifies.  No lookup of the host, if any, is
 *  performed, and no scheme-dependent stream handler is constructed.  Equality,
 *  hashing, and comparison are defined strictly in terms of the character
 *  content of the instance.  In other words, a URI instance is little more than
 *  a structured string that supports the syntactic, scheme-independent
 *  operations of comparison, normalization, resolution, and relativization.
 * 
 *   An instance of the URL class, by contrast, represents the
 *  syntactic components of a URL together with some of the information required
 *  to access the resource that it describes.  A URL must be absolute, that is,
 *  it must always specify a scheme.  A URL string is parsed according to its
 *  scheme.  A stream handler is always established for a URL, and in fact it is
 *  impossible to create a URL instance for a scheme for which no handler is
 *  available.  Equality and hashing depend upon both the scheme and the
 *  Internet address of the host, if any; comparison is not defined.  In other
 *  words, a URL is a structured string that supports the syntactic operation of
 *  resolution as well as the network I/O operations of looking up the host and
 *  opening a connection to the specified resource.
 */
final class URI extends Object with Comparable[URI] with Serializable {

    /** Constructs a URI by parsing the given string. */
    @stub
    def this(str: String) = ???

    /** Constructs a URI from the given components. */
    @stub
    def this(scheme: String, ssp: String, fragment: String) = ???

    /** Constructs a hierarchical URI from the given components. */
    @stub
    def this(scheme: String, userInfo: String, host: String, port: Int, path: String, query: String, fragment: String) = ???

    /** Constructs a hierarchical URI from the given components. */
    @stub
    def this(scheme: String, host: String, path: String, fragment: String) = ???

    /** Constructs a hierarchical URI from the given components. */
    @stub
    def this(scheme: String, authority: String, path: String, query: String, fragment: String) = ???

    /** Compares this URI to another object, which must be a URI. */
    @stub
    def compareTo(that: URI): Int = ???

    /** Tests this URI for equality with another object. */
    @stub
    def equals(ob: Object): Boolean = ???

    /** Returns the decoded authority component of this URI. */
    @stub
    def getAuthority(): String = ???

    /** Returns the decoded fragment component of this URI. */
    @stub
    def getFragment(): String = ???

    /** Returns the host component of this URI. */
    @stub
    def getHost(): String = ???

    /** Returns the decoded path component of this URI. */
    @stub
    def getPath(): String = ???

    /** Returns the port number of this URI. */
    @stub
    def getPort(): Int = ???

    /** Returns the decoded query component of this URI. */
    @stub
    def getQuery(): String = ???

    /** Returns the raw authority component of this URI. */
    @stub
    def getRawAuthority(): String = ???

    /** Returns the raw fragment component of this URI. */
    @stub
    def getRawFragment(): String = ???

    /** Returns the raw path component of this URI. */
    @stub
    def getRawPath(): String = ???

    /** Returns the raw query component of this URI. */
    @stub
    def getRawQuery(): String = ???

    /** Returns the raw scheme-specific part of this URI. */
    @stub
    def getRawSchemeSpecificPart(): String = ???

    /** Returns the raw user-information component of this URI. */
    @stub
    def getRawUserInfo(): String = ???

    /** Returns the scheme component of this URI. */
    @stub
    def getScheme(): String = ???

    /** Returns the decoded scheme-specific part of this URI. */
    @stub
    def getSchemeSpecificPart(): String = ???

    /** Returns the decoded user-information component of this URI. */
    @stub
    def getUserInfo(): String = ???

    /** Returns a hash-code value for this URI. */
    @stub
    def hashCode(): Int = ???

    /** Tells whether or not this URI is absolute. */
    @stub
    def isAbsolute(): Boolean = ???

    /** Tells whether or not this URI is opaque. */
    @stub
    def isOpaque(): Boolean = ???

    /** Normalizes this URI's path. */
    @stub
    def normalize(): URI = ???

    /** Attempts to parse this URI's authority component, if defined, into
     *  user-information, host, and port components.
     */
    @stub
    def parseServerAuthority(): URI = ???

    /** Relativizes the given URI against this URI. */
    @stub
    def relativize(uri: URI): URI = ???

    /** Constructs a new URI by parsing the given string and then resolving it
     *  against this URI.
     */
    @stub
    def resolve(str: String): URI = ???

    /** Resolves the given URI against this URI. */
    @stub
    def resolve(uri: URI): URI = ???

    /** Returns the content of this URI as a US-ASCII string. */
    @stub
    def toASCIIString(): String = ???

    /** Returns the content of this URI as a string. */
    @stub
    def toString(): String = ???

    /** Constructs a URL from this URI. */
    @stub
    def toURL(): URL = ???
}

object URI {
    /** Creates a URI by parsing the given string. */
    @stub
    def create(str: String): URI = ???
}
