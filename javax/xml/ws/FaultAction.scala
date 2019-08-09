package javax.xml.ws

import java.lang.annotation.{Documented, ElementType, Retention, RetentionPolicy, Target}

// The FaultAction annotation is used inside an Action
// annotation to allow an explicit association of a WS-Addressing
// Action message addressing property with the fault
// messages of the WSDL operation mapped from the exception class.
// 
// The wsam:Action attribute value in the fault
// message in the generated WSDL operation mapped for className
// class is equal to the corresponding value in the FaultAction.
// For the exact computation of wsam:Action values for the
// fault messages, refer to the algorithm in the JAX-WS specification.
//
// 
// Example 1: Specify explicit values for Action message addressing
// property for the input, output and fault message
// if the Java method throws only one service specific exception.
//
// 
// @WebService(targetNamespace="http://example.com/numbers")
// public class AddNumbersImpl {
//     @Action(
//         fault = {
//             @FaultAction(className=AddNumbersException.class, value="http://example.com/faultAction")
//         })
//     public int addNumbers(int number1, int number2)
//         throws AddNumbersException {
//         return number1 + number2;
//     }
// }
// 
//
// The generated WSDL looks like:
//
// 
//   <definitions targetNamespace="http://example.com/numbers" ...>
//     ...
//     <portType name="AddNumbersPortType">
//       <operation name="AddNumbers">
//         ...
//         <fault message="tns:AddNumbersException" name="AddNumbersException"
//           wsam:Action="http://example.com/faultAction"/>
//       </operation>
//     </portType>
//     ...
//   </definitions>
// 
//
// 
// Example 2: Here is an example that shows if the explicit value for Action
// message addressing property for the service specific exception is not present.
//
// 
// @WebService(targetNamespace="http://example.com/numbers")
// public class AddNumbersImpl {
//     public int addNumbers(int number1, int number2)
//         throws AddNumbersException {
//         return number1 + number2;
//     }
// }
// 
//
// The generated WSDL looks like:
//
// 
//   <definitions targetNamespace="http://example.com/numbers" ...>
//     ...
//     <portType name="AddNumbersPortType">
//       <operation name="AddNumbers">
//         ...
//         <fault message="tns:addNumbersFault" name="InvalidNumbers"
//           wsam:Action="http://example.com/numbers/AddNumbersPortType/AddNumbers/Fault/AddNumbersException"/>
//       </operation>
//     </portType>
//     ...
//   </definitions>
// 
//
// 
// Example 3: Here is an example that shows how to specify explicit values for Action
// message addressing property if the Java method throws more than one service specific exception.
//
// 
// @WebService(targetNamespace="http://example.com/numbers")
// public class AddNumbersImpl {
//     @Action(
//         fault = {
//             @FaultAction(className=AddNumbersException.class, value="http://example.com/addFaultAction"),
//             @FaultAction(className=TooBigNumbersException.class, value="http://example.com/toobigFaultAction")
//         })
//     public int addNumbers(int number1, int number2)
//         throws AddNumbersException, TooBigNumbersException {
//         return number1 + number2;
//     }
// }
// 
//
// The generated WSDL looks like:
//
// 
//   <definitions targetNamespace="http://example.com/numbers" ...>
//     ...
//     <portType name="AddNumbersPortType">
//       <operation name="AddNumbers">
//         ...
//         <fault message="tns:addNumbersFault" name="AddNumbersException"
//           wsam:Action="http://example.com/addFaultAction"/>
//         <fault message="tns:tooBigNumbersFault" name="TooBigNumbersException"
//           wsam:Action="http://example.com/toobigFaultAction"/>
//       </operation>
//     </portType>
//     ...
//   </definitions>
// 
@Documented @Retention ( value = RUNTIME ) @Target ( value = METHOD ) @interface FaultAction {
}
