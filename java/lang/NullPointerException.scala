package java.lang

import scala.scalanative.annotation.stub

/** Thrown when an application attempts to use null in a
 *  case where an object is required. These include:
 *  
 *  Calling the instance method of a null object.
 *  Accessing or modifying the field of a null object.
 *  Taking the length of null as if it were an array.
 *  Accessing or modifying the slots of null as if it
 *      were an array.
 *  Throwing null as if it were a Throwable
 *      value.
 *  
 *  
 *  Applications should throw instances of this class to indicate
 *  other illegal uses of the null object.
 * 
 *  NullPointerException objects may be constructed by the
 *  virtual machine as if suppression were disabled and/or the
 *  stack trace was not writable.
 */
class NullPointerException extends RuntimeException {

    /** Constructs a NullPointerException with no detail message. */
    @stub
    def this() = ???

    /** Constructs a NullPointerException with the specified
     *  detail message.
     */
    @stub
    def this(s: String) = ???
}
