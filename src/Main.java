import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();
        Mentoria mentoria = new Mentoria();

        curso1.setNome("Curso 1");
        curso1.setDescricao("Descrição curso 1");
        curso1.setCargaHoraria(12);

        curso2.setNome("Curso 2");
        curso2.setDescricao("Descrição curso 2");
        curso2.setCargaHoraria(6);

        mentoria.setNome("Mentoria");
        mentoria.setDescricao("Descrição mentoria");
        mentoria.setDate(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Descrição bootcamp Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLucas = new Dev();
        devLucas.setNome("Lucas");
        devLucas.inscreverBootcamp(bootcamp);

        System.out.println("Conteudo inscritos: " + devLucas.getConteudosInscrito());
        devLucas.progredir();
        devLucas.progredir();
        System.out.println("Conteudos inscritos: " + devLucas.getConteudosInscrito());
        System.out.println("Conteudos concluidos: " + devLucas.getConteudosConcluidos());
        System.out.println("XP: " + devLucas.calculatTotalXp());
    }
}