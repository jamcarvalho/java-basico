/** 
 * esta classe simula os comandos básicos executados em uma SmartTV
 * @author Jorge
 * 
 * */

public class SmartTV {

    
    boolean ligada=false;
    int canal=1;
    int volume=25;

    public void ligar(){
        ligada=true;
    }

    public void desligar(){
        ligada=false;
    }

    public void aumentarVolume(){
        volume++;
    }

    public void diminuirVolume(){
        volume--;
    }

    public void subirCanal(){
        canal++;
    }

    public void descerCanal(){
        canal++;
    }

    
    /** 
     * @param novoCanal
     */
    public void escolherCanal(int novoCanal){
        canal = novoCanal;
    }


}