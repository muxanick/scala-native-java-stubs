package java.lang.annotation

// The annotation type java.lang.annotation.Repeatable is
// used to indicate that the annotation type whose declaration it
// (meta-)annotates is repeatable. The value of
// @Repeatable indicates the containing annotation
// type for the repeatable annotation type.
@Documented @Retention ( value = RUNTIME ) @Target ( value = ANNOTATION_TYPE ) @interface Repeatable {
}
