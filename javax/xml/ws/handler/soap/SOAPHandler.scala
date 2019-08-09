package javax.xml.ws.handler.soap

import javax.xml.ws.handler.Handler

// The SOAPHandler class extends Handler
//  to provide typesafety for the message context parameter and add a method
//  to obtain access to the headers that may be processed by the handler.
trait SOAPHandler[T <: SOAPMessageContext] extends Handler[T] {
}
