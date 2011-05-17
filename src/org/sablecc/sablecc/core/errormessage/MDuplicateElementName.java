/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.sablecc.core.errormessage;

public class MDuplicateElementName {

    private final String pName;

    private final String pProdName;

    private final String pAltName;

    private final String pLine;

    private final String pChar;

    private final String pRefLine;

    private final String pRefChar;

    private final MDuplicateElementName mDuplicateElementName = this;

    public MDuplicateElementName(
            String pName,
            String pProdName,
            String pAltName,
            String pLine,
            String pChar,
            String pRefLine,
            String pRefChar) {

        if (pName == null) {
            throw new NullPointerException();
        }
        this.pName = pName;
        if (pProdName == null) {
            throw new NullPointerException();
        }
        this.pProdName = pProdName;
        if (pAltName == null) {
            throw new NullPointerException();
        }
        this.pAltName = pAltName;
        if (pLine == null) {
            throw new NullPointerException();
        }
        this.pLine = pLine;
        if (pChar == null) {
            throw new NullPointerException();
        }
        this.pChar = pChar;
        if (pRefLine == null) {
            throw new NullPointerException();
        }
        this.pRefLine = pRefLine;
        if (pRefChar == null) {
            throw new NullPointerException();
        }
        this.pRefChar = pRefChar;
    }

    String pName() {

        return this.pName;
    }

    String pProdName() {

        return this.pProdName;
    }

    String pAltName() {

        return this.pAltName;
    }

    String pLine() {

        return this.pLine;
    }

    String pChar() {

        return this.pChar;
    }

    String pRefLine() {

        return this.pRefLine;
    }

    String pRefChar() {

        return this.pRefChar;
    }

    private String rLine() {

        return this.mDuplicateElementName.pLine();
    }

    private String rChar() {

        return this.mDuplicateElementName.pChar();
    }

    private String rName() {

        return this.mDuplicateElementName.pName();
    }

    private String rAltName() {

        return this.mDuplicateElementName.pAltName();
    }

    private String rProdName() {

        return this.mDuplicateElementName.pProdName();
    }

    private String rRefLine() {

        return this.mDuplicateElementName.pRefLine();
    }

    private String rRefChar() {

        return this.mDuplicateElementName.pRefChar();
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(new MSemanticErrorHead().toString());
        sb.append(System.getProperty("line.separator"));
        sb.append("Line: ");
        sb.append(rLine());
        sb.append(System.getProperty("line.separator"));
        sb.append("Char: ");
        sb.append(rChar());
        sb.append(System.getProperty("line.separator"));
        sb.append("The \"");
        sb.append(rName());
        sb.append("\" element reuses an existing name in alternative \"");
        sb.append(rAltName());
        sb.append("\" of production \"");
        sb.append(rProdName());
        sb.append("\".");
        sb.append(System.getProperty("line.separator"));
        sb.append("A \"");
        sb.append(rName());
        sb.append("\" element is already declared at line ");
        sb.append(rRefLine());
        sb.append(", char ");
        sb.append(rRefChar());
        sb.append(".");
        sb.append(System.getProperty("line.separator"));
        return sb.toString();
    }

}