package java.sql

import java.lang.Class

// Interface for JDBC classes which provide the ability to retrieve the delegate instance when the instance
// in question is in fact a proxy class.
// 
// The wrapper pattern is employed by many JDBC driver implementations to provide extensions beyond
// the traditional JDBC API that are specific to a data source. Developers may wish to gain access to
// these resources that are wrapped (the delegates) as  proxy class instances representing the
// the actual resources. This interface describes a standard mechanism to access
// these wrapped resources
// represented by their proxy, to permit direct access to the resource delegates.
trait Wrapper {

    @stub
    // Returns true if this either implements the interface argument or is directly or indirectly a wrapper
    // for an object that does.
    def isWrapperFor(iface: Class[_]): Boolean = ???
}