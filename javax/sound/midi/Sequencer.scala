package javax.sound.midi

import java.io.InputStream

/** A hardware or software device that plays back a MIDI
 *  sequence is known as a sequencer.
 *  A MIDI sequence contains lists of time-stamped MIDI data, such as
 *  might be read from a standard MIDI file.  Most
 *  sequencers also provide functions for creating and editing sequences.
 *  
 *  The Sequencer interface includes methods for the following
 *  basic MIDI sequencer operations:
 *  
 *  obtaining a sequence from MIDI file data
 *  starting and stopping playback
 *  moving to an arbitrary position in the sequence
 *  changing the tempo (speed) of playback
 *  synchronizing playback to an internal clock or to received MIDI
 *  messages
 *  controlling the timing of another device
 *  
 *  In addition, the following operations are supported, either directly, or
 *  indirectly through objects that the Sequencer has access to:
 *  
 *  editing the data by adding or deleting individual MIDI events or entire
 *  tracks
 *  muting or soloing individual tracks in the sequence
 *  notifying listener objects about any meta-events or
 *  control-change events encountered while playing back the sequence.
 *  
 */
trait Sequencer extends MidiDevice {

    /** Registers a controller event listener to receive notification
     *  whenever the sequencer processes a control-change event of the
     *  requested type or types.
     */
    @stub
    def addControllerEventListener(listener: ControllerEventListener, controllers: Array[Int]): Array[Int] = ???

    /** Registers a meta-event listener to receive
     *  notification whenever a meta-event is encountered in the sequence
     *  and processed by the sequencer.
     */
    @stub
    def addMetaEventListener(listener: MetaEventListener): Boolean = ???

    /** Obtains the number of repetitions for
     *  playback.
     */
    @stub
    def getLoopCount(): Int = ???

    /** Obtains the end position of the loop,
     *  in MIDI ticks.
     */
    @stub
    def getLoopEndPoint(): Long = ???

    /** Obtains the start position of the loop,
     *  in MIDI ticks.
     */
    @stub
    def getLoopStartPoint(): Long = ???

    /** Obtains the current master synchronization mode for this sequencer. */
    @stub
    def getMasterSyncMode(): Sequencer.SyncMode = ???

    /** Obtains the set of master synchronization modes supported by this
     *  sequencer.
     */
    @stub
    def getMasterSyncModes(): Array[Sequencer.SyncMode] = ???

    /** Obtains the length of the current sequence, expressed in microseconds,
     *  or 0 if no sequence is set.
     */
    @stub
    def getMicrosecondLength(): Long = ???

    /** Obtains the current position in the sequence, expressed in
     *  microseconds.
     */
    @stub
    def getMicrosecondPosition(): Long = ???

    /** Obtains the sequence on which the Sequencer is currently operating. */
    @stub
    def getSequence(): Sequence = ???

    /** Obtains the current slave synchronization mode for this sequencer. */
    @stub
    def getSlaveSyncMode(): Sequencer.SyncMode = ???

    /** Obtains the set of slave synchronization modes supported by the sequencer. */
    @stub
    def getSlaveSyncModes(): Array[Sequencer.SyncMode] = ???

    /** Returns the current tempo factor for the sequencer. */
    @stub
    def getTempoFactor(): Float = ???

    /** Obtains the current tempo, expressed in beats per minute. */
    @stub
    def getTempoInBPM(): Float = ???

    /** Obtains the current tempo, expressed in microseconds per quarter
     *  note.
     */
    @stub
    def getTempoInMPQ(): Float = ???

    /** Obtains the length of the current sequence, expressed in MIDI ticks,
     *  or 0 if no sequence is set.
     */
    @stub
    def getTickLength(): Long = ???

    /** Obtains the current position in the sequence, expressed in MIDI
     *  ticks.
     */
    @stub
    def getTickPosition(): Long = ???

    /** Obtains the current mute state for a track. */
    @stub
    def getTrackMute(track: Int): Boolean = ???

    /** Obtains the current solo state for a track. */
    @stub
    def getTrackSolo(track: Int): Boolean = ???

    /** Indicates whether the Sequencer is currently recording. */
    @stub
    def isRecording(): Boolean = ???

    /** Indicates whether the Sequencer is currently running. */
    @stub
    def isRunning(): Boolean = ???

    /** Disables recording to the specified track. */
    @stub
    def recordDisable(track: Track): Unit = ???

    /** Prepares the specified track for recording events received on a particular channel. */
    @stub
    def recordEnable(track: Track, channel: Int): Unit = ???

    /** Removes a controller event listener's interest in one or more
     *  types of controller event.
     */
    @stub
    def removeControllerEventListener(listener: ControllerEventListener, controllers: Array[Int]): Array[Int] = ???

    /** Removes the specified meta-event listener from this sequencer's
     *  list of registered listeners, if in fact the listener is registered.
     */
    @stub
    def removeMetaEventListener(listener: MetaEventListener): Unit = ???

    /** Sets the number of repetitions of the loop for
     *  playback.
     */
    @stub
    def setLoopCount(count: Int): Unit = ???

    /** Sets the last MIDI tick that will be played in
     *  the loop.
     */
    @stub
    def setLoopEndPoint(tick: Long): Unit = ???

    /** Sets the first MIDI tick that will be
     *  played in the loop.
     */
    @stub
    def setLoopStartPoint(tick: Long): Unit = ???

    /** Sets the source of timing information used by this sequencer. */
    @stub
    def setMasterSyncMode(sync: Sequencer.SyncMode): Unit = ???

    /** Sets the current position in the sequence, expressed in microseconds */
    @stub
    def setMicrosecondPosition(microseconds: Long): Unit = ???

    /** Sets the current sequence on which the sequencer operates. */
    @stub
    def setSequence(stream: InputStream): Unit = ???

    /** Sets the current sequence on which the sequencer operates. */
    @stub
    def setSequence(sequence: Sequence): Unit = ???

    /** Sets the slave synchronization mode for the sequencer. */
    @stub
    def setSlaveSyncMode(sync: Sequencer.SyncMode): Unit = ???

    /** Scales the sequencer's actual playback tempo by the factor provided. */
    @stub
    def setTempoFactor(factor: Float): Unit = ???

    /** Sets the tempo in beats per minute. */
    @stub
    def setTempoInBPM(bpm: Float): Unit = ???

    /** Sets the tempo in microseconds per quarter note. */
    @stub
    def setTempoInMPQ(mpq: Float): Unit = ???

    /** Sets the current sequencer position in MIDI ticks */
    @stub
    def setTickPosition(tick: Long): Unit = ???

    /** Sets the mute state for a track. */
    @stub
    def setTrackMute(track: Int, mute: Boolean): Unit = ???

    /** Sets the solo state for a track. */
    @stub
    def setTrackSolo(track: Int, solo: Boolean): Unit = ???

    /** Starts playback of the MIDI data in the currently
     *  loaded sequence.
     */
    @stub
    def start(): Unit = ???

    /** Starts recording and playback of MIDI data. */
    @stub
    def startRecording(): Unit = ???

    /** Stops recording, if active, and playback of the currently loaded sequence,
     *  if any.
     */
    @stub
    def stop(): Unit = ???
}
