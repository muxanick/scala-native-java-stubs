package javax.sound.midi

import java.lang.Object

/** A Patch object represents a location, on a MIDI
 *  synthesizer, into which a single instrument is stored (loaded).
 *  Every Instrument object has its own Patch
 *  object that specifies the memory location
 *  into which that instrument should be loaded. The
 *  location is specified abstractly by a bank index and a program number (not by
 *  any scheme that directly refers to a specific address or offset in RAM).
 *  This is a hierarchical indexing scheme: MIDI provides for up to 16384 banks,
 *  each of which contains up to 128 program locations.  For example, a
 *  minimal sort of synthesizer might have only one bank of instruments, and
 *  only 32 instruments (programs) in that bank.
 *  
 *  To select what instrument should play the notes on a particular MIDI
 *  channel, two kinds of MIDI message are used that specify a patch location:
 *  a bank-select command, and a program-change channel command.  The Java Sound
 *  equivalent is the
 *  programChange(int, int)
 *  method of MidiChannel.
 */
class Patch extends Object {

    /** Returns the number of the bank that contains the instrument
     *  whose location this Patch specifies.
     */
    @stub
    def getBank(): Int = ???
}
