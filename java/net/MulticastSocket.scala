package java.net

import java.lang.Object

// The multicast datagram socket class is useful for sending
// and receiving IP multicast packets.  A MulticastSocket is
// a (UDP) DatagramSocket, with additional capabilities for
// joining "groups" of other multicast hosts on the internet.
// 
// A multicast group is specified by a class D IP address
// and by a standard UDP port number. Class D IP addresses
// are in the range 224.0.0.0 to 239.255.255.255,
// inclusive. The address 224.0.0.0 is reserved and should not be used.
// 
// One would join a multicast group by first creating a MulticastSocket
// with the desired port, then invoking the
// joinGroup(InetAddress groupAddr)
// method:
// 
// // join a Multicast group and send the group salutations
// ...
// String msg = "Hello";
// InetAddress group = InetAddress.getByName("228.5.6.7");
// MulticastSocket s = new MulticastSocket(6789);
// s.joinGroup(group);
// DatagramPacket hi = new DatagramPacket(msg.getBytes(), msg.length(),
//                             group, 6789);
// s.send(hi);
// // get their responses!
// byte[] buf = new byte[1000];
// DatagramPacket recv = new DatagramPacket(buf, buf.length);
// s.receive(recv);
// ...
// // OK, I'm done talking - leave the group...
// s.leaveGroup(group);
// 
//
// When one sends a message to a multicast group, all subscribing
// recipients to that host and port receive the message (within the
// time-to-live range of the packet, see below).  The socket needn't
// be a member of the multicast group to send messages to it.
// 
// When a socket subscribes to a multicast group/port, it receives
// datagrams sent by other hosts to the group/port, as do all other
// members of the group and port.  A socket relinquishes membership
// in a group by the leaveGroup(InetAddress addr) method.  
// Multiple MulticastSocket's may subscribe to a multicast group
// and port concurrently, and they will all receive group datagrams.
// 
// Currently applets are not allowed to use multicast sockets.
class MulticastSocket extends DatagramSocket {

    @stub
    // Create a multicast socket.
    def this() = ???

    @stub
    // Create a multicast socket and bind it to a specific port.
    def this(port: Int) = ???

    @stub
    // Retrieve the address of the network interface used for
    // multicast packets.
    def getInterface(): InetAddress = ???

    @stub
    // Get the setting for local loopback of multicast datagrams.
    def getLoopbackMode(): Boolean = ???

    @stub
    // Get the multicast network interface set.
    def getNetworkInterface(): NetworkInterface = ???

    @stub
    // Get the default time-to-live for multicast packets sent out on
    // the socket.
    def getTimeToLive(): Int = ???

    @stub
    // Deprecated. 
    //use the getTimeToLive method instead, which returns
    // an int instead of a byte.
    //
    def getTTL(): Byte = ???

    @stub
    // Joins a multicast group.
    def joinGroup(mcastaddr: InetAddress): Unit = ???

    @stub
    // Joins the specified multicast group at the specified interface.
    def joinGroup(mcastaddr: SocketAddress, netIf: NetworkInterface): Unit = ???

    @stub
    // Leave a multicast group.
    def leaveGroup(mcastaddr: InetAddress): Unit = ???

    @stub
    // Leave a multicast group on a specified local interface.
    def leaveGroup(mcastaddr: SocketAddress, netIf: NetworkInterface): Unit = ???

    @stub
    // Deprecated. 
    //Use the following code or its equivalent instead:
    //  ......
    //  int ttl = mcastSocket.getTimeToLive();
    //  mcastSocket.setTimeToLive(newttl);
    //  mcastSocket.send(p);
    //  mcastSocket.setTimeToLive(ttl);
    //  ......
    //
    def send(p: DatagramPacket, ttl: Byte): Unit = ???

    @stub
    // Set the multicast network interface used by methods
    // whose behavior would be affected by the value of the
    // network interface.
    def setInterface(inf: InetAddress): Unit = ???

    @stub
    // Disable/Enable local loopback of multicast datagrams
    // The option is used by the platform's networking code as a hint
    // for setting whether multicast data will be looped back to
    // the local socket.
    def setLoopbackMode(disable: Boolean): Unit = ???

    @stub
    // Specify the network interface for outgoing multicast datagrams
    // sent on this socket.
    def setNetworkInterface(netIf: NetworkInterface): Unit = ???

    @stub
    // Set the default time-to-live for multicast packets sent out
    // on this MulticastSocket in order to control the
    // scope of the multicasts.
    def setTimeToLive(ttl: Int): Unit = ???
}
