package java.lang

/** The type of a ProcessBuilder.Redirect. */
class ProcessBuilder.Redirect.Type private (name: String, ordinal: Int) extends Enum[ProcessBuilder.Redirect.Type](name, ordinal) {
}

object ProcessBuilder.Redirect.Type {
    /** The type of redirects returned from
     *  Redirect.appendTo(File).
     */
    final val APPEND = new ProcessBuilder.Redirect.Type(APPEND, 0)

    /** The type of Redirect.INHERIT. */
    final val INHERIT = new ProcessBuilder.Redirect.Type(INHERIT, 1)

    /** The type of Redirect.PIPE. */
    final val PIPE = new ProcessBuilder.Redirect.Type(PIPE, 2)

    /** The type of redirects returned from
     *  Redirect.from(File).
     */
    final val READ = new ProcessBuilder.Redirect.Type(READ, 3)

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): ProcessBuilder.Redirect.Type = ???
}
