package javax.sound.midi

import java.io.{File, InputStream}
import java.lang.Object
import java.net.URL

// The MidiSystem class provides access to the installed MIDI
// system resources, including devices such as synthesizers, sequencers, and
// MIDI input and output ports.  A typical simple MIDI application might
// begin by invoking one or more MidiSystem methods to learn
// what devices are installed and to obtain the ones needed in that
// application.
// 
// The class also has methods for reading files, streams, and  URLs that
// contain standard MIDI file data or soundbanks.  You can query the
// MidiSystem for the format of a specified MIDI file.
// 
// You cannot instantiate a MidiSystem; all the methods are
// static.
//
// Properties can be used to specify default MIDI devices.
// Both system properties and a properties file are considered.
// The sound.properties properties file is read from
// an implementation-specific location (typically it is the lib
// directory in the Java installation directory).
// If a property exists both as a system property and in the
// properties file, the system property takes precedence. If none is
// specified, a suitable default is chosen among the available devices.
// The syntax of the properties file is specified in
// Properties.load. The
// following table lists the available property keys and which methods
// consider them:
//
// 
//  MIDI System Property Keys
//  
//   Property Key
//   Interface
//   Affected Method
//  
//  
//   javax.sound.midi.Receiver
//   Receiver
//   getReceiver()
//  
//  
//   javax.sound.midi.Sequencer
//   Sequencer
//   getSequencer()
//  
//  
//   javax.sound.midi.Synthesizer
//   Synthesizer
//   getSynthesizer()
//  
//  
//   javax.sound.midi.Transmitter
//   Transmitter
//   getTransmitter()
//  
// 
//
// The property value consists of the provider class name
// and the device name, separated by the hash mark ("#").
// The provider class name is the fully-qualified
// name of a concrete MIDI device provider class. The device name is matched against
// the String returned by the getName
// method of MidiDevice.Info.
// Either the class name, or the device name may be omitted.
// If only the class name is specified, the trailing hash mark
// is optional.
//
// If the provider class is specified, and it can be
// successfully retrieved from the installed providers,
// the list of
// MidiDevice.Info objects is retrieved
// from the provider. Otherwise, or when these devices
// do not provide a subsequent match, the list is retrieved
// from getMidiDeviceInfo() to contain
// all available MidiDevice.Info objects.
//
// If a device name is specified, the resulting list of
// MidiDevice.Info objects is searched:
// the first one with a matching name, and whose
// MidiDevice implements the
// respective interface, will be returned.
// If no matching MidiDevice.Info object
// is found, or the device name is not specified,
// the first suitable device from the resulting
// list will be returned. For Sequencer and Synthesizer,
// a device is suitable if it implements the respective
// interface; whereas for Receiver and Transmitter, a device is
// suitable if it
// implements neither Sequencer nor Synthesizer and provides
// at least one Receiver or Transmitter, respectively.
//
// For example, the property javax.sound.midi.Receiver
// with a value
// "com.sun.media.sound.MidiProvider#SunMIDI1"
// will have the following consequences when
// getReceiver is called:
// if the class com.sun.media.sound.MidiProvider exists
// in the list of installed MIDI device providers,
// the first Receiver device with name
// "SunMIDI1" will be returned. If it cannot
// be found, the first Receiver from that provider
// will be returned, regardless of name.
// If there is none, the first Receiver with name
// "SunMIDI1" in the list of all devices
// (as returned by getMidiDeviceInfo) will be returned,
// or, if not found, the first Receiver that can
// be found in the list of all devices is returned.
// If that fails, too, a MidiUnavailableException
// is thrown.
class MidiSystem extends Object {
}

object MidiSystem {
    @stub
    // Obtains the requested MIDI device.
    def getMidiDevice(info: MidiDevice.Info): MidiDevice = ???

    @stub
    // Obtains an array of information objects representing
    // the set of all MIDI devices available on the system.
    def getMidiDeviceInfo(): Array[MidiDevice.Info] = ???

    @stub
    // Obtains the MIDI file format of the specified File.
    def getMidiFileFormat(file: File): MidiFileFormat = ???

    @stub
    // Obtains the MIDI file format of the data in the specified input stream.
    def getMidiFileFormat(stream: InputStream): MidiFileFormat = ???

    @stub
    // Obtains the MIDI file format of the data in the specified URL.
    def getMidiFileFormat(url: URL): MidiFileFormat = ???

    @stub
    // Obtains the set of MIDI file types for which file writing support is
    // provided by the system.
    def getMidiFileTypes(): Array[Int] = ???

    @stub
    // Obtains the set of MIDI file types that the system can write from the
    // sequence specified.
    def getMidiFileTypes(sequence: Sequence): Array[Int] = ???

    @stub
    // Obtains a MIDI receiver from an external MIDI port
    // or other default device.
    def getReceiver(): Receiver = ???

    @stub
    // Obtains a MIDI sequence from the specified File.
    def getSequence(file: File): Sequence = ???

    @stub
    // Obtains a MIDI sequence from the specified input stream.
    def getSequence(stream: InputStream): Sequence = ???

    @stub
    // Obtains a MIDI sequence from the specified URL.
    def getSequence(url: URL): Sequence = ???

    @stub
    // Obtains the default Sequencer, connected to
    // a default device.
    def getSequencer(): Sequencer = ???

    @stub
    // Obtains the default Sequencer, optionally
    // connected to a default device.
    def getSequencer(connected: Boolean): Sequencer = ???

    @stub
    // Constructs a Soundbank by reading it from the specified
    // File.
    def getSoundbank(file: File): Soundbank = ???

    @stub
    // Constructs a MIDI sound bank by reading it from the specified stream.
    def getSoundbank(stream: InputStream): Soundbank = ???

    @stub
    // Constructs a Soundbank by reading it from the specified URL.
    def getSoundbank(url: URL): Soundbank = ???

    @stub
    // Obtains the default synthesizer.
    def getSynthesizer(): Synthesizer = ???

    @stub
    // Obtains a MIDI transmitter from an external MIDI port
    // or other default source.
    def getTransmitter(): Transmitter = ???

    @stub
    // Indicates whether file writing support for the specified MIDI file type
    // is provided by the system.
    def isFileTypeSupported(fileType: Int): Boolean = ???

    @stub
    // Indicates whether a MIDI file of the file type specified can be written
    // from the sequence indicated.
    def isFileTypeSupported(fileType: Int, sequence: Sequence): Boolean = ???

    @stub
    // Writes a stream of bytes representing a file of the MIDI file type
    // indicated to the external file provided.
    def write(in: Sequence, type: Int, out: File): Int = ???
}
