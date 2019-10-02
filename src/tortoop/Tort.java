package tortoop;

public class Tort {
    public int szamlalo;
    public int nevezo;
    
    public Tort(){}
    public Tort(int szamlalo, int nevezo){
        this.szamlalo = szamlalo;
        this.nevezo = nevezo;
    }
    
    public int getNevezo(){
        return this.nevezo;
    }
    public int getSzamlalo(){
        return this.szamlalo;
    }
    
    public void legegyszerubbAlak(){
        System.out.printf("Legegyszerűbb alak: ");
        kiir(legegyszerubbSzamlalo(), legegyszerubbNevezo());
    }
    public int legegyszerubbSzamlalo(){
        int s = this.szamlalo / lnko(this.szamlalo,this.nevezo);
        return s;
    } 
    public int legegyszerubbNevezo(){
        int s = this.nevezo / lnko(this.szamlalo,this.nevezo);
        return s; 
    }
    public void isEgszerusithetoE(){
        
    }
    public void isEgeszE(){
    
    }
    public int lnko(int a, int b){
        int temp;
        while(b>0){
            temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    public void lkkt(){
        
    }
    public void osszeadas(){
    
    }
    public void kivonas(){
    
    }
    public void szorzas(){
    
    }
    public void osztas(){
    
    }
    
    public void kiir(int a, int b){
        System.out.printf("%s/%s\n\n", a, b);
    }
    
    @Override
    public String toString(){
        return String.format("%s/%s\n", this.szamlalo, this.nevezo);
    }
    
}
