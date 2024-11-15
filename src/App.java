import java.util.List;

class App {
    public static void main(String[] args) {
        List<String> disciplinas = List.of("logica", "ihc", "modular", "discreta");

        // TODO: criar a classe Strings e o método join
        String joined = Strings.join(disciplinas, ",");
        System.out.println(joined); // logica,ihc,modular,discreta

        String r1 = Strings.remove("programação modular", "programação ");
        System.out.println(r1); // modular

        String r2 = Strings.remove("paralelepípedo", "le");
        System.out.println(r2); // parapípedo

        String r3 = Strings.remove("<p><em>interface web</em></p>", List.of("<p>", "</p>", "<em>", "</em>"));
        System.out.println(r3); // interface web

        String dna = "ACGTGACCTTAGGCTTACCGTGAACGTTAGCTTACGGTACGTGACTTGACCGTTAGTACGGCATGACCTTAGGCGATACGTTAG";

        List<String> r4 = Strings.group(dna, 4);
        System.out.println(r4.size()); // 21
        System.out.println(r4); // [ACGT, GACC, TTAG, GCTT, ACCG, TGAA, CGTT, AGCT, TACG, GTAC, GTGA, CTTG, ACCG, TTAG, TACG, GCAT, GACC, TTAG, GCGA, TACG, TTAG]

        List<Integer> r5 = Strings.count(dna, List.of("G", "A"));
        System.out.println(r5.size()); // 2
        System.out.println(r5); // [23, 19]
    }
}