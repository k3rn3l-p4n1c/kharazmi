package listeners;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.ParseCancellationException;

import java.util.BitSet;

public class ThrowingErrorListener extends BaseErrorListener {

    public static final ThrowingErrorListener INSTANCE = new ThrowingErrorListener();

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line,
                            int charPositionInLine,
                            String msg,
                            RecognitionException e) throws ParseCancellationException {
//        throw new ParseCancellationException("line " + line + ":" + charPositionInLine + " " + msg);
//        System.err.println("Lex err: line " + line + ":" + charPositionInLine + " invalid token. Can not start with number");
//        System.out.println("--------- ThrowingErrorListener.syntaxError ---------");
        System.out.println("recognizer = [" + recognizer + "], offendingSymbol = [" + offendingSymbol + "], line = [" + line + "], charPositionInLine = [" + charPositionInLine + "], msg = [" + msg + "], e = [" + e + "]");
    }

//    @Override
//    public void reportAmbiguity(Parser recognizer,
//                                DFA dfa,
//                                int startIndex,
//                                int stopIndex,
//                                boolean exact,
//                                BitSet ambigAlts,
//                                ATNConfigSet configs) {
//        System.out.println("--------- ThrowingErrorListener.reportAmbiguity ---------");
//        System.out.println("recognizer = [" + recognizer + "], dfa = [" + dfa + "], startIndex = [" + startIndex + "], stopIndex = [" + stopIndex + "], exact = [" + exact + "], ambigAlts = [" + ambigAlts + "], configs = [" + configs + "]");
//    }
//
//    @Override
//    public void reportAttemptingFullContext(Parser recognizer,
//                                            DFA dfa,
//                                            int startIndex,
//                                            int stopIndex,
//                                            BitSet conflictingAlts,
//                                            ATNConfigSet configs) {
//        System.out.println("--------- ThrowingErrorListener.reportAttemptingFullContext ---------");
//        System.out.println("recognizer = [" + recognizer + "], dfa = [" + dfa + "], startIndex = [" + startIndex + "], stopIndex = [" + stopIndex + "], conflictingAlts = [" + conflictingAlts + "], configs = [" + configs + "]");
//    }
//
//    @Override
//    public void reportContextSensitivity(Parser recognizer,
//                                         DFA dfa,
//                                         int startIndex,
//                                         int stopIndex,
//                                         int prediction,
//                                         ATNConfigSet configs) {
//        System.out.println("--------- ThrowingErrorListener.reportContextSensitivity ---------");
//        System.out.println("recognizer = [" + recognizer + "], dfa = [" + dfa + "], startIndex = [" + startIndex + "], stopIndex = [" + stopIndex + "], prediction = [" + prediction + "], configs = [" + configs + "]");
//    }

}