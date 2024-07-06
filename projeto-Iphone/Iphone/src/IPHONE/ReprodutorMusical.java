package IPHONE;

public class  ReprodutorMusical{
   
    private String funcao;

    public  void Tocar(){
    //Para a fazer a reproducao da musica
    funcao = "tocando";
    System.out.println("Tocando Musica");
 }
 public void pausar(){
    funcao = "Pausar";
    System.out.println("Pausar musica");

 }
 public void selecionarMuisica(String musica){

        System.out.println("Musica selecionada" + musica);
 }
}

