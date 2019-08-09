package javax.sound.midi

import java.io.InputStream

// A hardware or software device that plays back a MIDI
// sequence is known as a sequencer.
// A MIDI sequence contains lists of time-stamped MIDI data, such as
// might be read from a standard MIDI file.  Most
// sequencers also provide functions for creating and editing sequences.
// 
// The Sequencer interface includes methods for the following
// basic MIDI sequencer operations:
// 
// obtaining a sequence from MIDI file data
// starting and stopping playback
// moving to an arbitrary position in the sequence
// changing the tempo (speed) of playback
// synchronizing playback to an internal clock or to received MIDI
// messages
// controlling the timing of another device
// 
// In addition, the following operations are supported, either directly, or
// indirectly through objects that the Sequencer has access to:
// 
// editing the data by adding or deleting individual MIDI events or entire
// tracks
// muting or soloing individual tracks in the sequence
// notifying listener objects about any meta-events or
// control-change events encountered while playing back the sequence.
// 
trait Sequencer extends MidiDevice {

    @stub
    // Registers a controller event listener to receive notification
    // whenever the sequencer processes a control-change event of the
    // requested type or types.
    def addControllerEventListener(listener: ControllerEventListener, controllers: Array[Int]): Array[Int] = ???

    @stub
    // Registers a meta-event listener to receive
    // notification whenever a meta-event is encountered in the sequence
    // and processed by the sequencer.
    def addMetaEventListener(listener: MetaEventListener): Boolean = ???

    @stub
    // Obtains the number of repetitions for
    // playback.
    def getLoopCount(): Int = ???

    @stub
    // Obtains the end position of the loop,
    // in MIDI ticks.
    def getLoopEndPoint(): Long = ???

    @stub
    // Obtains the start position of the loop,
    // in MIDI ticks.
    def getLoopStartPoint(): Long = ???

    @stub
    // Obtains the current master synchronization mode for this sequencer.
    def getMasterSyncMode(): Sequencer.SyncMode = ???

    @stub
    // Obtains the set of master synchronization modes supported by this
    // sequencer.
    def getMasterSyncModes(): Array[Sequencer.SyncMode] = ???

    @stub
    // Obtains the length of the current sequence, expressed in microseconds,
    // or 0 if no sequence is set.
    def getMicrosecondLength(): Long = ???

    @stub
    // Obtains the current position in the sequence, expressed in
    // microseconds.
    def getMicrosecondPosition(): Long = ???

    @stub
    // Obtains the sequence on which the Sequencer is currently operating.
    def getSequence(): Sequence = ???

    @stub
    // Obtains the current slave synchronization mode for this sequencer.
    def getSlaveSyncMode(): Sequencer.SyncMode = ???

    @stub
    // Obtains the set of slave synchronization modes supported by the sequencer.
    def getSlaveSyncModes(): Array[Sequencer.SyncMode] = ???

    @stub
    // Returns the current tempo factor for the sequencer.
    def getTempoFactor(): float = ???

    @stub
    // Obtains the current tempo, expressed in beats per minute.
    def getTempoInBPM(): float = ???

    @stub
    // Obtains the current tempo, expressed in microseconds per quarter
    // note.
    def getTempoInMPQ(): float = ???

    @stub
    // Obtains the length of the current sequence, expressed in MIDI ticks,
    // or 0 if no sequence is set.
    def getTickLength(): Long = ???

    @stub
    // Obtains the current position in the sequence, expressed in MIDI
    // ticks.
    def getTickPosition(): Long = ???

    @stub
    // Obtains the current mute state for a track.
    def getTrackMute(track: Int): Boolean = ???

    @stub
    // Obtains the current solo state for a track.
    def getTrackSolo(track: Int): Boolean = ???

    @stub
    // Indicates whether the Sequencer is currently recording.
    def isRecording(): Boolean = ???

    @stub
    // Indicates whether the Sequencer is currently running.
    def isRunning(): Boolean = ???

    @stub
    // Disables recording to the specified track.
    def recordDisable(track: Track): Unit = ???

    @stub
    // Prepares the specified track for recording events received on a particular channel.
    def recordEnable(track: Track, channel: Int): Unit = ???

    @stub
    // Removes a controller event listener's interest in one or more
    // types of controller event.
    def removeControllerEventListener(listener: ControllerEventListener, controllers: Array[Int]): Array[Int] = ???

    @stub
    // Removes the specified meta-event listener from this sequencer's
    // list of registered listeners, if in fact the listener is registered.
    def removeMetaEventListener(listener: MetaEventListener): Unit = ???

    @stub
    // Sets the number of repetitions of the loop for
    // playback.
    def setLoopCount(count: Int): Unit = ???

    @stub
    // Sets the last MIDI tick that will be played in
    // the loop.
    def setLoopEndPoint(tick: Long): Unit = ???

    @stub
    // Sets the first MIDI tick that will be
    // played in the loop.
    def setLoopStartPoint(tick: Long): Unit = ???

    @stub
    // Sets the source of timing information used by this sequencer.
    def setMasterSyncMode(sync: Sequencer.SyncMode): Unit = ???

    @stub
    // Sets the current position in the sequence, expressed in microseconds
    def setMicrosecondPosition(microseconds: Long): Unit = ???

    @stub
    // Sets the current sequence on which the sequencer operates.
    def setSequence(stream: InputStream): Unit = ???

    @stub
    // Sets the current sequence on which the sequencer operates.
    def setSequence(sequence: Sequence): Unit = ???

    @stub
    // Sets the slave synchronization mode for the sequencer.
    def setSlaveSyncMode(sync: Sequencer.SyncMode): Unit = ???

    @stub
    // Scales the sequencer's actual playback tempo by the factor provided.
    def setTempoFactor(factor: float): Unit = ???

    @stub
    // Sets the tempo in beats per minute.
    def setTempoInBPM(bpm: float): Unit = ???

    @stub
    // Sets the tempo in microseconds per quarter note.
    def setTempoInMPQ(mpq: float): Unit = ???

    @stub
    // Sets the current sequencer position in MIDI ticks
    def setTickPosition(tick: Long): Unit = ???

    @stub
    // Sets the mute state for a track.
    def setTrackMute(track: Int, mute: Boolean): Unit = ???

    @stub
    // Sets the solo state for a track.
    def setTrackSolo(track: Int, solo: Boolean): Unit = ???

    @stub
    // Starts playback of the MIDI data in the currently
    // loaded sequence.
    def start(): Unit = ???

    @stub
    // Starts recording and playback of MIDI data.
    def startRecording(): Unit = ???

    @stub
    // Stops recording, if active, and playback of the currently loaded sequence,
    // if any.
    def stop(): Unit = ???
}
