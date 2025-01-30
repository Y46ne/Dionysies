class Auteur {
  String nom;

  String citation_tragédie;
  int qualité_tragédie;

  String citation_comédie;
  int qualité_comédie;

  String citation_drame;
  int qualité_drame;

  public Auteur(
      String nom,
      int qualité_tragédie,
      String citation_tragédie,
      int qualité_comédie,
      String citation_comédie,
      int qualité_drame,
      String citation_drame) {
    this.nom = nom;
    this.citation_tragédie = citation_tragédie;
    this.qualité_tragédie = qualité_tragédie;
    this.citation_comédie = citation_comédie;
    this.qualité_comédie = qualité_comédie;
    this.citation_drame = citation_drame;
    this.citation_drame = citation_drame;
  }


  public String getNom() {
    return nom;
  }


  public String getCitation_tragédie() {
    return citation_tragédie;
  }



  public int getQualité_tragédie() {
    return qualité_tragédie;
  }



  public String getCitation_comédie() {
    return citation_comédie;
  }



  public int getQualité_comédie() {
    return qualité_comédie;
  }



  public String getCitation_drame() {
    return citation_drame;
  }



  public int getQualité_drame() {
    return qualité_drame;
  }

  

  public Style point_fort() {
    if (qualité_tragédie > qualité_comédie) {
      if (qualité_drame > qualité_tragédie) {
        return Style.DRAME;
      } else {
        return Style.TRAGÉDIE;
      }
    } else {
      if (qualité_drame > qualité_comédie) {
        return Style.DRAME;
      } else {
        return Style.COMÉDIE;
      }
    }
  }
}
