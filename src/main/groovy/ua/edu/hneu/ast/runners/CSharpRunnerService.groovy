package ua.edu.hneu.ast.runners

import ua.edu.hneu.ast.utils.Language

class CSharpRunnerService implements RunnerService, LinuxRunnerService {

    @Override
    String run(String code, String input) {
        run(Language.CS, code, input, "Program", INPUT, OUTPUT)
    }

    static void main(String[] args) {
        def cs = new CSharpRunnerService()
        cs.run("""
            namespace Labwork.Five.Two
            {
                class Program
                {
                    static void Main()
                    {
                        string[] lines = { "First line", "Second line", "Third line" };
                        System.IO.File.WriteAllLines(@"output.txt", lines);
                    }
                }
            }
        """, "asd")
    }
}
