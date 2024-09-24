# Guia de Contribuição

Obrigado por considerar contribuir com este projeto! Para garantir uma colaboração organizada e eficiente, siga este guia antes de submeter qualquer contribuição.

## Requisitos Obrigatórios

Antes de começar a contribuir, é **obrigatório** seguir estas diretrizes:

1. Seguir o padrão **Git Flow** para controle de versão.
2. **Ler este guia de contribuição** completamente.
3. Escrever **testes unitários** para cada nova funcionalidade ou correção de bug.
4. **Testes de UI** são opcionais de início, mas a UI deve ser **testada manualmente** em um emulador ou dispositivo físico.
5. Usar **Linter** para manter o código limpo e padronizado. Utilize:
    - Android: **KtLint**
    - iOS: **SwiftLint**

## Preparando o Ambiente

Siga estas instruções para configurar seu ambiente de desenvolvimento antes de começar:

### Para Android:

1. Instale o **Android Studio Koala 2024.1.2**.
2. Instale o plugin **KtLint** para garantir a padronização do código.
3. Configure um emulador Android ou utilize um dispositivo físico para testar.


## Padrões de Branches

Utilizamos o seguinte padrão para criação de branches no projeto:

- **feat/nome-da-feature**: Para novas funcionalidades.
    - Exemplo: `feat/buscar-por-produtos`
- **fix/nome-do-bug**: Para correção de bugs.
    - Exemplo: `fix/erro-de-carregamento`
- **refactor/nome-do-refactor**: Para refatoração de código existente.
    - Exemplo: `refactor/melhorar-performance-da-busca`
- **docs/nome-da-doc**: Para alterações na documentação.
    - Exemplo: `docs/atualizar-readme`


## Padrões de Commits

Ao fazer commits, siga os seguintes padrões para manter o histórico do projeto organizado:

- **feat**: Para adicionar uma nova funcionalidade.
    - Exemplo: `feat: adicionar busca por produtos`
- **fix**: Para correções de bugs.
    - Exemplo: `fix: corrigir erro ao carregar lista de produtos`
- **docs**: Para mudanças na documentação.
    - Exemplo: `docs: atualizar guia de contribuição`
- **style**: Para mudanças que não afetam a lógica do código (formatação, vírgulas, etc.).
    - Exemplo: `style: ajustar indentação no arquivo Produto.kt`
- **refactor**: Para refatorações que melhoram o código sem mudar a funcionalidade.
    - Exemplo: `refactor: otimizar função de ordenação`
- **test**: Para adicionar ou corrigir testes.
    - Exemplo: `test: adicionar testes unitários para a classe Produto`
- **chore**: Para tarefas repetitivas ou pequenas atualizações (configurações, builds, etc.).
    - Exemplo: `chore: atualizar a versao da dependencia do Room`

## Como Contribuir

1. Faça um **fork** do repositório.
2. Crie uma **branch** para a sua contribuição (utilize os padrões descritos acima).
3. Escreva os testes unitários correspondentes.
4. Se aplicável, faça o teste manual da UI no emulador ou dispositivo.
5. Confirme que o Linter está sendo seguido corretamente (use KtLint ou SwiftLint).
6. Envie um **Pull Request (PR)** com uma descrição clara e detalhada do que foi feito, e marque a sua PR com o tipo correto:
    - **feature**, **fix**, **refactor**, etc.

## Dicas para Colaboradores

- Certifique-se de que seu código siga as **boas práticas de clean code**.
- Verifique se todos os testes passaram antes de submeter sua PR.
- Leia a documentação e o código existente antes de iniciar uma nova feature.
- Siga o padrão de commits e branches para manter o projeto organizado.
- Sinta-se à vontade para abrir uma **issue** se tiver dúvidas ou problemas.

## Testes e Qualidade

- Todos os novos recursos devem ter **testes unitários**.
- **Testes de UI** são opcionais no início, mas são bem-vindos.
- Teste a UI manualmente usando um emulador ou dispositivo físico antes de enviar sua PR.

## Obrigado!

Agradecemos a sua contribuição para o projeto! Se tiver dúvidas, entre em contato com os mantenedores ou abra uma issue no GitHub.