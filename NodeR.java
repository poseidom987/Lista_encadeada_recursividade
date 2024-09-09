
public class NodeR
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int x;
    private NodeR prox;

    /**
     * Construtor para objetos da classe NodeR
     */
    public NodeR(int valor)
    {
        // inicializa variáveis de instância
        x = valor;
        prox = null;
    }
    
   public void add(int valor){
       if(prox!=null){
           prox.add(valor);
       }
       else{
           prox = new NodeR(valor);
       }
   }

    public void show(){
        //System.out.println(x);
        if(prox!=null){
            prox.show();
        }
        System.out.println(x);
    }
    
    public int size(){
        if(prox!=null){
            return prox.size() + 1;
        }
        else{
            return 1;
        }
    }
    
    public int soma(){
        if(prox!=null){
            return prox.soma() + x;
        }
        else{
            return x;
        }
    }
    
    public int maior(){
        if(prox!=null){
            int m = prox.maior();
            if(x>m){
                return x;
            }
            else{
                return m;
            }
        }
        else{
            return x;
        }
    }
        
    public int qtdNosComValor(int valor){
        if(prox!=null){
            int q = prox.qtdNosComValor(valor);
            if(x==valor){
                return q + 1;
            }
            else{
                return q;
            }
        }
        else{
            if(x==valor){
                return 1;
            }
            else{
                return 0;
            }
        }
    }
    
    public void showPosPares(int pos){
        if(pos%2==0){
            System.out.println(x);
        }
        if(prox!=null){
            prox.showPosPares(pos+1);
        }
    }

    public int showImpares(){
            if(prox!=null){
                if(x%2!=0){
                    return prox.showImpares() + x;
                }else{
                return prox.showImpares() ;
            }
        }
            else{
                if(x%2!=0){
                    return x;
            }else{
                return 0;
            }
        }
}
    public void showPares(){
        
            if(prox!=null){
                prox.showPares();
                if(x%2==0){
                    System.out.print(x+",");
        }
            if(x%2==0){
                System.out.print(x+",");
    };
}
}
public int showLast(){
    if(prox==null){
        return x;
    }
    else{
        return prox.showLast();
    }
}

public boolean find(int x){
    if(prox!=null){
        if(x==this.x){
            return true;
        }
        else{
            return prox.find(x);
        }
    }
    else{
        if(x==this.x){
            return true;
        }
        else{
            return false;
        }
    }
}

}

