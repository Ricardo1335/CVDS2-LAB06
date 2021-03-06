package guesser;

import java.util.Random;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;



@ManagedBean(name = "guessBean")
@ApplicationScoped
public class Adivinador {

    private Random rand = new Random();
    private int numero = rand.nextInt(10) + 1;
    private int answer;
    private int score = 100000;
    private int intentos = 0;
    private String state = "incompleto";

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAnswer() {
        return this.answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getIntentos() {
        return this.intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public String getState() {
        return this.state;
    }

    public void setVictory(String state) {
        this.state = state;
    }

    public void restart() {
        this.numero = rand.nextInt(10) + 1;
        this.score = 100000;
        this.intentos = 0;
        this.state = "incompleto";
    }

    public void guess() {
        intentos++;
        if (numero == answer) {
            this.state = "completo";
        } else {
            this.score -= 10000;
        }
    }
}
