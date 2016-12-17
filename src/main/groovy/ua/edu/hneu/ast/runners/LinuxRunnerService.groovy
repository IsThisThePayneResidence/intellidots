package ua.edu.hneu.ast.runners

import ua.edu.hneu.ast.utils.Language
import ua.edu.hneu.ast.utils.RunnerUtils

trait LinuxRunnerService {

    static String run(Language language, String code, String input, String codeFileName, String inputFile, String outputFile) {
        def dir = RunnerUtils.getDirectory(language, code)
        new File("${dir}/${codeFileName}${language.extension}") << code.trim()
        new File("${dir}/${inputFile}") << input.trim()

        ProcessBuilder builder = new ProcessBuilder().command(new File("src/main/bash/${language.runScript}").absolutePath, dir, codeFileName)
        builder.redirectOutput(new File("/home/ivan/log.log"))
        builder.redirectError(new File("/home/ivan/log.log"))
        def process = builder.start()
        process.waitFor()
        def line = ""
        BufferedReader out = new BufferedReader(new InputStreamReader(process.getInputStream()))
        while (line = out.readLine()) {
            print(line)
        }
        out.close()
        def output = new File("${dir}/${outputFile}")
        if (!output.exists()) {
            throw new Exception("Presentation Error")
        }
        output.text.trim()
    }
}
