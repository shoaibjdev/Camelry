package me.alanfoster.intellij.blueprint.language.highlight;

import com.intellij.lexer.FlexAdapter;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.SyntaxHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import me.alanfoster.intellij.blueprint.language.InjectionTypes;
import me.alanfoster.intellij.blueprint.language.lexer.InjectionLexer;
import me.alanfoster.intellij.camel.simple.language.lexer.SimpleLexer;
import org.jetbrains.annotations.NotNull;

import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

/**
 * Adds syntax highlighting for the Blueprint injection language.
 */
public class InjectionHighlighter extends SyntaxHighlighterBase {
    /**
     * Maintains an internal map of tokens to colors, for a fast lookup time.
     */
    private static final Map<IElementType, TextAttributesKey> elementTypeAttributeKeyMap;

    static {
        elementTypeAttributeKeyMap = new HashMap<IElementType, TextAttributesKey>();

        elementTypeAttributeKeyMap.put(InjectionTypes.FUNCTION_START, DefaultLanguageHighlighterColors.PARENTHESES);
        elementTypeAttributeKeyMap.put(InjectionTypes.PROPERTY_NAME, DefaultLanguageHighlighterColors.IDENTIFIER);
        elementTypeAttributeKeyMap.put(InjectionTypes.FUNCTION_END, DefaultLanguageHighlighterColors.PARENTHESES);
    }


    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new FlexAdapter(new InjectionLexer((Reader) null));
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        return pack(elementTypeAttributeKeyMap.get(tokenType));
    }
}