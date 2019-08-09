package javax.xml.bind.helpers

import java.lang.Object
import javax.xml.bind.ValidationEventHandler

// 
// JAXB 1.0 only default validation event handler. This is the default
// handler for all objects created from a JAXBContext that is managing
// schema-derived code generated by a JAXB 1.0 binding compiler.
//
// 
// This handler causes the unmarshal and validate operations to fail on the first
// error or fatal error.
//
// 
// This handler is not the default handler for JAXB mapped classes following
// JAXB 2.0 or later versions. Default validation event handling has changed
// and is specified in  Unmarshaller and
// Marshaller.
class DefaultValidationEventHandler extends Object with ValidationEventHandler {
}