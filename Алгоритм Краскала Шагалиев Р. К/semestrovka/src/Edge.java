// Класс ребра
public class Edge implements Comparable<Edge> {
    int u ;
    int v ;
    int w ;

    Edge(int u, int v, int w) {
        this.u = u;
        this.v = v;
        this.w = w;
    }

    @Override
    public int compareTo(Edge o) {
        if (w != o.w) return Integer.compare(o.w,w);
        return 0;
    }
}
