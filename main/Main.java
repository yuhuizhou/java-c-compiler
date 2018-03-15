package main;
import java.io.*;
import lexer.*;
import parser.*;
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
   public static void main(String[] args) throws IOException {
		Lexer lex = new Lexer();
		Parser parse = new Parser(lex);
		parse.program();
		System.out.write('\n');
	}
    
}

