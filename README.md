# Minecraft 07th Expansion Mod 1.19.2

Este é um mod de Minecraft, utilizando o Forge, baseado em "When They Cry" que adiciona os seguintes itens:

- Machado da Rena<br>
![Hatchet](https://i.imgur.com/aYty1wo.png)
- Taco de Baseball do Keiichi<br>
![Bat](https://i.imgur.com/HBizieJ.png)
- Manopla de Miyao Mitake de Ciconia<br>
![Gauntlet](https://i.imgur.com/zgJaNSg.png)
- Kakera como item<br>
![Kakera](https://i.imgur.com/BLpeNBt.png)

O item "Manopla" do mod tem uma funcionalidade especial, assim como no jogo de onde esse item vem, dá habilidade ao jogador de voar ao segurar o item. Enquanto aos outros items, "Kakera" é apenas um enfeite que remete ao "Mar de Kakera" na série When They Cry, machado é um item clássico da série que a personagem "Rena" utiliza, e por fim, o taco é também um item memorável da série.

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
OBS: JDK deve estar na versão 16 ou superior para ser compatível com o projeto Open-source.

## Recursos adicionais

- [Documentação da comunidade](https://mcforge.readthedocs.io/en/latest/gettingstarted/)
- [Vídeo de instalação do LexManos](https://www.youtube.com/watch?v=8VEdtQLuLO0)
- [Fórum do Forge](https://forums.minecraftforge.net/)
- [Discord do Forge](https://discord.gg/UvedJ9m)
