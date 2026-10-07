import java.util.ArrayList;
import java.util.List;

/**
 * Classe principal executora do Projeto QUIZ.
 * Gerencia a apresentação do cabeçalho, a lista de questões, a leitura de respostas,
 * o cálculo de pontuação final com porcentagem e a finalização da sessão.
 * 
 * @author Aluno UNIFAN
 */
public class Main {

    public static void main(String[] args) {
        // 1. Exibição do Cabeçalho Acadêmico
        // TODO: Substitua pelo seu nome completo
        String nomeAluno = "[SEU NOME COMPLETO]";
        String temaQuiz = "Tecnologia e Programação Java";

        Cabecalho cabecalho = new Cabecalho(nomeAluno, temaQuiz);
        cabecalho.exibirCabecalho();

        // 2. Inicialização da Lista de Questões
        List<Questao> lista = new ArrayList<>();

        // --------------------------------------------------------------------------------
        // Cadastro das 15 Questões Obrigatórias (Tema: Tecnologia da Informação / Java)
        // --------------------------------------------------------------------------------

        lista.add(new Questao(
            "1. Qual linguagem de programação é famosa pelo lema 'Write Once, Run Anywhere' (Escreva uma vez, execute em qualquer lugar)?",
            "C++",
            "Python",
            "Java",
            "PHP",
            "Assembly",
            "C"
        ));

        lista.add(new Questao(
            "2. Qual componente da plataforma Java é responsável por converter o bytecode em código de máquina executável?",
            "JDK (Java Development Kit)",
            "JVM (Java Virtual Machine)",
            "JRE (Java Runtime Environment)",
            "IDE (Integrated Development Environment)",
            "SDK (Software Development Kit)",
            "B"
        ));

        lista.add(new Questao(
            "3. Qual é o modificador de acesso em Java que permite visibilidade apenas dentro da própria classe?",
            "public",
            "protected",
            "default (package-private)",
            "private",
            "static",
            "D"
        ));

        lista.add(new Questao(
            "4. Qual das alternativas a seguir declara corretamente um array de inteiros em Java?",
            "int[] numeros = new int[5];",
            "array numeros = new int(5);",
            "int numeros = new Array(5);",
            "vector<int> numeros = new vector(5);",
            "list int numeros = [5];",
            "A"
        ));

        lista.add(new Questao(
            "5. Qual método da classe Scanner é utilizado para ler uma palavra ou token digitado no console?",
            "nextLine()",
            "next()",
            "readInt()",
            "scan()",
            "getWord()",
            "B"
        ));

        lista.add(new Questao(
            "6. Na Programação Orientada a Objetos (POO), qual conceito descreve a capacidade de um método assumir diferentes formas?",
            "Encapsulamento",
            "Herança",
            "Polimorfismo",
            "Abstração",
            "Instanciação",
            "C"
        ));

        lista.add(new Questao(
            "7. Qual palavra-chave em Java é utilizada para herdar atributos e métodos de uma superclasse?",
            "implements",
            "extends",
            "inherits",
            "super",
            "import",
            "B"
        ));

        lista.add(new Questao(
            "8. Qual é o valor padrão (default) atribuído a uma variável de instância do tipo boolean em Java?",
            "true",
            "false",
            "null",
            "0",
            "undefined",
            "B"
        ));

        lista.add(new Questao(
            "9. Qual estrutura de dados garante a inserção na ordem LIFO (Last In, First Out - Último a entrar, primeiro a sair)?",
            "Fila (Queue)",
            "Pilha (Stack)",
            "Lista Encadeada (LinkedList)",
            "Tabela Hash (HashMap)",
            "Árvore Binária (BinaryTree)",
            "B"
        ));

        lista.add(new Questao(
            "10. Qual comando do Git é utilizado para criar uma cópia de um repositório remoto na máquina local?",
            "git push",
            "git commit",
            "git clone",
            "git merge",
            "git init",
            "C"
        ));

        lista.add(new Questao(
            "11. O que significa o acrônimo HTTP na arquitetura de redes de computadores?",
            "HyperText Transfer Protocol",
            "High Transfer Text Process",
            "HyperTech Terminal Protocol",
            "Host Text Transport Process",
            "HyperText Transition Password",
            "A"
        ));

        lista.add(new Questao(
            "12. Qual classe do pacote java.util é utilizada para armazenar coleções dinâmicas de elementos em Java?",
            "ArrayList",
            "System",
            "Math",
            "String",
            "Object",
            "A"
        ));

        lista.add(new Questao(
            "13. Qual o resultado da expressão lógica (true && false) || (true || false) em Java?",
            "false",
            "null",
            "true",
            "Erro de compilação",
            "0",
            "C"
        ));

        lista.add(new Questao(
            "14. Qual palavra-chave é usada em Java para impedir que uma classe seja herdada ou que um método seja sobrescrito?",
            "static",
            "abstract",
            "final",
            "transient",
            "synchronized",
            "C"
        ));

        lista.add(new Questao(
            "15. Qual porta padrão é comumente utilizada para conexões HTTP não criptografadas na web?",
            "443",
            "21",
            "22",
            "80",
            "8080",
            "D"
        ));

        // 3. Execução do Quiz e Contagem de Acertos
        int acertos = 0;
        int totalQuestoes = lista.size();

        System.out.println("🚀 Iniciando o Quiz! Responda às " + totalQuestoes + " questões abaixo:\n");

        for (int i = 0; i < totalQuestoes; i++) {
            System.out.println("📍 QUESTÃO " + (i + 1) + " DE " + totalQuestoes);
            Questao q = lista.get(i);
            q.escrevaQuestao();

            String respostaUsuario = q.leiaResposta();
            if (q.isCorreta(respostaUsuario)) {
                acertos++;
            }
        }

        // 4. Processamento dos Resultados e Cálculo de Porcentagem
        double porcentagem = ((double) acertos / totalQuestoes) * 100.0;

        System.out.println("════════════════════════════════════════════════════════════════════════════════");
        System.out.println("                           RESULTADO FINAL DO QUIZ                             ");
        System.out.println("════════════════════════════════════════════════════════════════════════════════");
        System.out.printf("📊 Total de Acertos : %d de %d%n", acertos, totalQuestoes);
        System.out.printf("📈 Aproveitamento   : %.2f%%\n", porcentagem);
        System.out.println("--------------------------------------------------------------------------------");

        if (porcentagem >= 70.0) {
            System.out.println("🎉 Desempenho excelente! Você demonstrou ótimo conhecimento.");
        } else if (porcentagem >= 50.0) {
            System.out.println("👍 Bom trabalho! Mas ainda há espaço para revisão de conteúdos.");
        } else {
            System.out.println("📚 Recomendamos revisar a matéria e tentar novamente.");
        }

        System.out.println("════════════════════════════════════════════════════════════════════════════════");
        System.out.println("🙏 Obrigado por participar do Quiz! Bons estudos!");
        System.out.println("================================================================================");
    }
}
