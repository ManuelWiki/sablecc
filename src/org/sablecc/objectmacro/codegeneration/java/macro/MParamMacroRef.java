/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.java.macro;

import java.util.*;

public class MParamMacroRef
        extends Macro {

    String field_Name;

    MParamMacroRef(
            String pName,
            Macros macros) {

        setMacros(macros);
        setPName(pName);
    }

    private void setPName(
            String pName) {

        if (pName == null) {
            throw ObjectMacroException.parameterNull("Name");
        }

        this.field_Name = pName;
    }

    String buildName() {

        return this.field_Name;
    }

    String getName() {

        return this.field_Name;
    }

    @Override
    void apply(
            InternalsInitializer internalsInitializer) {

        internalsInitializer.setParamMacroRef(this);
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

        sb0.append("private InternalValue get");
        sb0.append(buildName());
        sb0.append("()");
        sb0.append("{");
        sb0.append(LINE_SEPARATOR);
        sb0.append("    return this.");
        sb0.append(buildName());
        sb0.append("Value;");
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
