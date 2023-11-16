package org.example;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Evento> eventos = Arrays.asList(new Evento("Reunión", LocalDate.of(2023, 11, 14), "laboral"),
                                             new Evento("Taller", LocalDate.of(2023, 11, 26), "personal"),
                                             new Evento("Conferencia", LocalDate.of(2023, 12, 5), "laboral")
        );

        //Filtra los eventos que están programados para una fecha específica

        LocalDate fecha = LocalDate.of(2023, 11, 14);
        System.out.println("***************** Eventos para fecha: " + fecha + " *****************");

        eventos.stream()
                .filter(p -> p.getFecha().isEqual(fecha))
                .forEach(System.out::println);

        //Agrupa los eventos por categoría y cuenta cuántos eventos hay en cada categoría.
        System.out.println("\n************* Eventos por Categoría *****************");
        List<Evento> eventosOrdenados = eventos.stream()
                .sorted(Comparator.comparing(p -> p.getCategoria()))
                .collect(Collectors.toList());
        eventosOrdenados.forEach(System.out::println);
        System.out.println("\n***************** Cantidad de eventos por categoría *****************");
        System.out.println("Por favor introduce la categoría que quieres consultar:");
        Scanner sc = new Scanner(System.in);
        String categoria = sc.nextLine();

        Long nroEventosCategoria = eventosOrdenados.stream()
                .filter(b -> b.getCategoria().equalsIgnoreCase(categoria))
                .count();

        System.out.println("La agenda contiene los siguientes eventos de tipo " + categoria + " : " + nroEventosCategoria);

        //Encuentra el evento más próximo en el tiempo utilizando Optionals

        System.out.println("\n***************** Evento próximo *****************");

        eventos.stream()
                .sorted(Comparator.comparing(p -> p.getFecha()))
                .filter(p -> p.getFecha().isAfter(LocalDate.now()))
                .findFirst()
                .ifPresentOrElse(v -> System.out.println(v), () -> System.out.println("No hay eventos próximos en el calendario"));


    }
}