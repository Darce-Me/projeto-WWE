package WWE;

import java.util.Random;

public class Luta {
//    Atributos

    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovado = false;

//    Funções
    public void marcarLuta(Lutador desafiado, Lutador desafiante) {
        System.out.println("");
        if (desafiado.getCategoria() == desafiante.getCategoria()) {
            System.out.println("A luta será entre o desafiado " + desafiado.getNome() + " contra o desafiante " + desafiante.getNome());
            this.aprovado = true;
        } else {
            System.out.println("A luta não será realizada devido a categorias de peso diferentes;");
            this.aprovado = false;
        }

    }

    public void lutar(Lutador desafiado, Lutador desafiante) {
        Random random = new Random();

        for (rounds = 0; rounds < 3; rounds++) {
            int vencedor = random.nextInt(3);

            if (this.aprovado == true) {
                switch (vencedor) {
                    case 0:
                        System.out.println("Após 3 rounds a luta terminou em");
                        System.out.println("empate entre o desafiado " + desafiado.getNome() + " e o desafiante " + desafiante.getNome());
                        desafiado.empatarLuta();
                        desafiante.empatarLuta();

                        break;
                    case 1:
                        System.out.println("Após 3 rounds a luta terminou com a");
                        System.out.println("vitória de " + desafiado.getNome());
                        desafiado.ganharLuta();
                        desafiante.perderLuta();
                        break;
                    case 2:
                        System.out.println("Após 3 rounds a luta terminou com a ");
                        System.out.println("vitória de " + desafiante.getNome());
                        desafiado.perderLuta();
                        desafiante.ganharLuta();
                        break;

                }
            }
        }

    }

//    Getter and Setter
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

}
