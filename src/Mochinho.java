import java.util.HashMap;

class Mochinho {
  // memória
  static HashMap<Integer, Estudante> mapa = 
      new HashMap<>(); // 2023008809 => {Gustavo,...}
    
  static boolean salvar(int pk, Estudante e) {
    if (mapa.containsKey(pk)) {
      return false;
    } else {
      mapa.put(pk, e);
      return true;
    }
  }

  static Estudante buscar(int pk) { // pk = 2023008809
    Estudante e = mapa.get(2023008809);
    return e;
  }
}
