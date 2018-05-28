/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.intermediate.macro;

import java.util.*;

public class MName
        extends Macro {

    final List<Macro> list_Value;

    final Context ValueContext = new Context();

    final InternalValue ValueValue;

    private DSeparator ValueSeparator;

    private DBeforeFirst ValueBeforeFirst;

    private DAfterLast ValueAfterLast;

    private DNone ValueNone;

    MName(
            Macros macros) {

        setMacros(macros);
        this.list_Value = new LinkedList<>();

        this.ValueValue = new InternalValue(this.list_Value, this.ValueContext);
    }

    public void addAllValue(
            List<Macro> macros) {

        if (macros == null) {
            throw ObjectMacroException.parameterNull("Value");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException.cannotModify("Name");
        }

        int i = 0;

        for (Macro macro : macros) {
            if (macro == null) {
                throw ObjectMacroException.macroNull(i, "Value");
            }

            if (getMacros() != macro.getMacros()) {
                throw ObjectMacroException.diffMacros();
            }

            verifyTypeValue(macro);
            this.list_Value.add(macro);
            this.children.add(macro);
            Macro.cycleDetector.detectCycle(this, macro);

            i++;
        }
    }

    void verifyTypeValue(
            Macro macro) {

        macro.apply(new InternalsInitializer("Value") {

            @Override
            void setSimpleName(
                    MSimpleName mSimpleName) {

            }
        });
    }

    public void addValue(
            MSimpleName macro) {

        if (macro == null) {
            throw ObjectMacroException.parameterNull("Value");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException.cannotModify("Name");
        }

        if (getMacros() != macro.getMacros()) {
            throw ObjectMacroException.diffMacros();
        }

        this.list_Value.add(macro);
        this.children.add(macro);
        Macro.cycleDetector.detectCycle(this, macro);
    }

    private String buildValue() {

        StringBuilder sb = new StringBuilder();
        Context local_context = this.ValueContext;
        List<Macro> macros = this.list_Value;

        int i = 0;
        int nb_macros = macros.size();
        String expansion = null;

        if (this.ValueNone != null) {
            sb.append(this.ValueNone.apply(i, "", nb_macros));
        }

        for (Macro macro : macros) {
            expansion = macro.build(local_context);

            if (this.ValueBeforeFirst != null) {
                expansion
                        = this.ValueBeforeFirst.apply(i, expansion, nb_macros);
            }

            if (this.ValueAfterLast != null) {
                expansion = this.ValueAfterLast.apply(i, expansion, nb_macros);
            }

            if (this.ValueSeparator != null) {
                expansion = this.ValueSeparator.apply(i, expansion, nb_macros);
            }

            sb.append(expansion);
            i++;
        }

        return sb.toString();
    }

    private InternalValue getValue() {

        return this.ValueValue;
    }

    private void initValueInternals(
            Context context) {

        for (Macro macro : this.list_Value) {
            macro.apply(new InternalsInitializer("Value") {

                @Override
                void setSimpleName(
                        MSimpleName mSimpleName) {

                }
            });
        }
    }

    private void initValueDirectives() {

        StringBuilder sb1 = new StringBuilder();
        sb1.append(", ");
        this.ValueSeparator = new DSeparator(sb1.toString());
        this.ValueValue.setSeparator(this.ValueSeparator);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        sb2.append(" ");
        this.ValueBeforeFirst = new DBeforeFirst(sb2.toString());
        this.ValueValue.setBeforeFirst(this.ValueBeforeFirst);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(" }");
        this.ValueAfterLast = new DAfterLast(sb3.toString());
        this.ValueValue.setAfterLast(this.ValueAfterLast);
    }

    @Override
    void apply(
            InternalsInitializer internalsInitializer) {

        internalsInitializer.setName(this);
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

        initValueDirectives();

        initValueInternals(null);

        StringBuilder sb0 = new StringBuilder();

        sb0.append("Name = ");
        sb0.append(buildValue());

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
