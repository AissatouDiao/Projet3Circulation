package pack1;

public class Circulation {
    Etat_circulation rouge= new Feu_Rouge();
    Etat_circulation vert= new Feu_Vert();
    Etat_circulation jaune= new Feu_Jaune();
    
    public void colorier(String couleur)
    
    {
        if (couleur=="rouge") {
            rouge.circuler();
        }else if(couleur=="vert") {
            vert.circuler();
        }else if(couleur=="jaune") {
            jaune.circuler();
        }else {System.out.println("On parle de Feu tricolore: Vert,Jaune, Rouge");}
    }

}
