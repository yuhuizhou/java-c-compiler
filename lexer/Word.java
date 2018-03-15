package lexer;
public class Word extends Token {

   public String lexeme = "";
   public Word(String s, int tag) { super(tag); lexeme = s; }
   public String toString() { return lexeme; }

   public static final Word

      and = new Word( "&&", Tag.AND ),  or = new Word( "||", Tag.OR ), //逻辑运算符
      eq  = new Word( "==", Tag.EQ  ),  ne = new Word( "!=", Tag.NE ),//关系运算符
      le  = new Word( "<=", Tag.LE  ),  ge = new Word( ">=", Tag.GE ),

      minus  = new Word( "minus", Tag.MINUS ),
      True   = new Word( "true",  Tag.TRUE  ),
      False  = new Word( "false", Tag.FALSE ),
      temp   = new Word( "t",     Tag.TEMP  );
}
