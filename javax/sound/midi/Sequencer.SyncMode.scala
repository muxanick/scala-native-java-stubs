package javax.sound.midi

import java.lang.Object

// A SyncMode object represents one of the ways in which
// a MIDI sequencer's notion of time can be synchronized with a master
// or slave device.
// If the sequencer is being synchronized to a master, the
// sequencer revises its current time in response to messages from
// the master.  If the sequencer has a slave, the sequencer
// similarly sends messages to control the slave's timing.
// 
// There are three predefined modes that specify possible masters
// for a sequencer: INTERNAL_CLOCK,
// MIDI_SYNC, and MIDI_TIME_CODE.  The
// latter two work if the sequencer receives MIDI messages from
// another device.  In these two modes, the sequencer's time gets reset
// based on system real-time timing clock messages or MIDI time code
// (MTC) messages, respectively.  These two modes can also be used
// as slave modes, in which case the sequencer sends the corresponding
// types of MIDI messages to its receiver (whether or not the sequencer
// is also receiving them from a master).  A fourth mode,
// NO_SYNC, is used to indicate that the sequencer should
// not control its receiver's timing.
object Sequencer.SyncMode extends Object {

    @stub
    // A master synchronization mode that makes the sequencer get
    // its timing information from its internal clock.
    def INTERNAL_CLOCK: Sequencer.SyncMode = ???

    @stub
    // A master or slave synchronization mode that specifies the
    // use of MIDI clock
    // messages.
    def MIDI_SYNC: Sequencer.SyncMode = ???

    @stub
    // A master or slave synchronization mode that specifies the
    // use of MIDI Time Code.
    def MIDI_TIME_CODE: Sequencer.SyncMode = ???

    @stub
    // Determines whether two objects are equal.
    def equals(obj: Object): Boolean = ???

    @stub
    // Finalizes the hashcode method.
    def hashCode(): Int = ???
}