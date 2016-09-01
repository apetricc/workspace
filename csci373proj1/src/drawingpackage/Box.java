package drawingpackage;


public class Box {

	
	private int x;
	private int y;
	private int height;
	private int width;
	private Box parent;
	private Box child;
	private Box root;
	private String title;
	
	
	
	public Box(String title, int x, int y,int height, int width, Box parent, Box child) {
		this.title = title;
		this.height = height;
		this.width = width;
		this.x = x;
		this.y = y;
		this.parent = parent;
		this.child = child;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String newTitle) {
		this.title = newTitle;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Box getParent() {
		return parent;
	}

	public void setParent(Box parent) {
		this.parent = parent;
	}

	public Box getChild() {
		return child;
	}

	public void setChild(Box child) {
		this.child = child;
	}
	
	public boolean isRoot(Box box) {
		return (box.parent == null);
	}
	
	
	
}
