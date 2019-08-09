package javax.management

import java.lang.{Object, String}
import java.util.EventObject

// Provides definitions of the attribute change notifications sent by MBeans.
// 
// It's up to the MBean owning the attribute of interest to create and send
// attribute change notifications when the attribute change occurs.
// So the NotificationBroadcaster interface has to be implemented
// by any MBean for which an attribute change is of interest.
// 
// Example:
// If an MBean called myMbean needs to notify registered listeners
// when its attribute:
// 
//      String myString
// 
// is modified, myMbean creates and emits the following notification:
// 
// new AttributeChangeNotification(myMbean, sequenceNumber, timeStamp, msg,
//                                 "myString", "String", oldValue, newValue);
// 
class AttributeChangeNotification extends Notification {

    @stub
    // Gets the name of the attribute which has changed.
    def getAttributeName(): String = ???

    @stub
    // Gets the type of the attribute which has changed.
    def getAttributeType(): String = ???

    @stub
    // Gets the new value of the attribute which has changed.
    def getNewValue(): Object = ???
}
