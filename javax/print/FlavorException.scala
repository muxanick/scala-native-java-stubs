package javax.print

// Interface FlavorException is a mixin interface which a subclass of PrintException can implement to report an error condition
// involving a doc flavor or flavors (class DocFlavor). The Print Service API does not define any print exception
// classes that implement interface FlavorException, that being left to the
// Print Service implementor's discretion.
trait FlavorException {
}
