/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.macro;

public class M_expand_declaration
        extends Macro {

    // ---- constructor ----

    M_expand_declaration(
            Macro parent,
            String p_expand_name) {

        this.parent = parent;
        this.p_expand_name = p_expand_name;
    }

    // ---- parent ----

    private final Macro parent;

    @Override
    Macro get_parent() {

        return this.parent;
    }

    // ---- parameters ----

    private final String p_expand_name;

    String get_local_p_expand_name() {

        return this.p_expand_name;
    }

    // ---- parameter accessors ----

    private String cached_p_expand_name;

    private String get_p_expand_name() {

        String result = this.cached_p_expand_name;

        if (result == null) {
            Macro current = this;

            while (!(current instanceof M_expand_declaration)) {
                current = current.get_parent();
            }

            result = ((M_expand_declaration) current).get_local_p_expand_name();
            this.cached_p_expand_name = result;
        }

        return result;
    }

    // ---- appendTo ----

    @Override
    public void appendTo(
            StringBuilder sb) {

        sb.append("  private final List<Macro> e_");

        sb.append(get_p_expand_name());

        sb.append(" = new LinkedList<Macro>();");

        sb.append(EOL);
    }

}