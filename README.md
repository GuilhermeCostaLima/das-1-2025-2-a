# das-1-2025-2-a

## Aula 04/08
O que que é abstração
>Entender ou resolver um problema, simplificando a realidade ao nosso redor, focando no essencial

Código coeso
>Ele faz um trabalho, porém faz ele bem feito. Harmonia entre elementos.

vazada contínua -> herança
<br>
pontilhada -> implementação
<br>
preenchida contínua -> associação

## Aula 05/08
### SOLID
Usar a orientação de objetos de maneira correta

*Single Responsibility Principle*
>Aplicação direta da ideia de coesão. Uma classe deve ter apenas uma única responsabilidade e um único motivo para mudar.
* _Isso facilita a manutenção e evita que uma alteração afete outras funcionalidades._

*Open/Closed Principle*
>O código deve estar aberto para extensão, mas fechado para modificação.
* _Você pode adicionar novas funcionalidades sem alterar o código já existente, evitando erros em sistemas estáveis._

*Liskov Substitution Principle*
>Subclasses devem poder ser usadas no lugar da superclasse sem alterar o funcionamento do sistema.
* _Ou seja, heranças devem manter o comportamento esperado, sem quebrar regras da classe pai._

*Interface Segregation Principle*
>É melhor ter muitas interfaces específicas do que uma única interface genérica com muitos métodos.
* _Assim, classes implementam apenas o que realmente usam, mantendo o código mais limpo._

*Dependency Inversion Principle*
>Dependa de abstrações (interfaces) e não de classes concretas.
* _Isso torna o sistema mais flexível, facilitando testes e mudanças sem afetar o restante do código._

### MVC

#### Model
>Representa os dados e regras de negócio. É onde ficam as informações e lógica.
#### View
>Exibe a interface visual para o usuário. É responsável pela apresentação.
#### Controller
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
Code Interface Segregation Principle
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

## Aula 11/08
### O que é o principio da inversão de dependencia?
* Ambas as classes devem depender de abstrações que definem o comportamento desejado. Com isso pode-se alterar outras classes sem ter alteração nas demais, desde que a interface permaneça a mesma.

### Herança
* Que uma classe utilize caracteristicas de uma classe pai.

### Demeter
* Tenta evitar variáveis globais para que possa ser utilizado variáveis locais. Visando reduzir o acoplamento entre classes e promover o encapsulamento.

## Aula 12/08
### Liskov
* Para manter a herança e a compatibilidade com o pai, codificar o código dos filhos desde que não afete o resto. as subclasses devem se comportar de maneira compatível com a superclasse, permitindo que sejam usadas em qualquer contexto onde a superclasse seja esperada.

## Aula 26/08
#### Cararcteristicas de arquiteturas
* As características de arquitetura são os atributos de qualidade de um sistema, como sua performance, segurança e escalabilidade. Elas definem o "quão bem" o sistema faz o que deve fazer, impactando diretamente a experiência do usuário e a manutenção do software.

#### Decisões arquiteturais
* As decisões arquiteturais são as escolhas mais importantes e difíceis de reverter no design de um sistema. Elas incluem a escolha do estilo de arquitetura (como microsserviços ou monolito), a seleção de tecnologias e a forma como os componentes se comunicam. Essas decisões moldam a estrutura e as características de um sistema.

#### Princípios do design
* Os princípios de design são diretrizes que ajudam a equipe a escrever um código de melhor qualidade, mais limpo e fácil de manter. Eles se aplicam a um nível mais detalhado e guiam a criação de componentes, como as classes. Um exemplo famoso é o SOLID, um conjunto de cinco princípios que promovem um código mais flexível e sustentável.

## Aula 01/09
#### Caracteristicas de arquitetura
1. Não Funcionais
2. Funcionais

#### Decisão Arquiterual
* Escolhe em que arquitetura irá utilizar, decide qual será suas caracteristircas.

1. Tomar decisões de arquiteturas
2. Analisar continuamente a arquitetura
3. Manter-se atualiado com as ultimas tendencias
4. Assegurar a conformidade com as decisoes

_um arquiteto deve orientear quais tecnologias utilizar, baseando-se no seu conhecimento e sabendo quais as melhores para o desenvolvimento do projeto. Levando em consideração desempenho, escalabilidade ou disponibilidade._

* É o papel do arquitero assegurar que seja desenvolvido utilizando os seus princípios documentados e comunicados por ele.

#### DevOps
>Maneira de entregar valor ao meu cliente mais rápido.

[Introdução a DevOps](https://learn.microsoft.com/pt-br/training/modules/introduction-to-devops/2-what-is-devops?ns-enrollment-type=learningpath&ns-enrollment-id=learn.wwl.az-400-work-git-for-enterprise-devops)


