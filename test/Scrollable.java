import jcurses.system.CharColor;
import jcurses.util.Rectangle;
import jcurses.widgets.IScrollable;

public class Scrollable implements IScrollable {
    private boolean hasHorizontalScrollbar;
    private boolean hasVerticalScrollbar;
    private Rectangle rect;
    private CharColor borderColors    = new CharColor(CharColor.BLACK, CharColor.WHITE);
    private CharColor scrollbarColors = new CharColor(CharColor.BLACK, CharColor.RED);
    private float horizontalScrollbarOffset = 0;
    private float verticalScrollbarOffset   = 0;
    private float horizontalScrollbarLength = 1;
    private float verticalScrollbarLength   = 1;

    public Scrollable(int x, int y, int width, int height, boolean hasHorizontalScrollbar, boolean hasVerticalScrollbar) {
        this.hasHorizontalScrollbar = hasHorizontalScrollbar;
        this.hasVerticalScrollbar   = hasVerticalScrollbar;

        rect = new Rectangle(x, y, width, height);
    }

    public CharColor getBorderColors() {
        return borderColors;
    }

    public Rectangle getBorderRectangle() {
        return rect;
    }

    public float getHorizontalScrollbarOffset() {
        return horizontalScrollbarOffset;
    }

    public CharColor getScrollbarColors() {
        return scrollbarColors;
    }

    public float getHorizontalScrollbarLength() {
        return horizontalScrollbarLength;
    }

    public float getVerticalScrollbarLength() {
        return verticalScrollbarLength;
    }

    public float getVerticalScrollbarOffset() {
        return verticalScrollbarOffset;
    }

    public boolean hasHorizontalScrollbar() {
        return hasHorizontalScrollbar;
    }

    public boolean hasVerticalScrollbar() {
        return hasVerticalScrollbar;
    }
}
