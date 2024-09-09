
public class ListaR{
    private NodeR inicio;
    
    public ListaR(){
       inicio = null; 
    }
    
    public void add(int valor){
        if(inicio!=null){
            inicio.add(valor);
        }
        else{
            inicio = new NodeR(valor);
        }
        
    }
    
    public void show(){
        if(inicio!=null){
            inicio.show();
        }
        
    }
    
    public int size(){
        if(inicio!=null){
            return inicio.size();
        }
        else{
            return 0;
        }
    }
    
    public int soma(){
        if(inicio!=null){
            return inicio.soma();
        }
        else{
            return 0;
        }
    }
    
    public int maior(){
        if(inicio!=null){
            return inicio.maior();
        }
        else{
            return -99999;
        }
    }
    
    public int qtdNosComValor(int valor){
        if(inicio!=null){
            return inicio.qtdNosComValor(valor);
        }
        else{
            return 0;
        }
    }
    
    public void showPosPares(){
        if(inicio!=null){
            inicio.showPosPares(1);
        }
        
    }

    public int showImpares(){
        if(inicio!=null){
            return inicio.showImpares();
        }
        else{
            return 0;
        }
    }

    public void showPares(){
        if(inicio!=null){
            inicio.showPares();
        }
        
    }

    public int showLast(){
        if(inicio!=null){
            return inicio.showLast();
        }
        else{
            return 0;
        }
    }

    public boolean find(int x){
        if(inicio!=null){
            return inicio.find(x);
        }
        else{
            return false;
        }
    }
}
