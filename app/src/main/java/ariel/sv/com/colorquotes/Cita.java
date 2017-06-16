package ariel.sv.com.colorquotes;

/**
 * Created by Ariel on 16/6/2017.
 */

public class Cita {
    private String text;
    private String autor;
    private int color;

    public Cita() {
    }

    public Cita(String text, String autor) {
        this.text = text;
        this.autor = autor;
    }

    public Cita(String text, String autor, int color) {
        this.text = text;
        this.autor = autor;
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
