package ua.edu.hneu.ast.utils

enum Language {
    CPP14("c++14", ".cpp", "run-cpp.sh"),
    JAVA8("java1.8", ".java", "run-java8.sh"),
    NODEJS("nodejs6.9.2", ".js", "run-nodejs.sh"),
    CS("c#", ".cs", "run-cs.sh"),
    PYTHON27("python2.7", ".py", "run-python2.7.sh"),
    PYTHON35("python3.5", ".py", "run-python3.5.sh"),

    private final String name
    private final String fileExtension
    private final String runScript

    private Language(String s, String ext, String script) {
        name = s
        fileExtension = ext
        runScript = script
    }

    boolean equalsName(String otherName) {
        return (otherName == null) ? false : name == otherName
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

}