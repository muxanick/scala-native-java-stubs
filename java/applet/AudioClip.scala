package java.applet

/** The AudioClip interface is a simple abstraction for
 *  playing a sound clip. Multiple AudioClip items can be
 *  playing at the same time, and the resulting sound is mixed
 *  together to produce a composite.
 */
trait AudioClip {

    /** Starts playing this audio clip in a loop. */
    @stub
    def loop(): Unit = ???

    /** Starts playing this audio clip. */
    @stub
    def play(): Unit = ???
}
