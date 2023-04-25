public class Lutador {
    private String nome;
    private String nacionaliade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private  int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String no,String na,int id,float al,float pe, int vi,int de,int em){
        this.nome= no;
        this.nacionaliade= na;
        this.idade=id;
        this.altura=al;
       this.setPeso(pe);
        this.vitorias=vi;
        this.derrotas=de;
        this.empates=em;
    }


    public void apresentar(){
        System.out.println("CHEGOU A HORA! Apresentamos o lutador " + this.getNome());
        System.out.println("Diretamente de " + this.getNacionaliade());
        System.out.println("com " + this.getIdade() + " Anos e " + this.getaltura() + " de Altura");
        System.out.println("Pesando: " + this.getPeso() + "Kg");
        System.out.println("Com " + this.getVitorias() + " Vitórias" );
        System.out.println(this.getDerrotas() + " Derrotas e ");
        System.out.println(this.getempates() + " Empates");
    }
    public void status(){
        System.out.println(this.getNome()+ " é um peso "+ this.getCategoria());
        System.out.println("Ganhou " + this.getVitorias() + " vezes");
        System.out.println("Perdeu " + this.getDerrotas() + " vezes");
        System.out.println("Empatou " + this.getempates() + " vezes");

    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);

    }
    public void perdeLuta(){
        this.setDerrotas(this.getDerrotas() + 1);

    }
    public void empatarLuta(){
        this.setEmpates(this.getempates() + 1);

    }

    public String getNome(){   return nome;}
   public void setNome(String n){ this.nome = n;}
    public String getNacionaliade(){ return nacionaliade;}
    public void setNacionaliade(String l){ this.nacionaliade=l;}
    public int getIdade(){ return idade;}
    public void setIdade(int i){ this.idade = i;}
    public float getaltura(){ return altura;}
    public void setaltura(float a){ this.altura=a;}
    public float getPeso(){ return peso;}
    public void setPeso(float p){ this.peso = p; this.setCategoria();}
    public String getCategoria(){ return categoria;}
    private void setCategoria(){
        if(this.peso<52.2){
            this.categoria="Inválido";
        }else if(this.peso<=70.3) {
            this.categoria="Leve";
        }else if(this.peso<=83.9){
            this.categoria="Médio";
        }else if(this.peso<=120.2){
            this.categoria="Pesado";
        }else{
            this.categoria="Inválido";
        }
    }
    private int getVitorias(){ return this.vitorias;}
    private void setVitorias(int v){  this.vitorias= v;}
    private int getDerrotas(){ return this.derrotas;}
    private void setDerrotas(int d){  this.derrotas= d;}
    private int getempates(){ return this.empates;}
    private void setEmpates(int e){  this.empates= e;}










}
