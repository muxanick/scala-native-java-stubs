package javax.xml.ws

import java.lang.String
import java.lang.annotation.{Documented, ElementType, Retention, RetentionPolicy, Target}
import scala.annotation.StaticAnnotation

/** The Action annotation allows explicit association of a
 *  WS-Addressing Action message addressing property with
 *  input, output, and
 *  fault messages of the mapped WSDL operation.
 *  
 *  This annotation can be specified on each method of a service endpoint interface.
 *  For such a method, the mapped operation in the generated WSDL's
 *  wsam:Action attribute on the WSDL input,
 *  output and fault messages of the WSDL operation
 *  is based upon which attributes of the Action annotation have been specified.
 *  For the exact computation of wsam:Action values for the messages, refer
 *  to the algorithm in the JAX-WS specification.
 *  
 *  Example 1: Specify explicit values for Action message addressing property
 *  for input and output messages.
 * 
 *  
 *  @WebService(targetNamespace="http://example.com/numbers")
 *  public class AddNumbersImpl {
 *      @Action(
 *          input="http://example.com/inputAction",
 *          output="http://example.com/outputAction")
 *      public int addNumbers(int number1, int number2) {
 *          return number1 + number2;
 *      }
 *  }
 *  
 * 
 *  The generated WSDL looks like:
 *  
 *    <definitions targetNamespace="http://example.com/numbers" ...>
 *      ...
 *      <portType name="AddNumbersPortType">
 *        <operation name="AddNumbers">
 *          <input message="tns:AddNumbersInput" name="foo"
 *            wsam:Action="http://example.com/inputAction"/>
 *          <output message="tns:AddNumbersOutput" name="bar"
 *            wsam:Action="http://example.com/outputAction"/>
 *        </operation>
 *      </portType>
 *      ...
 *    </definitions>
 *  
 * 
 *  
 *  Example 2: Specify explicit value for Action message addressing property
 *  for only the input message. The wsam:Action values for the
 *  WSDL output message are computed using the algorithm in the JAX-WS specification.
 * 
 *  
 *  @WebService(targetNamespace="http://example.com/numbers")
 *  public class AddNumbersImpl {
 *      @Action(input="http://example.com/inputAction")
 *      public int addNumbers(int number1, int number2) {
 *          return number1 + number2;
 *      }
 *  }
 *  
 * 
 *  The generated WSDL looks like:
 *  
 *    <definitions targetNamespace="http://example.com/numbers" ...>
 *      ...
 *      <portType name="AddNumbersPortType">
 *        <operation name="AddNumbers">
 *          <input message="tns:AddNumbersInput" name="foo"
 *            wsam:Action="http://example.com/inputAction" />
 *          <output message="tns:AddNumbersOutput" name="bar"
 *            wsam:Action="http://example.com/numbers/AddNumbersPortType/AddNumbersResponse"/>
 *        </operation>
 *      </portType>
 *      ...
 *    </definitions>
 *  
 * 
 *  It is legitimate to specify an explicit value for Action message addressing property for
 *  output message only. In this case, wsam:Action value for the
 *  WSDL input message is computed using the algorithm in the JAX-WS specification.
 * 
 *  
 *  Example 3: See FaultAction annotation for an example of
 *  how to specify an explicit value for Action message addressing property for the
 *  fault message.
 */
@Documented 
@Retention ( value = RUNTIME ) 
@Target ( value = METHOD ) 
 final class Action extends StaticAnnotation {

    /** Explicit value of the WS-Addressing Action message addressing property for the fault
     *  message(s) of the operation.
     */
    @stub
    val fault: Array[FaultAction] = ???

    /** Explicit value of the WS-Addressing Action message addressing property for the input
     *  message of the operation.
     */
    @stub
    val input: String = ???
}
