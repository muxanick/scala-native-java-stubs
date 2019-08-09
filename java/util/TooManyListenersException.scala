package java.util

import java.lang.{Exception, Object, Throwable}

/** 
 *  The  TooManyListenersException  Exception is used as part of
 *  the Java Event model to annotate and implement a unicast special case of
 *  a multicast Event Source.
 *  
 *  
 *  The presence of a "throws TooManyListenersException" clause on any given
 *  concrete implementation of the normally multicast "void addXyzEventListener"
 *  event listener registration pattern is used to annotate that interface as
 *  implementing a unicast Listener special case, that is, that one and only
 *  one Listener may be registered on the particular event listener source
 *  concurrently.
 *  
 */
class TooManyListenersException extends Exception {

    /** Constructs a TooManyListenersException with no detail message. */
    @stub
    def this() = ???
}
