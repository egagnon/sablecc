/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.c.macro;

import java.util.*;

public class MTextH {

    private final MFile mFile;

    private final List<Object> eInclude = new LinkedList<>();

    private final List<Object> eParamField_SelfRefH_AncestorField = new LinkedList<>();

    private final List<Object> eParamParam_AncestorParam = new LinkedList<>();

    private final List<Object> eParamPrototype = new LinkedList<>();

    private final List<Object> eParamRefPrototype = new LinkedList<>();

    MTextH(
            MFile mFile) {

        if (mFile == null) {
            throw new NullPointerException();
        }
        this.mFile = mFile;
    }

    public MInclude newInclude(
            String pName) {

        MInclude lInclude = new MInclude(pName);
        this.eInclude.add(lInclude);
        return lInclude;
    }

    public MParamField newParamField(
            String pName) {

        MParamField lParamField = new MParamField(pName);
        this.eParamField_SelfRefH_AncestorField.add(lParamField);
        return lParamField;
    }

    public MSelfRefH newSelfRefH() {

        MSelfRefH lSelfRefH = new MSelfRefH(this.mFile);
        this.eParamField_SelfRefH_AncestorField.add(lSelfRefH);
        return lSelfRefH;
    }

    public MAncestorField newAncestorField(
            String pName) {

        MAncestorField lAncestorField = new MAncestorField(pName);
        this.eParamField_SelfRefH_AncestorField.add(lAncestorField);
        return lAncestorField;
    }

    public MParamParam newParamParam(
            String pName) {

        MParamParam lParamParam = new MParamParam(pName);
        this.eParamParam_AncestorParam.add(lParamParam);
        return lParamParam;
    }

    public MAncestorParam newAncestorParam(
            String pName) {

        MAncestorParam lAncestorParam = new MAncestorParam(pName);
        this.eParamParam_AncestorParam.add(lAncestorParam);
        return lAncestorParam;
    }

    public MParamPrototype newParamPrototype(
            String pName) {

        MParamPrototype lParamPrototype = new MParamPrototype(pName,
                this.mFile);
        this.eParamPrototype.add(lParamPrototype);
        return lParamPrototype;
    }

    public MParamRefPrototype newParamRefPrototype(
            String pName) {

        MParamRefPrototype lParamRefPrototype = new MParamRefPrototype(pName,
                this.mFile);
        this.eParamRefPrototype.add(lParamRefPrototype);
        return lParamRefPrototype;
    }

    private String rFileName() {

        return this.mFile.pFileName();
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(new MHeader().toString());
        sb.append(System.getProperty("line.separator"));
        sb.append("#ifndef M");
        sb.append(rFileName());
        sb.append("_H");
        sb.append(System.getProperty("line.separator"));
        sb.append("#define M");
        sb.append(rFileName());
        sb.append("_H");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("#include <stdlib.h>");
        sb.append(System.getProperty("line.separator"));
        sb.append("#include <string.h>");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("#include \"List.h\"");
        sb.append(System.getProperty("line.separator"));
        sb.append("#include \"AbstractMacro.h\"");
        sb.append(System.getProperty("line.separator"));
        for (Object oInclude : this.eInclude) {
            sb.append(oInclude.toString());
        }
        sb.append(System.getProperty("line.separator"));
        sb.append("typedef struct M");
        sb.append(rFileName());
        sb.append(" {");
        sb.append(System.getProperty("line.separator"));
        sb.append("  char* (*toString)(void*);");
        sb.append(System.getProperty("line.separator"));
        sb.append("  void (*free)(void*);");
        sb.append(System.getProperty("line.separator"));
        for (Object oParamField_SelfRefH_AncestorField : this.eParamField_SelfRefH_AncestorField) {
            sb.append(oParamField_SelfRefH_AncestorField.toString());
        }
        sb.append("}M");
        sb.append(rFileName());
        sb.append(";");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("M");
        sb.append(rFileName());
        sb.append("* M");
        sb.append(rFileName());
        sb.append("_init(");
        {
            boolean first = true;
            for (Object oParamParam_AncestorParam : this.eParamParam_AncestorParam) {
                if (first) {
                    first = false;
                }
                else {
                    sb.append(", ");
                }
                sb.append(oParamParam_AncestorParam.toString());
            }
        }
        sb.append(");");
        sb.append(System.getProperty("line.separator"));
        sb.append("void M");
        sb.append(rFileName());
        sb.append("_free(M");
        sb.append(rFileName());
        sb.append("* m");
        sb.append(rFileName());
        sb.append(");");
        sb.append(System.getProperty("line.separator"));
        {
            boolean first = true;
            for (Object oParamPrototype : this.eParamPrototype) {
                if (first) {
                    first = false;
                }
                else {
                    sb.append(System.getProperty("line.separator"));
                }
                sb.append(oParamPrototype.toString());
            }
        }
        {
            boolean first = true;
            for (Object oParamRefPrototype : this.eParamRefPrototype) {
                if (first) {
                    first = false;
                }
                else {
                    sb.append(System.getProperty("line.separator"));
                }
                sb.append(oParamRefPrototype.toString());
            }
        }
        sb.append("char* M");
        sb.append(rFileName());
        sb.append("_toString(M");
        sb.append(rFileName());
        sb.append("* m");
        sb.append(rFileName());
        sb.append(");");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("#endif");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        return sb.toString();
    }

}
