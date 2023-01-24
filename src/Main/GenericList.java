package Main;

public class GenericList<Obj> {
    private Obj[] o;

    public GenericList(Obj[] o) {
        this.o = o;
    }

    public Obj[] get() {
        return o;
    }

    public boolean remove(int pos) {
        o[pos] = null;
        return true;
    }

    public boolean set(Obj o, int pos) {
        this.o[pos] = o;
        return true;
    }

}
