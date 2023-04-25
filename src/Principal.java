public class Principal {
    public static void main(String[]args){

          Lutador l[] = new Lutador[6];
        l[0] = new Lutador("Andre Silva","França",31,1.75f,68.9f,11,3,1);
        l[1] = new Lutador("José Adeiltom","Brazil",29,1.68f,57.8f,14,2,3);
        l[2] = new Lutador("Matt Leblac","EUA",35,1.65f,80.9f,12,2,1);
        l[3] = new Lutador("Felipe Brandão","Australia",28,1.93f,80.9f,13,0,1);
        l[4] = new Lutador("Gabriel Santos","Portugal",37,1.70f,119.3f,5,4,3);
        l[5] = new Lutador("Dean winchester","EUA",30,1.81f,105.7f,12,2,4);

        Luta UEC01 = new Luta();
        UEC01.marcaLuta(l[0],l[1]);
        UEC01.lutar();
        l[0].status();
        l[1].status();






    }
}
