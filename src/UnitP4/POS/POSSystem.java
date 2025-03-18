package UnitP4.POS;

public class POSSystem {
    private Cart[] line;

    public POSSystem(int noCarts){
        line = new Cart[noCarts];
    }

    public void joinLine(Cart newCart){
        for(int i = 0; i<line.length; i++){
            if(line[i] == null){
                line[i] = newCart;
                i=line.length;
            }
        }
    }

    public Cart leaveLine(int n){
        Cart result = line[n];
        for(int i = n; i<line.length-1; i++){
            line[i] = line[i+1];
        }
        line[line.length-1] = null;
        return result;
    }
}
