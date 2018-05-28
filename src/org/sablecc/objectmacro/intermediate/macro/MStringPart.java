/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.intermediate.macro;

import java.util.*;

public class MStringPart
        extends Macro {

    String field_Text;

    MStringPart(
            String pText,
            Macros macros) {

        setMacros(macros);
        setPText(pText);
    }

    private void setPText(
            String pText) {

        if (pText == null) {
            throw ObjectMacroException.parameterNull("Text");
        }

        this.field_Text = pText;
    }

    String buildText() {

        return this.field_Text;
    }

    String getText() {

        return this.field_Text;
    }

    @Override
    void apply(
            InternalsInitializer internalsInitializer) {

        internalsInitializer.setStringPart(this);
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

        sb0.append("'");
        sb0.append(buildText());
        sb0.append("'");

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
