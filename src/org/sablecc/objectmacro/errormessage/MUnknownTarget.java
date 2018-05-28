/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.errormessage;

import java.util.*;

public class MUnknownTarget
        extends Macro {

    String field_Target;

    MUnknownTarget(
            String pTarget,
            Macros macros) {

        setMacros(macros);
        setPTarget(pTarget);
    }

    private void setPTarget(
            String pTarget) {

        if (pTarget == null) {
            throw ObjectMacroException.parameterNull("Target");
        }

        this.field_Target = pTarget;
    }

    String buildTarget() {

        return this.field_Target;
    }

    String getTarget() {

        return this.field_Target;
    }

    @Override
    void apply(
            InternalsInitializer internalsInitializer) {

        internalsInitializer.setUnknownTarget(this);
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

        MCommandLineErrorHead m1 = getMacros().newCommandLineErrorHead();

        sb0.append(m1.build(null));
        sb0.append(LINE_SEPARATOR);
        sb0.append(LINE_SEPARATOR);
        sb0.append("The \"");
        sb0.append(buildTarget());
        sb0.append("\" target is not supported.");
        sb0.append(LINE_SEPARATOR);
        sb0.append(LINE_SEPARATOR);
        sb0.append("The following command lists available target languages:");
        sb0.append(LINE_SEPARATOR);
        sb0.append(" objectmacro --list-targets");
        sb0.append(LINE_SEPARATOR);
        sb0.append(LINE_SEPARATOR);
        MCommandLineErrorTail m2 = getMacros().newCommandLineErrorTail();

        sb0.append(m2.build(null));

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
