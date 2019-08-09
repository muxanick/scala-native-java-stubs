package java.lang

// Thrown when a thread is waiting, sleeping, or otherwise occupied,
// and the thread is interrupted, either before or during the activity.
// Occasionally a method may wish to test whether the current
// thread has been interrupted, and if so, to immediately throw
// this exception.  The following code can be used to achieve
// this effect:
// 
//  if (Thread.interrupted())  // Clears interrupted status!
//      throw new InterruptedException();
// 
class InterruptedException extends Exception {

    @stub
    // Constructs an InterruptedException with no detail  message.
    def this() = ???
}
