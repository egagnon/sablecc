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

package org.sablecc.objectmacro.structure;

import org.sablecc.exception.*;
import org.sablecc.objectmacro.syntax3.node.*;

public class TextInsert {

    private final ATextInsert declaration;

    private final Scope enclosingScope;

    private final TextBlock insertedTextBlock;

    TextInsert(
            ATextInsert declaration,
            Scope enclosingScope) {

        if (declaration == null) {
            throw new InternalException("declaration may not be null");
        }

        if (enclosingScope == null) {
            throw new InternalException("enclosingScope may not be null");
        }

        this.declaration = declaration;
        this.enclosingScope = enclosingScope;
        this.insertedTextBlock = enclosingScope
                .getTextBlock(declaration.getName());
    }

    public ATextInsert getDeclaration() {

        return this.declaration;
    }

    public Scope getEnclosingScope() {

        return this.enclosingScope;
    }

    public TextBlock getInsertedTextBlock() {

        return this.insertedTextBlock;
    }
}
