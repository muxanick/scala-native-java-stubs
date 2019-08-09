package javax.annotation.processing

import java.lang.annotation.{Documented, ElementType, Retention, RetentionPolicy, Target}

// An annotation used to indicate the latest source version an
// annotation processor supports.  The Processor.getSupportedSourceVersion() method can construct its
// result from the value of this annotation, as done by AbstractProcessor.getSupportedSourceVersion().
@Documented @Target ( value = TYPE ) @Retention ( value = RUNTIME ) @interface SupportedSourceVersion {
}
