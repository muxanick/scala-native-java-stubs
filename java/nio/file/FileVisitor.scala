package java.nio.file

import java.io.IOException
import java.nio.file.attribute.BasicFileAttributes
import scala.scalanative.annotation.stub

/** A visitor of files. An implementation of this interface is provided to the
 *  Files.walkFileTree methods to visit each file in
 *  a file tree.
 * 
 *   Usage Examples:
 *  Suppose we want to delete a file tree. In that case, each directory should
 *  be deleted after the entries in the directory are deleted.
 *  
 *      Path start = ...
 *      Files.walkFileTree(start, new SimpleFileVisitor<Path>() {
 *          @Override
 *          public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)
 *              throws IOException
 *          {
 *              Files.delete(file);
 *              return FileVisitResult.CONTINUE;
 *          }
 *          @Override
 *          public FileVisitResult postVisitDirectory(Path dir, IOException e)
 *              throws IOException
 *          {
 *              if (e == null) {
 *                  Files.delete(dir);
 *                  return FileVisitResult.CONTINUE;
 *              } else {
 *                  // directory iteration failed
 *                  throw e;
 *              }
 *          }
 *      });
 *  
 *   Furthermore, suppose we want to copy a file tree to a target location.
 *  In that case, symbolic links should be followed and the target directory
 *  should be created before the entries in the directory are copied.
 *  
 *      final Path source = ...
 *      final Path target = ...
 * 
 *      Files.walkFileTree(source, EnumSet.of(FileVisitOption.FOLLOW_LINKS), Integer.MAX_VALUE,
 *          new SimpleFileVisitor<Path>() {
 *              @Override
 *              public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs)
 *                  throws IOException
 *              {
 *                  Path targetdir = target.resolve(source.relativize(dir));
 *                  try {
 *                      Files.copy(dir, targetdir);
 *                  } catch (FileAlreadyExistsException e) {
 *                       if (!Files.isDirectory(targetdir))
 *                           throw e;
 *                  }
 *                  return CONTINUE;
 *              }
 *              @Override
 *              public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)
 *                  throws IOException
 *              {
 *                  Files.copy(file, target.resolve(source.relativize(file)));
 *                  return CONTINUE;
 *              }
 *          });
 *  
 */
trait FileVisitor[T] {

    /** Invoked for a directory after entries in the directory, and all of their
     *  descendants, have been visited.
     */
    @stub
    def postVisitDirectory(dir: T, exc: IOException): FileVisitResult = ???

    /** Invoked for a directory before entries in the directory are visited. */
    @stub
    def preVisitDirectory(dir: T, attrs: BasicFileAttributes): FileVisitResult = ???

    /** Invoked for a file in a directory. */
    @stub
    def visitFile(file: T, attrs: BasicFileAttributes): FileVisitResult = ???

    /** Invoked for a file that could not be visited. */
    @stub
    def visitFileFailed(file: T, exc: IOException): FileVisitResult = ???
}
