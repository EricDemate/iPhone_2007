# iPhone 2007

Com ajuda do curso da Santander e a Dio eu criei este repositório que contém a modelagem e a implementação das funcionalidades principais do iPhone conforme o vídeo de lançamento de 2007.

## Funcionalidades

- **Reprodutor Musical**
  - Tocar
  - Pausar
  - Selecionar Música

- **Aparelho Telefônico**
  - Ligar
  - Atender
  - Iniciar Correio de Voz

- **Navegador na Internet**
  - Exibir Página
  - Adicionar Nova Aba
  - Atualizar Página

## Diagrama UML

```mermaid
classDiagram
    direction LR
    
    class ReprodutorMusical {
        <<interface>>
        +tocar() : void
        +pausar() : void
        +selecionarMusica(musica : String) : void
    }

    class AparelhoTelefonico {
        <<interface>>
        +ligar(numero : String) : void
        +atender() : void
        +iniciarCorreioVoz() : void
    }

    class NavegadorInternet {
        <<interface>>
        +exibirPagina(url : String) : void
        +adicionarNovaAba() : void
        +atualizarPagina() : void
    }

    class iPhone {
        +tocar() : void
        +pausar() : void
        +selecionarMusica(musica : String) : void
        +ligar(numero : String) : void
        +atender() : void
        +iniciarCorreioVoz() : void
        +exibirPagina(url : String) : void
        +adicionarNovaAba() : void
        +atualizarPagina() : void
    }

    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet
