package com.hxg.compile;

import org.eclipse.jdt.core.compiler.batch.BatchCompiler;

import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {
        BatchCompiler.compile("-help", new PrintWriter(System.out), new PrintWriter(System.err), null);
        //-1.8 -8 -8.0       use 1.8 compliance (-source 1.8 -target 1.8)
        String cmd = "D:/WEB-WORK/ECJ/src/com/hxg/compile/TestClass.java -d D:/WEB-WORK/ECJ/out/hxg -source 1.8 -target 1.8";

        BatchCompiler.compile(cmd, new PrintWriter(System.out), new PrintWriter(System.err), null);
    }
}

/**
 * Eclipse Compiler for Java(TM) bundle_qualifier, bundle_version
 * Copyright IBM Corp 2000, 2020. All rights reserved.
 *
 *  Usage: <options> <source files | directories>
 *  If directories are specified, then their source contents are compiled.
 *  Possible options are listed below. Options enabled by default are prefixed
 *  with '+'.
 *
 *  Classpath options:
 *     -cp -classpath <directories and ZIP archives separated by ;>
 *                        specify location for application classes and sources.
 *                        Each directory or file can specify access rules for
 *                        types between '[' and ']' (e.g. [-X] to forbid
 *                        access to type X, [~X] to discourage access to type X,
 *                        [+p/X;-p/*] to forbid access to all types in package p
 *                        but allow access to p/X)
 *     -bootclasspath <directories and ZIP archives separated by ;>
 *                        specify location for system classes. Each directory or
 *                        file can specify access rules for types between '['
 *                        and ']'
 *     -sourcepath <directories and ZIP archives separated by ;>
 *                        specify location for application sources. Each directory
 *                        or file can specify access rules for types between '['
 *                        and ']'. Each directory can further specify a specific
 *                        destination directory using a '-d' option between '['
 *                        and ']'; this overrides the general '-d' option.
 *                        .class files created from source files contained in a
 *                        jar file are put in the user.dir folder in case no
 *                        general '-d' option is specified. ZIP archives cannot
 *                        override the general '-d' option
 *     -extdirs <directories separated by ;>
 *                        specify location for extension ZIP archives
 *     -endorseddirs <directories separated by ;>
 *                        specify location for endorsed ZIP archives
 *     -d <dir>           destination directory (if omitted, no directory is
 *                        created); this option can be overridden per source
 *                        directory
 *     -d none            generate no .class files
 *     -encoding <enc>    specify default encoding for all source files. Each
 *                        file/directory can override it when suffixed with
 *                        '['<enc>']' (e.g. X.java[utf8]).
 *                        If multiple default encodings are specified, the last
 *                        one will be used.
 *
 *  Module compilation options:
 *    These options are meaningful only in Java 9 environment or later.
 *     --module-source-path <directories separated by ;>
 *                        specify where to find source files for multiple modules
 *     -p --module-path <directories separated by ;>
 *                        specify where to find application modules
 *     --processor-module-path <directories separated by ;>
 *                        specify module path where annotation processors
 *                        can be found
 *     --system <jdk>     Override location of system modules
 *     --add-exports <module>/<package>=<other-module>(,<other-module>)*
 *                        specify additional package exports clauses to the
 *                        given modules
 *     --add-reads <module>=<other-module>(,<other-module>)*
 *                        specify additional modules to be considered as required
 *                        by given modules
 *     --add-modules  <module>(,<module>)*
 *                        specify the additional module names that should be
 *                        resolved to be root modules
 *     --limit-modules <module>(,<module>)*
 *                        specify the observable module names
 *     --release <release> compile for a specific VM version
 *
 *  Compliance options:
 *     -1.3               use 1.3 compliance (-source 1.3 -target 1.1)
 *     -1.4             + use 1.4 compliance (-source 1.3 -target 1.2)
 *     -1.5 -5 -5.0       use 1.5 compliance (-source 1.5 -target 1.5)
 *     -1.6 -6 -6.0       use 1.6 compliance (-source 1.6 -target 1.6)
 *     -1.7 -7 -7.0       use 1.7 compliance (-source 1.7 -target 1.7)
 *     -1.8 -8 -8.0       use 1.8 compliance (-source 1.8 -target 1.8)
 *     -1.9 -9 -9.0       use 1.9 compliance (-source 1.9 -target 1.9)
 *     -10 -10.0          use 10  compliance (-source 10  -target 10)
 *     -11 -11.0          use 11  compliance (-source 11  -target 11)
 *     -12 -12.0          use 12  compliance (-source 12  -target 12)
 *     -13 -13.0          use 13  compliance (-source 13  -target 13)
 *     -14 -14.0          use 14  compliance (-source 14  -target 14)
 *     -15 -15.0          use 15  compliance (-source 15  -target 15)
 *     -16 -16.0          use 16  compliance (-source 16  -target 16)
 *     -17 -17.0          use 17  compliance (-source 17  -target 17)
 *     -18 -18.0          use 18  compliance (-source 18  -target 18)
 *     -19 -19.0          use 19  compliance (-source 19  -target 19)
 *     -20 -20.0          use 20  compliance (-source 20  -target 20)
 *     -21 -21.0          use 21  compliance (-source 21  -target 21)
 *     -22 -22.0          use 22  compliance (-source 22  -target 22)
 *     -source <version>  set source level: 1.3 to 1.9, 10 to 22
 *                        (or 6, 6.0, etc)
 *     -target <version>  set classfile target: 1.3 to 1.9, 10 to 22
 *                        (or 6, 6.0, etc)
 *                        cldc1.1 can also be used to generate the StackMap
 *                        attribute
 *     --enable-preview   enable support for preview features of the
 *                        latest Java release
 *
 *  Warning options:
 *     -deprecation     + deprecation outside deprecated code (equivalent to
 *                        -warn:+deprecation)
 *     -nowarn -warn:none disable all warnings
 *     -nowarn:[<directories separated by ;>]
 *                        specify directories from which optional problems should
 *                        be ignored
 *     -?:warn -help:warn display advanced warning options
 *
 *  Error options:
 *     -err:<warnings separated by ,>    convert exactly the listed warnings
 *                                       to be reported as errors
 *     -err:+<warnings separated by ,>   enable additional warnings to be
 *                                       reported as errors
 *     -err:-<warnings separated by ,>   disable specific warnings to be
 *                                       reported as errors
 *
 *  Info options:
 *     -info:<warnings separated by ,>   convert exactly the listed warnings
 *                                       to be reported as infos
 *     -info:+<warnings separated by ,>  enable additional warnings to be
 *                                       reported as infos
 *     -info:-<warnings separated by ,>  disable specific warnings to be
 *                                       reported as infos
 *
 *  Setting warning, error or info options using properties file:
 *     -properties <file>   set warnings/errors/info option based on the properties
 *                          file contents. This option can be used with -nowarn,
 *                          -err:.., -info: or -warn:.. options, but the last one
 *                          on the command line sets the options to be used.
 *
 *  Debug options:
 *     -g[:lines,vars,source] custom debug info
 *     -g:lines,source  + both lines table and source debug info
 *     -g                 all debug info
 *     -g:none            no debug info
 *     -preserveAllLocals preserve unused local vars for debug purpose
 *
 *  Annotation processing options:
 *    These options are meaningful only in a 1.6 environment.
 *     -Akey[=value]        options that are passed to annotation processors
 *     -processorpath <directories and ZIP archives separated by ;>
 *                          specify locations where to find annotation processors.
 *                          If this option is not used, the classpath will be
 *                          searched for processors
 *     -processor <class1[,class2,...]>
 *                          qualified names of the annotation processors to run.
 *                          This bypasses the default annotation discovery process
 *     -proc:only           run annotation processors, but do not compile
 *     -proc:none           perform compilation but do not run annotation
 *                          processors
 *     -s <dir>             destination directory for generated source files
 *     -XprintProcessorInfo print information about which annotations and elements
 *                          a processor is asked to process
 *     -XprintRounds        print information about annotation processing rounds
 *     -classNames <className1[,className2,...]>
 *                          qualified names of binary classes to process
 *
 *  Advanced options:
 *     @<file> read command line arguments from file
 *     -maxProblems <n>   max number of problems per compilation unit (100 by
 *                        default)
 *     -log <file>        log to a file. If the file extension is '.xml', then
 *                        the log will be a xml file.
 *     -proceedOnError[:Fatal]
 *                        do not stop at first error, dumping class files with
 *                        problem methods
 *                        With ":Fatal", all optional errors are treated as fatal
 *     -failOnWarning     fail compilation if there are warnings
 *     -verbose           enable verbose output
 *     -referenceInfo     compute reference info
 *     -progress          show progress (only in -log mode)
 *     -time              display speed information
 *     -noExit            do not call System.exit(n) at end of compilation (n==0
 *                        if no error)
 *     -repeat <n>        repeat compilation process <n> times for perf analysis
 *     -inlineJSR         inline JSR bytecode (implicit if target >= 1.5)
 *     -enableJavadoc     consider references in javadoc
 *     -parameters        generate method parameters attribute (for target >= 1.8)
 *     -genericsignature  generate generic signature for lambda expressions
 *     -Xemacs            used to enable emacs-style output in the console.
 *                        It does not affect the xml log output
 *     -missingNullDefault  report missing default nullness annotation
 *     -annotationpath <directories and ZIP archives separated by ;>
 *                        specify locations where to find external annotations
 *                        to support annotation-based null analysis.
 *                        The special name CLASSPATH will cause lookup of
 *                        external annotations from the classpath and sourcepath.
 *
 *     -? -help           print this help message
 *     -v -version        print compiler version
 *     -showversion       print compiler version and continue
 *
 *  Ignored options:
 *     -J<option>         pass option to virtual machine (ignored)
 *     -X<option>         specify non-standard option (ignored
 *                        except for listed -X options)
 *     -X                 print non-standard options and exit (ignored)
 *     -O                 optimize for execution time (ignored)
 */