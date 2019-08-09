package java.net

import java.lang.Object
import scala.scalanative.annotation.stub

/** The multicast datagram socket class is useful for sending
 *  and receiving IP multicast packets.  A MulticastSocket is
 *  a (UDP) DatagramSocket, with additional capabilities for
 *  joining "groups" of other multicast hosts on the internet.
 *  
 *  A multicast group is specified by a class D IP address
 *  and by a standard UDP port number. Class D IP addresses
 *  are in the range 224.0.0.0 to 239.255.255.255,
 *  inclusive. The address 224.0.0.0 is reserved and should not be used.
 *  
 *  One would join a multicast group by first creating a MulticastSocket
 *  with the desired port, then invoking the
 *  joinGroup(InetAddress groupAddr)
 *  method:
 *  
 *  // join a Multicast group and send the group salutations
 *  ...
 *  String msg = "Hello";
 *  InetAddress group = InetAddress.getByName("228.5.6.7");
 *  MulticastSocket s = new MulticastSocket(6789);
 *  s.joinGroup(group);
 *  DatagramPacket hi = new DatagramPacket(msg.getBytes(), msg.length(),
 *                              group, 6789);
 *  s.send(hi);
 *  // get their responses!
 *  byte[] buf = new byte[1000];
 *  DatagramPacket recv = new DatagramPacket(buf, buf.length);
 *  s.receive(recv);
 *  ...
 *  // OK, I'm done talking - leave the group...
 *  s.leaveGroup(group);
 *  
 * 
 *  When one sends a message to a multicast group, all subscribing
 *  recipients to that host and port receive the message (within the
 *  time-to-live range of the packet, see below).  The socket needn't
 *  be a member of the multicast group to send messages to it.
 *  
 *  When a socket subscribes to a multicast group/port, it receives
 *  datagrams sent by other hosts to the group/port, as do all other
 *  members of the group and port.  A socket relinquishes membership
 *  in a group by the leaveGroup(InetAddress addr) method.  
 *  Multiple MulticastSocket's may subscribe to a multicast group
 *  and port concurrently, and they will all receive group datagrams.
 *  
 *  Currently applets are not allowed to use multicast sockets.
 */
class MulticastSocket extends DatagramSocket {

    /** Create a multicast socket. */
    @stub
    def this() = ???

    /** Create a multicast socket and bind it to a specific port. */
    @stub
    def this(port: Int) = ???

    /** Create a MulticastSocket bound to the specified socket address. */
    @stub
    def this(bindaddr: SocketAddress) = ???

    /** Retrieve the address of the network interface used for
     *  multicast packets.
     */
    @stub
    def getInterface(): InetAddress = ???

    /** Get the setting for local loopback of multicast datagrams. */
    @stub
    def getLoopbackMode(): Boolean = ???

    /** Get the multicast network interface set. */
    @stub
    def getNetworkInterface(): NetworkInterface = ???

    /** Get the default time-to-live for multicast packets sent out on
     *  the socket.
     */
    @stub
    def getTimeToLive(): Int = ???

    /** Deprecated. 
     * use the getTimeToLive method instead, which returns
     *  an int instead of a byte.
     * 
     */
    @stub
    def getTTL(): Byte = ???

    /** Joins a multicast group. */
    @stub
    def joinGroup(mcastaddr: InetAddress): Unit = ???

    /** Joins the specified multicast group at the specified interface. */
    @stub
    def joinGroup(mcastaddr: SocketAddress, netIf: NetworkInterface): Unit = ???

    /** Leave a multicast group. */
    @stub
    def leaveGroup(mcastaddr: InetAddress): Unit = ???

    /** Leave a multicast group on a specified local interface. */
    @stub
    def leaveGroup(mcastaddr: SocketAddress, netIf: NetworkInterface): Unit = ???

    /** Deprecated. 
     * Use the following code or its equivalent instead:
     *   ......
     *   int ttl = mcastSocket.getTimeToLive();
     *   mcastSocket.setTimeToLive(newttl);
     *   mcastSocket.send(p);
     *   mcastSocket.setTimeToLive(ttl);
     *   ......
     * 
     */
    @stub
    def send(p: DatagramPacket, ttl: Byte): Unit = ???

    /** Set the multicast network interface used by methods
     *  whose behavior would be affected by the value of the
     *  network interface.
     */
    @stub
    def setInterface(inf: InetAddress): Unit = ???

    /** Disable/Enable local loopback of multicast datagrams
     *  The option is used by the platform's networking code as a hint
     *  for setting whether multicast data will be looped back to
     *  the local socket.
     */
    @stub
    def setLoopbackMode(disable: Boolean): Unit = ???

    /** Specify the network interface for outgoing multicast datagrams
     *  sent on this socket.
     */
    @stub
    def setNetworkInterface(netIf: NetworkInterface): Unit = ???

    /** Set the default time-to-live for multicast packets sent out
     *  on this MulticastSocket in order to control the
     *  scope of the multicasts.
     */
    @stub
    def setTimeToLive(ttl: Int): Unit = ???

    /** Deprecated. 
     * use the setTimeToLive method instead, which uses
     *  int instead of byte as the type for ttl.
     * 
     */
    @stub
    def setTTL(ttl: Byte): Unit = ???
}
