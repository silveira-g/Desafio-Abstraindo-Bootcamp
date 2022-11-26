import java.time.LocalDate;

import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitutlo("Java");
        curso.setDescricao("Descrição do curso de java");
        curso.setCargaHoraria(8);
        Curso curso2 = new Curso();

        curso2.setTitutlo("Java");
        curso2.setDescricao("Descrição do curso de java");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitutlo("Mentoria de java");
        mentoria.setDescricao("Descrição da mentoria");
        mentoria.setData(LocalDate.now());



    }
}