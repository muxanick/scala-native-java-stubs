package javax.print

// Interface URIException is a mixin interface which a subclass of PrintException can implement to report an error condition
// involving a URI address. The Print Service API does not define any print
// exception classes that implement interface URIException, that being left to
// the Print Service implementor's discretion.
trait URIException {

    @stub
    // Return the reason for the event.
    def getReason(): Int = ???
}

object URIException {
    @stub
    // Indicates that the printer cannot access the URI address.
    def URIInaccessible: Int = ???

    @stub
    // Indicates any kind of problem not specifically identified
    // by the other reasons.
    def URIOtherProblem: Int = ???
}
