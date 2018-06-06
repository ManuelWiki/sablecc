/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.java.macro;

import java.util.*;

public class MRedefinedInternalsSetter
        extends Macro {

    private DSeparator MacroNameSeparator;

    private DBeforeFirst MacroNameBeforeFirst;

    private DAfterLast MacroNameAfterLast;

    private DNone MacroNameNone;

    final List<String> list_MacroName;

    final Context MacroNameContext = new Context();

    final StringValue MacroNameValue;

    private DSeparator TextPartsSeparator;

    private DBeforeFirst TextPartsBeforeFirst;

    private DAfterLast TextPartsAfterLast;

    private DNone TextPartsNone;

    final List<Macro> list_TextParts;

    final Context TextPartsContext = new Context();

    final MacroValue TextPartsValue;

    private DSeparator SingleStringElementsSeparator;

    private DBeforeFirst SingleStringElementsBeforeFirst;

    private DAfterLast SingleStringElementsAfterLast;

    private DNone SingleStringElementsNone;

    final List<Macro> list_SingleStringElements;

    final Context SingleStringElementsContext = new Context();

    final MacroValue SingleStringElementsValue;

    private DSeparator SetInternalsSeparator;

    private DBeforeFirst SetInternalsBeforeFirst;

    private DAfterLast SetInternalsAfterLast;

    private DNone SetInternalsNone;

    final List<Macro> list_SetInternals;

    final Context SetInternalsContext = new Context();

    final MacroValue SetInternalsValue;

    MRedefinedInternalsSetter(
            Macros macros) {

        setMacros(macros);
        this.list_MacroName = new LinkedList<>();
        this.list_TextParts = new LinkedList<>();
        this.list_SingleStringElements = new LinkedList<>();
        this.list_SetInternals = new LinkedList<>();

        this.MacroNameValue
                = new StringValue(this.list_MacroName, this.MacroNameContext);
        this.TextPartsValue
                = new MacroValue(this.list_TextParts, this.TextPartsContext);
        this.SingleStringElementsValue
                = new MacroValue(this.list_SingleStringElements,
                        this.SingleStringElementsContext);
        this.SetInternalsValue = new MacroValue(this.list_SetInternals,
                this.SetInternalsContext);
    }

    MRedefinedInternalsSetter(
            String pMacroName,
            List<Macro> pTextParts,
            List<Macro> pSingleStringElements,
            List<Macro> pSetInternals,
            Macros macros) {

        setMacros(macros);
        this.list_MacroName = new LinkedList<>();
        this.list_TextParts = new LinkedList<>();
        this.list_SingleStringElements = new LinkedList<>();
        this.list_SetInternals = new LinkedList<>();

        this.MacroNameValue
                = new StringValue(this.list_MacroName, this.MacroNameContext);
        this.TextPartsValue
                = new MacroValue(this.list_TextParts, this.TextPartsContext);
        this.SingleStringElementsValue
                = new MacroValue(this.list_SingleStringElements,
                        this.SingleStringElementsContext);
        this.SetInternalsValue = new MacroValue(this.list_SetInternals,
                this.SetInternalsContext);
        if (pTextParts != null) {
            addAllTextParts(pTextParts);
        }
        if (pSingleStringElements != null) {
            addAllSingleStringElements(pSingleStringElements);
        }
        if (pSetInternals != null) {
            addAllSetInternals(pSetInternals);
        }

        if (pMacroName != null) {
            addMacroName(pMacroName);
        }
    }

    public void addAllMacroName(
            List<String> strings) {

        if (this.macros == null) {
            throw ObjectMacroException.parameterNull("MacroName");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }
        for (String string : strings) {
            if (string == null) {
                throw ObjectMacroException.parameterNull("MacroName");
            }

            this.list_MacroName.add(string);
        }
    }

    public void addMacroName(
            String string) {

        if (string == null) {
            throw ObjectMacroException.parameterNull("MacroName");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }

        this.list_MacroName.add(string);
    }

    public void addAllTextParts(
            List<Macro> macros) {

        if (macros == null) {
            throw ObjectMacroException.parameterNull("TextParts");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }

        int i = 0;

        for (Macro macro : macros) {
            if (macro == null) {
                throw ObjectMacroException.macroNull(i, "TextParts");
            }

            if (getMacros() != macro.getMacros()) {
                throw ObjectMacroException.diffMacros();
            }

            verifyTypeTextParts(macro);
            this.list_TextParts.add(macro);
            this.children.add(macro);
            Macro.cycleDetector.detectCycle(this, macro);

            i++;
        }
    }

    void verifyTypeTextParts(
            Macro macro) {

        macro.apply(new InternalsInitializer("TextParts") {

            @Override
            void setInitStringBuilder(
                    MInitStringBuilder mInitStringBuilder) {

            }

            @Override
            void setStringPart(
                    MStringPart mStringPart) {

            }

            @Override
            void setParamInsertPart(
                    MParamInsertPart mParamInsertPart) {

            }

            @Override
            void setEolPart(
                    MEolPart mEolPart) {

            }

            @Override
            void setInsertMacroPart(
                    MInsertMacroPart mInsertMacroPart) {

            }
        });
    }

    public void addTextParts(
            MInitStringBuilder macro) {

        if (macro == null) {
            throw ObjectMacroException.parameterNull("TextParts");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }

        if (getMacros() != macro.getMacros()) {
            throw ObjectMacroException.diffMacros();
        }

        this.list_TextParts.add(macro);
        this.children.add(macro);
        Macro.cycleDetector.detectCycle(this, macro);
    }

    public void addTextParts(
            MStringPart macro) {

        if (macro == null) {
            throw ObjectMacroException.parameterNull("TextParts");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }

        if (getMacros() != macro.getMacros()) {
            throw ObjectMacroException.diffMacros();
        }

        this.list_TextParts.add(macro);
        this.children.add(macro);
        Macro.cycleDetector.detectCycle(this, macro);
    }

    public void addTextParts(
            MParamInsertPart macro) {

        if (macro == null) {
            throw ObjectMacroException.parameterNull("TextParts");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }

        if (getMacros() != macro.getMacros()) {
            throw ObjectMacroException.diffMacros();
        }

        this.list_TextParts.add(macro);
        this.children.add(macro);
        Macro.cycleDetector.detectCycle(this, macro);
    }

    public void addTextParts(
            MEolPart macro) {

        if (macro == null) {
            throw ObjectMacroException.parameterNull("TextParts");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }

        if (getMacros() != macro.getMacros()) {
            throw ObjectMacroException.diffMacros();
        }

        this.list_TextParts.add(macro);
        this.children.add(macro);
        Macro.cycleDetector.detectCycle(this, macro);
    }

    public void addTextParts(
            MInsertMacroPart macro) {

        if (macro == null) {
            throw ObjectMacroException.parameterNull("TextParts");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }

        if (getMacros() != macro.getMacros()) {
            throw ObjectMacroException.diffMacros();
        }

        this.list_TextParts.add(macro);
        this.children.add(macro);
        Macro.cycleDetector.detectCycle(this, macro);
    }

    public void addAllSingleStringElements(
            List<Macro> macros) {

        if (macros == null) {
            throw ObjectMacroException.parameterNull("SingleStringElements");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }

        int i = 0;

        for (Macro macro : macros) {
            if (macro == null) {
                throw ObjectMacroException.macroNull(i, "SingleStringElements");
            }

            if (getMacros() != macro.getMacros()) {
                throw ObjectMacroException.diffMacros();
            }

            verifyTypeSingleStringElements(macro);
            this.list_SingleStringElements.add(macro);
            this.children.add(macro);
            Macro.cycleDetector.detectCycle(this, macro);

            i++;
        }
    }

    void verifyTypeSingleStringElements(
            Macro macro) {

        macro.apply(new InternalsInitializer("SingleStringElements") {

            @Override
            void setNewStringValue(
                    MNewStringValue mNewStringValue) {

            }
        });
    }

    public void addSingleStringElements(
            MNewStringValue macro) {

        if (macro == null) {
            throw ObjectMacroException.parameterNull("SingleStringElements");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }

        if (getMacros() != macro.getMacros()) {
            throw ObjectMacroException.diffMacros();
        }

        this.list_SingleStringElements.add(macro);
        this.children.add(macro);
        Macro.cycleDetector.detectCycle(this, macro);
    }

    public void addAllSetInternals(
            List<Macro> macros) {

        if (macros == null) {
            throw ObjectMacroException.parameterNull("SetInternals");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }

        int i = 0;

        for (Macro macro : macros) {
            if (macro == null) {
                throw ObjectMacroException.macroNull(i, "SetInternals");
            }

            if (getMacros() != macro.getMacros()) {
                throw ObjectMacroException.diffMacros();
            }

            verifyTypeSetInternals(macro);
            this.list_SetInternals.add(macro);
            this.children.add(macro);
            Macro.cycleDetector.detectCycle(this, macro);

            i++;
        }
    }

    void verifyTypeSetInternals(
            Macro macro) {

        macro.apply(new InternalsInitializer("SetInternals") {

            @Override
            void setSetInternal(
                    MSetInternal mSetInternal) {

            }
        });
    }

    public void addSetInternals(
            MSetInternal macro) {

        if (macro == null) {
            throw ObjectMacroException.parameterNull("SetInternals");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }

        if (getMacros() != macro.getMacros()) {
            throw ObjectMacroException.diffMacros();
        }

        this.list_SetInternals.add(macro);
        this.children.add(macro);
        Macro.cycleDetector.detectCycle(this, macro);
    }

    private String buildMacroName() {

        StringBuilder sb = new StringBuilder();
        List<String> strings = this.list_MacroName;

        int i = 0;
        int nb_strings = strings.size();

        if (this.MacroNameNone != null) {
            sb.append(this.MacroNameNone.apply(i, "", nb_strings));
        }

        for (String string : strings) {

            if (this.MacroNameBeforeFirst != null) {
                string = this.MacroNameBeforeFirst.apply(i, string, nb_strings);
            }

            if (this.MacroNameAfterLast != null) {
                string = this.MacroNameAfterLast.apply(i, string, nb_strings);
            }

            if (this.MacroNameSeparator != null) {
                string = this.MacroNameSeparator.apply(i, string, nb_strings);
            }

            sb.append(string);
            i++;
        }

        return sb.toString();
    }

    private String buildTextParts() {

        StringBuilder sb = new StringBuilder();
        Context local_context = this.TextPartsContext;
        List<Macro> macros = this.list_TextParts;

        int i = 0;
        int nb_macros = macros.size();
        String expansion = null;

        if (this.TextPartsNone != null) {
            sb.append(this.TextPartsNone.apply(i, "", nb_macros));
        }

        for (Macro macro : macros) {
            expansion = macro.build(local_context);

            if (this.TextPartsBeforeFirst != null) {
                expansion = this.TextPartsBeforeFirst.apply(i, expansion,
                        nb_macros);
            }

            if (this.TextPartsAfterLast != null) {
                expansion = this.TextPartsAfterLast.apply(i, expansion,
                        nb_macros);
            }

            if (this.TextPartsSeparator != null) {
                expansion = this.TextPartsSeparator.apply(i, expansion,
                        nb_macros);
            }

            sb.append(expansion);
            i++;
        }

        return sb.toString();
    }

    private String buildSingleStringElements() {

        StringBuilder sb = new StringBuilder();
        Context local_context = this.SingleStringElementsContext;
        List<Macro> macros = this.list_SingleStringElements;

        int i = 0;
        int nb_macros = macros.size();
        String expansion = null;

        if (this.SingleStringElementsNone != null) {
            sb.append(this.SingleStringElementsNone.apply(i, "", nb_macros));
        }

        for (Macro macro : macros) {
            expansion = macro.build(local_context);

            if (this.SingleStringElementsBeforeFirst != null) {
                expansion = this.SingleStringElementsBeforeFirst.apply(i,
                        expansion, nb_macros);
            }

            if (this.SingleStringElementsAfterLast != null) {
                expansion = this.SingleStringElementsAfterLast.apply(i,
                        expansion, nb_macros);
            }

            if (this.SingleStringElementsSeparator != null) {
                expansion = this.SingleStringElementsSeparator.apply(i,
                        expansion, nb_macros);
            }

            sb.append(expansion);
            i++;
        }

        return sb.toString();
    }

    private String buildSetInternals() {

        StringBuilder sb = new StringBuilder();
        Context local_context = this.SetInternalsContext;
        List<Macro> macros = this.list_SetInternals;

        int i = 0;
        int nb_macros = macros.size();
        String expansion = null;

        if (this.SetInternalsNone != null) {
            sb.append(this.SetInternalsNone.apply(i, "", nb_macros));
        }

        for (Macro macro : macros) {
            expansion = macro.build(local_context);

            if (this.SetInternalsBeforeFirst != null) {
                expansion = this.SetInternalsBeforeFirst.apply(i, expansion,
                        nb_macros);
            }

            if (this.SetInternalsAfterLast != null) {
                expansion = this.SetInternalsAfterLast.apply(i, expansion,
                        nb_macros);
            }

            if (this.SetInternalsSeparator != null) {
                expansion = this.SetInternalsSeparator.apply(i, expansion,
                        nb_macros);
            }

            sb.append(expansion);
            i++;
        }

        return sb.toString();
    }

    StringValue getMacroName() {

        return this.MacroNameValue;
    }

    MacroValue getTextParts() {

        return this.TextPartsValue;
    }

    MacroValue getSingleStringElements() {

        return this.SingleStringElementsValue;
    }

    MacroValue getSetInternals() {

        return this.SetInternalsValue;
    }

    private void initTextPartsInternals(
            Context context) {

        for (Macro macro : this.list_TextParts) {
            macro.apply(new InternalsInitializer("TextParts") {

                @Override
                void setInitStringBuilder(
                        MInitStringBuilder mInitStringBuilder) {

                }

                @Override
                void setStringPart(
                        MStringPart mStringPart) {

                }

                @Override
                void setParamInsertPart(
                        MParamInsertPart mParamInsertPart) {

                }

                @Override
                void setEolPart(
                        MEolPart mEolPart) {

                }

                @Override
                void setInsertMacroPart(
                        MInsertMacroPart mInsertMacroPart) {

                }
            });
        }
    }

    private void initSingleStringElementsInternals(
            Context context) {

        for (Macro macro : this.list_SingleStringElements) {
            macro.apply(new InternalsInitializer("SingleStringElements") {

                @Override
                void setNewStringValue(
                        MNewStringValue mNewStringValue) {

                }
            });
        }
    }

    private void initSetInternalsInternals(
            Context context) {

        for (Macro macro : this.list_SetInternals) {
            macro.apply(new InternalsInitializer("SetInternals") {

                @Override
                void setSetInternal(
                        MSetInternal mSetInternal) {

                    mSetInternal.setVarName(
                            MRedefinedInternalsSetter.this.SetInternalsContext,
                            getMacroName());
                }
            });
        }
    }

    private void initMacroNameDirectives() {

    }

    private void initTextPartsDirectives() {

        StringBuilder sb1 = new StringBuilder();
        sb1.append(LINE_SEPARATOR);
        this.TextPartsSeparator = new DSeparator(sb1.toString());
        this.TextPartsValue.setSeparator(this.TextPartsSeparator);
    }

    private void initSingleStringElementsDirectives() {

        StringBuilder sb1 = new StringBuilder();
        sb1.append(LINE_SEPARATOR);
        this.SingleStringElementsSeparator = new DSeparator(sb1.toString());
        this.SingleStringElementsValue
                .setSeparator(this.SingleStringElementsSeparator);
    }

    private void initSetInternalsDirectives() {

        StringBuilder sb1 = new StringBuilder();
        sb1.append(LINE_SEPARATOR);
        this.SetInternalsSeparator = new DSeparator(sb1.toString());
        this.SetInternalsValue.setSeparator(this.SetInternalsSeparator);
    }

    @Override
    void apply(
            InternalsInitializer internalsInitializer) {

        internalsInitializer.setRedefinedInternalsSetter(this);
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

        initMacroNameDirectives();
        initTextPartsDirectives();
        initSingleStringElementsDirectives();
        initSetInternalsDirectives();

        initTextPartsInternals(null);
        initSingleStringElementsInternals(null);
        initSetInternalsInternals(null);

        StringBuilder sb0 = new StringBuilder();

        sb0.append("@Override");
        sb0.append(LINE_SEPARATOR);
        sb0.append("void set");
        sb0.append(buildMacroName());
        sb0.append("(M");
        sb0.append(buildMacroName());
        sb0.append(" m");
        sb0.append(buildMacroName());
        sb0.append(")");
        sb0.append("{");
        sb0.append(LINE_SEPARATOR);
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("    ");
        indentations.add(sb2.toString());
        sb1.append(buildTextParts());
        sb1.append(LINE_SEPARATOR);
        sb1.append(buildSingleStringElements());
        sb1.append(LINE_SEPARATOR);
        sb1.append(buildSetInternals());
        sb0.append(applyIndent(sb1.toString(),
                indentations.remove(indentations.size() - 1)));
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
