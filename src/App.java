import java.security.MessageDigest;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

class App {
    
  public static void main(String[] args) throws Exception {

    System.out.println(UUID.randomUUID());

    ArrayList<Integer> idades = new ArrayList<>();
    List<Integer> idades2 = new ArrayList<>();
    var idades3 = new ArrayList<Integer>();
    
    idades.add(24);
    idades.add(24);
    idades.add(21);

    var idades4 = List.of(23, 22, 20);
    System.out.println(idades4);

    // Map: HashMap (dict, hash, keyValue)
    // Agregado

    // Key        -> Value
    // 2023015779 -> Bruno Nascimento
    // 2023015887 -> Vinícius da Silva
    HashMap<Integer, String> academico = 
      new HashMap<>();
    var aca = new HashMap<Integer, String>();
    //academico.put("das", 234);
    aca.put(2023015779, "Bruno Nascimento");
    aca.put(2023015887, "Vinícius da Silva");
    System.out.println(aca);
    aca.put(2023015887, "Douglas Pestano");

    System.out.println(aca.get(2023015779));
    System.out.println(aca.get(233842329));
    System.out.println(aca.get(null));
    
    System.out.println(aca.keySet());
    System.out.println(aca.values());

              // Construtor
    var e1 = new Estudante(); // instanciando (objeto)

    e1.matricula = 2023008809;
    e1.nome = "Gustavo Silva";
    e1.genero = Genero.MASCULINO;
    e1.dataNascimento = LocalDate.of(1969, 7, 1);

    System.out.println(e1);

    System.out.println(e1.matricula 
      + "\n" + e1.nome
      + "\n" + e1.genero
      + "\n" + e1.dataNascimento);

                /// chave         valor
    System.out.println( // true
      Mochinho.salvar(2023008809, e1)); // insert
    System.out.println( // false
      Mochinho.salvar(2023008809, e1)); // insert
    
    // select
    Estudante e2 = Mochinho.buscar(2023008809); 
    System.out.println(e2.nome); // Gustavo
  }
}