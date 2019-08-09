package java.net

import java.lang.{Object, String}
import java.util.{Enumeration, List}

// This class represents a Network Interface made up of a name,
// and a list of IP addresses assigned to this interface.
// It is used to identify the local interface on which a multicast group
// is joined.
//
// Interfaces are normally known by names such as "le0".
final class NetworkInterface extends Object {

    @stub
    // Compares this object against the specified object.
    def equals(obj: Object): Boolean = ???

    @stub
    // Get the display name of this network interface.
    def getDisplayName(): String = ???

    @stub
    // Returns the hardware address (usually MAC) of the interface if it
    // has one and if it can be accessed given the current privileges.
    def getHardwareAddress(): Array[Byte] = ???

    @stub
    // Returns the index of this network interface.
    def getIndex(): Int = ???

    @stub
    // Convenience method to return an Enumeration with all or a
    // subset of the InetAddresses bound to this network interface.
    def getInetAddresses(): Enumeration[InetAddress] = ???

    @stub
    // Get a List of all or a subset of the InterfaceAddresses
    // of this network interface.
    def getInterfaceAddresses(): List[InterfaceAddress] = ???

    @stub
    // Returns the Maximum Transmission Unit (MTU) of this interface.
    def getMTU(): Int = ???

    @stub
    // Get the name of this network interface.
    def getName(): String = ???

    @stub
    // Returns the parent NetworkInterface of this interface if this is
    // a subinterface, or null if it is a physical
    // (non virtual) interface or has no parent.
    def getParent(): NetworkInterface = ???

    @stub
    // Get an Enumeration with all the subinterfaces (also known as virtual
    // interfaces) attached to this network interface.
    def getSubInterfaces(): Enumeration[NetworkInterface] = ???

    @stub
    // Returns a hash code value for the object.
    def hashCode(): Int = ???

    @stub
    // Returns whether a network interface is a loopback interface.
    def isLoopback(): Boolean = ???

    @stub
    // Returns whether a network interface is a point to point interface.
    def isPointToPoint(): Boolean = ???

    @stub
    // Returns whether a network interface is up and running.
    def isUp(): Boolean = ???

    @stub
    // Returns whether this interface is a virtual interface (also called
    // subinterface).
    def isVirtual(): Boolean = ???

    @stub
    // Returns whether a network interface supports multicasting or not.
    def supportsMulticast(): Boolean = ???
}

object NetworkInterface {
    @stub
    // Get a network interface given its index.
    def getByIndex(index: Int): NetworkInterface = ???

    @stub
    // Convenience method to search for a network interface that
    // has the specified Internet Protocol (IP) address bound to
    // it.
    def getByInetAddress(addr: InetAddress): NetworkInterface = ???

    @stub
    // Searches for the network interface with the specified name.
    def getByName(name: String): NetworkInterface = ???

    @stub
    // Returns all the interfaces on this machine.
    def getNetworkInterfaces(): Enumeration[NetworkInterface] = ???
}
