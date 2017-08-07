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

package org.sablecc.sablecc.semantics;

import java.util.*;

import org.sablecc.sablecc.syntax3.node.*;

public class NameSpace {

    private final Map<String, Declaration> nameMap = new TreeMap<>();

    public Declaration get(
            String name) {

        return this.nameMap.get(name);
    }

    void add(
            Declaration declaration) {

        String lookupName = declaration.getLookupName();
        if (this.nameMap.containsKey(lookupName)) {
            Token location = this.nameMap.get(lookupName).getLocation();
            throw SemanticException.semanticError("Another \"" + lookupName
                    + "\" has already been declared on line "
                    + location.getLine() + " char " + location.getPos() + ".",
                    declaration.getLocation());
        }
        this.nameMap.put(lookupName, declaration);
    }

}
