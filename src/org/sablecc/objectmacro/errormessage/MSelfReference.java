/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.errormessage;

import java.util.*;

public class MSelfReference
        extends Macro {

    private String field_Reference;

    private String field_Line;

    private String field_Char;

    private String field_Context;

    private String field_ContextLine;

    private String field_ContextChar;

    public MSelfReference(
            String pReference,
            String pLine,
            String pChar,
            String pContext,
            String pContextLine,
            String pContextChar) {

        setPReference(pReference);
        setPLine(pLine);
        setPChar(pChar);
        setPContext(pContext);
        setPContextLine(pContextLine);
        setPContextChar(pContextChar);

    }

    private void setPReference(
            String pReference) {

        if (pReference == null) {
            throw ObjectMacroException.parameterNull("Reference");
        }

        this.field_Reference = pReference;
    }

    private void setPLine(
            String pLine) {

        if (pLine == null) {
            throw ObjectMacroException.parameterNull("Line");
        }

        this.field_Line = pLine;
    }

    private void setPChar(
            String pChar) {

        if (pChar == null) {
            throw ObjectMacroException.parameterNull("Char");
        }

        this.field_Char = pChar;
    }

    private void setPContext(
            String pContext) {

        if (pContext == null) {
            throw ObjectMacroException.parameterNull("Context");
        }

        this.field_Context = pContext;
    }

    private void setPContextLine(
            String pContextLine) {

        if (pContextLine == null) {
            throw ObjectMacroException.parameterNull("ContextLine");
        }

        this.field_ContextLine = pContextLine;
    }

    private void setPContextChar(
            String pContextChar) {

        if (pContextChar == null) {
            throw ObjectMacroException.parameterNull("ContextChar");
        }

        this.field_ContextChar = pContextChar;
    }

    private String buildReference() {

        return this.field_Reference;
    }

    private String buildLine() {

        return this.field_Line;
    }

    private String buildChar() {

        return this.field_Char;
    }

    private String buildContext() {

        return this.field_Context;
    }

    private String buildContextLine() {

        return this.field_ContextLine;
    }

    private String buildContextChar() {

        return this.field_ContextChar;
    }

    private String getReference() {

        return this.field_Reference;
    }

    private String getLine() {

        return this.field_Line;
    }

    private String getChar() {

        return this.field_Char;
    }

    private String getContext() {

        return this.field_Context;
    }

    private String getContextLine() {

        return this.field_ContextLine;
    }

    private String getContextChar() {

        return this.field_ContextChar;
    }

    @Override
    void apply(
            InternalsInitializer internalsInitializer) {

        internalsInitializer.setSelfReference(this);
    }

    @Override
    public String build() {

        BuildState buildState = this.build_state;

        if (buildState == null) {
            buildState = new BuildState();
        }
        else if (buildState.getExpansion() == null) {
            throw ObjectMacroException.cyclicReference("SelfReference");
        }
        else {
            return buildState.getExpansion();
        }
        this.build_state = buildState;
        List<String> indentations = new LinkedList<>();
        StringBuilder sbIndentation = new StringBuilder();

        StringBuilder sb0 = new StringBuilder();

        MSemanticErrorHead minsert_1 = new MSemanticErrorHead();

        sb0.append(minsert_1.build(null));
        sb0.append(LINE_SEPARATOR);
        sb0.append(LINE_SEPARATOR);
        sb0.append("Line: ");
        sb0.append(buildLine());
        sb0.append(LINE_SEPARATOR);
        sb0.append("Char: ");
        sb0.append(buildChar());
        sb0.append(LINE_SEPARATOR);
        sb0.append("\"");
        sb0.append(buildReference());
        sb0.append("\" is a self reference to \"");
        sb0.append(buildContext());
        sb0.append("\" of line ");
        sb0.append(buildContextLine());
        sb0.append(", char ");
        sb0.append(buildContextChar());
        sb0.append(".");

        buildState.setExpansion(sb0.toString());
        return sb0.toString();
    }

    @Override
    String build(
            Context context) {

        return build();
    }

    private String applyIndent(
            String macro,
            String indent) {

        StringBuilder sb = new StringBuilder();
        String[] lines = macro.split("\n");

        if (lines.length > 1) {
            for (int i = 0; i < lines.length; i++) {
                String line = lines[i];
                sb.append(indent).append(line);

                if (i < lines.length - 1) {
                    sb.append(LINE_SEPARATOR);
                }
            }
        }
        else {
            sb.append(indent).append(macro);
        }

        return sb.toString();
    }
}