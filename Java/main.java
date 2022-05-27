// WFLO
public class main {

  public static void main(String argv[]) {
      try {
          WindScenario ws = new WindScenario(argv[0]);
          KusiakLayoutEvaluator wfle = new KusiakLayoutEvaluator();
          wfle.initialize(ws);
          SRIE algorithm = new SRIE(wfle);
          algorithm.run(); // optional, name of method 'run' provided on submission
          // algorithm can also just use constructor
      } catch (Exception e) {
          e.printStackTrace();
      }
  }
}
