package exercise0;


public class Persona {
String name, cognome = "Andrea";

int eta = 23; 
int anno = 1997, 
int mese=08;

//costruttore
  public Persona(String nome, String cognome, int eta) {
    this.name=nome;
    this.cognome = cognome;
    this.eta=eta;
  }

public Persona(String name, String cognome, int eta){

  this.name=name;
  this.cognome=cognome;
  this.eta=18;
}

  public String dettagli(){
      
     String d ="la persona si chiama" + this.nome +"" + this.cognome + "e ha" + 
    this.eta+ "è nata nell'anno" + this.anno "nel mese"+ mese;
    return d;
  }
}
