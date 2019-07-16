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
	public int versionNo=1;
	Version()
	{}
	Version(int versionNo)
	{
		this.versionNo = versionNo;
	}
	public void changeVersion(int versionNo)
	{
		this.versionNo = versionNo;
	}

	public int getVersion()
	{
		return versionNo;
	}
}

class Line extends Version {
	Line()
	{
		Random r = new Random();
		int ranNo = r.nextInt((25 - 5) + 1) + 5;
		xCod = new int[] {4,5,6,7};
		yCod = new int[] {ranNo,ranNo,ranNo,ranNo};
	}

	public void changeVersionAnticlock(int verNo)
	{
		super.changeVersion(verNo);

		if(verNo == 1)
		{	
			for(int i=0;i<xCod.length;i++)
			{
				xCod[i] = xCod[0]+i;
				yCod[i] = yCod[0];
			}
		}
		else if(verNo == 2)
		{
			for(int i=0;i<xCod.length;i++)
			{
				xCod[i] = xCod[0];
				yCod[i] = yCod[0]+i;
			}
		}
		else if(verNo == 3)
		{
			for(int i=0;i<xCod.length;i++)
			{
				xCod[i] = xCod[i]-i;
				yCod[i] = yCod[0];
			}
		}
		else if(verNo == 4)
		{
			for(int i=0;i<xCod.length;i++)
			{
				xCod[i] = xCod[0];
				yCod[i] = yCod[0]-i;
			}
		}
	}
	public void changeVersionClock(int verNo)
	{
		super.changeVersion(verNo);

		if(verNo == 1)
		{	
			for(int i=0;i<xCod.length;i++)
			{
				xCod[i] = xCod[0]+i;
				yCod[i] = yCod[0];
			}
		}
		else if(verNo == 2)
		{
			for(int i=0;i<xCod.length;i++)
			{
				xCod[i] = xCod[0];
				yCod[i] = yCod[0]+i;
			}
		}
		else if(verNo == 3)
		{
			for(int i=0;i<xCod.length;i++)
			{
				xCod[i] = xCod[0]-i;
				yCod[i] = yCod[0];
			}
		}
		else if(verNo == 4)
		{
			for(int i=0;i<xCod.length;i++)
			{
				xCod[i] = xCod[0];
				yCod[i] = yCod[0]-i;
			}
		}
	}

	// public void changeDirection()
	// {
	// 		for(int i=0;i<4;i++)
	// 		{
	// 			if(yCod[3]!=28)
	// 			{
	// 				yCod[i] = yCod[i]+1;
	// 				xCod[i] = xCod[i]+1;
	// 			}
	// 			else if(yCod[0]!=27)
	// 			{
	// 				System.out.println("gigig");
	// 				break;
	// 			}
	// 			else
	// 				break;
	// 		}
	// 		System.out.println("x=" + xCod[0]);
	// 		System.out.println("y =" + yCod[0]);
	// }
}

class Square extends Version {
	Square()
	{
		Random r = new Random();
		int ranNo = r.nextInt((25 - 5) + 1) + 5;
		xCod = new int[] {1,1,2,2,};
		yCod = new int[] {ranNo,ranNo+1,ranNo,ranNo+1};
	}
	public void changeVersionAnticlock(int verNo)
	{
		super.changeVersion(verNo);
	}
	public void changeVersionClock(int verNo)
	{
		super.changeVersion(verNo);
	}
}

class Tshape extends Version {
	Tshape()
	{
		Random r = new Random();
		int ranNo = r.nextInt((25 - 5) + 1) + 5;
		xCod = new int[] {1,1,1,2};
		yCod = new int[] {ranNo,ranNo+1,ranNo+2,ranNo+1};
	}

	public void changeVersionAnticlock(int verNo)
	{
		super.changeVersion(verNo);

		if(verNo == 1)
		{
			xCod[1] = xCod[1]-1;
			xCod[2] = xCod[2]-2;
			yCod[0] = yCod[0]-1;
			yCod[2] = yCod[2]+1;
			yCod[3] = yCod[3]+1;
		}
		if(verNo == 2)
		{
			xCod[1] = xCod[1]+1;
			xCod[2] = xCod[2]+2;
			yCod[0] = yCod[0]+1;
			yCod[2] = yCod[2]-1;
			yCod[3] = yCod[3]+1;
		}
		if(verNo == 3)
		{
			xCod[0] = xCod[0]+1;
			xCod[2] = xCod[2]-1;
			xCod[3] = xCod[3]-1;
			yCod[0] = yCod[0]-1;
			yCod[2] = yCod[2]+1;
			yCod[3] = yCod[3]-1;
		}
		if(verNo == 4)
		{
			xCod[0] = xCod[0]-1;
			xCod[2] = xCod[2]+1;
			xCod[3] = xCod[3]+1;
			yCod[0] = yCod[0]+1;
			yCod[2] = yCod[2]-1;
			yCod[3] = yCod[3]-1;
		}
	}

	public void changeVersionClock(int verNo)
	{
		super.changeVersion(verNo);

		if(verNo == 1)
		{
			xCod[1] = xCod[1]-1;
			xCod[2] = xCod[2]-2;
			yCod[0] = yCod[0]-1;
			yCod[2] = yCod[2]+1;
			yCod[3] = yCod[3]-1;
		}
		if(verNo == 2)
		{
			xCod[0] = xCod[0]-1;
			xCod[2] = xCod[2]+1;
			xCod[3] = xCod[3]+1;
			yCod[0] = yCod[0]+1;
			yCod[2] = yCod[2]-1;
			yCod[3] = yCod[3]+1;
		}
		if(verNo == 3)
		{
			xCod[0] = xCod[0]+1;
			xCod[2] = xCod[2]-1;
			xCod[3] = xCod[3]-1;
			yCod[0] = yCod[0]-1;
			yCod[2] = yCod[2]+1;
			yCod[3] = yCod[3]+1;
		}
		if(verNo == 4)
		{
			xCod[1] = xCod[1]+1;
			xCod[2] = xCod[2]+2;
			yCod[0] = yCod[0]+1;
			yCod[2] = yCod[2]-1;
			yCod[3] = yCod[3]-1;
		}
	}
}

class Lshape extends Version {
	Lshape()
	{
		Random r = new Random();
		int ranNo = r.nextInt((25 - 5) + 1) + 5;
		xCod = new int[] {1,2,3,3};
		yCod = new int[] {ranNo,ranNo,ranNo,ranNo+1};
	}

	public void changeVersionAnticlock(int verNo)
	{
		super.changeVersion(verNo);

		if(verNo == 1)
		{
			xCod[1] = xCod[1]+1;
			xCod[2] = xCod[2]+2;
			xCod[3] = xCod[3]+1;
			yCod[0] = yCod[0]-2;
			yCod[1] = yCod[1]-1;
			yCod[3] = yCod[3]+1;
		}
		else if(verNo == 2)
		{
			xCod[0] = xCod[0]+2;
			xCod[1] = xCod[1]+1;
			xCod[3] = xCod[3]-1;
			yCod[1] = yCod[1]+1;
			yCod[2] = yCod[2]+2;
			yCod[3] = yCod[3]+1;
		}
		else if(verNo == 3)
		{
			xCod[1] = xCod[1]-1;
			xCod[2] = xCod[2]-2;
			xCod[3] = xCod[3]-1;
			yCod[0] = yCod[0]+2;
			yCod[1] = yCod[1]+1;
			yCod[3] = yCod[3]-1;
		}
		else if(verNo == 4)
		{
			xCod[0] = xCod[0]-2;
			xCod[1] = xCod[1]-1;
			xCod[3] = xCod[3]+1;
			yCod[1] = yCod[1]-1;
			yCod[2] = yCod[2]-2;
			yCod[3] = yCod[3]-1;
		}
	}

	public void changeVersionClock(int verNo)
	{
		super.changeVersion(verNo);

		if(verNo == 1)
		{
			xCod[0] = xCod[0]-2;
			xCod[1] = xCod[1]-1;
			xCod[3] = xCod[3]+1;
			yCod[1] = yCod[1]-1;
			yCod[2] = yCod[2]-2;
			yCod[3] = yCod[3]-1;
		}
		else if(verNo == 2)
		{
			xCod[1] = xCod[1]+1;
			xCod[2] = xCod[2]+2;
			xCod[3] = xCod[3]+1;
			yCod[0] = yCod[0]-2;
			yCod[1] = yCod[1]-1;
			yCod[3] = yCod[3]+1;
		}
		else if(verNo == 3)
		{
			xCod[0] = xCod[0]+2;
			xCod[1] = xCod[1]+1;
			xCod[3] = xCod[3]-1;
			yCod[1] = yCod[1]+1;
			yCod[2] = yCod[2]+2;
			yCod[3] = yCod[3]+1;
		}
		else if(verNo == 4)
		{
			xCod[1] = xCod[1]-1;
			xCod[2] = xCod[2]-2;
			xCod[3] = xCod[3]-1;
			yCod[0] = yCod[0]+2;
			yCod[1] = yCod[1]+1;
			yCod[3] = yCod[3]-1;
		}

	}
}

class LTshape extends Version {
	LTshape()
	{
		Random r = new Random();
		int ranNo = r.nextInt((25 - 5) + 1) + 5;
		xCod = new int[] {1,2,2,3};
		yCod = new int[] {ranNo,ranNo,ranNo+1,ranNo+1};
	}

	public void changeVersionAnticlock(int verNo)
	{
		super.changeVersion(verNo);

		if(verNo == 1 || verNo == 3)
		{
			xCod[1] = xCod[1]+1;
			xCod[3] = xCod[3]+1;
			yCod[0] = yCod[0]-2;
			yCod[1] = yCod[1]-1;
			yCod[3] = yCod[3]+1;
		}
		else if(verNo == 2 || verNo == 4)
		{
			xCod[1] = xCod[1]-1;
			xCod[3] = xCod[3]-1;
			yCod[0] = yCod[0]+2;
			yCod[1] = yCod[1]+1;
			yCod[3] = yCod[3]-1;
		}
	}
	public void changeVersionClock(int verNo)
	{
		super.changeVersion(verNo);
		changeVersionAnticlock(verNo);

	}
}

public class TETRIS
{

	public static char board[][] = new char[30][30];

	public static void main(String args[]) 
	{
		//Line l1 = new Line();
		Square l1 = new Square();
		//Tshape l1 = new Tshape();
		//Lshape l1 = new Lshape();
		//LTshape l1 = new LTshape();

		clearBoard();
		drawShape(l1);
		displayBoard();

		int versionNo = l1.getVersion();

		Scanner obj = new Scanner(System.in);
		char c = obj.next().charAt(0);
		while(c!='q')
		{
			if(c == 'd')
			{
				clearScreen();
				if(versionNo == 1)
				{
					l1.changeVersionAnticlock(2);
				}
				else if(versionNo == 2)
				{
					l1.changeVersionAnticlock(3);
				}
				else if(versionNo == 3)
				{
					l1.changeVersionAnticlock(4);
				}
				else if(versionNo == 4) 
				{
					l1.changeVersionAnticlock(1);	
				}

			}
			else if(c == 'a')
			{
				clearScreen();
				if(versionNo == 1)
				{
					l1.changeVersionClock(4);
				}
				else if(versionNo == 2)
				{
					l1.changeVersionClock(1);
				}
				else if(versionNo == 3)
				{
					l1.changeVersionClock(2);
				}
				else if(versionNo == 4)
				{
					l1.changeVersionClock(3);
				}
			}
			else if(c == 'r')
			{
				moveRight(l1);
				moveDown(l1);
			}
			else if(c == 'l')
			{
				moveLeft(l1);
				moveDown(l1);
			}

			clearBoard();
			drawShape(l1);
			displayBoard();
			versionNo = l1.getVersion();
			c = obj.next().charAt(0);

		}
	}

	public static void moveRight(Version v1)
	{
		if(v1.yCod[0]==28 || v1.yCod[1]==28 || v1.yCod[2]==28 || v1.yCod[3]==28)
			return ;
		for(int i=0;i<v1.xCod.length;i++)
			v1.yCod[i]++;
	}

	public static void moveLeft(Version v1)
	{
		if(v1.yCod[0]==1 || v1.yCod[1]==1 || v1.yCod[2]==1 || v1.yCod[3]==1)
			return ;
		for(int i=0;i<v1.xCod.length;i++)
			v1.yCod[i]--;
	}

	public static void moveDown(Version v1)
	{
		if(v1.xCod[0]==28 || v1.xCod[1]==28 || v1.xCod[2]==28 || v1.xCod[3]==28)
			return ;
		for(int i=0;i<v1.xCod.length;i++)
			v1.xCod[i]++;
	}

	public static void clearBoard() {
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

	public static void drawShape(Version v1) {
		for(int i=0;i<v1.xCod.length;i++)
		{
			board[v1.xCod[i]][v1.yCod[i]] = '#';
		}
	}

	public static void displayBoard() {
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