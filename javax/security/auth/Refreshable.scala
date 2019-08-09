package javax.security.auth

// Objects such as credentials may optionally implement this
// interface to provide the capability to refresh itself.
// For example, a credential with a particular time-restricted lifespan
// may implement this interface to allow callers to refresh the time period
// for which it is valid.
trait Refreshable {

    @stub
    // Determine if this Object is current.
    def isCurrent(): Boolean = ???
}
