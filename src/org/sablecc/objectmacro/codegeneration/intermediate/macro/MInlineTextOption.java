/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.intermediate.macro;

import java.util.*;

public class MInlineTextOption {

    private final String pOption;

    private final MInlineTextOption mInlineTextOption = this;

    private final List<Object> eInlineString_InlineEol = new LinkedList<>();

    public MInlineTextOption(
            String pOption) {

        if (pOption == null) {
            throw new NullPointerException();
        }
        this.pOption = pOption;
    }

    public MInlineString newInlineString(
            String pString) {

        MInlineString lInlineString = new MInlineString(pString);
        this.eInlineString_InlineEol.add(lInlineString);
        return lInlineString;
    }

    public MInlineEol newInlineEol() {

        MInlineEol lInlineEol = new MInlineEol();
        this.eInlineString_InlineEol.add(lInlineEol);
        return lInlineEol;
    }

    String pOption() {

        return this.pOption;
    }

    private String rOption() {

        return this.mInlineTextOption.pOption();
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("    ");
        sb.append(rOption());
        sb.append(" = ");
        {
            boolean first = true;
            for (Object oInlineString_InlineEol : this.eInlineString_InlineEol) {
                if (first) {
                    first = false;
                }
                else {
                    sb.append(", ");
                }
                sb.append(oInlineString_InlineEol.toString());
            }
        }
        sb.append(";");
        sb.append(System.getProperty("line.separator"));
        return sb.toString();
    }

}
