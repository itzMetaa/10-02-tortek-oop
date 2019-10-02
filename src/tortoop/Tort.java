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
    
    public void kiir(){
        System.out.println(this.szamlalo + "\n" +
                "-\n" +
                this.nevezo+ "\n");
    }
    
    
}
