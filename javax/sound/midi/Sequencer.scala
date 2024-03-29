package javax.sound.midi

import java.io.InputStream
import java.lang.{Object, String}
import scala.scalanative.annotation.stub

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

    /** Stops recording, if active. */
    @stub
    def stopRecording(): Unit = ???
}

object Sequencer {
    /** A SyncMode object represents one of the ways in which
     *  a MIDI sequencer's notion of time can be synchronized with a master
     *  or slave device.
     *  If the sequencer is being synchronized to a master, the
     *  sequencer revises its current time in response to messages from
     *  the master.  If the sequencer has a slave, the sequencer
     *  similarly sends messages to control the slave's timing.
     *  
     *  There are three predefined modes that specify possible masters
     *  for a sequencer: INTERNAL_CLOCK,
     *  MIDI_SYNC, and MIDI_TIME_CODE.  The
     *  latter two work if the sequencer receives MIDI messages from
     *  another device.  In these two modes, the sequencer's time gets reset
     *  based on system real-time timing clock messages or MIDI time code
     *  (MTC) messages, respectively.  These two modes can also be used
     *  as slave modes, in which case the sequencer sends the corresponding
     *  types of MIDI messages to its receiver (whether or not the sequencer
     *  is also receiving them from a master).  A fourth mode,
     *  NO_SYNC, is used to indicate that the sequencer should
     *  not control its receiver's timing.
     */
    object SyncMode extends Object {

        /** Constructs a synchronization mode. */
        @stub
        protected def apply(name: String) = ???

        /** A master synchronization mode that makes the sequencer get
         *  its timing information from its internal clock.
         */
        @stub
        val INTERNAL_CLOCK: SyncMode = ???

        /** A master or slave synchronization mode that specifies the
         *  use of MIDI clock
         *  messages.
         */
        @stub
        val MIDI_SYNC: SyncMode = ???

        /** A master or slave synchronization mode that specifies the
         *  use of MIDI Time Code.
         */
        @stub
        val MIDI_TIME_CODE: SyncMode = ???

        /** A slave synchronization mode indicating that no timing information
         *  should be sent to the receiver.
         */
        @stub
        val NO_SYNC: SyncMode = ???

        /** Determines whether two objects are equal. */
        @stub
        def equals(obj: Any): Boolean = ???

        /** Finalizes the hashcode method. */
        @stub
        def hashCode(): Int = ???

        /** Provides this synchronization mode's name as the string
         *  representation of the mode.
         */
        @stub
        def toString(): String = ???
    }


    /** A value indicating that looping should continue
     *  indefinitely rather than complete after a specific
     *  number of loops.
     */
    @stub
    val LOOP_CONTINUOUSLY: Int = ???
}
