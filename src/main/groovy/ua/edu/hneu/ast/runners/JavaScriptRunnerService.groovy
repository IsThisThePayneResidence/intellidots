package ua.edu.hneu.ast.runners

import ua.edu.hneu.ast.utils.Language
import ua.edu.hneu.ast.utils.RunnerUtils

import javax.script.ScriptEngine
import javax.script.ScriptEngineManager

class JavaScriptRunnerService implements RunnerService {

    @Override
    String run(String code, String input) {
        def file = "code"
        def dir = RunnerUtils.getDirectory(Language.JAVA_SCRIPT, code)
        new File("${dir}/${INPUT}") << input.trim()
        def codeFile = new File("${dir}/${file}${Language.JAVA_SCRIPT.extension}")
        codeFile.text = code.trim()
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
        engine.eval(new FileReader(codeFile));
        def output = new File("${dir}/${OUTPUT}")
        if (!output.exists()) {
            throw new Exception("Presentation Error")
        }
        output.text
    }
}
