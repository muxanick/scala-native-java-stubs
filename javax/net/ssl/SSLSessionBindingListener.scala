package javax.net.ssl

import java.util.EventListener

/** This interface is implemented by objects which want to know when
 *  they are being bound or unbound from a SSLSession.  When either event
 *  occurs via SSLSession.putValue(String, Object)
 *  or SSLSession.removeValue(String), the event is communicated
 *  through a SSLSessionBindingEvent identifying the session.
 */
trait SSLSessionBindingListener extends EventListener {

    /** This is called to notify the listener that it is being bound into
     *  an SSLSession.
     */
    @stub
    def valueBound(event: SSLSessionBindingEvent): Unit = ???
}
