import java.util.ArrayList;
import java.util.List;

public class Epreuve {
    int nombreSpectateurs;
    Style style;
    List<Auteur> auteurs;
    List<Integer> score=new ArrayList<Integer>();

    public Epreuve(int nombreSpectateurs, Style style) {
        this.nombreSpectateurs = nombreSpectateurs;
        this.style = style;
    }

    public int getNombreSpectateurs() {
        return this.nombreSpectateurs;
    }

    public Style getStyle() {
        return this.style;
    }

    public void setNombreSpectateurs(int nombreSpectateurs) {
        this.nombreSpectateurs = nombreSpectateurs;
    }

    public void setStyle(Style style) {
        this.style = style;
    }


    public int getScore(Auteur auteur) {
        return auteur.QualitéStyle(style) * this.nombreSpectateurs;
    }

    public void addAuteur(Auteur auteur) {
        auteurs.add(auteur);
    }

    public void removeAuteur(Auteur auteur) {
        auteurs.remove(auteur);
    }

    public void addScore() {
        for (Auteur auteur : auteurs) {
            int total = 0;
            total += getScore(auteur);
            score.add(total);
        }
    }


    @Override
    public String toString() {
        return "Epreuve{" +
                "nombreSpectateurs=" + nombreSpectateurs +
                ", style=" + style +
                '}';
    }

}
