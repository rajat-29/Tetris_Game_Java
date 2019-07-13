import java.util.*;
import java.lang.*;

class Points
{
	Points()
	{

	}
		int xCod[];
		int yCod[];	
}

class Version extends Points
{
	public int versionNo;
	Version()
	{

	}
	Version(int versionNo)
	{
		this.versionNo = versionNo;
	}
	public void changeVersion(int versionNo)
	{
		this.versionNo = versionNo;
	}
}

class Line extends Version
{
	Line()
	{
		xCod = new int[] {1,2,3,4};
		yCod = new int[] {10,10,10,10};
	}

	public void changeVersion(int verNo)
	{
		super.changeVersion(verNo);
		int tempCod;
		for(int i=0;i<xCod.length;i++)
		{
			tempCod = xCod[i];
			xCod[i] = yCod[i];
			yCod[i] = tempCod;
		}
	}
}

class Square extends Version
{
	Square()
	{
		xCod = new int[] {1,1,2,2,};
		yCod = new int[] {1,2,1,2};
	}
	public void changeVersion(int verNo)
	{
		super.changeVersion(verNo);
	}
}

class T extends Version
{
	T()
	{
		xCod = new int[] {1,1,1,2,};
		yCod = new int[] {1,2,3,2};
	}
	public void changeVersion(int verNo)
	{
		super.changeVersion(verNo);
	}
}

public class TETRIS
{

	public static char board[][] = new char[30][30];

	public static void main(String args[]) 
	{
		Line l1 = new Line();
		//Square l1 = new Square();
		//T l1 = new T();

		clearBoard();
		drawShape(l1);
		displayBoard();

		Scanner obj = new Scanner(System.in);
		char c = obj.next().charAt(0);
		while(c!='q')
		{
			if(c == 'd')
			{
				clearScreen();
				l1.changeVersion(2);
				
			}
			else if(c == 'a')
			{
				clearScreen();
				//l1.changeVersion(2);
			}
			clearBoard();
			drawShape(l1);
			displayBoard();
			c = obj.next().charAt(0);
		}
	}

	public static void clearBoard()
	{
		for(int i=0;i<board.length;i++)
		{
			for(int j=0;j<board.length;j++)
			{
				if(i==0 || j==0 || i==board.length-1 || j==board.length-1)
				{
					board[i][j]='*';
				}
				else
				{
					board[i][j]=' ';
				}	
			}
		}
	}

	public static void clearScreen() 
	{  
		System.out.print("\033[H\033[2J"); 
	}

	public static void drawShape(Version v1)
	{
		for(int i=0;i<v1.xCod.length;i++)
		{
			board[v1.xCod[i]][v1.yCod[i]] = '#';
		}
	}

	public static void displayBoard()
	{
		for(int i=0;i<30;i++)
		{
			for(int j=0;j<30;j++)
			{
				System.out.print(" " + board[i][j]);
			}
			System.out.println();
		}
	}
}	