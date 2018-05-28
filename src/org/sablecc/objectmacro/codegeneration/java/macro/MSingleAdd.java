/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.java.macro;

import java.util.*;

public class MSingleAdd
        extends Macro {

    String field_ReferencedMacroName;

    String field_CurrentMacroName;

    String field_ParamName;

    MSingleAdd(
            String pReferencedMacroName,
            String pCurrentMacroName,
            String pParamName,
            Macros macros) {

        setMacros(macros);
        setPReferencedMacroName(pReferencedMacroName);
        setPCurrentMacroName(pCurrentMacroName);
        setPParamName(pParamName);
    }

    private void setPReferencedMacroName(
            String pReferencedMacroName) {

        if (pReferencedMacroName == null) {
            throw ObjectMacroException.parameterNull("ReferencedMacroName");
        }

        this.field_ReferencedMacroName = pReferencedMacroName;
    }

    private void setPCurrentMacroName(
            String pCurrentMacroName) {

        if (pCurrentMacroName == null) {
            throw ObjectMacroException.parameterNull("CurrentMacroName");
        }

        this.field_CurrentMacroName = pCurrentMacroName;
    }

    private void setPParamName(
            String pParamName) {

        if (pParamName == null) {
            throw ObjectMacroException.parameterNull("ParamName");
        }

        this.field_ParamName = pParamName;
    }

    String buildReferencedMacroName() {

        return this.field_ReferencedMacroName;
    }

    String buildCurrentMacroName() {

        return this.field_CurrentMacroName;
    }

    String buildParamName() {

        return this.field_ParamName;
    }

    String getReferencedMacroName() {

        return this.field_ReferencedMacroName;
    }

    String getCurrentMacroName() {

        return this.field_CurrentMacroName;
    }

    String getParamName() {

        return this.field_ParamName;
    }

    @Override
    void apply(
            InternalsInitializer internalsInitializer) {

        internalsInitializer.setSingleAdd(this);
    }

    public String build() {

        CacheBuilder cache_builder = this.cacheBuilder;

        if (cache_builder == null) {
            cache_builder = new CacheBuilder();
        }
        else if (cache_builder.getExpansion() == null) {
            throw new InternalException("Cycle detection detected lately");
        }
        else {
            return cache_builder.getExpansion();
        }
        this.cacheBuilder = cache_builder;
        List<String> indentations = new LinkedList<>();
        StringBuilder sbIndentation = new StringBuilder();

        StringBuilder sb0 = new StringBuilder();

        sb0.append("public void add");
        sb0.append(buildParamName());
        sb0.append("(M");
        sb0.append(buildReferencedMacroName());
        sb0.append(" macro)");
        sb0.append("{");
        sb0.append(LINE_SEPARATOR);
        sb0.append("    if(macro == null)");
        sb0.append("{");
        sb0.append(LINE_SEPARATOR);
        sb0.append("        throw ObjectMacroException.parameterNull(\"");
        sb0.append(buildParamName());
        sb0.append("\");");
        sb0.append(LINE_SEPARATOR);
        sb0.append("    }");
        sb0.append(LINE_SEPARATOR);
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("    ");
        indentations.add(sb2.toString());
        MIsBuilt m1 = getMacros().newIsBuilt();

        m1.setMacroName(null, getCurrentMacroName());
        sb1.append(m1.build(null));
        sb1.append(LINE_SEPARATOR);
        sb1.append(LINE_SEPARATOR);
        MFactoryComparison m2 = getMacros().newFactoryComparison();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("macro");
        m2.setVarName(null, sb3.toString());
        sb1.append(m2.build(null));
        sb0.append(applyIndent(sb1.toString(),
                indentations.remove(indentations.size() - 1)));
        sb0.append(LINE_SEPARATOR);
        sb0.append(LINE_SEPARATOR);
        sb0.append("    this.list_");
        sb0.append(buildParamName());
        sb0.append(".add(macro);");
        sb0.append(LINE_SEPARATOR);
        sb0.append("    this.children.add(macro);");
        sb0.append(LINE_SEPARATOR);
        sb0.append("    Macro.cycleDetector.detectCycle(this, macro);");
        sb0.append(LINE_SEPARATOR);
        sb0.append("}");

        cache_builder.setExpansion(sb0.toString());
        return sb0.toString();
    }

    @Override
    String build(
            Context context) {

        return build();
    }

    private void setMacros(
            Macros macros) {

        if (macros == null) {
            throw new InternalException("macros cannot be null");
        }

        this.macros = macros;
    }
}
