# das-1-2025-2-a

# Aula 04/08

O que que é abstração
> Entender ou resolver um problema, simplificando a realidade ao nosso redor, focando no essencial

Código coeso 
> Ele faz um trabalho, porém faz ele bem feito. Harmonia entre elementos.

**vazada contínua** -> herança <br>
**pontilhada** -> implementação <br>
**preenchida contínua** -> associação

# Aula 05/08

### SOLID

**_Usar a orientação de objetos de maneira correta_**

* Single Responsibility Principle
>Aplicação direta da ideia de coesão. Uma classe deve ter apenas uma única responsabilidade e um único motivo para mudar.

\_Isso facilita a manutenção e evita que uma alteração afete outras funcionalidades.\_
* Open/Closed Principle
>O código deve estar aberto para extensão, mas fechado para modificação.

\_Você pode adicionar novas funcionalidades sem alterar o código já existente, evitando erros em sistemas estáveis.\_
* Liskov Substitution Principle
>Subclasses devem poder ser usadas no lugar da superclasse sem alterar o funcionamento do sistema.

\_Ou seja, heranças devem manter o comportamento esperado, sem quebrar regras da classe pai.\_
* Interface Segregation Principle
>É melhor ter muitas interfaces específicas do que uma única interface genérica com muitos métodos.

\_Assim, classes implementam apenas o que realmente usam, mantendo o código mais limpo.\_
* Dependency Inversion Principle
>Dependa de abstrações (interfaces) e não de classes concretas.

\_Isso torna o sistema mais flexível, facilitando testes e mudanças sem afetar o restante do código.\_

### MVC

**Model**
>Representa os dados e regras de negócio. É onde ficam as informações e lógica.

**View**
>Exibe a interface visual para o usuário. É responsável pela apresentação.

**Controller**
>Faz a ponte entre Model e View. Recebe comandos (ações do usuário), processa e atualiza a View e o Model.

## Code Single Responsibility Principle
~~~
package br.univille;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Janelinha extends JFrame{

    private JButton botaozinho;
    private Controlador controlador;

    public Janelinha() {
        setTitle("Eu nao acredito");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        botaozinho = new JButton("ME CLICA");
        controlador = new Controlador();
        botaozinho.addActionListener(controlador);
        
        add(botaozinho);

        setVisible(true);
    }
    public static void main(String[] args) {
        new Janelinha();
    }
}
~~~

## Code Interface Segregation Principle
~~~
package br.univille;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class Controlador implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        meClica();
    }

    private void meClica(){
        JOptionPane.showMessageDialog(null, "NAO ACREDITO");
    }
    
    
}
~~~

# Aula 11/08

O que é o principio da inversão de dependencia?
>Ambas as classes devem depender de abstrações que definem o comportamento desejado. Com isso pode-se alterar outras classes sem ter alteração nas demais, desde que a interface permaneça a mesma.

### Herança 
>Que uma classe utilize caracteristicas de uma classe pai.

### Demeter 
>tenta evitar variáveis globais para que possa ser utilizado variáveis locais. Visando reduzir o acoplamento entre classes e promover o encapsulamento.
