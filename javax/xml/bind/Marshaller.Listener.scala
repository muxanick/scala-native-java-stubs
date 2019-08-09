package javax.xml.bind

import java.lang.Object

/** 
 *  Register an instance of an implementation of this class with a Marshaller to externally listen
 *  for marshal events.
 *  
 *  
 *  This class enables pre and post processing of each marshalled object.
 *  The event callbacks are called when marshalling from an instance that maps to an xml element or
 *  complex type definition. The event callbacks are not called when marshalling from an instance of a
 *  Java datatype that represents a simple type definition.
 *  
 *  
 *  External listener is one of two different mechanisms for defining marshal event callbacks.
 *  See Marshal Event Callbacks for an overview.
 */
object abstract Marshaller.Listener extends Object {

    /** 
     *  Callback method invoked after marshalling source to XML.
     */
    @stub
    def afterMarshal(source: Object): Unit = ???
}
