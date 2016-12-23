package ua.edu.hneu.ast.utils

import org.antlr.v4.runtime.Parser
import ua.edu.hneu.ast.parsers.CPP14Parser
import ua.edu.hneu.ast.parsers.CParser
import ua.edu.hneu.ast.parsers.CSharpParser
import ua.edu.hneu.ast.parsers.ECMAScriptParser
import ua.edu.hneu.ast.parsers.Java8Parser
import ua.edu.hneu.ast.parsers.Python3Parser

enum Language {
    C("c99", ".c", "run-c.sh", CParser),
    CPP14("c++14", ".cpp", "run-cpp.sh", CPP14Parser),
    JAVA8("java1.8", ".java", "run-java8.sh", Java8Parser),
    NODEJS("nodejs6.9.2", ".js", "run-nodejs.sh", ECMAScriptParser),
    CS("c#", ".cs", "run-cs.sh", CSharpParser),
    PYTHON27("python2.7", ".py", "run-python2.7.sh", Python3Parser),
    PYTHON35("python3.5", ".py", "run-python3.5.sh", Python3Parser),

    private final String name
    private final String fileExtension
    private final String runScript
    private final Class parser

    private Language(String s, String ext, String script, Class parser) {
        this.name = s
        this.fileExtension = ext
        this.runScript = script
        this.parser = parser
    }

    boolean equalsName(String otherName) {
        return (otherName == null) ? false : name == otherName
    }

    static Language getByName(String name) {
        for (Language language : values()) {
            if (language.name == name) {
                return language
            }
        }
        return null
    }

    String toString() {
        return this.name
    }

    String getExtension() {
        fileExtension
    }

    String getRunScript() {
        runScript
    }

    Class getParser() {
        parser
    }
    static List<String> names() {
        values().name
    }
}