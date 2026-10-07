import java.util.Scanner;

/**
 * Classe que representa uma questão do Quiz.
 * Contém a pergunta, 5 alternativas (A-E), a resposta correta e regras de validação.
 * 
 * @author Aluno UNIFAN
 */
public class Questao {
    private String pergunta;
    private String opcaoA;
    private String opcaoB;
    private String opcaoC;
    private String opcaoD;
    private String opcaoE;
    private String correta;

    /**
     * Construtor padrão sem parâmetros.
     */
    public Questao() {
        this.pergunta = "";
        this.opcaoA = "";
        this.opcaoB = "";
        this.opcaoC = "";
        this.opcaoD = "";
        this.opcaoE = "";
        this.correta = "";
    }

    /**
     * Construtor completo para instanciação direta da questão.
     * 
     * @param pergunta Texto do enunciado da questão
     * @param opcaoA Texto da opção A
     * @param opcaoB Texto da opção B
     * @param opcaoC Texto da opção C
     * @param opcaoD Texto da opção D
     * @param opcaoE Texto da opção E
     * @param correta Letra referente à alternativa correta (A, B, C, D ou E)
     */
    public Questao(String pergunta, String opcaoA, String opcaoB, String opcaoC, String opcaoD, String opcaoE, String correta) {
        this.pergunta = pergunta;
        this.opcaoA = opcaoA;
        this.opcaoB = opcaoB;
        this.opcaoC = opcaoC;
        this.opcaoD = opcaoD;
        this.opcaoE = opcaoE;
        this.correta = correta;
    }

    // --- Getters e Setters (Encapsulamento) ---

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public String getOpcaoA() {
        return opcaoA;
    }

    public void setOpcaoA(String opcaoA) {
        this.opcaoA = opcaoA;
    }

    public String getOpcaoB() {
        return opcaoB;
    }

    public void setOpcaoB(String opcaoB) {
        this.opcaoB = opcaoB;
    }

    public String getOpcaoC() {
        return opcaoC;
    }

    public void setOpcaoC(String opcaoC) {
        this.opcaoC = opcaoC;
    }

    public String getOpcaoD() {
        return opcaoD;
    }

    public void setOpcaoD(String opcaoD) {
        this.opcaoD = opcaoD;
    }

    public String getOpcaoE() {
        return opcaoE;
    }

    public void setOpcaoE(String opcaoE) {
        this.opcaoE = opcaoE;
    }

    public String getCorreta() {
        return correta;
    }

    public void setCorreta(String correta) {
        this.correta = correta;
    }

    /**
     * Verifica se a resposta fornecida é a correta.
     * 
     * @param resposta Letra digitada pelo usuário
     * @return true se estiver correta, false caso contrário
     */
    public boolean isCorreta(String resposta) {
        if (resposta != null && resposta.equalsIgnoreCase(this.correta)) {
            System.out.println("✅ Parabéns, resposta CORRETA! (Letra: " + this.correta.toUpperCase() + ")");
            System.out.println();
            return true;
        } else {
            System.out.println("❌ Resposta ERRADA!");
            System.out.println("💡 A alternativa correta era a letra: " + this.correta.toUpperCase());
            System.out.println();
            return false;
        }
    }

    /**
     * Lê e valida a resposta digitada pelo usuário via Scanner.
     * 
     * @return String contendo a letra validada (A, B, C, D ou E)
     */
    public String leiaResposta() {
        Scanner ler = new Scanner(System.in);
        String resp;
        do {
            System.out.print("👉 Digite a sua resposta (A, B, C, D ou E): ");
            resp = ler.next();
        } while (!respostaValida(resp));
        return resp.toUpperCase();
    }

    /**
     * Valida se a entrada pertence ao conjunto das 5 alternativas permitidas (A-E).
     * Utiliza expressão regular (Regex) de forma moderna e concisa.
     * 
     * @param resp Entrada informada pelo usuário
     * @return true se a entrada for válida, false caso contrário
     */
    private boolean respostaValida(String resp) {
        if (resp != null && resp.trim().matches("(?i)[A-E]")) {
            return true;
        }
        System.out.println("⚠️ Opção inválida! Por favor, digite apenas uma letra entre A, B, C, D ou E.");
        System.out.println();
        return false;
    }

    /**
     * Exibe a questão e suas alternativas no console com separadores visuais polidos.
     */
    public void escrevaQuestao() {
        System.out.println("================================================================================");
        System.out.println("❓ " + this.pergunta);
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println(" [A] " + formatarOpcao(this.opcaoA, "A"));
        System.out.println(" [B] " + formatarOpcao(this.opcaoB, "B"));
        System.out.println(" [C] " + formatarOpcao(this.opcaoC, "C"));
        System.out.println(" [D] " + formatarOpcao(this.opcaoD, "D"));
        System.out.println(" [E] " + formatarOpcao(this.opcaoE, "E"));
        System.out.println("================================================================================");
    }

    /**
     * Auxiliar para evitar duplicar o prefixo caso a string da opção já comece com a letra.
     */
    private String formatarOpcao(String opcaoText, String letra) {
        if (opcaoText == null) return "";
        String trimmed = opcaoText.trim();
        if (trimmed.toUpperCase().startsWith(letra + ")") || trimmed.toUpperCase().startsWith(letra + " -")) {
            return trimmed.substring(2).trim();
        }
        return trimmed;
    }
}
