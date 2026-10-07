/**
 * Classe responsável por exibir o cabeçalho acadêmico formatado do projeto QUIZ.
 * Atende aos requisitos institucionais da UNIFAN e do Prof. Brenno Pimenta da Costa.
 * 
 * @author Aluno UNIFAN
 */
public class Cabecalho {

    private String faculdade;
    private String curso;
    private String aluno;
    private String professor;
    private String tema;

    /**
     * Construtor padrão inicializando os dados padrão da UNIFAN.
     */
    public Cabecalho() {
        this.faculdade = "Centro Universitário Alfredo Nasser (UNIFAN)";
        this.curso = "Engenharia de Software / Segurança da Informação";
        this.aluno = "[NOME DO ALUNO]";
        this.professor = "Prof. Brenno Pimenta da Costa";
        this.tema = "Tecnologia da Informação e Programação Java";
    }

    /**
     * Construtor customizado para definição flexível das informações.
     */
    public Cabecalho(String aluno, String tema) {
        this();
        this.aluno = aluno;
        this.tema = tema;
    }

    // Getters e Setters
    public String getFaculdade() { return faculdade; }
    public void setFaculdade(String faculdade) { this.faculdade = faculdade; }

    public String getCurso() { return curso; }
    public void setCurso(String curso) { this.curso = curso; }

    public String getAluno() { return aluno; }
    public void setAluno(String aluno) { this.aluno = aluno; }

    public String getProfessor() { return professor; }
    public void setProfessor(String professor) { this.professor = professor; }

    public String getTema() { return tema; }
    public void setTema(String tema) { this.tema = tema; }

    /**
     * Exibe o cabeçalho acadêmico no console com bordas em moldura ASCII.
     */
    public void exibirCabecalho() {
        System.out.println("╔══════════════════════════════════════════════════════════════════════════════╗");
        System.out.println("║                        AVALIAÇÃO ACADÊMICA - QUIZ 2026                       ║");
        System.out.println("╠══════════════════════════════════════════════════════════════════════════════╣");
        System.out.println("║  🏛️  INSTITUIÇÃO : " + alinharTexto(faculdade, 57) + "║");
        System.out.println("║  🎓 CURSO       : " + alinharTexto(curso, 57) + "║");
        System.out.println("║  👨‍🎓 ALUNO       : " + alinharTexto(aluno, 57) + "║");
        System.out.println("║  👨‍🏫 PROFESSOR   : " + alinharTexto(professor, 57) + "║");
        System.out.println("║  🎯 TEMA DO QUIZ: " + alinharTexto(tema, 57) + "║");
        System.out.println("╚══════════════════════════════════════════════════════════════════════════════╝");
        System.out.println();
    }

    /**
     * Método utilitário para alinhar o texto dentro da caixa ASCII.
     */
    private String alinharTexto(String texto, int largura) {
        if (texto == null) texto = "";
        if (texto.length() > largura) {
            return texto.substring(0, largura - 3) + "...";
        }
        return String.format("%-" + largura + "s", texto);
    }
}
