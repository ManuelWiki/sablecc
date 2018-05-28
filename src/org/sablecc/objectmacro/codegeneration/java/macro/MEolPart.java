/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.java.macro;

import java.util.*;

public class MEolPart
        extends Macro {

    String field_IndexBuilder;

    MEolPart(
            String pIndexBuilder,
            Macros macros) {

        setMacros(macros);
        setPIndexBuilder(pIndexBuilder);
    }

    private void setPIndexBuilder(
            String pIndexBuilder) {

        if (pIndexBuilder == null) {
            throw ObjectMacroException.parameterNull("IndexBuilder");
        }

        this.field_IndexBuilder = pIndexBuilder;
    }

    String buildIndexBuilder() {

        return this.field_IndexBuilder;
    }

    String getIndexBuilder() {

        return this.field_IndexBuilder;
    }

    @Override
    void apply(
            InternalsInitializer internalsInitializer) {

        internalsInitializer.setEolPart(this);
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

        sb0.append("sb");
        sb0.append(buildIndexBuilder());
        sb0.append(".append(LINE_SEPARATOR);");

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
