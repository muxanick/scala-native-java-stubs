package javax.sound.midi

import java.io.{File, InputStream, OutputStream}
import java.lang.Object
import java.net.URL
import scala.scalanative.annotation.stub

/** The MidiSystem class provides access to the installed MIDI
 *  system resources, including devices such as synthesizers, sequencers, and
 *  MIDI input and output ports.  A typical simple MIDI application might
 *  begin by invoking one or more MidiSystem methods to learn
 *  what devices are installed and to obtain the ones needed in that
 *  application.
 *  
 *  The class also has methods for reading files, streams, and  URLs that
 *  contain standard MIDI file data or soundbanks.  You can query the
 *  MidiSystem for the format of a specified MIDI file.
 *  
 *  You cannot instantiate a MidiSystem; all the methods are
 *  static.
 * 
 *  Properties can be used to specify default MIDI devices.
 *  Both system properties and a properties file are considered.
 *  The sound.properties properties file is read from
 *  an implementation-specific location (typically it is the lib
 *  directory in the Java installation directory).
 *  If a property exists both as a system property and in the
 *  properties file, the system property takes precedence. If none is
 *  specified, a suitable default is chosen among the available devices.
 *  The syntax of the properties file is specified in
 *  Properties.load. The
 *  following table lists the available property keys and which methods
 *  consider them:
 * 
 *  
 *   MIDI System Property Keys
 *   
 *    Property Key
 *    Interface
 *    Affected Method
 *   
 *   
 *    javax.sound.midi.Receiver
 *    Receiver
 *    getReceiver()
 *   
 *   
 *    javax.sound.midi.Sequencer
 *    Sequencer
 *    getSequencer()
 *   
 *   
 *    javax.sound.midi.Synthesizer
 *    Synthesizer
 *    getSynthesizer()
 *   
 *   
 *    javax.sound.midi.Transmitter
 *    Transmitter
 *    getTransmitter()
 *   
 *  
 * 
 *  The property value consists of the provider class name
 *  and the device name, separated by the hash mark ("#").
 *  The provider class name is the fully-qualified
 *  name of a concrete MIDI device provider class. The device name is matched against
 *  the String returned by the getName
 *  method of MidiDevice.Info.
 *  Either the class name, or the device name may be omitted.
 *  If only the class name is specified, the trailing hash mark
 *  is optional.
 * 
 *  If the provider class is specified, and it can be
 *  successfully retrieved from the installed providers,
 *  the list of
 *  MidiDevice.Info objects is retrieved
 *  from the provider. Otherwise, or when these devices
 *  do not provide a subsequent match, the list is retrieved
 *  from getMidiDeviceInfo() to contain
 *  all available MidiDevice.Info objects.
 * 
 *  If a device name is specified, the resulting list of
 *  MidiDevice.Info objects is searched:
 *  the first one with a matching name, and whose
 *  MidiDevice implements the
 *  respective interface, will be returned.
 *  If no matching MidiDevice.Info object
 *  is found, or the device name is not specified,
 *  the first suitable device from the resulting
 *  list will be returned. For Sequencer and Synthesizer,
 *  a device is suitable if it implements the respective
 *  interface; whereas for Receiver and Transmitter, a device is
 *  suitable if it
 *  implements neither Sequencer nor Synthesizer and provides
 *  at least one Receiver or Transmitter, respectively.
 * 
 *  For example, the property javax.sound.midi.Receiver
 *  with a value
 *  "com.sun.media.sound.MidiProvider#SunMIDI1"
 *  will have the following consequences when
 *  getReceiver is called:
 *  if the class com.sun.media.sound.MidiProvider exists
 *  in the list of installed MIDI device providers,
 *  the first Receiver device with name
 *  "SunMIDI1" will be returned. If it cannot
 *  be found, the first Receiver from that provider
 *  will be returned, regardless of name.
 *  If there is none, the first Receiver with name
 *  "SunMIDI1" in the list of all devices
 *  (as returned by getMidiDeviceInfo) will be returned,
 *  or, if not found, the first Receiver that can
 *  be found in the list of all devices is returned.
 *  If that fails, too, a MidiUnavailableException
 *  is thrown.
 */
class MidiSystem extends Object {
}

object MidiSystem {
    /** Obtains the requested MIDI device. */
    @stub
    def getMidiDevice(info: MidiDevice.Info): MidiDevice = ???

    /** Obtains an array of information objects representing
     *  the set of all MIDI devices available on the system.
     */
    @stub
    def getMidiDeviceInfo(): Array[MidiDevice.Info] = ???

    /** Obtains the MIDI file format of the specified File. */
    @stub
    def getMidiFileFormat(file: File): MidiFileFormat = ???

    /** Obtains the MIDI file format of the data in the specified input stream. */
    @stub
    def getMidiFileFormat(stream: InputStream): MidiFileFormat = ???

    /** Obtains the MIDI file format of the data in the specified URL. */
    @stub
    def getMidiFileFormat(url: URL): MidiFileFormat = ???

    /** Obtains the set of MIDI file types for which file writing support is
     *  provided by the system.
     */
    @stub
    def getMidiFileTypes(): Array[Int] = ???

    /** Obtains the set of MIDI file types that the system can write from the
     *  sequence specified.
     */
    @stub
    def getMidiFileTypes(sequence: Sequence): Array[Int] = ???

    /** Obtains a MIDI receiver from an external MIDI port
     *  or other default device.
     */
    @stub
    def getReceiver(): Receiver = ???

    /** Obtains a MIDI sequence from the specified File. */
    @stub
    def getSequence(file: File): Sequence = ???

    /** Obtains a MIDI sequence from the specified input stream. */
    @stub
    def getSequence(stream: InputStream): Sequence = ???

    /** Obtains a MIDI sequence from the specified URL. */
    @stub
    def getSequence(url: URL): Sequence = ???

    /** Obtains the default Sequencer, connected to
     *  a default device.
     */
    @stub
    def getSequencer(): Sequencer = ???

    /** Obtains the default Sequencer, optionally
     *  connected to a default device.
     */
    @stub
    def getSequencer(connected: Boolean): Sequencer = ???

    /** Constructs a Soundbank by reading it from the specified
     *  File.
     */
    @stub
    def getSoundbank(file: File): Soundbank = ???

    /** Constructs a MIDI sound bank by reading it from the specified stream. */
    @stub
    def getSoundbank(stream: InputStream): Soundbank = ???

    /** Constructs a Soundbank by reading it from the specified URL. */
    @stub
    def getSoundbank(url: URL): Soundbank = ???

    /** Obtains the default synthesizer. */
    @stub
    def getSynthesizer(): Synthesizer = ???

    /** Obtains a MIDI transmitter from an external MIDI port
     *  or other default source.
     */
    @stub
    def getTransmitter(): Transmitter = ???

    /** Indicates whether file writing support for the specified MIDI file type
     *  is provided by the system.
     */
    @stub
    def isFileTypeSupported(fileType: Int): Boolean = ???

    /** Indicates whether a MIDI file of the file type specified can be written
     *  from the sequence indicated.
     */
    @stub
    def isFileTypeSupported(fileType: Int, sequence: Sequence): Boolean = ???

    /** Writes a stream of bytes representing a file of the MIDI file type
     *  indicated to the external file provided.
     */
    @stub
    def write(in: Sequence, type: Int, out: File): Int = ???

    /** Writes a stream of bytes representing a file of the MIDI file type
     *  indicated to the output stream provided.
     */
    @stub
    def write(in: Sequence, fileType: Int, out: OutputStream): Int = ???
}
