public class Myvector {
    public int x;
    public int y;

    public Myvector(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Myvector add(Myvector other) {
        return new Myvector(x+ other.x, y+ other.y);
    }

    public String toString() {
        return x+","+y;
    }
}
