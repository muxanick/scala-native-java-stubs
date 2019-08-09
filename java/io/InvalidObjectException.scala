package java.io

import java.lang.{Exception, Object, Throwable}

// Indicates that one or more deserialized objects failed validation
// tests.  The argument should provide the reason for the failure.
class InvalidObjectException extends ObjectStreamException {
}
