package java.util.concurrent

// A BlockingQueue in which producers may wait for consumers
// to receive elements.  A TransferQueue may be useful for
// example in message passing applications in which producers
// sometimes (using method transfer(E)) await receipt of
// elements by consumers invoking take or poll, while
// at other times enqueue elements (via method put) without
// waiting for receipt.
// Non-blocking and
// time-out versions of
// tryTransfer are also available.
// A TransferQueue may also be queried, via hasWaitingConsumer(), whether there are any threads waiting for
// items, which is a converse analogy to a peek operation.
//
// Like other blocking queues, a TransferQueue may be
// capacity bounded.  If so, an attempted transfer operation may
// initially block waiting for available space, and/or subsequently
// block waiting for reception by a consumer.  Note that in a queue
// with zero capacity, such as SynchronousQueue, put
// and transfer are effectively synonymous.
//
// This interface is a member of the
// 
// Java Collections Framework.
trait TransferQueue[E] extends BlockingQueue[E] {

    @stub
    // Returns an estimate of the number of consumers waiting to
    // receive elements via BlockingQueue.take() or timed
    // poll.
    def getWaitingConsumerCount(): Int = ???

    @stub
    // Returns true if there is at least one consumer waiting
    // to receive an element via BlockingQueue.take() or
    // timed poll.
    def hasWaitingConsumer(): Boolean = ???

    @stub
    // Transfers the element to a consumer, waiting if necessary to do so.
    def transfer(e: E): Unit = ???

    @stub
    // Transfers the element to a waiting consumer immediately, if possible.
    def tryTransfer(e: E): Boolean = ???
}
