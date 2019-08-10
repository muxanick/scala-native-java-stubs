package javax.xml.bind

import java.lang.Object
import scala.scalanative.annotation.stub

/** 
 *  Register an instance of an implementation of this class with Unmarshaller to externally listen
 *  for unmarshal events.
 *  
 *  
 *  This class enables pre and post processing of an instance of a JAXB mapped class
 *  as XML data is unmarshalled into it. The event callbacks are called when unmarshalling
 *  XML content into a JAXBElement instance or a JAXB mapped class that represents a complex type definition.
 *  The event callbacks are not called when unmarshalling to an instance of a
 *  Java datatype that represents a simple type definition.
 *  
 *  
 *  External listener is one of two different mechanisms for defining unmarshal event callbacks.
 *  See Unmarshal Event Callbacks for an overview.
 *  
 *  (@link #setListener(Listener)}
 *  (@link #getListener()}
 */
object abstract Unmarshaller_Listener extends Object {

    /**  */
    @stub
    def Listener() = ???

    /** 
     *  Callback method invoked after unmarshalling XML data into target.
     */
    @stub
    def afterUnmarshal(target: Any, parent: Any): Unit = ???

    /** 
     *  Callback method invoked before unmarshalling into target.
     */
    @stub
    def beforeUnmarshal(target: Any, parent: Any): Unit = ???
}
