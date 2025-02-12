/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.c.macro;

import java.util.*;

public class MExpandInsertPart {

    private final String pName;

    private final MExpandInsertPart mExpandInsertPart = this;

    private final MFile mFile;

    private final List<Object> eNone = new LinkedList<>();

    private final List<Object> eBeforeFirst = new LinkedList<>();

    private final List<Object> eBeforeOne = new LinkedList<>();

    private final List<Object> eBeforeMany = new LinkedList<>();

    private final List<Object> eSeparator = new LinkedList<>();

    private final List<Object> eNoSeparator = new LinkedList<>();

    private final List<Object> eAfterLast = new LinkedList<>();

    private final List<Object> eAfterOne = new LinkedList<>();

    private final List<Object> eAfterMany = new LinkedList<>();

    MExpandInsertPart(
            String pName,
            MFile mFile) {

        if (pName == null) {
            throw new NullPointerException();
        }
        this.pName = pName;
        if (mFile == null) {
            throw new NullPointerException();
        }
        this.mFile = mFile;
    }

    public MNone newNone() {

        MNone lNone = new MNone(this.mFile, this.mExpandInsertPart);
        this.eNone.add(lNone);
        return lNone;
    }

    public MBeforeFirst newBeforeFirst() {

        MBeforeFirst lBeforeFirst = new MBeforeFirst(this.mFile,
                this.mExpandInsertPart);
        this.eBeforeFirst.add(lBeforeFirst);
        return lBeforeFirst;
    }

    public MBeforeOne newBeforeOne() {

        MBeforeOne lBeforeOne = new MBeforeOne(this.mFile,
                this.mExpandInsertPart);
        this.eBeforeOne.add(lBeforeOne);
        return lBeforeOne;
    }

    public MBeforeMany newBeforeMany() {

        MBeforeMany lBeforeMany = new MBeforeMany(this.mFile,
                this.mExpandInsertPart);
        this.eBeforeMany.add(lBeforeMany);
        return lBeforeMany;
    }

    public MSeparator newSeparator() {

        MSeparator lSeparator = new MSeparator(this.mFile,
                this.mExpandInsertPart);
        this.eSeparator.add(lSeparator);
        return lSeparator;
    }

    public MNoSeparator newNoSeparator() {

        MNoSeparator lNoSeparator = new MNoSeparator(this.mFile,
                this.mExpandInsertPart);
        this.eNoSeparator.add(lNoSeparator);
        return lNoSeparator;
    }

    public MAfterLast newAfterLast() {

        MAfterLast lAfterLast = new MAfterLast(this.mFile,
                this.mExpandInsertPart);
        this.eAfterLast.add(lAfterLast);
        return lAfterLast;
    }

    public MAfterOne newAfterOne() {

        MAfterOne lAfterOne = new MAfterOne(this.mFile, this.mExpandInsertPart);
        this.eAfterOne.add(lAfterOne);
        return lAfterOne;
    }

    public MAfterMany newAfterMany() {

        MAfterMany lAfterMany = new MAfterMany(this.mFile,
                this.mExpandInsertPart);
        this.eAfterMany.add(lAfterMany);
        return lAfterMany;
    }

    String pName() {

        return this.pName;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        for (Object oNone : this.eNone) {
            sb.append(oNone.toString());
        }
        for (Object oBeforeFirst : this.eBeforeFirst) {
            sb.append(oBeforeFirst.toString());
        }
        for (Object oBeforeOne : this.eBeforeOne) {
            sb.append(oBeforeOne.toString());
        }
        for (Object oBeforeMany : this.eBeforeMany) {
            sb.append(oBeforeMany.toString());
        }
        for (Object oSeparator : this.eSeparator) {
            sb.append(oSeparator.toString());
        }
        for (Object oNoSeparator : this.eNoSeparator) {
            sb.append(oNoSeparator.toString());
        }
        for (Object oAfterLast : this.eAfterLast) {
            sb.append(oAfterLast.toString());
        }
        for (Object oAfterOne : this.eAfterOne) {
            sb.append(oAfterOne.toString());
        }
        for (Object oAfterMany : this.eAfterMany) {
            sb.append(oAfterMany.toString());
        }
        return sb.toString();
    }

}
