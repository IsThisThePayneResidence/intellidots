package ua.edu.hneu.ast.runners

import ua.edu.hneu.ast.utils.Language
import ua.edu.hneu.ast.utils.RunnerUtils

class CppRunnerService implements RunnerService, LinuxRunnerService {

    @Override
    String run(String code, String input) {
        run(Language.CPP14, code, input, "code", INPUT, OUTPUT)
    }

    static void main(String[] args) {
        def cpp = new CppRunnerService()
        cpp.run("""
            #include <iostream>
            #include <fstream>
            using namespace std;
            
            int main () {
              ofstream myfile;
              myfile.open ("output.txt");
              myfile << "Writing this to a file.\\n";
              myfile.close();
              return 0;
            }
        """, "asd")
    }
}
