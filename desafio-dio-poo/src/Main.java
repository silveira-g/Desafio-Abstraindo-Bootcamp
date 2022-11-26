import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitutlo("Java");
        curso.setDescricao("Descrição do curso de java");
        curso.setCargaHoraria(8);
        Curso curso2 = new Curso();

        curso2.setTitutlo("Python");
        curso2.setDescricao("Descrição do curso de python");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitutlo("Mentoria de java");
        mentoria.setDescricao("Descrição da mentoria");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devGuilherme = new Dev();
        devGuilherme.setNome("Guilherme");
        devGuilherme.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos de Guilherme: " + devGuilherme.getConteudosInscritos());
        devGuilherme.progredir();
        devGuilherme.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos de Guilherme: " + devGuilherme.getConteudosInscritos());
        System.out.println("Conteudos concluidos de Guilherme: " + devGuilherme.getConteudosConcluido());
        System.out.println("XP: " + devGuilherme.calcularTotalXp());

        Dev devMarcos = new Dev();
        devMarcos.setNome("Marcos");
        devMarcos.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos de Marcos: " + devMarcos.getConteudosInscritos());
        devMarcos.progredir();
        devMarcos.progredir();
        devMarcos.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos de Marcos: " + devMarcos.getConteudosInscritos());
        System.out.println("Conteudos concluidos de Marcos: " + devMarcos.getConteudosConcluido());
        System.out.println("XP: " + devMarcos.calcularTotalXp());



    }
}