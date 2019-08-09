package javax.security.auth

// Objects such as credentials may optionally implement this interface
// to provide the capability to destroy its contents.
trait Destroyable {

    @stub
    // Destroy this Object.
    def Unit: default = ???
}