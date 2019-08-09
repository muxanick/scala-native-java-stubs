package java.rmi.activation

import java.lang.{Exception, Object, Throwable}

// An UnknownObjectException is thrown by methods of classes and
// interfaces in the java.rmi.activation package when the
// ActivationID parameter to the method is determined to be
// invalid.  An ActivationID is invalid if it is not currently
// known by the ActivationSystem.  An ActivationID
// is obtained by the ActivationSystem.registerObject method.
// An ActivationID is also obtained during the
// Activatable.register call.
class UnknownObjectException extends ActivationException {
}
