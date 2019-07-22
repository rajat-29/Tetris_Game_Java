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

	public void changeVersionAnticlock(int versionNo)
	{
		this.versionNo = versionNo;
	}

	public void changeVersionClock(int versionNo)
	{
		this.versionNo = versionNo;
	}

	public boolean checkDown(char board[][]) {
        return false;
    }

    public void generateVer() {
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

	public void generateVer() 
	{
        Random r = new Random();
		int ranNo = r.nextInt((25 - 5) + 1) + 5;
		xCod = new int[] {4,5,6,7};
		yCod = new int[] {ranNo,ranNo,ranNo,ranNo};
    }

    public boolean checkDown(char board[][]) {
        if(versionNo == 1 && (board[xCod[3] + 1][yCod[3]] == '#')) {
            return true;
        } else if(versionNo == 2 && ( board[xCod[0] + 1][yCod[0]] == '#' 
        || board[xCod[1] + 1][yCod[1]] == '#' || 
        board[xCod[2] + 1][yCod[2]] == '#' 
        || board[xCod[3] + 1][yCod[3]] == '#')) {
            return true;
        }
        return false;
    }

	public void changeVersionAnticlock(int versionNo)
	{
		super.changeVersion(versionNo);

		if(versionNo == 1)
		{	
			for(int i=0;i<xCod.length;i++)
			{
				xCod[i] = xCod[0]+i;
				yCod[i] = yCod[0];
			}
		}
		else if(versionNo == 2)
		{
			for(int i=0;i<xCod.length;i++)
			{
				xCod[i] = xCod[0];
				yCod[i] = yCod[0]+i;
			}
		}
		else if(versionNo == 3)
		{
			for(int i=0;i<xCod.length;i++)
			{
				xCod[i] = xCod[i]-i;
				yCod[i] = yCod[0];
			}
		}
		else if(versionNo == 4)
		{
			for(int i=0;i<xCod.length;i++)
			{
				xCod[i] = xCod[0];
				yCod[i] = yCod[0]-i;
			}
		}
	}
	public void changeVersionClock(int versionNo)
	{
		super.changeVersion(versionNo);

		if(versionNo == 1)
		{	
			for(int i=0;i<xCod.length;i++)
			{
				xCod[i] = xCod[0]+i;
				yCod[i] = yCod[0];
			}
		}
		else if(versionNo == 2)
		{
			for(int i=0;i<xCod.length;i++)
			{
				xCod[i] = xCod[0];
				yCod[i] = yCod[0]+i;
			}
		}
		else if(versionNo == 3)
		{
			for(int i=0;i<xCod.length;i++)
			{
				xCod[i] = xCod[0]-i;
				yCod[i] = yCod[0];
			}
		}
		else if(versionNo == 4)
		{
			for(int i=0;i<xCod.length;i++)
			{
				xCod[i] = xCod[0];
				yCod[i] = yCod[0]-i;
			}
		}
	}

}

class Square extends Version {
	Square()
	{
		 Random r = new Random();
		int ranNo = r.nextInt((25 - 5) + 1) + 5;
		xCod = new int[] {1,1,2,2,};
		yCod = new int[] {ranNo,ranNo+1,ranNo,ranNo+1};
	}

	public void generateVer() 
	{
       Random r = new Random();
		int ranNo = r.nextInt((25 - 5) + 1) + 5;
		xCod = new int[] {1,1,2,2,};
		yCod = new int[] {ranNo,ranNo+1,ranNo,ranNo+1};
    }

      public boolean checkDown(char board[][]) {
        if(board[xCod[2] + 1][yCod[2]] == '#' || board[xCod[3] + 1][yCod[3]] == '#') {
            return true;
        } 
        return false;
    }

	public void changeVersionAnticlock(int versionNo)
	{
		super.changeVersion(versionNo);
	}
	public void changeVersionClock(int versionNo)
	{
		super.changeVersion(versionNo);
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

	public void generateVer() 
	{
       Random r = new Random();
		int ranNo = r.nextInt((25 - 5) + 1) + 5;
		xCod = new int[] {1,1,1,2};
		yCod = new int[] {ranNo,ranNo+1,ranNo+2,ranNo+1};
    }

    public boolean checkDown(char board[][]) {
        if(versionNo == 1 && (board[xCod[0] + 1][yCod[0]] == '#' 
        || board[xCod[2] + 1][yCod[2]] == '#' || board[xCod[3] + 1][yCod[3]] == '#')) {
            return true;
        } else if(versionNo == 2 && ( board[xCod[2] + 1][yCod[2]] == '#' 
        || board[xCod[3] + 1][yCod[3]] == '#')) {
            return true;
        } else if(versionNo == 3 && (board[xCod[0] + 1][yCod[0]] == '#' 
        || board[xCod[1] + 1][yCod[1]] == '#' || board[xCod[2] + 1][yCod[2]] == '#')) {
            return true;
        } else if(versionNo == 4 && (board[xCod[0] + 1][yCod[0]] == '#' || board[xCod[3] + 1][yCod[3]] == '#')){
            return true;
        }
        return false;
    }

	public void changeVersionAnticlock(int versionNo)
	{
		super.changeVersion(versionNo);

		if(versionNo == 1)
		{
			xCod[1] = xCod[1]-1;
			xCod[2] = xCod[2]-2;
			yCod[0] = yCod[0]-1;
			yCod[2] = yCod[2]+1;
			yCod[3] = yCod[3]+1;
		}
		if(versionNo == 2)
		{
			xCod[1] = xCod[1]+1;
			xCod[2] = xCod[2]+2;
			yCod[0] = yCod[0]+1;
			yCod[2] = yCod[2]-1;
			yCod[3] = yCod[3]+1;
		}
		if(versionNo == 3)
		{
			xCod[0] = xCod[0]+1;
			xCod[2] = xCod[2]-1;
			xCod[3] = xCod[3]-1;
			yCod[0] = yCod[0]-1;
			yCod[2] = yCod[2]+1;
			yCod[3] = yCod[3]-1;
		}
		if(versionNo == 4)
		{
			xCod[0] = xCod[0]-1;
			xCod[2] = xCod[2]+1;
			xCod[3] = xCod[3]+1;
			yCod[0] = yCod[0]+1;
			yCod[2] = yCod[2]-1;
			yCod[3] = yCod[3]-1;
		}
	}

	public void changeVersionClock(int versionNo)
	{
		super.changeVersion(versionNo);

		if(versionNo == 1)
		{
			xCod[1] = xCod[1]-1;
			xCod[2] = xCod[2]-2;
			yCod[0] = yCod[0]-1;
			yCod[2] = yCod[2]+1;
			yCod[3] = yCod[3]-1;
		}
		if(versionNo == 2)
		{
			xCod[0] = xCod[0]-1;
			xCod[2] = xCod[2]+1;
			xCod[3] = xCod[3]+1;
			yCod[0] = yCod[0]+1;
			yCod[2] = yCod[2]-1;
			yCod[3] = yCod[3]+1;
		}
		if(versionNo == 3)
		{
			xCod[0] = xCod[0]+1;
			xCod[2] = xCod[2]-1;
			xCod[3] = xCod[3]-1;
			yCod[0] = yCod[0]-1;
			yCod[2] = yCod[2]+1;
			yCod[3] = yCod[3]+1;
		}
		if(versionNo == 4)
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
		yCod = new int[] {10,10,10,11};
	}

	public void generateVer() 
	{
       Random r = new Random();
		int ranNo = r.nextInt((25 - 5) + 1) + 5;
		xCod = new int[] {1,2,3,3};
		yCod = new int[] {10,10,10,11};
    }

    public boolean checkDown(char board[][]) {
        if(versionNo == 1 && (board[xCod[2] + 1][yCod[2]] == '#' || board[xCod[3] + 1][yCod[3]] == '#')) {
            return true;
        } else if(versionNo == 2 && ( board[xCod[0] + 1][yCod[0]] == '#' || board[xCod[1] + 1][yCod[1]] == '#' 
        || board[xCod[2] + 1][yCod[2]] == '#')) {
            return true;
        } else if(versionNo == 3 && (board[xCod[0] + 1][yCod[0]] == '#' || board[xCod[3] + 1][yCod[3]] == '#')) {
            return true;
        } else if(versionNo == 4 && (board[xCod[0] + 1][yCod[0]] == '#' || board[xCod[1] + 1][yCod[1]] == '#' || board[xCod[2] + 1][yCod[2]] == '#' )){
            return true;
        }
        return false;
    }

	public void changeVersionAnticlock(int versionNo)
	{
		super.changeVersion(versionNo);

		if(versionNo == 1)
		{
			xCod[1] = xCod[1]+1;
			xCod[2] = xCod[2]+2;
			xCod[3] = xCod[3]+1;
			yCod[0] = yCod[0]-2;
			yCod[1] = yCod[1]-1;
			yCod[3] = yCod[3]+1;
		}
		else if(versionNo == 2)
		{
			xCod[0] = xCod[0]+2;
			xCod[1] = xCod[1]+1;
			xCod[3] = xCod[3]-1;
			yCod[1] = yCod[1]+1;
			yCod[2] = yCod[2]+2;
			yCod[3] = yCod[3]+1;
		}
		else if(versionNo == 3)
		{
			xCod[1] = xCod[1]-1;
			xCod[2] = xCod[2]-2;
			xCod[3] = xCod[3]-1;
			yCod[0] = yCod[0]+2;
			yCod[1] = yCod[1]+1;
			yCod[3] = yCod[3]-1;
		}
		else if(versionNo == 4)
		{
			xCod[0] = xCod[0]-2;
			xCod[1] = xCod[1]-1;
			xCod[3] = xCod[3]+1;
			yCod[1] = yCod[1]-1;
			yCod[2] = yCod[2]-2;
			yCod[3] = yCod[3]-1;
		}
	}

	public void changeVersionClock(int versionNo)
	{
		super.changeVersion(versionNo);

		if(versionNo == 1)
		{
			xCod[0] = xCod[0]+2;
			xCod[1] = xCod[1]+1;
			xCod[3] = xCod[3]-1;
			yCod[1] = yCod[1]+1;
			yCod[2] = yCod[2]+2;
			yCod[3] = yCod[3]+1;
		}
		else if(versionNo == 2)
		{
			System.out.println("2");
			xCod[1] = xCod[1]+1;
			xCod[2] = xCod[2]+2;
			xCod[3] = xCod[3]+1;
			yCod[0] = yCod[0]-2;
			yCod[1] = yCod[1]-1;
			yCod[3] = yCod[3]+1;
		}
		else if(versionNo == 3)
		{
			System.out.println("3");
			xCod[0] = xCod[0]-2;
			xCod[1] = xCod[1]-1;
			xCod[3] = xCod[3]+1;
			yCod[1] = yCod[1]+1;
			yCod[2] = yCod[2]-2;
			yCod[3] = yCod[3]-1;
			for(int i=0;i<4;i++)
			System.out.println("" + yCod[i]);
		}
		else if(versionNo == 4)
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

// class LTshape extends Version {
// 	LTshape()
// 	{
// 		Random r = new Random();
// 		int ranNo = r.nextInt((25 - 5) + 1) + 5;
// 		xCod = new int[] {1,2,2,3};
// 		yCod = new int[] {ranNo,ranNo,ranNo+1,ranNo+1};
// 	}

// 	public void generateVer() 
// 	{
//        Random r = new Random();
// 		int ranNo = r.nextInt((25 - 5) + 1) + 5;
// 		xCod = new int[] {1,2,2,3};
// 		yCod = new int[] {ranNo,ranNo,ranNo+1,ranNo+1};
//     }

// 	public void changeVersionAnticlock(int versionNo)
// 	{
// 		super.changeVersion(versionNo);

// 		if(versionNo == 1 || versionNo == 3)
// 		{
// 			xCod[1] = xCod[1]+1;
// 			xCod[3] = xCod[3]+1;
// 			yCod[0] = yCod[0]-2;
// 			yCod[1] = yCod[1]-1;
// 			yCod[3] = yCod[3]+1;
// 		}
// 		else if(versionNo == 2 || versionNo == 4)
// 		{
// 			xCod[1] = xCod[1]-1;
// 			xCod[3] = xCod[3]-1;
// 			yCod[0] = yCod[0]+2;
// 			yCod[1] = yCod[1]+1;
// 			yCod[3] = yCod[3]-1;
// 		}
// 	}
// 	public void changeVersionClock(int versionNo)
// 	{
// 		super.changeVersion(versionNo);
// 		changeVersionAnticlock(versionNo);

// 	}
// }

public class TETRIS
{

	public static char board[][] = new char[30][30];
	public static int hashNo[] = new int[30];
	public static Stack<String> undoStack = new Stack<String>();
	public static Stack<String> redoStack = new Stack<String>();
	 static int currentShapeNo = 1;
	 static int currentShapeVersion = 1;

	public static void main(String args[]) 
	{
		Line line = new Line();
		Square square = new Square();
		Tshape t = new Tshape();
		Lshape l = new Lshape();
		//LTshape lt = new LTshape();
		Version currentShape = new Version();

		Scanner obj = new Scanner(System.in);

		char c;

		initBoard();

		while(true)
		{

			currentShape = currentShapeNo == 1 ? line : currentShapeNo == 2 ? square : currentShapeNo == 3 ? t : l;
			int versionNo = currentShape.getVersion();
			drawShape(currentShape);
			displayBoard();

			c = obj.next().charAt(0);

			    if(c == 'd')
				{
					moveAnti(versionNo,currentShape);
					undoStack.push("a");
				}
				else if(c == 'a')
				{
					moveClock(versionNo,currentShape);
					undoStack.push("d");
				}

				 if(c == 'r')
				{
					moveRight(currentShape);
					moveDown(currentShape);
					undoStack.push("r");
				}
				else if(c == 'l')
				{
					moveLeft(currentShape);
					moveDown(currentShape);
					undoStack.push("l");
				}
				else if(c == 'b')
				{
					moveDown(currentShape);
					undoStack.push("b");
				}
				else if(c == 'u')
				{
					if(undoStack.isEmpty())
					{
						continue;
					}
						undoStep(versionNo,undoStack.peek(),currentShape);
						redoStack.push(undoStack.pop());
					
				}
				else if(c == 'i') 
				{
                	if(redoStack.isEmpty())
                	{
                		continue;
                	}
                	redoStep(versionNo,redoStack.peek(),currentShape);
                	undoStack.push(redoStack.pop());
                }
		}
	}

	public static void moveAnti(int vNO, Version V)
	{
		vNO = vNO > 4 ? 1 : ++vNO;
				
		clearFromBoard(V);
		V.changeVersionAnticlock(vNO);
		undoStack.push("d");
	}

	public static void moveClock(int vNO, Version V)
	{
		vNO = vNO > 1 ? --vNO : 4;
				
		clearFromBoard(V);
		V.changeVersionClock(vNO);
		undoStack.push("a");
	}

	public static void moveLeft(Version V) {
        if(V.yCod[0] == 1 || V.yCod[1] == 1 || V.yCod[2] == 1 || V.yCod[3] == 1)
            return;
        for(int i = 0;i<V.xCod.length;i++) {
            board[V.xCod[i]][V.yCod[i]] = ' ';
            V.yCod[i]--;
        }
    }
    public static void moveRight(Version V) {
        if(V.yCod[0] == (board.length - 2) || V.yCod[1] == (board.length - 2) || V.yCod[2] == (board.length - 2) || V.yCod[3] == (board.length - 2))
            return;
        for(int i = 0;i<V.xCod.length;i++) {
            board[V.xCod[i]][V.yCod[i]] = ' ';
            V.yCod[i]++;
        }
    }

	public static void moveDown(Version V) {
        if(V.xCod[0] == (board.length - 2) || V.xCod[1] == (board.length - 2) || 
        V.xCod[2] == (board.length - 2) || V.xCod[3] == (board.length - 2) || V.checkDown(board)) {
        	  checkRemoveLine(V);
            V.generateVer();

            currentShapeNo = (int)(Math.random() * 5) + 1;
            return;
        }
        for(int i = 0;i<V.xCod.length;i++) {
            board[V.xCod[i]][V.yCod[i]] = ' ';
            V.xCod[i]++;
        }
    }

    public static void undoStep(int vers,String undo, Version V)
	{
		if(undo.equals("b"))
		{
			for(int i=0;i<V.xCod.length;i++)
			{
				board[V.xCod[i]][V.yCod[i]] = ' ';
				V.xCod[i]--;
			}
		}
		else if(undo.equals("l"))
		{
			moveRight(V);
		}
		else if(undo.equals("r"))
		{
			moveLeft(V);
		}
		else if(undo.equals("d"))
		{
			moveClock(vers,V);
		}
	}

	public static void redoStep(int vers,String undo, Version V)
	{
		if(undo.equals("b"))
		{
			moveDown(V);
		}
		else if(undo.equals("l"))
		{
			moveLeft(V);
		}
		else if(undo.equals("r"))
		{
			moveRight(V);
		}
		else if(undo.equals("d"))
		{
			moveAnti(vers,V);
		}
	}

	public static void clearFromBoard(Version V) 
	{
    	for(int i=0;i<V.xCod.length;i++)
    	{
    		board[V.xCod[i]][V.yCod[i]] = ' ';
    	}
    }

    public static void checkRemoveLine(Version V) {

    	

    	for(int i=0;i<4;i++)
    	{
    		hashNo[30-1-V.xCod[i]]++;
    	}
    	for(int i=29;i>0;i--)
    	{
    		if(hashNo[i]>28)
    		{
    			for(int j=board.length-1-i;j>0;j--)
    			{
    				board[j] = board[j-1];
    			}
    			board[0] = new char[30];
    		}
    	}
    }

	public static void initBoard() {
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