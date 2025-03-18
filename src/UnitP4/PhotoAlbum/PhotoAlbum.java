package UnitP4.PhotoAlbum;

public class PhotoAlbum {
    private Photo[] obj = new Photo[200];
    private int count=0;

    public boolean add(Photo a){
        if(count<200){
            obj[count]=a;
            count++;
            return true;
        }
        else{
            return false;
        }
    }
    public void list(String c){
        for(int i=0;i<obj.length; i++){ //could be used count
            if(obj[i]!=null){
                if(obj[i].getCate().equals(c)){
                    System.out.println(obj[i]);
                }

            }
        }
    }
    public Photo search(String i){
        for(int j=0; j< obj.length;j++){
            if(obj[j]!=null && obj[j].getId().equals(i)){
                return obj[j];
            }
        }
        return null;
    }
    public void sort(){
        for(int i=0;i<obj.length;i++){
            for(int j =1; j< (obj.length -i); j++ ){
                if(obj[j-1].getSize() < obj[j].getSize()){
                    Photo temp = obj[j-1];
                    obj[j-1]=obj[j];
                    obj[j]= temp;
                }
            }
        }
        for (Photo n: obj) {
            if (n!=null){
                System.out.println(n);
            }
        }
    }

}
