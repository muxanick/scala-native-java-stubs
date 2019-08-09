package javax.xml.ws.soap

import java.lang.{Exception, Object, RuntimeException, Throwable}
import javax.xml.ws.{ProtocolException, WebServiceException}

// The SOAPFaultException exception represents a
//  SOAP 1.1 or 1.2 fault.
//
//  A SOAPFaultException wraps a SAAJ SOAPFault
//  that manages the SOAP-specific representation of faults.
//  The createFault method of
//  javax.xml.soap.SOAPFactory may be used to create an instance
//  of javax.xml.soap.SOAPFault for use with the
//  constructor. SOAPBinding contains an accessor for the
//  SOAPFactory used by the binding instance.
//
//  Note that the value of getFault is the only part of the
//  exception used when searializing a SOAP fault.
//
//  Refer to the SOAP specification for a complete
//  description of SOAP faults.
class SOAPFaultException extends ProtocolException {
}
