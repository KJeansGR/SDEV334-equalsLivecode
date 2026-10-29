public class Centroid {
    private int r;
    private int c;
    private String name;
    
    public Centroid(int r, int c, String name) {
        this.r = r;
        this.c = c;
        this.name = name;
    }
    @Override 
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null) return false; 
        if(!(o instanceof Centroid))return false;
        
        Centroid temp = ((Centroid) o);
        if(temp.r != this.r ){return false;}
        if(temp.c != this.c ){return false;}
        if(this.name ==null){
            return temp.name == null;
        }
        return this.name.equals(temp.name);
    }
}
