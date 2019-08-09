package org.w3c.dom.events

import java.lang.{Exception, Object, RuntimeException, Throwable}

// Event operations may throw an EventException as specified in
// their method descriptions.
// See also the Document Object Model (DOM) Level 2 Events Specification.
class EventException extends RuntimeException {

    @stub
    // 
    def code: Short = ???
}
