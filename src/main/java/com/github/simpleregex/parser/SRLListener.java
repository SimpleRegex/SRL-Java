// Generated from SRL.g by ANTLR 4.5.2
package com.github.simpleregex.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SRLParser}.
 */
public interface SRLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SRLParser#literally}.
	 * @param ctx the parse tree
	 */
	void enterLiterally(SRLParser.LiterallyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRLParser#literally}.
	 * @param ctx the parse tree
	 */
	void exitLiterally(SRLParser.LiterallyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRLParser#letter}.
	 * @param ctx the parse tree
	 */
	void enterLetter(SRLParser.LetterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRLParser#letter}.
	 * @param ctx the parse tree
	 */
	void exitLetter(SRLParser.LetterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRLParser#of}.
	 * @param ctx the parse tree
	 */
	void enterOf(SRLParser.OfContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRLParser#of}.
	 * @param ctx the parse tree
	 */
	void exitOf(SRLParser.OfContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRLParser#character}.
	 * @param ctx the parse tree
	 */
	void enterCharacter(SRLParser.CharacterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRLParser#character}.
	 * @param ctx the parse tree
	 */
	void exitCharacter(SRLParser.CharacterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRLParser#provider}.
	 * @param ctx the parse tree
	 */
	void enterProvider(SRLParser.ProviderContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRLParser#provider}.
	 * @param ctx the parse tree
	 */
	void exitProvider(SRLParser.ProviderContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRLParser#specification}.
	 * @param ctx the parse tree
	 */
	void enterSpecification(SRLParser.SpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRLParser#specification}.
	 * @param ctx the parse tree
	 */
	void exitSpecification(SRLParser.SpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRLParser#exactly}.
	 * @param ctx the parse tree
	 */
	void enterExactly(SRLParser.ExactlyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRLParser#exactly}.
	 * @param ctx the parse tree
	 */
	void exitExactly(SRLParser.ExactlyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRLParser#between}.
	 * @param ctx the parse tree
	 */
	void enterBetween(SRLParser.BetweenContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRLParser#between}.
	 * @param ctx the parse tree
	 */
	void exitBetween(SRLParser.BetweenContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRLParser#at_least}.
	 * @param ctx the parse tree
	 */
	void enterAt_least(SRLParser.At_leastContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRLParser#at_least}.
	 * @param ctx the parse tree
	 */
	void exitAt_least(SRLParser.At_leastContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRLParser#or_more}.
	 * @param ctx the parse tree
	 */
	void enterOr_more(SRLParser.Or_moreContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRLParser#or_more}.
	 * @param ctx the parse tree
	 */
	void exitOr_more(SRLParser.Or_moreContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRLParser#quantifier}.
	 * @param ctx the parse tree
	 */
	void enterQuantifier(SRLParser.QuantifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRLParser#quantifier}.
	 * @param ctx the parse tree
	 */
	void exitQuantifier(SRLParser.QuantifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRLParser#anchor}.
	 * @param ctx the parse tree
	 */
	void enterAnchor(SRLParser.AnchorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRLParser#anchor}.
	 * @param ctx the parse tree
	 */
	void exitAnchor(SRLParser.AnchorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRLParser#character_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCharacter_stmt(SRLParser.Character_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRLParser#character_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCharacter_stmt(SRLParser.Character_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRLParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(SRLParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRLParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(SRLParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRLParser#flag}.
	 * @param ctx the parse tree
	 */
	void enterFlag(SRLParser.FlagContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRLParser#flag}.
	 * @param ctx the parse tree
	 */
	void exitFlag(SRLParser.FlagContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRLParser#quantifiable_stmt}.
	 * @param ctx the parse tree
	 */
	void enterQuantifiable_stmt(SRLParser.Quantifiable_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRLParser#quantifiable_stmt}.
	 * @param ctx the parse tree
	 */
	void exitQuantifiable_stmt(SRLParser.Quantifiable_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRLParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(SRLParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRLParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(SRLParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRLParser#stmts}.
	 * @param ctx the parse tree
	 */
	void enterStmts(SRLParser.StmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRLParser#stmts}.
	 * @param ctx the parse tree
	 */
	void exitStmts(SRLParser.StmtsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRLParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(SRLParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRLParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(SRLParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRLParser#capture}.
	 * @param ctx the parse tree
	 */
	void enterCapture(SRLParser.CaptureContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRLParser#capture}.
	 * @param ctx the parse tree
	 */
	void exitCapture(SRLParser.CaptureContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRLParser#any_of}.
	 * @param ctx the parse tree
	 */
	void enterAny_of(SRLParser.Any_ofContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRLParser#any_of}.
	 * @param ctx the parse tree
	 */
	void exitAny_of(SRLParser.Any_ofContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRLParser#group_stmt}.
	 * @param ctx the parse tree
	 */
	void enterGroup_stmt(SRLParser.Group_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRLParser#group_stmt}.
	 * @param ctx the parse tree
	 */
	void exitGroup_stmt(SRLParser.Group_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRLParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(SRLParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRLParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(SRLParser.QueryContext ctx);
}