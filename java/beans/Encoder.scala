package java.beans

import java.lang.{Class, Object}

// An Encoder is a class which can be used to create
// files or streams that encode the state of a collection of
// JavaBeans in terms of their public APIs. The Encoder,
// in conjunction with its persistence delegates, is responsible for
// breaking the object graph down into a series of Statementss
// and Expressions which can be used to create it.
// A subclass typically provides a syntax for these expressions
// using some human readable form - like Java source code or XML.
class Encoder extends Object {

    @stub
    // Returns a tentative value for oldInstance in
    // the environment created by this stream.
    def get(oldInstance: Object): Object = ???

    @stub
    // Gets the exception handler for this stream.
    def getExceptionListener(): ExceptionListener = ???

    @stub
    // Returns the persistence delegate for the given type.
    def getPersistenceDelegate(type: Class[_]): PersistenceDelegate = ???

    @stub
    // Removes the entry for this instance, returning the old entry.
    def remove(oldInstance: Object): Object = ???

    @stub
    // Sets the exception handler for this stream to exceptionListener.
    def setExceptionListener(exceptionListener: ExceptionListener): Unit = ???

    @stub
    // Associates the specified persistence delegate with the given type.
    def setPersistenceDelegate(type: Class[_], delegate: PersistenceDelegate): Unit = ???

    @stub
    // The implementation first checks to see if an
    // expression with this value has already been written.
    def writeExpression(oldExp: Expression): Unit = ???

    @stub
    // Write the specified object to the output stream.
    protected def writeObject(o: Object): Unit = ???
}
