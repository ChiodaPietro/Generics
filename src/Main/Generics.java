package Main;

public class Generics <Obj> {
    private Obj o;
    public Generics(Obj o){
        this.o=o;
    }
    public Obj get(){return o;}
    public boolean remove (){
        o=null;
        return true;
    }
    public boolean refactor(Obj o){
        this.o=o;
        return true;
    }
    public boolean add(Obj[] list, Obj o){
        for(int i=0; i<list.length;i++){
            if(list[i]==null){
                list[i]=o;
                return true;
            }
        }
        return false;
    }
}
