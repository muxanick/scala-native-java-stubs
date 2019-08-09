# scala-native-java-stubs
Java Stubs for Scala-Native

To install all python packages run:
```
pip install -r requirements.txt
```

For instance, you run it as:
```
python createJavaStub --java 8 --outputFolder javacorelib --classname java.security.SecureClassLoader
```
it will download this page: https://docs.oracle.com/javase/8/docs/api/java/security/SecureClassLoader.html
then parses it and saves into `javacorelib/java/security/SecureClassLoader.scala` file (if not exists):
```Scala
package java.security

import java.lang.{Object, ClassLoader, Class}
import java.nio.ByteBuffer

// This class extends ClassLoader with additional support for
// defining classes with an associated code source and permissions
// which are retrieved by the system policy by default.
class SecureClassLoader extends ClassLoader {

    // Creates a new SecureClassLoader using the default parent class loader for delegation.
    protected this()

    // Creates a new SecureClassLoader using the specified parent class loader for delegation.
    protected this(parent: ClassLoader)

    @stub
    // Converts an array of bytes into an instance of class Class, with an optional CodeSource.
    protected def defineClass(name: String, b: Array[Byte], off: Int, len: Int, cs: CodeSource): Class[_] = ???

    @stub
    // Converts a ByteBuffer into an instance of class Class, with an optional CodeSource.
    protected def defineClass(name: String, b: ByteBuffer, cs: CodeSource): Class[_] = ???

    @stub
    // Returns the permissions for the given CodeSource object.
    protected def getPermissions(codesource: CodeSource) : PermissionCollection = ???
}
```
it works recursively for all imports and dependencies.
