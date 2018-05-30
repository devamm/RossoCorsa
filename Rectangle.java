public class Rectangle {
	private int x;
 	private int y;
 	private int width;
	private int height;

 	public Rectangle(int x, int y, int width, int height) {
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
    }

    public boolean intersects(Rectangle r) {
    int newx = x < r.x ? r.x : x;
    int newy = y < r.y ? r.y : y;
    int neww = (x + width < r.x + r.width ?
            x + width : r.x + r.width) - newx;
    int newh = (y + height < r.y + r.height ?
            y + height : r.y + r.height) - newy;
    if (neww >= 0 && newh >= 0)
      return true;
    else
      return false;
    }
}