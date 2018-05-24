import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.swing.JOptionPane;


public class Main 
{
	private static Robot robot					= null;
	private static char[] specials				= {'~','!','@','#','$','%','^','&','*','(',')','_','+','{','}',':','"','<','>','?','|'};
	private static int sizeScalar				= 1;
	
	public Main()
	{
		JOptionPane.showMessageDialog(null, "I, CaspR the Great, have successfully uploaded my consciousness into this program.\nAnyway just click the okay button and \nDON'T disturb and see what my virtual consciousness has to say.","A message from CaspR",JOptionPane.INFORMATION_MESSAGE);
		try
		{
			robot = new Robot();
		} 
		catch (AWTException e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) 
	{
		new Main();
		Runtime rt = Runtime.getRuntime();
		try 
		{
			//Run the cmd
			File txtFile = new File("message.txt");
			if(!txtFile.createNewFile())
			{
				System.out.println("Could not create temporary file on app directory.");
				return;
			}
			Desktop.getDesktop().open(txtFile);
			// rt.exec("cmd.exe /C start");
			robot.delay(1000);
			
			//Execute command to run wordpad
			// String cmd = "start /max wordpad.exe";
			String cmd = "";
			typeString(cmd,50);
			
			//Press enter
			enter(5);
			robot.delay(3000);
			
			//Begin typing the message
			String msg = "Imagine a world,";
			typeString(msg,50);
			twoKeyCombo(KeyEvent.VK_SHIFT, KeyEvent.VK_HOME);
			for(int i=0;i<sizeScalar;i++)//increase font-size by ten
			{
				threeKeyCombo(KeyEvent.VK_SHIFT,KeyEvent.VK_CONTROL,getKeyCode('.'));
				robot.delay(100);
			}
			keyTap(10, KeyEvent.VK_RIGHT);
			//Press enter
			enter(300);
			sizeScalar=1;
			
			msg = "Where you can type documents,";
			typeString(msg,50);
			twoKeyCombo(KeyEvent.VK_SHIFT, KeyEvent.VK_HOME);
			for(int i=0;i<sizeScalar;i++)//increase font-size by ten
			{
				threeKeyCombo(KeyEvent.VK_SHIFT,KeyEvent.VK_CONTROL,getKeyCode('.'));
				robot.delay(100);
			}
			keyTap(10, KeyEvent.VK_RIGHT);
			//Press enter
			enter(300);
			//sizeScalar+=5;
			
			msg = "Play games, browse the Internet, etc.";
			typeString(msg,50);
			twoKeyCombo(KeyEvent.VK_SHIFT, KeyEvent.VK_HOME);
			for(int i=0;i<sizeScalar;i++)//increase font-size by ten
			{
				threeKeyCombo(KeyEvent.VK_SHIFT,KeyEvent.VK_CONTROL,getKeyCode('.'));
				robot.delay(100);
			}
			keyTap(10, KeyEvent.VK_RIGHT);
			//Press enter
			enter(300);
			
			msg = "Not with your fingers but ";
			typeString(msg,50);
			twoKeyCombo(KeyEvent.VK_SHIFT, KeyEvent.VK_HOME);
			for(int i=0;i<sizeScalar;i++)//increase font-size by ten
			{
				threeKeyCombo(KeyEvent.VK_SHIFT,KeyEvent.VK_CONTROL,getKeyCode('.'));
				robot.delay(100);
			}
			keyTap(10, KeyEvent.VK_RIGHT);
			//Press enter
			enter(300);
			//sizeScalar+=5;
			
			msg = "With your MIND :D";
			typeString(msg,50);
			twoKeyCombo(KeyEvent.VK_SHIFT, KeyEvent.VK_HOME);
			for(int i=0;i<sizeScalar;i++)//increase font-size by ten
			{
				threeKeyCombo(KeyEvent.VK_SHIFT,KeyEvent.VK_CONTROL,getKeyCode('.'));
				robot.delay(100);
			}
			keyTap(10, KeyEvent.VK_RIGHT);
			//Press enter
			enter(300);
			//sizeScalar+=5;
			
			msg = "It would be a really bad ass world right?";
			typeString(msg,50);
			twoKeyCombo(KeyEvent.VK_SHIFT, KeyEvent.VK_HOME);
			for(int i=0;i<sizeScalar;i++)//increase font-size by ten
			{
				threeKeyCombo(KeyEvent.VK_SHIFT,KeyEvent.VK_CONTROL,getKeyCode('.'));
				robot.delay(100);
			}
			keyTap(10, KeyEvent.VK_RIGHT);
			//Press enter
			enter(300);
			//sizeScalar+=5;
			
			msg = "Well guess what";
			typeString(msg,50);
			twoKeyCombo(KeyEvent.VK_SHIFT, KeyEvent.VK_HOME);
			for(int i=0;i<sizeScalar;i++)//increase font-size by ten
			{
				threeKeyCombo(KeyEvent.VK_SHIFT,KeyEvent.VK_CONTROL,getKeyCode('.'));
				robot.delay(100);
			}
			keyTap(10, KeyEvent.VK_RIGHT);
			//Press enter
			enter(100);
			//sizeScalar+=5;
			
			sizeScalar = 4;
			msg = "I'm doing it right now!!";
			typeString(msg,50);
			twoKeyCombo(KeyEvent.VK_SHIFT, KeyEvent.VK_HOME);
			for(int i=0;i<sizeScalar;i++)//increase font-size by ten
			{
				threeKeyCombo(KeyEvent.VK_SHIFT,KeyEvent.VK_CONTROL,getKeyCode('.'));
				robot.delay(100);
			}
			keyTap(10, KeyEvent.VK_RIGHT);
			//Press enter
			enter(100);
			//sizeScalar+=5;
			
			sizeScalar = -10;
			//Size down the font a bit
			for(int i=0;i>sizeScalar;i--)//increase font-size by ten
			{
				threeKeyCombo(KeyEvent.VK_SHIFT,KeyEvent.VK_CONTROL,getKeyCode(','));
				robot.delay(100);
			}
			msg = " - #UsingTheForce";
			typeString(msg,20);
			//Press enter
			enter(100);
			
			//delete previous msg
			for(int j=0;j<msg.length()+1;j++)
			{
				backspace();
				robot.delay(20);
			}
			
			msg = " - #LikeABoss";
			typeString(msg,20);
			//Press enter
			enter(10);
			
			msg = "888888888888888888888888888888888888888888888888";
			typeString(msg,5);
			enter(5);
			msg = "888888888888888888888888888888888888888888888888";
			typeString(msg,5);
			enter(5);
			msg = "888888888888888888888888888888888888888888888888";
			typeString(msg,5);
			enter(5);
			msg = "88888888888888888__________________________88888";
			typeString(msg,5);
			enter(5);
			msg = "88888888888888888__________________________88888";
			typeString(msg,5);
			enter(5);
			msg = "8888888888888____8888888___________________88888";
			typeString(msg,5);
			enter(5);
			msg = "888888888______88____8888888_______________88888";
			typeString(msg,5);
			enter(5);
			msg = "888888_____888888________88888_____________88888";
			typeString(msg,5);
			enter(5);
			msg = "8888____88888____888888____88888___________88888";
			typeString(msg,5);
			enter(5);
			msg = "88____8888____888___88888____8888__________88888";
			typeString(msg,5);
			enter(5);
			msg = "88____888____8888____888____8888___________88888";
			typeString(msg,5);
			enter(5);
			msg = "888____888____888_________8888_____88______88888";
			typeString(msg,5);
			enter(5);
			msg = "8888_____888___88_______8888_____888888____88888";
			typeString(msg,5);
			enter(5);
			msg = "888888____888____888888888_____88888888____88888";
			typeString(msg,5);
			enter(5);
			msg = "8888888_____888888888_______88888888_______88888";
			typeString(msg,5);
			enter(5);
			msg = "8888888888______8______888888888___________88888";
			typeString(msg,5);
			enter(5);
			msg = "8888888888888____8888888888________________88888";
			typeString(msg,5);
			enter(5);
			msg = "88888888888888888__________________________88888";
			typeString(msg,5);
			enter(5);
			msg = "88888888888888888__________________________88888";
			typeString(msg,5);
			enter(5);
			msg = "888888888888888888888888888888888888888888888888";
			typeString(msg,5);
			enter(5);
			msg = "888888888888888888888888888888888888888888888888";
			typeString(msg,5);
			enter(5);
			msg = "888888888888888888888888888888888888888888888888";
			typeString(msg,5);
			enter(5);
			msg = "888888888888888888888888888888888888888888888888";
			typeString(msg,5);
			enter(5);
			msg = "8_______88__8888__8__88______888__8888____888888";
			typeString(msg,5);
			enter(5);
			msg = "8________8___88___8__88__888__88__888__88__88888";
			typeString(msg,5);
			enter(5);
			msg = "8___888__88__88__88__88__8888__8__88__8888__8888";
			typeString(msg,5);
			enter(5);
			msg = "8___888___88____888__88__8888__8__88__8888__8888";
			typeString(msg,5);
			enter(5);
			msg = "8___888___88____888__88__888__88__88________8888";
			typeString(msg,5);
			enter(5);
			msg = "8___888___888__8888__88______888__88__8888__8888";
			typeString(msg,5);
			enter(5);
			msg = "888888888888888888888888888888888888888888888888";
			typeString(msg,5);
			enter(5);
			msg = "888888888888888888888888888888888888888888888888";
			typeString(msg,5);
			enter(5);
			msg = "888888888888888888888888888888888888888888888888";
			typeString(msg,5);
			enter(5);

			//
			//Highlight the ASCII drawing
			for(int i=0;i<32;i++)
			{
				twoKeyCombo(KeyEvent.VK_SHIFT, KeyEvent.VK_UP);
				robot.delay(10);
			}
			twoKeyCombo(KeyEvent.VK_SHIFT, KeyEvent.VK_HOME);//mark the rest of the first line
			twoKeyCombo(KeyEvent.VK_CONTROL, KeyEvent.VK_1);//Change line-spacing
			//robot.delay(100);
			robot.mouseMove(440, 70);
			//robot.delay(100);
			robot.mousePress(KeyEvent.BUTTON1_MASK);
			robot.mouseRelease(KeyEvent.BUTTON1_MASK);
			//robot.delay(100);
			//robot.delay(100);
			twoKeyCombo(KeyEvent.VK_ALT, KeyEvent.VK_A);
			//robot.delay(100);
			keyTap(10, KeyEvent.VK_DOWN);
			//robot.delay(100);
			keyTap(10, KeyEvent.VK_END);
			//robot.delay(100);
			enter(100);
			
			msg = "This message will self-destruct in 6 :)";
			typeString(msg,50);
			
			for(int sec=0;sec<6;sec++)
			{
				robot.delay(500);
				
				for(int j=0;j<4;j++)
				{
					backspace();
					robot.delay(20);
				}
				typeString((5-sec) + " :)",50);
			}
			
			JOptionPane.showMessageDialog(null, "Buh-Bye!");
			robot.delay(100);
			enter(100);
			robot.delay(300);
			twoKeyCombo(KeyEvent.VK_ALT, KeyEvent.VK_F4);
			robot.delay(300);
			keyTap(10, KeyEvent.VK_RIGHT);
			robot.delay(300);
			enter(100);
			
			msg = "exit";
			typeString(msg,50);
			enter(100);
		} 
		catch (IOException e) 
		{
			System.err.println("IOException: " + e.getMessage());
		}
	}
	
	public static void backspace()
	{
		robot.keyPress(KeyEvent.VK_BACK_SPACE);
		robot.keyRelease(KeyEvent.VK_BACK_SPACE);
	}
	
	public static void threeKeyCombo(int code1,int code2,int code3)
	{
		robot.keyPress(code1);
		robot.keyPress(code2);
		robot.keyPress(code3);
		robot.keyRelease(code1);
		robot.keyRelease(code2);
		robot.keyRelease(code3);
	}
	
	public static void twoKeyCombo(int code1,int code2)
	{
		robot.keyPress(code1);
		robot.keyPress(code2);
		robot.keyRelease(code1);
		robot.keyRelease(code2);
	}
	
	private static void enter(int delay)
	{
		//Press enter
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(delay);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public static void typeString(String msg, int delay)
	{
		boolean special = false;
		for(char c: msg.toCharArray())
		{
			robot.delay(delay);//delay before pressing
			for(char s:specials)
				if(s == c)//c is special
					special = true;
			
			if(special || Character.isUpperCase(c))//c is special or uppercase
			{
				robot.keyPress(KeyEvent.VK_SHIFT);
				
				/*if(Character.isUpperCase(c))
					keyTap(10,getKeyCode(Character.toLowerCase(c)));
				else
					keyTap(10,getSpecialkeyParent(c));*/
				
				keyTap(10,special?getSpecialkeyParent(c):getKeyCode(Character.toLowerCase(c)));
				
				robot.keyRelease(KeyEvent.VK_SHIFT);
			}
			else//c is not special or uppercase
			{
				keyTap(10,getKeyCode(c));
			}
			
			special = false;
		}
	}
	
	public static int getSpecialkeyParent(char key)
	{
		switch(key)
		{
			case '!':
				return KeyEvent.VK_1;
			case '@':
				return KeyEvent.VK_2;
			case '#':
				return KeyEvent.VK_3;
			case '$':
				return KeyEvent.VK_4;
			case '%':
				return KeyEvent.VK_5;
			case '^':
				return KeyEvent.VK_6;
			case '&':
				return KeyEvent.VK_7;
			case '*':
				return KeyEvent.VK_8;
			case '(':
				return KeyEvent.VK_9;
			case ')':
				return KeyEvent.VK_0;
			case '_':
				return KeyEvent.VK_MINUS;
			case '+':
				return KeyEvent.VK_EQUALS;
			case '{':
				return KeyEvent.VK_OPEN_BRACKET;
			case '}':
				return KeyEvent.VK_CLOSE_BRACKET;
			case '|':
				return KeyEvent.VK_BACK_SLASH;
			case ':':
				return KeyEvent.VK_SEMICOLON;
			case '"':
				return KeyEvent.VK_QUOTE;
			case '<':
				return KeyEvent.VK_COMMA;
			case '>':
				return KeyEvent.VK_PERIOD;
			case '?':
				return KeyEvent.VK_SLASH;
			case '~':
				return 96;//KeyEvent.VK_DEAD_TILDE;
			default:
				return 0;
		}
	}

	public static void keyTap(int delay,int code)
	{
		robot.keyPress(code);
		robot.delay(delay);
		robot.keyRelease(code);
	}
	
	public static int getKeyCodeAscii(char letter)
	{
		switch(letter)
		{
			case 'A':
				return KeyEvent.VK_A;
			case 'B':
				return KeyEvent.VK_B;
			case 'C':
				return KeyEvent.VK_C;
			case 'D':
				return KeyEvent.VK_D;
			case 'E':
				return KeyEvent.VK_E;
			case 'F':
				return KeyEvent.VK_F;
			case 'G':
				return KeyEvent.VK_G;
			case 'H':
				return KeyEvent.VK_H;
			case 'I':
				return KeyEvent.VK_I;
			case 'J':
				return KeyEvent.VK_J;
			case 'K':
				return KeyEvent.VK_K;
			case 'L':
				return KeyEvent.VK_L;
			case 'M':
				return KeyEvent.VK_M;
			case 'N':
				return KeyEvent.VK_N;
			case 'O':
				return KeyEvent.VK_O;
			case 'P':
				return KeyEvent.VK_P;
			case 'Q':
				return KeyEvent.VK_Q;
			case 'R':
				return KeyEvent.VK_R;
			case 'S':
				return KeyEvent.VK_S;
			case 'T':
				return KeyEvent.VK_T;
			case 'U':
				return KeyEvent.VK_U;
			case 'V':
				return KeyEvent.VK_V;
			case 'W':
				return KeyEvent.VK_W;
			case 'X':
				return KeyEvent.VK_X;
			case 'Y':
				return KeyEvent.VK_Y;
			case 'Z':
				return KeyEvent.VK_Z;
			case 'a':
				return 97;
			case 'b':
				return 98;
			case 'c':
				return 99;
			case 'd':
				return 100;
			case 'e':
				return 101;
			case 'f':
				return 102;
			case 'g':
				return 103;
			case 'h':
				return 104;
			case 'i':
				return 105;
			case 'j':
				return 106;
			case 'k':
				return 107;
			case 'l':
				return 108;
			case 'm':
				return 109;
			case 'n':
				return 110;
			case 'o':
				return 111;
			case 'p':
				return 112;
			case 'q':
				return 113;
			case 'r':
				return 114;
			case 's':
				return 115;
			case 't':
				return 116;
			case 'u':
				return 117;
			case 'v':
				return 118;
			case 'w':
				return 119;
			case 'x':
				return 120;
			case 'y':
				return 121;
			case 'z':
				return 122;
			case ' ':
				return KeyEvent.VK_SPACE;
			case '1':
				return KeyEvent.VK_1;
			case '2':
				return KeyEvent.VK_2;
			case '3':
				return KeyEvent.VK_3;
			case '4':
				return KeyEvent.VK_4;
			case '5':
				return KeyEvent.VK_5;
			case '6':
				return KeyEvent.VK_6;
			case '7':
				return KeyEvent.VK_7;
			case '8':
				return KeyEvent.VK_8;
			case '9':
				return KeyEvent.VK_9;
			case '0':
				return KeyEvent.VK_0;
			case '`':
				return 96;//KeyEvent.VK_BACK_QUOTE;
			case '-':
				return KeyEvent.VK_MINUS;
			case '=':
				return KeyEvent.VK_EQUALS;
			case ']':
				return 93;
			case '[':
				return 91;
			case '{':
				return 123;
			case '}':
				return 125;
			case '~':
				return 126;
			case ':':
				return 58;
			case ';':
				return 59;
			case '\'':
				return 39;
			case '"':
				return 34;
			case '<':
				return 60;
			case '>':
				return 62;
			case ',':
				return 44;
			case '.':
				return 46;
			case '/':
				return 47;
			case '?':
				return 63;
			case '|':
				return 124;
			case '\\':
				return 92;
			case '!':
				return 33;
			case '@':
				return 64;
			case '#':
				return 35;
			case '$':
				return 36;
			case '%':
				return 37;
			case '^':
				return 94;
			case '&':
				return 38;
			case '*':
				return 42;
			case '(':
				return 40;
			case ')':
				return 41;
			case '_':
				return 95;
			case '+':
				return 43;
			default:
				return 0;
		}
	}
	
	public static int getKeyCode(char letter)
	{
		switch(letter)
		{
			case 'a':
				return KeyEvent.VK_A;
			case 'b':
				return KeyEvent.VK_B;
			case 'c':
				return KeyEvent.VK_C;
			case 'd':
				return KeyEvent.VK_D;
			case 'e':
				return KeyEvent.VK_E;
			case 'f':
				return KeyEvent.VK_F;
			case 'g':
				return KeyEvent.VK_G;
			case 'h':
				return KeyEvent.VK_H;
			case 'i':
				return KeyEvent.VK_I;
			case 'j':
				return KeyEvent.VK_J;
			case 'k':
				return KeyEvent.VK_K;
			case 'l':
				return KeyEvent.VK_L;
			case 'm':
				return KeyEvent.VK_M;
			case 'n':
				return KeyEvent.VK_N;
			case 'o':
				return KeyEvent.VK_O;
			case 'p':
				return KeyEvent.VK_P;
			case 'q':
				return KeyEvent.VK_Q;
			case 'r':
				return KeyEvent.VK_R;
			case 's':
				return KeyEvent.VK_S;
			case 't':
				return KeyEvent.VK_T;
			case 'u':
				return KeyEvent.VK_U;
			case 'v':
				return KeyEvent.VK_V;
			case 'w':
				return KeyEvent.VK_W;
			case 'x':
				return KeyEvent.VK_X;
			case 'y':
				return KeyEvent.VK_Y;
			case 'z':
				return KeyEvent.VK_Z;
			case ' ':
				return KeyEvent.VK_SPACE;
			case '1':
				return KeyEvent.VK_1;
			case '2':
				return KeyEvent.VK_2;
			case '3':
				return KeyEvent.VK_3;
			case '4':
				return KeyEvent.VK_4;
			case '5':
				return KeyEvent.VK_5;
			case '6':
				return KeyEvent.VK_6;
			case '7':
				return KeyEvent.VK_7;
			case '8':
				return KeyEvent.VK_8;
			case '9':
				return KeyEvent.VK_9;
			case '0':
				return KeyEvent.VK_0;
			case '`':
				return 96;//KeyEvent.VK_BACK_QUOTE;
			case '-':
				return KeyEvent.VK_MINUS;
			case '=':
				return KeyEvent.VK_EQUALS;
			case '[':
				return KeyEvent.VK_OPEN_BRACKET;
			case ']':
				return KeyEvent.VK_CLOSE_BRACKET;
			case '\\':
				return KeyEvent.VK_BACK_SLASH;
			case ';':
				return KeyEvent.VK_SEMICOLON;
			case '\'':
				return KeyEvent.VK_QUOTE;
			case ',':
				return KeyEvent.VK_COMMA;
			case '.':
				return KeyEvent.VK_PERIOD;
			case '/':
				return KeyEvent.VK_SLASH;
			default:
				return 0;
		}
	}
}
