package calculadora;

/**
 * TODO fgarciah This type ...
 *
 */
public class Calculadora {

  private double ans;

  public Calculadora() {

    this.ans = 0;
  }

  public double add(double a, double b) {

    this.ans = a + b;
    return this.ans;

  }

  public double res(double a, double b) {

    this.ans = a - b;
    return this.ans;
  }

  public double addac(double v) {

    this.ans += v;
    return this.ans;

  }

  public double resac(double v) {

    this.ans -= v;
    return v;

  }

  public double acc() {

    this.ans = 0;
    return this.ans;
  }

  public double div(double a, double b) {

    if (b == 0) {
      throw new ArithmeticException("Div 0");
    }
    this.ans = a / b;
    return this.ans;

  }

  public void operacionOptima() {

    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
    }
  }

}
