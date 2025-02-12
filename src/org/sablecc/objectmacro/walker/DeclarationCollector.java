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

package org.sablecc.objectmacro.walker;

import org.sablecc.exception.*;
import org.sablecc.objectmacro.structure.*;
import org.sablecc.objectmacro.syntax3.analysis.*;
import org.sablecc.objectmacro.syntax3.node.*;

public class DeclarationCollector
        extends
        DepthFirstAdapter {

    private final GlobalIndex globalIndex;

    private Scope currentScope;

    public DeclarationCollector(
            GlobalIndex globalIndex) {

        if (globalIndex == null) {
            throw new InternalException("globalIndex may not be null");
        }

        this.globalIndex = globalIndex;
    }

    @Override
    public void inAMacro(
            AMacro node) {

        if (this.currentScope != null) {
            this.currentScope = ((Macro) this.currentScope).newMacro(node);
        }
        else {
            this.currentScope = this.globalIndex.newTopMacro(node);
        }
    }

    @Override
    public void outAMacro(
            AMacro node) {

        this.currentScope = this.currentScope.getParent();
    }

    @Override
    public void inATextBlock(
            ATextBlock node) {

        if (this.currentScope != null) {
            this.currentScope = this.currentScope.newTextBlock(node);
        }
        else {
            this.currentScope = this.globalIndex.newTopTextBlock(node);
        }
    }

    @Override
    public void outATextBlock(
            ATextBlock node) {

        this.currentScope = this.currentScope.getParent();
    }

    @Override
    public void inAParam(
            AParam node) {

        this.currentScope.newParam(node);
    }

}
