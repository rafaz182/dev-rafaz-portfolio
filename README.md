#

# Playground
Android roadmap
- Components
- Activity
What's an Activity?
Uma activity é a porta de entrada para um aplicativo Android. Devido a dinâmica de uso do dispositivo mobile, em que a interação de um usuário com o aplicativo nem sempre começa no mesmo lugar, as Activities permitem um comportamento não-determinístico, isso significa que caminhos iguais podem levar a lugares diferentes. Veja como exemplo, se você abrir um aplicativo de e-mail na tela inicial, poderá ver uma lista de e-mails. Por outro lado, se você estiver usando um aplicativo de mídia social que inicia seu aplicativo de e-mail, poderá ir diretamente para a tela do aplicativo de e-mail para redigir um e-mail.

Starting with Activity
Para seu app poder utilizar uma activity, é necessário primeiro declara-la no arquivo manifest.

activity_manifest_basic.html

É possível também registrar no sistema operacional uma configuração que associará a sua activity, chamado de Intent. Está é uma ferramenta extremamente poderosa que será mais detalhada nas seção sobre Intents, por hora, vamos configurar um intent na activity para que esta seja aberta ao tocar no ícone do aplicativo.

activity_manifest_launch_intent.html

Lifecycle
As activities no sistema são gerenciadas como pilhas de <Activity>. Quando uma nova atividade é iniciada, ela geralmente é colocada no topo da pilha atual e se torna a atividade em execução -- a activity anterior sempre permanece abaixo dela na pilha e não voltará ao primeiro plano (foreground) até que a nova atividade saia. Pode haver uma ou várias pilhas de atividades visíveis na tela. Ao longo de seu tempo de vida, uma atividade passa por vários estados. Você usa uma série de retornos de chamada para lidar com transições entre estados. As seções a seguir apresentam esses retornos de chamada.


- Fragment
- Service
- Broadcast Receiver
- Content Provider


Compose Playground

