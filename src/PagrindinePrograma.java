/**
 * Užduotis 1:
 * 1. Susikurkite Java projektą, susikurkite Programa.java failą (class), tame faile susikurkite main funkciją.
 * 2. Susikurkite Apskritimas.java papildomą klasę.
 * 3. Susikurkite Apskritimas klasei kintamąjį spindulys.
 * 4. Susikurkite (generate...) tai klasei constructor, getter-setter, toString()
 * 5. Susikurkite tai klasei papildomą funkciją, kuri apskaičiuotų klasės skersmenį.
 * 6. Susikurkite tai klasei papildomą funkciją, kuri apskaičiuotų apskritimo plotą.
 * 7. Susikurkite tai klasei papildomą funkciją, kuri apskaičiuotų apskritimo ilgį.
 * 8. Pagrindinėje programoje susikurkite apskritimą, kurio spindulys = 8 ir išveskite į konsolę jo skersmenį, plotą ir ilgį.
 * 9. Pagrindinėje programoje susikurkite apskritimą, kurio spindulys = 27.368 ir išveskite į konsolę jo skersmenį, plotą ir ilgį.
 * 10. Pagrindinėje programoje susikurkite apskritimą, kurio spindulys = 1048.671 ir išveskite į konsolę jo skersmenį, plotą ir ilgį.
 * 11. SUNKESNIS PUNKTAS (jeigu nesigauna, galima praleisti): Pagrindinėje programoje susikurkite apskritimą, kurio spindulys = -25 ir išveskite į konsolę jo skersmenį, plotą ir ilgį. Visi skaičiai neigiami ir iš kitos pusė pagalvokime ar tikrai gali būti toks apskritimas, su neigiamo ilgio spinduliu? Atitinkamai pataisykite setterį ir constructorių
 */
public class PagrindinePrograma {
    public static void main(String[] args) {
        Apskritimas a1 = new Apskritimas(8);
        System.out.println("a1: \n" + a1.skaiciavimaiToString());

        Apskritimas a2 = new Apskritimas(27.368);
        System.out.println("a2: \n" + a2.skaiciavimaiToString());

        Apskritimas a3 = new Apskritimas(1048.671);
        System.out.println("a3: \n" + a3.skaiciavimaiToString());

        Apskritimas a4 = new Apskritimas(-25);
        System.out.println("a4: \n" + a4.skaiciavimaiToString());

    }
}
