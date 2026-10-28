package AtividadeStreams.Questao12Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.Map;
import java.util.stream.Collectors;

public class App {
    private static final Scanner sc = new Scanner(System.in);
    private static final List<Autonomo> autonomos = new ArrayList<>();
    static void main(String[] args) {
            int opcao;
            do {
                System.out.println("\n=== MENU ===");
                System.out.println("1 - Cadastrar autônomo");
                System.out.println("2 - Cadastrar serviço");
                System.out.println("3 - Consultar serviços por CPF");
                System.out.println("0 - Sair");
                System.out.print("Opção: ");

                try {
                    opcao = Integer.parseInt(sc.nextLine().trim());
                } catch (NumberFormatException e) {
                    opcao = -1;
                }

                switch (opcao) {
                    case 1 -> cadastrarAutonomo();
                    case 2 -> cadastrarServico();
                    case 3 -> consultarServicos();
                    case 0 -> System.out.println("Encerrando...");
                    default -> System.out.println("Opção inválida!");
                }
            } while (opcao != 0);
        }

        private static Optional<Autonomo> buscarPorCpf(String cpf) {
            return autonomos.stream()
                    .filter(a -> a.getCpf().equals(cpf))
                    .findFirst();
        }

        private static void cadastrarAutonomo() {
            System.out.print("Nome: ");
            String nome = sc.nextLine().trim();
            System.out.print("CPF: ");
            String cpf = sc.nextLine().trim();

            if (buscarPorCpf(cpf).isPresent()) {
                System.out.println("Já existe um autônomo com esse CPF!");
                return;
            }

            autonomos.add(new Autonomo(nome, cpf));
            System.out.println("Autônomo cadastrado com sucesso!");
        }

        private static void cadastrarServico() {
            System.out.print("CPF do autônomo: ");
            String cpf = sc.nextLine().trim();

            Optional<Autonomo> autonomo = buscarPorCpf(cpf);
            if (autonomo.isEmpty()) {
                System.out.println("Autônomo não encontrado!");
                return;
            }

            try {
                System.out.print("Tipo (ELETRICO, HIDRAULICO, ALVENARIA): ");
                TipoServico tipo = TipoServico.valueOf(sc.nextLine().trim().toUpperCase());

                System.out.print("Valor: ");
                double valor = Double.parseDouble(sc.nextLine().trim().replace(",", "."));

                autonomo.get().adicionarServico(new Servico(tipo, valor));
                System.out.println("Serviço cadastrado com sucesso!");
            } catch (IllegalArgumentException e) {
                // pega tanto o tipo inválido (valueOf) quanto o valor inválido (NumberFormatException)
                System.out.println("Dado inválido! Serviço não cadastrado.");
            }
        }

        private static void consultarServicos() {
            System.out.print("CPF do autônomo: ");
            String cpf = sc.nextLine().trim();

            Optional<Autonomo> opt = buscarPorCpf(cpf);
            if (opt.isEmpty()) {
                System.out.println("Autônomo não encontrado!");
                return;
            }

            Autonomo autonomo = opt.get();
            System.out.println("\nAutônomo: " + autonomo.getNome() + " (CPF: " + autonomo.getCpf() + ")");

            if (autonomo.getServicos().isEmpty()) {
                System.out.println("Nenhum serviço cadastrado.");
                return;
            }


            Map<TipoServico, List<Servico>> porTipo = autonomo.getServicos().stream()
                    .collect(Collectors.groupingBy(Servico::getTipo));

            porTipo.forEach((tipo, lista) -> {
                double subtotal = lista.stream().mapToDouble(Servico::getValor).sum();
                System.out.println("\n" + tipo + " (" + lista.size() + " serviço(s))");
                lista.forEach(s -> System.out.printf("  - R$ %.2f%n", s.getValor()));
                System.out.printf("  Subtotal: R$ %.2f%n", subtotal);
            });


            double total = autonomo.getServicos().stream()
                    .mapToDouble(Servico::getValor)
                    .sum();
            System.out.printf("%nTOTAL GERAL: R$ %.2f%n", total);
        }
    }
