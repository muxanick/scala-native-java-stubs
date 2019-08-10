package javax.sound.sampled

import scala.scalanative.annotation.stub

/** Ports are simple lines for input or output of audio to or from audio devices.
 *  Common examples of ports that act as source lines (mixer inputs) include the microphone,
 *  line input, and CD-ROM drive.  Ports that act as target lines (mixer outputs) include the
 *  speaker, headphone, and line output.  You can access port using a Port.Info
 *  object.
 */
trait Port extends Line {
}

object Port {
    /** The Port.Info class extends Line.Info
     *  with additional information specific to ports, including the port's name
     *  and whether it is a source or a target for its mixer.
     */
    type Info = Port_Info
}
