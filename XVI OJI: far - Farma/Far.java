import java.util.Scanner;

public class Far {

    static int x, y;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Utils.cls();
        Utils.i("Bajtek ma farmę a na niej pewną liczbę kur i krów. Razem wszystkie te zwierzęta mają dokładnie \uD835\uDC4B głów oraz \uD835\uDC4C nóg.\n" +
                "Wszystkie kury mają po dwie nogi, a wszystkie krowy mają po cztery nogi. Oczywiście zarówno kury, jak i krowy mają po\n" +
                "jednej głowie. Ile kur oraz ile krów ma Bajtek?\n" +
                "Napisz program, który wczyta wartości \uD835\uDC4B oraz \uD835\uDC4C i wyznaczy liczbę kur oraz liczbę krów na farmie Bajtka.\n");

        System.out.print(Utils.CYAN + "Wprowadź liczbę głów > " + Utils.GREEN);
        x = Integer.parseInt(s.next());

        System.out.print(Utils.CYAN + "\n\nWprowadź liczbę nóg > " + Utils.GREEN);
        y = Integer.parseInt(s.next());

        // TODO https://sio2.mimuw.edu.pl/c/oij16-1/p/far/
    }
}
