/* This file is part of SableCC ( http://sablecc.org ).
 *
 * See the NOTICE file distributed with this work for copyright information.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.sablecc.objectmacro.codegeneration.intermediate;

import java.io.*;

import org.sablecc.objectmacro.codegeneration.*;
import org.sablecc.objectmacro.exception.*;
import org.sablecc.util.*;

public class IntermediateCodeGenerator
        extends
        CodeGenerator {

    private File outputFile;

    public IntermediateCodeGenerator(
            IntermediateRepresentation ir) {

        super(ir);
    }

    private File getOutputFile() {

        if (this.outputFile == null) {
            this.outputFile = new File(getIr().getDestinationDirectory(),
                    getIr().getName() + ".objectmacro_intermediate");
        }

        return this.outputFile;
    }

    @Override
    public void verifyTargetSpecificSemantics(
            Strictness strictness) {

        // nothing to verify
    }

    @Override
    public void generateCode() {

        CodeGenerationWalker walker = new CodeGenerationWalker();
        getIr().getAST().apply(walker);

        File destinationDirectory = getIr().getDestinationDirectory();

        if (!destinationDirectory.exists()) {
            if (!destinationDirectory.mkdirs()) {
                CompilerException
                        .cannotCreateDirectory(destinationDirectory.toString());
            }
        }

        try {
            FileWriter fw = new FileWriter(getOutputFile());
            fw.write(walker.getStringRepresentation());
            fw.close();
        }
        catch (IOException e) {
            throw CompilerException.outputError(getOutputFile().toString(), e);
        }
    }
}
