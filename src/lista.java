public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    int[] teste =new int[10];
    List<String> listaNomes = new ArrayList<>();
    List<Integer> listaNumeros = new ArrayList<>();

    listaNomes.add("Eliane");
    System.out.println("Digite o nome do aluno: ");
    listaNomes.add(leitor.nextLine());
    System.out.println("Digite o nome do aluno: ");
    listaNomes.add(leitor.nextLine());
    listaNomes.add(1,"Marcelo");

    System.out.println("Lista conforme entrada de dados");
    //Percorrendo a lista e exibindo os elementos pelo indice
    //for(inicialização; condição; incremento)
    for(int i=0; i< listaNomes.size();i++){
        System.out.println(listaNomes.get(i));
    }

    System.out.println("Lista ordenada");
    Collections.sort(listaNomes);
    //foreach (Tipo variavel: lista)
    for(String nome: listaNomes){
        System.out.println(nome);
    }

    System.out.println(listaNomes);

    listaNumeros.add(50);
    listaNumeros.add(23);
    listaNumeros.add(27);
    listaNumeros.add(48);
    listaNumeros.add(2);
    int soma =0;
    for (Integer num: listaNumeros) {
        soma += num;
    }
    System.out.println("Soma = " + soma);
}