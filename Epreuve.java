public class Epreuve {
    int nombreSpectateurs;
    Style style;

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

    public String toString() {
        return "Epreuve{" +
                "nombreSpectateurs=" + nombreSpectateurs +
                ", style=" + style +
                '}';
    }

}
