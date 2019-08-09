package java.net

import java.lang.{Object, String}
import java.util.{Enumeration, List}
import scala.scalanative.annotation.stub

/** This class represents a Network Interface made up of a name,
 *  and a list of IP addresses assigned to this interface.
 *  It is used to identify the local interface on which a multicast group
 *  is joined.
 * 
 *  Interfaces are normally known by names such as "le0".
 */
final class NetworkInterface extends Object {

    /** Compares this object against the specified object. */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Get the display name of this network interface. */
    @stub
    def getDisplayName(): String = ???

    /** Returns the hardware address (usually MAC) of the interface if it
     *  has one and if it can be accessed given the current privileges.
     */
    @stub
    def getHardwareAddress(): Array[Byte] = ???

    /** Returns the index of this network interface. */
    @stub
    def getIndex(): Int = ???

    /** Convenience method to return an Enumeration with all or a
     *  subset of the InetAddresses bound to this network interface.
     */
    @stub
    def getInetAddresses(): Enumeration[InetAddress] = ???

    /** Get a List of all or a subset of the InterfaceAddresses
     *  of this network interface.
     */
    @stub
    def getInterfaceAddresses(): List[InterfaceAddress] = ???

    /** Returns the Maximum Transmission Unit (MTU) of this interface. */
    @stub
    def getMTU(): Int = ???

    /** Get the name of this network interface. */
    @stub
    def getName(): String = ???

    /** Returns the parent NetworkInterface of this interface if this is
     *  a subinterface, or null if it is a physical
     *  (non virtual) interface or has no parent.
     */
    @stub
    def getParent(): NetworkInterface = ???

    /** Get an Enumeration with all the subinterfaces (also known as virtual
     *  interfaces) attached to this network interface.
     */
    @stub
    def getSubInterfaces(): Enumeration[NetworkInterface] = ???

    /** Returns a hash code value for the object. */
    @stub
    def hashCode(): Int = ???

    /** Returns whether a network interface is a loopback interface. */
    @stub
    def isLoopback(): Boolean = ???

    /** Returns whether a network interface is a point to point interface. */
    @stub
    def isPointToPoint(): Boolean = ???

    /** Returns whether a network interface is up and running. */
    @stub
    def isUp(): Boolean = ???

    /** Returns whether this interface is a virtual interface (also called
     *  subinterface).
     */
    @stub
    def isVirtual(): Boolean = ???

    /** Returns whether a network interface supports multicasting or not. */
    @stub
    def supportsMulticast(): Boolean = ???

    /** Returns a string representation of the object. */
    @stub
    def toString(): String = ???
}

object NetworkInterface {
    /** Get a network interface given its index. */
    @stub
    def getByIndex(index: Int): NetworkInterface = ???

    /** Convenience method to search for a network interface that
     *  has the specified Internet Protocol (IP) address bound to
     *  it.
     */
    @stub
    def getByInetAddress(addr: InetAddress): NetworkInterface = ???

    /** Searches for the network interface with the specified name. */
    @stub
    def getByName(name: String): NetworkInterface = ???

    /** Returns all the interfaces on this machine. */
    @stub
    def getNetworkInterfaces(): Enumeration[NetworkInterface] = ???
}
