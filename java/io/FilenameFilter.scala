package java.io

import java.lang.FunctionalInterface

// Instances of classes that implement this interface are used to
// filter filenames. These instances are used to filter directory
// listings in the list method of class
// File, and by the Abstract Window Toolkit's file
// dialog component.
@FunctionalInterface trait FilenameFilter {
}
