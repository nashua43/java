public class Line {
    private Point start;
    private Point end;

    // Конструктор с двумя объектами типа Point
    public Line(Point start, Point end) {
        if (start == null || end == null) {
            throw new IllegalArgumentException("Точки линии не могут быть null.");
        }
        this.start = start;
        this.end = end;
    }

    // Конструктор с четырьмя координатами
    public Line(double x1, double y1, double x2, double y2) {
        this(new Point(x1, y1), new Point(x2, y2));
    }

    public Point getStart() { return start; }
    public Point getEnd() { return end; }

    public void setStart(Point start) {
        if (start == null) throw new IllegalArgumentException("Начальная точка не может быть null.");
        this.start = start;
    }

    public void setEnd(Point end) {
        if (end == null) throw new IllegalArgumentException("Конечная точка не может быть null.");
        this.end = end;
    }

    public int getLength() {
        double dx = end.getX() - start.getX();
        double dy = end.getY() - start.getY();
        return (int) Math.round(Math.sqrt(dx * dx + dy * dy));
    }

    @Override
    public String toString() {
        return "Линия от " + start + " до " + end;
    }
}
