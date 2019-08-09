package javax.management

import java.lang.{Object, String}
import java.util.EventObject
import scala.scalanative.annotation.stub

/** Provides definitions of the attribute change notifications sent by MBeans.
 *  
 *  It's up to the MBean owning the attribute of interest to create and send
 *  attribute change notifications when the attribute change occurs.
 *  So the NotificationBroadcaster interface has to be implemented
 *  by any MBean for which an attribute change is of interest.
 *  
 *  Example:
 *  If an MBean called myMbean needs to notify registered listeners
 *  when its attribute:
 *  
 *       String myString
 *  
 *  is modified, myMbean creates and emits the following notification:
 *  
 *  new AttributeChangeNotification(myMbean, sequenceNumber, timeStamp, msg,
 *                                  "myString", "String", oldValue, newValue);
 *  
 */
class AttributeChangeNotification extends Notification {

    /** Constructs an attribute change notification object. */
    @stub
    def this(source: Object, sequenceNumber: Long, timeStamp: Long, msg: String, attributeName: String, attributeType: String, oldValue: Object, newValue: Object) = ???

    /** Gets the name of the attribute which has changed. */
    @stub
    def getAttributeName(): String = ???

    /** Gets the type of the attribute which has changed. */
    @stub
    def getAttributeType(): String = ???

    /** Gets the new value of the attribute which has changed. */
    @stub
    def getNewValue(): Object = ???

    /** Gets the old value of the attribute which has changed. */
    @stub
    def getOldValue(): Object = ???
}

object AttributeChangeNotification {
    /** Notification type which indicates that the observed MBean attribute value has changed. */
    @stub
    val ATTRIBUTE_CHANGE: String = ???
}
