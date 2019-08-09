package java.util

import java.lang.Object

// The Stack class represents a last-in-first-out
// (LIFO) stack of objects. It extends class Vector with five
// operations that allow a vector to be treated as a stack. The usual
// push and pop operations are provided, as well as a
// method to peek at the top item on the stack, a method to test
// for whether the stack is empty, and a method to search
// the stack for an item and discover how far it is from the top.
// 
// When a stack is first created, it contains no items.
//
// A more complete and consistent set of LIFO stack operations is
// provided by the Deque interface and its implementations, which
// should be used in preference to this class.  For example:
//    
//   Deque<Integer> stack = new ArrayDeque<Integer>();
class Stack[E] extends Vector[E] {

    @stub
    // Tests if this stack is empty.
    def empty(): Boolean = ???

    @stub
    // Looks at the object at the top of this stack without removing it
    // from the stack.
    def peek(): E = ???

    @stub
    // Removes the object at the top of this stack and returns that
    // object as the value of this function.
    def pop(): E = ???

    @stub
    // Pushes an item onto the top of this stack.
    def push(item: E): E = ???
}
