package javax.swing

import java.lang.{Object, String}
import javax.accessibility.{Accessible, AccessibleContext}

// A class to monitor the progress of some operation. If it looks
// like the operation will take a while, a progress dialog will be popped up.
// When the ProgressMonitor is created it is given a numeric range and a
// descriptive string. As the operation progresses, call the setProgress method
// to indicate how far along the [min,max] range the operation is.
// Initially, there is no ProgressDialog. After the first millisToDecideToPopup
// milliseconds (default 500) the progress monitor will predict how long
// the operation will take.  If it is longer than millisToPopup (default 2000,
// 2 seconds) a ProgressDialog will be popped up.
// 
// From time to time, when the Dialog box is visible, the progress bar will
// be updated when setProgress is called.  setProgress won't always update
// the progress bar, it will only be done if the amount of progress is
// visibly significant.
//
// 
//
// For further documentation and examples see
// How to Monitor Progress,
// a section in The Java Tutorial.
class ProgressMonitor extends Object with Accessible {

    @stub
    // Indicate that the operation is complete.
    def close(): Unit = ???

    @stub
    // Gets the AccessibleContext for the
    // ProgressMonitor
    def getAccessibleContext(): AccessibleContext = ???

    @stub
    // Returns the maximum value -- the higher end of the progress value.
    def getMaximum(): Int = ???

    @stub
    // Returns the amount of time this object waits before deciding whether
    // or not to popup a progress monitor.
    def getMillisToDecideToPopup(): Int = ???

    @stub
    // Returns the amount of time it will take for the popup to appear.
    def getMillisToPopup(): Int = ???

    @stub
    // Returns the minimum value -- the lower end of the progress value.
    def getMinimum(): Int = ???

    @stub
    // Specifies the additional note that is displayed along with the
    // progress message.
    def getNote(): String = ???

    @stub
    // Returns true if the user hits the Cancel button in the progress dialog.
    def isCanceled(): Boolean = ???

    @stub
    // Specifies the maximum value.
    def setMaximum(m: Int): Unit = ???

    @stub
    // Specifies the amount of time to wait before deciding whether or
    // not to popup a progress monitor.
    def setMillisToDecideToPopup(millisToDecideToPopup: Int): Unit = ???

    @stub
    // Specifies the amount of time it will take for the popup to appear.
    def setMillisToPopup(millisToPopup: Int): Unit = ???

    @stub
    // Specifies the minimum value.
    def setMinimum(m: Int): Unit = ???

    @stub
    // Specifies the additional note that is displayed along with the
    // progress message.
    def setNote(note: String): Unit = ???
}
