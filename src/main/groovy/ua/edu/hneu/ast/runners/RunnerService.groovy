package ua.edu.hneu.ast.runners

interface RunnerService {

    String INPUT = "input.txt"

    String OUTPUT = "output.txt"

    String DIRECTORY = "/tmp/intellidots"

    String run(String code, String input)
}
