/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.c.macro;

import java.util.*;

public class MFile {

    private final String pFileName;

    private final MFile mFile = this;

    private final List<Object> eTextH = new LinkedList<>();

    private final List<Object> eTextC = new LinkedList<>();

    private final List<Object> eMacroH = new LinkedList<>();

    private final List<Object> eMacroC = new LinkedList<>();

    private final List<Object> eInclude = new LinkedList<>();

    private final List<Object> eSelfRefH = new LinkedList<>();

    private final List<Object> eSelfRefC = new LinkedList<>();

    private final List<Object> eParamField = new LinkedList<>();

    private final List<Object> eAncestorField = new LinkedList<>();

    private final List<Object> eExpandField = new LinkedList<>();

    private final List<Object> eExpandDestructor = new LinkedList<>();

    private final List<Object> eMacroCreator = new LinkedList<>();

    private final List<Object> eMacroCreatorPrototype = new LinkedList<>();

    private final List<Object> eParam = new LinkedList<>();

    private final List<Object> eParamPrototype = new LinkedList<>();

    private final List<Object> eParamRef = new LinkedList<>();

    private final List<Object> eParamRefPrototype = new LinkedList<>();

    private final List<Object> eParamParam = new LinkedList<>();

    private final List<Object> eAncestorParam = new LinkedList<>();

    private final List<Object> eParamArg = new LinkedList<>();

    private final List<Object> eAncestorArg = new LinkedList<>();

    private final List<Object> eParamConstructorInit = new LinkedList<>();

    private final List<Object> eAncestorConstructorInit = new LinkedList<>();

    private final List<Object> eExpandConstructorInit = new LinkedList<>();

    private final List<Object> eStringPart = new LinkedList<>();

    private final List<Object> eEolPart = new LinkedList<>();

    private final List<Object> eParamInsertPart = new LinkedList<>();

    private final List<Object> eTextInsertPart = new LinkedList<>();

    private final List<Object> eExpandInsertPart = new LinkedList<>();

    private final List<Object> eTextInsert = new LinkedList<>();

    private final List<Object> eTextInsertString = new LinkedList<>();

    private final List<Object> eTextInsertDestructor = new LinkedList<>();

    private final List<Object> eInlineText = new LinkedList<>();

    private final List<Object> eInlineString = new LinkedList<>();

    private final List<Object> eInlineEol = new LinkedList<>();

    private final List<Object> eParamInsert = new LinkedList<>();

    private final List<Object> eTextInsertAncestor = new LinkedList<>();

    public MFile(
            String pFileName) {

        if (pFileName == null) {
            throw new NullPointerException();
        }
        this.pFileName = pFileName;
    }

    public MTextH newTextH() {

        MTextH lTextH = new MTextH(this.mFile);
        this.eTextH.add(lTextH);
        return lTextH;
    }

    public MTextC newTextC() {

        MTextC lTextC = new MTextC(this.mFile);
        this.eTextC.add(lTextC);
        return lTextC;
    }

    public MMacroH newMacroH() {

        MMacroH lMacroH = new MMacroH(this.mFile);
        this.eMacroH.add(lMacroH);
        return lMacroH;
    }

    public MMacroC newMacroC() {

        MMacroC lMacroC = new MMacroC(this.mFile);
        this.eMacroC.add(lMacroC);
        return lMacroC;
    }

    public MInclude newInclude(
            String pName) {

        MInclude lInclude = new MInclude(pName);
        this.eInclude.add(lInclude);
        return lInclude;
    }

    public MSelfRefH newSelfRefH() {

        MSelfRefH lSelfRefH = new MSelfRefH(this.mFile);
        this.eSelfRefH.add(lSelfRefH);
        return lSelfRefH;
    }

    public MSelfRefC newSelfRefC() {

        MSelfRefC lSelfRefC = new MSelfRefC(this.mFile);
        this.eSelfRefC.add(lSelfRefC);
        return lSelfRefC;
    }

    public MParamField newParamField(
            String pName) {

        MParamField lParamField = new MParamField(pName);
        this.eParamField.add(lParamField);
        return lParamField;
    }

    public MAncestorField newAncestorField(
            String pName) {

        MAncestorField lAncestorField = new MAncestorField(pName);
        this.eAncestorField.add(lAncestorField);
        return lAncestorField;
    }

    public MExpandField newExpandField(
            String pName) {

        MExpandField lExpandField = new MExpandField(pName);
        this.eExpandField.add(lExpandField);
        return lExpandField;
    }

    public MExpandDestructor newExpandDestructor(
            String pName) {

        MExpandDestructor lExpandDestructor = new MExpandDestructor(pName,
                this.mFile);
        this.eExpandDestructor.add(lExpandDestructor);
        return lExpandDestructor;
    }

    public MMacroCreator newMacroCreator(
            String pName) {

        MMacroCreator lMacroCreator = new MMacroCreator(pName, this.mFile);
        this.eMacroCreator.add(lMacroCreator);
        return lMacroCreator;
    }

    public MMacroCreatorPrototype newMacroCreatorPrototype(
            String pName) {

        MMacroCreatorPrototype lMacroCreatorPrototype = new MMacroCreatorPrototype(
                pName, this.mFile);
        this.eMacroCreatorPrototype.add(lMacroCreatorPrototype);
        return lMacroCreatorPrototype;
    }

    public MParam newParam(
            String pName) {

        MParam lParam = new MParam(pName, this.mFile);
        this.eParam.add(lParam);
        return lParam;
    }

    public MParamPrototype newParamPrototype(
            String pName) {

        MParamPrototype lParamPrototype = new MParamPrototype(pName,
                this.mFile);
        this.eParamPrototype.add(lParamPrototype);
        return lParamPrototype;
    }

    public MParamRef newParamRef(
            String pName,
            String pContext) {

        MParamRef lParamRef = new MParamRef(pName, pContext, this.mFile);
        this.eParamRef.add(lParamRef);
        return lParamRef;
    }

    public MParamRefPrototype newParamRefPrototype(
            String pName) {

        MParamRefPrototype lParamRefPrototype = new MParamRefPrototype(pName,
                this.mFile);
        this.eParamRefPrototype.add(lParamRefPrototype);
        return lParamRefPrototype;
    }

    public MParamParam newParamParam(
            String pName) {

        MParamParam lParamParam = new MParamParam(pName);
        this.eParamParam.add(lParamParam);
        return lParamParam;
    }

    public MAncestorParam newAncestorParam(
            String pName) {

        MAncestorParam lAncestorParam = new MAncestorParam(pName);
        this.eAncestorParam.add(lAncestorParam);
        return lAncestorParam;
    }

    public MParamArg newParamArg(
            String pName) {

        MParamArg lParamArg = new MParamArg(pName);
        this.eParamArg.add(lParamArg);
        return lParamArg;
    }

    public MAncestorArg newAncestorArg(
            String pName) {

        MAncestorArg lAncestorArg = new MAncestorArg(pName, this.mFile);
        this.eAncestorArg.add(lAncestorArg);
        return lAncestorArg;
    }

    public MParamConstructorInit newParamConstructorInit(
            String pName) {

        MParamConstructorInit lParamConstructorInit = new MParamConstructorInit(
                pName, this.mFile);
        this.eParamConstructorInit.add(lParamConstructorInit);
        return lParamConstructorInit;
    }

    public MAncestorConstructorInit newAncestorConstructorInit(
            String pName) {

        MAncestorConstructorInit lAncestorConstructorInit = new MAncestorConstructorInit(
                pName, this.mFile);
        this.eAncestorConstructorInit.add(lAncestorConstructorInit);
        return lAncestorConstructorInit;
    }

    public MExpandConstructorInit newExpandConstructorInit(
            String pName) {

        MExpandConstructorInit lExpandConstructorInit = new MExpandConstructorInit(
                pName, this.mFile);
        this.eExpandConstructorInit.add(lExpandConstructorInit);
        return lExpandConstructorInit;
    }

    public MStringPart newStringPart(
            String pString) {

        MStringPart lStringPart = new MStringPart(pString);
        this.eStringPart.add(lStringPart);
        return lStringPart;
    }

    public MEolPart newEolPart() {

        MEolPart lEolPart = new MEolPart();
        this.eEolPart.add(lEolPart);
        return lEolPart;
    }

    public MParamInsertPart newParamInsertPart(
            String pName) {

        MParamInsertPart lParamInsertPart = new MParamInsertPart(pName,
                this.mFile);
        this.eParamInsertPart.add(lParamInsertPart);
        return lParamInsertPart;
    }

    public MTextInsertPart newTextInsertPart() {

        MTextInsertPart lTextInsertPart = new MTextInsertPart(this.mFile);
        this.eTextInsertPart.add(lTextInsertPart);
        return lTextInsertPart;
    }

    public MExpandInsertPart newExpandInsertPart(
            String pName) {

        MExpandInsertPart lExpandInsertPart = new MExpandInsertPart(pName,
                this.mFile);
        this.eExpandInsertPart.add(lExpandInsertPart);
        return lExpandInsertPart;
    }

    public MTextInsert newTextInsert(
            String pName) {

        MTextInsert lTextInsert = new MTextInsert(pName, this.mFile);
        this.eTextInsert.add(lTextInsert);
        return lTextInsert;
    }

    public MTextInsertString newTextInsertString(
            String pName) {

        MTextInsertString lTextInsertString = new MTextInsertString(pName);
        this.eTextInsertString.add(lTextInsertString);
        return lTextInsertString;
    }

    public MTextInsertDestructor newTextInsertDestructor(
            String pName) {

        MTextInsertDestructor lTextInsertDestructor = new MTextInsertDestructor(
                pName);
        this.eTextInsertDestructor.add(lTextInsertDestructor);
        return lTextInsertDestructor;
    }

    public MInlineText newInlineText() {

        MInlineText lInlineText = new MInlineText();
        this.eInlineText.add(lInlineText);
        return lInlineText;
    }

    public MInlineString newInlineString(
            String pString) {

        MInlineString lInlineString = new MInlineString(pString);
        this.eInlineString.add(lInlineString);
        return lInlineString;
    }

    public MInlineEol newInlineEol() {

        MInlineEol lInlineEol = new MInlineEol();
        this.eInlineEol.add(lInlineEol);
        return lInlineEol;
    }

    public MParamInsert newParamInsert(
            String pName) {

        MParamInsert lParamInsert = new MParamInsert(pName, this.mFile);
        this.eParamInsert.add(lParamInsert);
        return lParamInsert;
    }

    public MTextInsertAncestor newTextInsertAncestor(
            String pName) {

        MTextInsertAncestor lTextInsertAncestor = new MTextInsertAncestor(pName,
                this.mFile);
        this.eTextInsertAncestor.add(lTextInsertAncestor);
        return lTextInsertAncestor;
    }

    String pFileName() {

        return this.pFileName;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        for (Object oTextH : this.eTextH) {
            sb.append(oTextH.toString());
        }
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        for (Object oTextC : this.eTextC) {
            sb.append(oTextC.toString());
        }
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        for (Object oMacroH : this.eMacroH) {
            sb.append(oMacroH.toString());
        }
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        for (Object oMacroC : this.eMacroC) {
            sb.append(oMacroC.toString());
        }
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        for (Object oInclude : this.eInclude) {
            sb.append(oInclude.toString());
        }
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        for (Object oSelfRefH : this.eSelfRefH) {
            sb.append(oSelfRefH.toString());
        }
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        for (Object oSelfRefC : this.eSelfRefC) {
            sb.append(oSelfRefC.toString());
        }
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        for (Object oParamField : this.eParamField) {
            sb.append(oParamField.toString());
        }
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        for (Object oAncestorField : this.eAncestorField) {
            sb.append(oAncestorField.toString());
        }
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        for (Object oExpandField : this.eExpandField) {
            sb.append(oExpandField.toString());
        }
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        for (Object oExpandDestructor : this.eExpandDestructor) {
            sb.append(oExpandDestructor.toString());
        }
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        for (Object oMacroCreator : this.eMacroCreator) {
            sb.append(oMacroCreator.toString());
        }
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        for (Object oMacroCreatorPrototype : this.eMacroCreatorPrototype) {
            sb.append(oMacroCreatorPrototype.toString());
        }
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        for (Object oParam : this.eParam) {
            sb.append(oParam.toString());
        }
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        for (Object oParamPrototype : this.eParamPrototype) {
            sb.append(oParamPrototype.toString());
        }
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        for (Object oParamRef : this.eParamRef) {
            sb.append(oParamRef.toString());
        }
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        for (Object oParamRefPrototype : this.eParamRefPrototype) {
            sb.append(oParamRefPrototype.toString());
        }
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        for (Object oParamParam : this.eParamParam) {
            sb.append(oParamParam.toString());
        }
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        for (Object oAncestorParam : this.eAncestorParam) {
            sb.append(oAncestorParam.toString());
        }
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        for (Object oParamArg : this.eParamArg) {
            sb.append(oParamArg.toString());
        }
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        for (Object oAncestorArg : this.eAncestorArg) {
            sb.append(oAncestorArg.toString());
        }
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        for (Object oParamConstructorInit : this.eParamConstructorInit) {
            sb.append(oParamConstructorInit.toString());
        }
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        for (Object oAncestorConstructorInit : this.eAncestorConstructorInit) {
            sb.append(oAncestorConstructorInit.toString());
        }
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        for (Object oExpandConstructorInit : this.eExpandConstructorInit) {
            sb.append(oExpandConstructorInit.toString());
        }
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        for (Object oStringPart : this.eStringPart) {
            sb.append(oStringPart.toString());
        }
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        for (Object oEolPart : this.eEolPart) {
            sb.append(oEolPart.toString());
        }
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        for (Object oParamInsertPart : this.eParamInsertPart) {
            sb.append(oParamInsertPart.toString());
        }
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        for (Object oTextInsertPart : this.eTextInsertPart) {
            sb.append(oTextInsertPart.toString());
        }
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        for (Object oExpandInsertPart : this.eExpandInsertPart) {
            sb.append(oExpandInsertPart.toString());
        }
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        for (Object oTextInsert : this.eTextInsert) {
            sb.append(oTextInsert.toString());
        }
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        for (Object oTextInsertString : this.eTextInsertString) {
            sb.append(oTextInsertString.toString());
        }
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        for (Object oTextInsertDestructor : this.eTextInsertDestructor) {
            sb.append(oTextInsertDestructor.toString());
        }
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        for (Object oInlineText : this.eInlineText) {
            sb.append(oInlineText.toString());
        }
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        for (Object oInlineString : this.eInlineString) {
            sb.append(oInlineString.toString());
        }
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        for (Object oInlineEol : this.eInlineEol) {
            sb.append(oInlineEol.toString());
        }
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        for (Object oParamInsert : this.eParamInsert) {
            sb.append(oParamInsert.toString());
        }
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        for (Object oTextInsertAncestor : this.eTextInsertAncestor) {
            sb.append(oTextInsertAncestor.toString());
        }
        sb.append(System.getProperty("line.separator"));
        return sb.toString();
    }

}
