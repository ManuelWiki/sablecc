/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.java.macro;

import java.util.*;

class MUserErrorCyclicReference
        extends Macro {

    private String field_MacroName;

    public MUserErrorCyclicReference(
            String pMacroName) {

        setPMacroName(pMacroName);
    }

    private void setPMacroName(
            String pMacroName) {

        if (pMacroName == null) {
            throw ObjectMacroException.parameterNull("MacroName");
        }

        this.field_MacroName = pMacroName;
    }

    private String buildMacroName() {

        return this.field_MacroName;
    }

    private String getMacroName() {

        return this.field_MacroName;
    }

    @Override
    void apply(
            InternalsInitializer internalsInitializer) {

        internalsInitializer.setUserErrorCyclicReference(this);
    }

    public String build() {

        CacheBuilder cache_builder = this.cacheBuilder;

        if (cache_builder == null) {
            cache_builder = new CacheBuilder();
        }
        else {
            return cache_builder.getExpansion();
        }
        this.cacheBuilder = cache_builder;
        List<String> indentations = new LinkedList<>();
        StringBuilder sbIndentation = new StringBuilder();

        StringBuilder sb0 = new StringBuilder();

        MObjectMacroUserErrorHead minsert_1 = new MObjectMacroUserErrorHead();

        sb0.append(minsert_1.build(null));
        sb0.append(LINE_SEPARATOR);
        sb0.append(LINE_SEPARATOR);
        sb0.append("An instance of \"");
        sb0.append(buildMacroName());
        sb0.append("\" is a cyclic reference to the same instance.");

        cache_builder.setExpansion(sb0.toString());
        return sb0.toString();
    }

    @Override
    String build(
            Context context) {

        return build();
    }
}
