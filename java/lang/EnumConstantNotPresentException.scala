package java.lang

// Thrown when an application tries to access an enum constant by name
// and the enum type contains no constant with the specified name.
// This exception can be thrown by the API used to read annotations
// reflectively.
class EnumConstantNotPresentException extends RuntimeException {

    @stub
    // Returns the name of the missing enum constant.
    def constantName(): String = ???
}
