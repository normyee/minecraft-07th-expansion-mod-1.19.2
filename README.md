# Minecraft 07th Expansion Mod 1.19.2

Este é um mod simples de Minecraft baseado em "When They Cry" que adiciona os seguintes itens:

- Machado da Rena
- Bastão de Baseball do Keiichi
- Manopla da Miyao Mitake de Ciconia
- Kakera como item

Este mod foi feito usando Minecraft Forge na versão 1.19.2.

## Setup

Para rodar o código, siga os seguintes passos:

1. Abra o seu terminal e navegue até a pasta onde você extraiu o arquivo zip do mod.

2. Escolha entre utilizar o Eclipse ou o IntelliJ:

  - Se preferir usar o Eclipse:
    1. Rode o comando a seguir: `gradlew genEclipseRuns` (`./gradlew genEclipseRuns` se você estiver no Mac/Linux).
    2. Abra o Eclipse, clique em Import > Existing Gradle Project > Select Folder ou rode `gradlew eclipse` para gerar o projeto.

  - Se preferir usar o IntelliJ:
    1. Abra o IntelliJ e importe o projeto.
    2. Selecione o arquivo build.gradle e importe-o.
    3. Rode o comando a seguir: `gradlew genIntellijRuns` (`./gradlew genIntellijRuns` se você estiver no Mac/Linux).
    4. Atualize o projeto Gradle no IntelliJ se necessário.

Se em algum momento você estiver com problemas ou faltar bibliotecas em seu IDE, rode `gradlew --refresh-dependencies` para atualizar o cache local. `gradlew clean` limpa tudo e reseta o processo (isso não afeta o seu código).

## Recursos adicionais

- [Documentação da comunidade](https://mcforge.readthedocs.io/en/latest/gettingstarted/)
- [Vídeo de instalação do LexManos](https://www.youtube.com/watch?v=8VEdtQLuLO0)
- [Fórum do Forge](https://forums.minecraftforge.net/)
- [Discord do Forge](https://discord.gg/UvedJ9m)
