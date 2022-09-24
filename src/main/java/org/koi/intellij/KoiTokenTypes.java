package org.koi.intellij;

import org.antlr.intellij.adaptor.lexer.PSIElementTypeFactory;
import org.antlr.intellij.adaptor.lexer.RuleIElementType;
import org.antlr.intellij.adaptor.lexer.TokenIElementType;
import org.intellij.lang.annotations.MagicConstant;

import java.util.List;

public class KoiTokenTypes {
    public static final List<TokenIElementType> TOKEN_ELEMENT_TYPES =
            PSIElementTypeFactory.getTokenIElementTypes(KoiLanguage.INSTANCE);
    public static final List<RuleIElementType> RULE_ELEMENT_TYPES =
            PSIElementTypeFactory.getRuleIElementTypes(KoiLanguage.INSTANCE);

    public static RuleIElementType getRuleElementType(@MagicConstant(valuesFromClass = KoiLanguage.class)int ruleIndex){
        return RULE_ELEMENT_TYPES.get(ruleIndex);
    }
    public static TokenIElementType getTokenElementType(@MagicConstant(valuesFromClass = KoiLanguage.class)int ruleIndex){
        return TOKEN_ELEMENT_TYPES.get(ruleIndex);
    }
}
