package java.beans

import java.lang.{Class, Object}
import scala.scalanative.annotation.stub

/** An Encoder is a class which can be used to create
 *  files or streams that encode the state of a collection of
 *  JavaBeans in terms of their public APIs. The Encoder,
 *  in conjunction with its persistence delegates, is responsible for
 *  breaking the object graph down into a series of Statementss
 *  and Expressions which can be used to create it.
 *  A subclass typically provides a syntax for these expressions
 *  using some human readable form - like Java source code or XML.
 */
class Encoder extends Object {

    /**  */
    @stub
    def this() = ???

    /** Returns a tentative value for oldInstance in
     *  the environment created by this stream.
     */
    @stub
    def get(oldInstance: Object): Object = ???

    /** Gets the exception handler for this stream. */
    @stub
    def getExceptionListener(): ExceptionListener = ???

    /** Returns the persistence delegate for the given type. */
    @stub
    def getPersistenceDelegate(type: Class[_]): PersistenceDelegate = ???

    /** Removes the entry for this instance, returning the old entry. */
    @stub
    def remove(oldInstance: Object): Object = ???

    /** Sets the exception handler for this stream to exceptionListener. */
    @stub
    def setExceptionListener(exceptionListener: ExceptionListener): Unit = ???

    /** Associates the specified persistence delegate with the given type. */
    @stub
    def setPersistenceDelegate(type: Class[_], delegate: PersistenceDelegate): Unit = ???

    /** The implementation first checks to see if an
     *  expression with this value has already been written.
     */
    @stub
    def writeExpression(oldExp: Expression): Unit = ???

    /** Write the specified object to the output stream. */
    @stub
    protected def writeObject(o: Object): Unit = ???

    /** Writes statement oldStm to the stream. */
    @stub
    def writeStatement(oldStm: Statement): Unit = ???
}
