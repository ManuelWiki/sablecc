/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.java.macro;

import java.util.*;

public class MRedefinedInternalsSetter
        extends Macro {

    private String field_MacroName;

    private final List<Macro> list_TextParts;

    private DSeparator TextPartsSeparator;

    private DBeforeFirst TextPartsBeforeFirst;

    private DAfterLast TextPartsAfterLast;

    private DNone TextPartsNone;

    private final InternalValue TextPartsValue;

    private final List<Macro> list_SetInternals;

    private DSeparator SetInternalsSeparator;

    private DBeforeFirst SetInternalsBeforeFirst;

    private DAfterLast SetInternalsAfterLast;

    private DNone SetInternalsNone;

    private final InternalValue SetInternalsValue;

    private final Context TextPartsContext = new Context();

    private final Context SetInternalsContext = new Context();

    public MRedefinedInternalsSetter(
            String pMacroName) {

        setPMacroName(pMacroName);
        this.list_TextParts = new ArrayList<>();
        this.list_SetInternals = new ArrayList<>();

        this.TextPartsValue
                = new InternalValue(this.list_TextParts, this.TextPartsContext);
        this.SetInternalsValue = new InternalValue(this.list_SetInternals,
                this.SetInternalsContext);
    }

    private void setPMacroName(
            String pMacroName) {

        if (pMacroName == null) {
            throw ObjectMacroException.parameterNull("MacroName");
        }

        this.field_MacroName = pMacroName;
    }

    public void addTextParts(
            MInitStringBuilder macro) {

        if (macro == null) {
            throw ObjectMacroException.parameterNull("TextParts");
        }
        if (this.build_state != null) {
            throw ObjectMacroException.cannotModify("InitStringBuilder");
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
        if (this.build_state != null) {
            throw ObjectMacroException.cannotModify("StringPart");
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
        if (this.build_state != null) {
            throw ObjectMacroException.cannotModify("ParamInsertPart");
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
        if (this.build_state != null) {
            throw ObjectMacroException.cannotModify("EolPart");
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
        if (this.build_state != null) {
            throw ObjectMacroException.cannotModify("InsertMacroPart");
        }

        this.list_TextParts.add(macro);
        this.children.add(macro);
        Macro.cycleDetector.detectCycle(this, macro);
    }

    public void addSetInternals(
            MSetInternal macro) {

        if (macro == null) {
            throw ObjectMacroException.parameterNull("SetInternals");
        }
        if (this.build_state != null) {
            throw ObjectMacroException.cannotModify("SetInternal");
        }

        this.list_SetInternals.add(macro);
        this.children.add(macro);
        Macro.cycleDetector.detectCycle(this, macro);
    }

    private String buildMacroName() {

        return this.field_MacroName;
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

    private String getMacroName() {

        return this.field_MacroName;
    }

    private InternalValue getTextParts() {

        return this.TextPartsValue;
    }

    private InternalValue getSetInternals() {

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

    private void initTextPartsDirectives() {

        StringBuilder sb0 = new StringBuilder();
        sb0.append(LINE_SEPARATOR);
        this.TextPartsSeparator = new DSeparator(sb0.toString());
        this.TextPartsValue.setSeparator(this.TextPartsSeparator);
    }

    private void initSetInternalsDirectives() {

        StringBuilder sb0 = new StringBuilder();
        sb0.append(LINE_SEPARATOR);
        this.SetInternalsSeparator = new DSeparator(sb0.toString());
        this.SetInternalsValue.setSeparator(this.SetInternalsSeparator);
    }

    @Override
    void apply(
            InternalsInitializer internalsInitializer) {

        internalsInitializer.setRedefinedInternalsSetter(this);
    }

    @Override
    public String build() {

        BuildState buildState = this.build_state;

        if (buildState == null) {
            buildState = new BuildState();
        }
        else if (buildState.getExpansion() == null) {
            throw ObjectMacroException
                    .cyclicReference("RedefinedInternalsSetter");
        }
        else {
            return buildState.getExpansion();
        }
        this.build_state = buildState;
        List<String> indentations = new LinkedList<>();
        StringBuilder sbIndentation = new StringBuilder();

        initTextPartsDirectives();
        initSetInternalsDirectives();

        initTextPartsInternals(null);
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
        sb0.append(LINE_SEPARATOR);
        sb0.append("    ");
        sb0.append(buildTextParts());
        sb0.append(LINE_SEPARATOR);
        sb0.append("    ");
        sb0.append(buildSetInternals());
        sb0.append(LINE_SEPARATOR);
        sb0.append("}");

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