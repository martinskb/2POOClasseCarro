/*
2. Classe Carro (Atributos Privados e Getters)
• Crie a classe Carro com atributos privados:
◦ marca (String)
◦ ano (int)
• Crie métodos get para acessar cada atributo.
• No main, crie um carro e exiba suas informações.
 */
public class Main {
    public static void main(String[] args) {
        Carro Carro1 = new Carro("Bugatti",2019);
        Carro Carro2 = new Carro("Porsche",1964);
        System.out.println("Porsche 911,Marca: " + Carro2.getMarca() + ",Ano: " + Carro2.getAno() );
        System.out.println("Bugatti Divo,Marca: " + Carro1.getMarca() + ",Ano: " + Carro1.getAno());

    }
}
