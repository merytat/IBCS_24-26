package UnitP4.PhotoAlbum;

public class Photo {
   private String id;
   private String cate;
   private double size;

    public Photo(String id, String cate, double size) {
        this.id = id;
        this.cate = cate;
        this.size = size;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCate() {
        return cate;
    }

    public void setCate(String cate) {
        this.cate = cate;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return  id + '\t' +
                size + '\t'
                +  cate;
    }
}
