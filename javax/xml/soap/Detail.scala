package javax.xml.soap

import javax.xml.namespace.QName

// A container for DetailEntry objects. DetailEntry
// objects give detailed error information that is application-specific and
// related to the SOAPBody object that contains it.
//
// A Detail object, which is part of a SOAPFault
// object, can be retrieved using the method SOAPFault.getDetail.
// The Detail interface provides two methods. One creates a new
// DetailEntry object and also automatically adds it to
// the Detail object. The second method gets a list of the
// DetailEntry objects contained in a Detail
// object.
// 
// The following code fragment, in which sf is a SOAPFault
// object, gets its Detail object (d), adds a new
// DetailEntry object to d, and then gets a list of all the
// DetailEntry objects in d. The code also creates a
// Name object to pass to the method addDetailEntry.
// The variable se, used to create the Name object,
// is a SOAPEnvelope object.
// 
//    Detail d = sf.getDetail();
//    Name name = se.createName("GetLastTradePrice", "WOMBAT",
//                                "http://www.wombat.org/trader");
//    d.addDetailEntry(name);
//    Iterator it = d.getDetailEntries();
// 
trait Detail extends SOAPFaultElement {

    @stub
    // Creates a new DetailEntry object with the given
    // name and adds it to this Detail object.
    def addDetailEntry(name: Name): DetailEntry = ???

    @stub
    // Creates a new DetailEntry object with the given
    // QName and adds it to this Detail object.
    def addDetailEntry(qname: QName): DetailEntry = ???
}
