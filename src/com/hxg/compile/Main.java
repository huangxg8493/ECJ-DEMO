package com.hxg.compile;

import org.eclipse.jdt.core.compiler.batch.BatchCompiler;

import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {
        // BatchCompiler.compile("-help", new PrintWriter(System.out), new PrintWriter(System.err), null);
        //-1.8 -8 -8.0       use 1.8 compliance (-source 1.8 -target 1.8)
        String cmd = "D:/WEB-WORK/ECJ/src/com/hxg/compile/TestClass.java -d D:/WEB-WORK/ECJ/out/hxg -source 1.8 -target 1.8";

        BatchCompiler.compile(cmd, new PrintWriter(System.out), new PrintWriter(System.err), null);
    }
}
