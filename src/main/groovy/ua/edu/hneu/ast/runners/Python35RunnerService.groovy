package ua.edu.hneu.ast.runners

import ua.edu.hneu.ast.utils.Language

class Python35RunnerService implements RunnerService, LinuxRunnerService {

    @Override
    String run(String code, String input) {
        run(Language.PYTHON35, code, input, "code", INPUT, OUTPUT)
    }

    static void main(String[] args) {
        def python = new Python35RunnerService()
        python.run("""f = open('output.txt','w')\nf.write('hi there\\n')\nf.close()""", 'asd')
    }
}
