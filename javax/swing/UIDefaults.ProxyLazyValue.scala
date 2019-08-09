package javax.swing

import java.lang.{Object, String}

// This class provides an implementation of LazyValue
// which can be
// used to delay loading of the Class for the instance to be created.
// It also avoids creation of an anonymous inner class for the
// LazyValue
// subclass.  Both of these improve performance at the time that a
// a Look and Feel is loaded, at the cost of a slight performance
// reduction the first time createValue is called
// (since Reflection APIs are used).
object UIDefaults.ProxyLazyValue extends Object with UIDefaults.LazyValue {

    @stub
    // Creates a LazyValue which will construct an instance
    // when asked.
    def ProxyLazyValue(c: String) = ???

    @stub
    // Creates a LazyValue which will construct an instance
    // when asked.
    def ProxyLazyValue(c: String, o: Array[Object]) = ???

    @stub
    // Creates a LazyValue which will construct an instance
    // when asked.
    def ProxyLazyValue(c: String, m: String) = ???