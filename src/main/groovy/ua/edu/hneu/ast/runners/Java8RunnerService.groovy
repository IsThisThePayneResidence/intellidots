package ua.edu.hneu.ast.runners

import ua.edu.hneu.ast.utils.Language

class Java8RunnerService implements RunnerService, LinuxRunnerService {

    @Override
    String run(String code, String input) {
        run(Language.JAVA8, code, input, "Main", INPUT, OUTPUT)
    }

    static void main(String[] args) {
        def cpp = new Java8RunnerService()
        cpp.run("""
            import java.nio.file.Files;         
            import java.nio.file.Paths; 
            public class Main { 
                public static void main(String[] argv) throws java.io.IOException { 
                    Files.write(Paths.get(\"output.txt\"), \"res\".getBytes()); 
                } 
            }
        """, "asd")
    }
}
