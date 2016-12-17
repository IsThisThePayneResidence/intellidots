package ua.edu.hneu.ast.utils

import ua.edu.hneu.ast.runners.RunnerService

class RunnerUtils {

    static String getDirectory(Language lang, String code) {
        def dir = new File("${RunnerService.DIRECTORY}-${((System.currentTimeMillis() + lang.toString() + code) as String).encodeAsMD5()}")
        dir.mkdirs()
        return dir.absolutePath
    }

}
