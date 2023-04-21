public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto(){
        volume = 50;
        ligado = false;
        tocando = false;
    }
    private int getVolume(){
        return this.volume;
    }
    private void setvolume(int v){
        this.volume = v;
    }
    private boolean getligado(){
        return this.ligado;
    }
    private void setLigado(boolean l){
        this.ligado = l;
    }
    private boolean gettocando(){
        return this.tocando;
    }
    private void setTocando(boolean t){
        this.tocando= t;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
         this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("----MENU----");
        System.out.println("Está ligado? " + this.getligado());
        System.out.println("Está tocando? "+ this.gettocando());
        System.out.println("Volume: " + this.getVolume());
        for(int i = 0; i<= this.getVolume();i+=10){
            System.out.print("|");
        }


    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");

    }

    @Override
    public void maisVolume() {
        if(this.getligado()){
            setvolume(getVolume() + 5);

        }

    }

    @Override
    public void menosVolume() {
        if(this.getligado()){
            setvolume(getVolume() - 5);


        }

    }

    @Override
    public void ligarMudo() {
        if(this.getligado() && this.getVolume() > 0){
            this.setvolume(0);
        }

    }

    @Override
    public void desligarMudo() {
        if(this.getligado() && this.getVolume() == 0){
            this.setvolume(50);
        }

    }

    @Override
    public void play() {
         if(this.getligado() && (this.gettocando())){
             this.setTocando(true);
         }

    }

    @Override
    public void pause() {

        if(this.getligado() && (this.gettocando())){
            this.setTocando(false);

    }
}
}
