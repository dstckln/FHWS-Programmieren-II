package ueb13.aufgabe2;

public class MultipleChoice extends Frage {
	
    @Override
    public String getFrage() {
	return this.frage;
    }
    @Override
    public void setFrage(String frage) {
	this.frage = frage;
    }
}
