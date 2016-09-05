// Generated from SRL.g by ANTLR 4.5.2
package com.github.simpleregex.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SRLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SRLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SRLParser#character}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter(SRLParser.CharacterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRLParser#specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecification(SRLParser.SpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRLParser#quantifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantifier(SRLParser.QuantifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRLParser#anchor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnchor(SRLParser.AnchorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRLParser#character_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter_stmt(SRLParser.Character_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRLParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(SRLParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRLParser#flag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlag(SRLParser.FlagContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRLParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(SRLParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRLParser#stmts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmts(SRLParser.StmtsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRLParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(SRLParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRLParser#group_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_stmt(SRLParser.Group_stmtContext ctx);
}