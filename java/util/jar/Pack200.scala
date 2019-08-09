package java.util.jar

import java.lang.Object

// Transforms a JAR file to or from a packed stream in Pack200 format.
// Please refer to Network Transfer Format JSR 200 Specification at
// http://jcp.org/aboutJava/communityprocess/review/jsr200/index.html
// 
// Typically the packer engine is used by application developers
// to deploy or host JAR files on a website.
// The unpacker  engine is used by deployment applications to
// transform the byte-stream back to JAR format.
// 
// Here is an example using  packer and unpacker:
// 
//    import java.util.jar.Pack200;
//    import java.util.jar.Pack200.*;
//    ...
//    // Create the Packer object
//    Packer packer = Pack200.newPacker();
//
//    // Initialize the state by setting the desired properties
//    Map p = packer.properties();
//    // take more time choosing codings for better compression
//    p.put(Packer.EFFORT, "7");  // default is "5"
//    // use largest-possible archive segments (>10% better compression).
//    p.put(Packer.SEGMENT_LIMIT, "-1");
//    // reorder files for better compression.
//    p.put(Packer.KEEP_FILE_ORDER, Packer.FALSE);
//    // smear modification times to a single value.
//    p.put(Packer.MODIFICATION_TIME, Packer.LATEST);
//    // ignore all JAR deflation requests,
//    // transmitting a single request to use "store" mode.
//    p.put(Packer.DEFLATE_HINT, Packer.FALSE);
//    // discard debug attributes
//    p.put(Packer.CODE_ATTRIBUTE_PFX+"LineNumberTable", Packer.STRIP);
//    // throw an error if an attribute is unrecognized
//    p.put(Packer.UNKNOWN_ATTRIBUTE, Packer.ERROR);
//    // pass one class file uncompressed:
//    p.put(Packer.PASS_FILE_PFX+0, "mutants/Rogue.class");
//    try {
//        JarFile jarFile = new JarFile("/tmp/testref.jar");
//        FileOutputStream fos = new FileOutputStream("/tmp/test.pack");
//        // Call the packer
//        packer.pack(jarFile, fos);
//        jarFile.close();
//        fos.close();
//
//        File f = new File("/tmp/test.pack");
//        FileOutputStream fostream = new FileOutputStream("/tmp/test.jar");
//        JarOutputStream jostream = new JarOutputStream(fostream);
//        Unpacker unpacker = Pack200.newUnpacker();
//        // Call the unpacker
//        unpacker.unpack(f, jostream);
//        // Must explicitly close the output.
//        jostream.close();
//    } catch (IOException ioe) {
//        ioe.printStackTrace();
//    }
// 
// 
// A Pack200 file compressed with gzip can be hosted on HTTP/1.1 web servers.
// The deployment applications can use "Accept-Encoding=pack200-gzip". This
// indicates to the server that the client application desires a version of
// the file encoded with Pack200 and further compressed with gzip. Please
// refer to  Java Deployment Guide for more details and
// techniques.
// 
// Unless otherwise noted, passing a null argument to a constructor or
// method in this class will cause a NullPointerException to be thrown.
abstract class Pack200 extends Object {
}

object Pack200 {
    @stub
    // The packer engine applies various transformations to the input JAR file,
    // making the pack stream highly compressible by a compressor such as
    // gzip or zip.
    def Pack200.Packer: trait = ???

    @stub
    // Obtain new instance of a class that implements Packer.
    def newPacker(): Pack200.Packer = ???
}
