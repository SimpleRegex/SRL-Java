package com.github.simpleregex.parser;

/**
 * Created by samtebbs on 04/09/2016.
 */
public class SRLParserVisitor extends SRLBaseVisitor {

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     *
     * @param ctx
     */
    @Override
    public Object visitCharacter(SRLParser.CharacterContext ctx) {
        return super.visitCharacter(ctx);
    }
}
