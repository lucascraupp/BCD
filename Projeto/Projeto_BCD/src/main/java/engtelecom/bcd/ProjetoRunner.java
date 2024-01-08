package engtelecom.bcd;

import engtelecom.bcd.model.*;
import engtelecom.bcd.model.acampamento.Acampamentos;
import engtelecom.bcd.model.distintivo.Distintivos;
import engtelecom.bcd.model.distintivo.ProgressoDistintivo;
import engtelecom.bcd.model.distintivo.RequisitosDistintivo;
import engtelecom.bcd.model.especialidade.Areas;
import engtelecom.bcd.model.especialidade.Especialidades;
import engtelecom.bcd.model.especialidade.ProgressoEspecialidade;
import engtelecom.bcd.model.especialidade.RequisitosEspecialidade;
import engtelecom.bcd.model.insignia.Insignias;
import engtelecom.bcd.model.insignia.ProgressoInsignia;
import engtelecom.bcd.model.insignia.RequisitosInsignia;
import engtelecom.bcd.repository.*;
import engtelecom.bcd.repository.distintivo.DistintivosRepository;
import engtelecom.bcd.repository.distintivo.ProgressoDistintivoRepository;
import engtelecom.bcd.repository.distintivo.RequisitosDistintivoRepository;
import engtelecom.bcd.repository.especialidade.AreasRepository;
import engtelecom.bcd.repository.especialidade.EspecialidadesRepository;
import engtelecom.bcd.repository.especialidade.ProgressoEspecialidadeRepository;
import engtelecom.bcd.repository.especialidade.RequisitosEspecialidadeRepository;
import engtelecom.bcd.repository.insignia.InsigniasRepository;
import engtelecom.bcd.repository.insignia.ProgressoInsigniaRepository;
import engtelecom.bcd.repository.insignia.RequisitosInsigniaRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
@Slf4j
@RequiredArgsConstructor
public class ProjetoRunner implements CommandLineRunner {
    @Autowired
    private TipoSanguineoRepository tipoSanguineoRepository;

    @Autowired
    private AlergiasRepository alergiasRepository;

    @Autowired
    private InsigniasRepository insigniasRepository;

    @Autowired
    private RequisitosInsigniaRepository requisitosInsigniaRepository;

    @Autowired
    private DistintivosRepository distintivosRepository;

    @Autowired
    private RequisitosDistintivoRepository requisitosDistintivoRepository;

    @Autowired
    private AreasRepository areasRepository;

    @Autowired
    private EspecialidadesRepository especialidadesRepository;

    @Autowired
    private RequisitosEspecialidadeRepository requisitosEspecialidadeRepository;

    @Autowired
    private ResponsavelRepository responsavelRepository;

    @Autowired
    private JovemRepository jovemRepository;

    @Autowired
    private ProgressoInsigniaRepository progressoInsigniaRepository;

    @Autowired
    private ProgressoDistintivoRepository progressoDistintivoRepository;

    @Autowired
    private ProgressoEspecialidadeRepository progressoEspecialidadeRepository;

    @Autowired
    private AcampamentosRepository acampamentosRepository;


    // --------------------------------------------------------------------------------------------- //
    // --------------------------------- Povoando o Banco de Dados --------------------------------- //

    private void geraTipoSanguineo() {
        TipoSanguineo a_pos = new TipoSanguineo("A+");
        tipoSanguineoRepository.save(a_pos);
        TipoSanguineo a_neg = new TipoSanguineo("A-");
        tipoSanguineoRepository.save(a_neg);

        TipoSanguineo b_pos = new TipoSanguineo("B+");
        tipoSanguineoRepository.save(b_pos);
        TipoSanguineo b_neg = new TipoSanguineo("B-");
        tipoSanguineoRepository.save(b_neg);

        TipoSanguineo o_pos = new TipoSanguineo("O+");
        tipoSanguineoRepository.save(o_pos);
        TipoSanguineo o_neg = new TipoSanguineo("O-");
        tipoSanguineoRepository.save(o_neg);

        TipoSanguineo ab_pos = new TipoSanguineo("AB+");
        tipoSanguineoRepository.save(ab_pos);
        TipoSanguineo ab_neg = new TipoSanguineo("AB-");
        tipoSanguineoRepository.save(ab_neg);
    }

    private void geraAlergias() {
        Alergias aranha = new Alergias("Aranha");
        alergiasRepository.save(aranha);

        Alergias amendoim = new Alergias("Amendoim");
        alergiasRepository.save(amendoim);

        Alergias gluten = new Alergias("Glúten");
        alergiasRepository.save(gluten);

        Alergias acaro = new Alergias("Ácaro");
        alergiasRepository.save(acaro);

        Alergias ovo = new Alergias("Ovo");
        alergiasRepository.save(ovo);
    }

    private void geraRequisitosInsignia(Insignias insignia) {
        List<String> requisitos = new ArrayList<>();

        switch (insignia.getNome()) {
            case "INSÍGNIA DO APRENDER":
                requisitos.add("Organizar o espaço de estudo adequadamente, observando a sua iluminação, " +
                        "local para acondicionamento dos materiais e ambiente.");
                requisitos.add("Ter o seu material escolar devidamente organizado, demonstrado cuidados " +
                        "com os livros, cadernos e demais materiais.");
                requisitos.add("Destinar o tempo adequado para seu estudo e tarefas de casa, relatando aos pais, " +
                        "a Akela ou outro Velho Lobo quanto tempo utiliza para essas atividades.");
                requisitos.add("Participar, como Lobinho, de pelo menos uma edição do Projeto Educação Escoteira com sua Alcateia, " +
                        "ou de outra atividade em conjunto com escolas realizada pela sua Alcateia ou pelo seu " +
                        "Grupo Escoteiro/Seção Autônoma.");
                requisitos.add("Participar ativamente de pelo menos duas atividades especiais em sua escola " +
                        "(Ex.: Festa Junina, Feira de Ciências, Excursão, etc.) e mostrar fotos ou relatório para a Alcateia.");
                requisitos.add("Apoiar um colega de classe em alguma tarefa ou ajudá-lo a aprender algum conteúdo que tenha dificuldade.");
                requisitos.add("Conversar com seus pais , Akela ou outro Velho Lobo sobre sua participação na escola, " +
                        "seu interesse pelos estudos e sobre os pontos que podem ser melhorados para ser um melhor aluno.");
                break;

            case "INSÍGNIA DO CONESUL":
                requisitos.add("Indicar, no mapa mundi, onde estão localizados os demais países do Cone Sul, sabendo " +
                        "reconhecer suas bandeiras e explicar o significado das cores de cada uma delas.");
                requisitos.add("Pesquisar a história de algo importante por sua utilidade que tenha sido inventado " +
                        "em um dos países do Cone Sul.");
                requisitos.add("Degustar pelo menos um prato típico de outro país do Cone Sul, conhecendo sua história e origem.");
                requisitos.add("Visitar exposições ou feiras culturais referentes a outros países do Cone Sul.");
                requisitos.add("Conhecer uma lenda ou conto de outro país do Cone Sul e contá-la para Alcateia.");
                requisitos.add("Conhecer a principal dança típica de pelo menos dois países do Cone Sul.");
                requisitos.add("Ir a uma peça de teatro cujo roteiro seja de outro país do Cone Sul e não esteja adaptado.");
                requisitos.add("Assistir uma animação ou filme nacional de outro país do Cone Sul.");
                requisitos.add("Enviar e receber uma correspondência, ou e-mail, contendo uma foto de sua Alcateia, " +
                        "para um lobinho de outro país do Cone Sul.");
                requisitos.add("Entrevistar alguém que esteja morando, ou tenha morado em algum país do Cone Sul.");
                requisitos.add("Descobrir quais distintivos poderia conquistar se fosse de outro país do Cone Sul.");
                requisitos.add("Ensinar a Alcateia a cantar uma canção escoteira de outro país do Cone Sul.");
                requisitos.add("Conhecer as principais terminologias do Ramo Lobinho (Alcateia, Matilha, acampamento, etc) " +
                        "em castelhano ou em outro idioma falado em países do Cone Sul, como o guarani.");
                requisitos.add("Conhecer os nomes e os símbolos das Associações Escoteiras dos países que integram o Cone Sul.");
                break;

            case "INSÍGNIA DA BOA AÇÃO":
                requisitos.add("Conhecer os principais problemas sociais de sua rua ou bairro e conversar com seus " +
                        "pais ou velhos lobos sobre como você poderia contribuir para resolvê-los.");
                requisitos.add("Conhecer instituições de sua comunidade que realizam ações assistenciais a pessoas " +
                        "necessitadas ou orientação para a melhoria da vida das pessoas, procurando saber de que " +
                        "forma sua Alcateia poderia ajudá-las.");
                requisitos.add("Participar de pelo menos uma edição do Mutirão Nacional Escoteiro de Ação Comunitária com " +
                        "sua Alcateia ou de outra atividade de ação comunitária realizada pela sua Alcateia ou " +
                        "por seu Grupo Escoteiro.");
                requisitos.add("Perceber os eventuais perigos a que estão expostos os lobinhos em uma excursão ou " +
                        "acampamento/acantonamento e ajudar a aplicar as regras de segurança para evitá-los.");
                requisitos.add("Participar de pelo menos três boas ações coletivas com sua Alcateia, contribuindo " +
                        "com ideias e ações para o planejamento e execução das atividades.");
                requisitos.add("Participar de uma ação comunitária promovida por alguma instituição de sua comunidade: " +
                        "igreja, clube, escola, posto de saúde, polícia, bombeiros, casa comercial, etc. " +
                        "e fazer um relatório sobre essa participação.");
                requisitos.add("Planejar e executar uma boa ação, diferente das realizadas anteriormente, que seja útil " +
                        "em sua Alcateia, casa, escola ou comunidade, com duração mínima de um mês, " +
                        "apresentando posteriormente os resultados para sua Alcateia.");
                break;

            case "INSÍGNIA DA LUSOFONIA":
                requisitos.add("Pesquisar os temperos e especiarias típicos dos países lusófonos, também presentes no Brasil.");
                requisitos.add("Pesquisar a fauna e flora típicos dos países lusófonos, também presentes no Brasil.");
                requisitos.add("Pesquisar utensílios e invenções utilizadas no Brasil, criados em algum país lusófonos.");
                requisitos.add("Indicar, no mapa mundi, onde estão localizados os países lusófonos e reconhecer suas respectivas bandeiras.");
                requisitos.add("Visitar exposições ou feiras culturais referentes a outros países lusófonos.");
                requisitos.add("Degustar pelo menos uma refeição típica de outro país lusófono, conhecendo sua história e origem.");
                requisitos.add("Ir a uma peça de teatro cujo roteiro seja de outro país lusófono e não esteja adaptado.");
                requisitos.add("Assistir um espetáculo (circo, show musical etc) que seja originário de outro país lusófono.");
                requisitos.add("Conhecer uma lenda ou conto de um outro país lusófono, e contá-la para sua Alcateia.");
                requisitos.add("Entrevistar alguém que tenha morado, ou esteja morando, em um país lusófono.");
                requisitos.add("Ver um filme nacional ou animação de outro país Lusófono.");
                requisitos.add("Enviar e receber uma correspondência, ou e-mail, contendo uma foto de sua Alcateia, para um lobinho de outro país lusófono.");
                requisitos.add("Descobrir quais distintivos o Lobinho poderia conquistar se fosse de outro país lusófono.");
                requisitos.add("Fazer uma lista de termos escoteiros utilizados em outro país lusófono.");
                requisitos.add("Conhecer o símbolo das Associações Escoteiras dos países lusófonos.");
                break;

            default:
                System.out.println("Insíginia não cadastrada no banco de dados!");
        }

        for (String req : requisitos) {
            RequisitosInsignia requisito = new RequisitosInsignia(insignia, req);
            requisitosInsigniaRepository.save(requisito);
        }
    }

    private void geraInsignias() {
        Insignias aprender = new Insignias("INSÍGNIA DO APRENDER");
        insigniasRepository.save(aprender);
        geraRequisitosInsignia(aprender);

        Insignias conesul = new Insignias("INSÍGNIA DO CONESUL");
        insigniasRepository.save(conesul);
        geraRequisitosInsignia(conesul);

        Insignias boaAcao = new Insignias("INSÍGNIA DA BOA AÇÃO");
        insigniasRepository.save(boaAcao);
        geraRequisitosInsignia(boaAcao);

        Insignias lusofonia = new Insignias("INSÍGNIA DA LUSOFONIA");
        insigniasRepository.save(lusofonia);
        geraRequisitosInsignia(lusofonia);
    }

    private void geraRequisitosDistintivo(Distintivos distintivo) {
        String requisito = "";

        switch (distintivo.getNome()) {
            case "Pata-tenra":
                requisito = "Quando completar o Caminho do Integrar é sinal que você já está pronto(a) para a " +
                        "Cerimônia de Integração e para fazer a sua Promessa de Lobinho. Os “Velhos Lobos” vão preparar " +
                        "um momento especial para apresentar você e sua família para todo o grupo escoteiro. " +
                        "Nesta cerimônia você receberá o lenço escoteiro e alguns distintivos para costurar em sua camisa ou blusa.";

                break;

            case "Saltador":
                requisito = "Para conquistar o distintivo de Lobo Saltador, você precisa fazer pelo menos a metade das " +
                        "atividades propostas no seu guia/aplicativo.";

                break;

            case "Rastreador":
                requisito = "Para conquistar o distintivo de Lobo Rastreador, você precisa fazer as atividades que restam, " +
                        "e assim cumprir 100% das atividades.";

                break;

            case "Caçador":
                requisito = "Para conquistar o distintivo de Lobo Caçador, você deve realizar a metade das atividades deste bloco.";

                break;

            default:
                System.out.println("Distintivo não cadastrado no banco de dados!");
                break;
        }

        if (!requisito.isEmpty()) {
            RequisitosDistintivo requisitosDistintivo = new RequisitosDistintivo(distintivo, requisito);
            requisitosDistintivoRepository.save(requisitosDistintivo);
        }

    }

    private void geraDistintivos() {
        Distintivos pata_tenra = new Distintivos("Pata-tenra");
        distintivosRepository.save(pata_tenra);
        geraRequisitosDistintivo(pata_tenra);

        Distintivos saltador = new Distintivos("Saltador");
        distintivosRepository.save(saltador);
        geraRequisitosDistintivo(saltador);

        Distintivos rastreador = new Distintivos("Rastreador");
        distintivosRepository.save(rastreador);
        geraRequisitosDistintivo(rastreador);

        Distintivos cacador = new Distintivos("Caçador");
        distintivosRepository.save(cacador);
        geraRequisitosDistintivo(cacador);
    }

    private void geraRequisitosEspecialidade(Especialidades especialidade) {
        List<String> requisitos = new ArrayList<>();
        switch (especialidade.getEspecialidade()) {
            case "Arqueologia":
                requisitos.add("Apresentar, de maneira ilustrada, o que é arqueologia e qual sua importância.");
                requisitos.add("Apresentar 4 (quatro) diferentes zonas arqueológicas, sendo duas delas brasileiras e duas de outros países.");
                requisitos.add("Preparar e apresentar uma palestra ilustrada, tratando de uma das zonas arqueológicas do país, " +
                        "dando enfoque nos seguintes aspectos: localização, estado atual e importância histórica, social, econômica e turística.");
                requisitos.add("Apresentar a biografia de 2 (dois) arqueólogos importantes na história mundial, " +
                        "destacando seus principais trabalhos, suas descobertas mais importantes e a corrente teórica em que trabalhavam.");
                requisitos.add("Expor as teorias associadas à evolução humana e ao povoamento das Américas, decorrente de estudos arqueológicos, " +
                        "citando as principais descobertas e onde ocorreram.");
                requisitos.add("Apresentar 1 (um) estudo sobre a vida de 1 (um) povo antigo de sua livre escolha, " +
                        "baseado em pesquisas arqueológicas e ilustrando com fotos ou gravuras de escavações, documentos, " +
                        "monumentos ou objetos deixados por ele.");
                break;

            case "Astronáutica":
                requisitos.add("Apresentar a história da conquista do espaço.");
                requisitos.add("Apresentar 1 (um) pequeno experimento que demonstre a Lei de Ação e Reação, que explica o " +
                        "funcionamento básico de 1 (um) foguete.");
                requisitos.add("Construir uma base de lançamento de foguetes de garrafas PET (foguete de água) e " +
                        "executar 1 (um) lançamento, seguindo as regras de segurança adequadas.");
                requisitos.add("Explicar o conceito do canhão de Newton.");
                requisitos.add("Explicar o funcionamento do Sistema de Posicionamento Global (GPS).");
                requisitos.add("Explicar o que é uma Estação Espacial, além de apresentar a história de uma das estações espaciais construídas até hoje.");
                requisitos.add("Apresentar a biografia de 1 (um) dos personagens da conquista espacial.");
                requisitos.add("Fazer uma apresentação, utilizando material midiático (cartazes, multimídia, etc.), acerca de 5 (cinco) " +
                        "satélites artificiais que se encontram no espaço sideral, explicando quais são os tipos e suas funções. " +
                        "Destacar sua importância nos dias de hoje.");
                requisitos.add("Explicar o que foi a “Missão Centenário” e citar quais foram os experimentos realizados nesta missão.");
                break;

            case "Anatomia Humana":
                requisitos.add("Conhecer a estrutura geral de uma célula humana e criar uma maquete ou modelo com massa de modelar, incluindo seus principais componentes.");
                requisitos.add("Explicar a relação entre as células, os tecidos, os órgãos, os sistemas e o corpo humano.");
                requisitos.add("Apresentar uma pesquisa sobre uma doença escolhida pelo seu examinador, que possa afetar 1 (um) " +
                        "dos sistemas do corpo humano, nomeando as estruturas que podem ser afetadas.");
                requisitos.add("Citar os componentes do sistema respiratório, e apresentar os malefícios que o ar poluído pode ocasionar a este sistema.");
                requisitos.add("Conhecer as estruturas do sistema digestório e apresentar como funciona o processo de digestão dos alimentos " +
                        "e onde os diferentes nutrientes são absorvidos.");
                requisitos.add("Apresentar as classes de nutrientes alimentares e a importância de uma alimentação balanceada para o corpo humano.");
                requisitos.add("Apresentar como é composto o sistema músculo-esquelético e a importância de praticar atividades físicas regularmente.");
                requisitos.add("Conhecer a estrutura e os componentes do aparelho circulatório, nomear as partes do coração, " +
                        "diferenciar as artérias e as veias e saber a localização das principais artérias do organismo.");
                requisitos.add("Conhecer os neurônios envolvidos no processo de percepção da dor e explicar como ocorre o reflexo de retirada da mão de uma superfície quente.");
                requisitos.add("Apresentar as diferenças entre 1 (um) embrião e 1 (um) feto, buscando fotos que ilustrem os diferentes momentos da gestação.");
                requisitos.add("Montar 1 (um) panfleto contendo informações sobre como o cigarro pode fazer mal à saúde, " +
                        "que estruturas do corpo humano podem ser afetadas, e distribuir cópias na sua escola, comunidade ou Grupo Escoteiro.");
                requisitos.add("Conhecer as principais estruturas do aparelho urinário do homem e da mulher, e explicar como a água ingerida pela boca pode ser eliminada do organismo.");
                requisitos.add("Citar os principais estudiosos de anatomia humana e expor, em seu Grupo Escoteiro, desenhos de partes do corpo humano, nomeando cada uma delas.");
                requisitos.add("Fazer uma pesquisa sobre como eram realizadas as primeiras dissecções de cadáveres para o estudo da anatomia humana.");
                requisitos.add("Dissecar uma peça de frango mostrando quais estruturas do corpo é possível reconhecer e nomear cada uma delas.");
                break;

            case "Anime":
                requisitos.add("Escolher 1 (um) anime de sua preferência e apresentá-lo, discorrendo sobre sua trama, " +
                        "personagens, criadores, artistas envolvidos, época de criação, etc.");
                requisitos.add("Realizar uma apresentação sobre a história dos animes, destacando seu surgimento, " +
                        "o desenvolvimento no país de origem, os principais títulos, os principais autores e artistas e sua chegada e exibição no Brasil.");
                requisitos.add("Organizar uma exposição ilustrada com personagens de animes de sua preferência, citando suas características, a que obra pertencem e quem foi seu criador.");
                requisitos.add("Descrever ao menos 5 (cinco) gêneros de anime, explicando as particularidades de cada um.");
                requisitos.add("Explicar a importância da restrição de faixa etária em determinados animes.");
                requisitos.add("Apresentar 1 (um) relato audiovisual contendo ao menos 5 (cinco) animes assistidos por você. " +
                        "O relato deve conter o título original, e se houver o nacional, ano de produção, país de origem, " +
                        "gênero e uma breve sinopse de cada 1 (um) dos animes.");
                requisitos.add("Demonstrar conhecimento sobre as principais tecnologias utilizadas na produção, gravação e reprodução de animes.");
                requisitos.add("Apresentar 1 (um) trabalho sobre 3 (três) grandes festivais de anime pelo mundo, sendo pelo menos 1 (um) brasileiro, " +
                        "e explicar as particularidades de cada 1 (um) deles.");
                requisitos.add("Promover uma sessão de vídeo, preferencialmente para sua seção ou matilha/patrulha, para assistir 1 (um) anime.");
                break;

            case "Budismo":
                requisitos.add("Apresentar a história do Buda Shakyamuni e a origem do budismo.");
                requisitos.add("Apresentar uma breve explicação sobre as 3 (três) grandes linhas de pensamento Budistas, " +
                        "ou 3 (três) Veículos:Hinayana, Mahayana e Tantrayana.");
                requisitos.add("Explicar o que são os Sutras e citar três.");
                requisitos.add("Explicar o que são Mantras, escolher 1 (um) deles e recitar para o examinador.");
                requisitos.add("Definir o que é joia tríplice e o significado de tomar refúgio na jóia tríplice.");
                requisitos.add("Explicar o que são bodisatvas, relatando a história e características de 1 (um) deles.");
                requisitos.add("Apresentar pelo menos 3 (três) preceitos budistas.");
                requisitos.add("Relacionar os fundamentos budistas com 3 (três) artigos da Lei Escoteira.");
                requisitos.add("Visitar 1 (um) templo e participar de uma cerimônia budista.");
                break;

            case "Arte em Origami":
                requisitos.add("Apresentar 1 (um) relatório sobre o significado da palavra “origami”, a origem desta arte e do papel, descrevendo seus benefícios.");
                requisitos.add("Montar esquema que apresente a linguagem do origami (símbolos utilizados na dobradura: Linha do vale, linha da montanha, " +
                        "virar, girar, dobrar por dentro, dobrar por fora, plissagem, achatar ou afundar).");
                requisitos.add("Apresentar por escrito bibliografia sobre o Origami: sobre 2 (dois) autores famosos nacionais ou " +
                        "internacionais e possuir pelo menos 1 (um) livro de origami.");
                requisitos.add("Expor seus trabalhos de origami sozinho ou com outros origamistas em outro local, " +
                        "como escola, biblioteca, associações ou exposição internacional.");
                requisitos.add("Visitar uma exposição de origami mostrando fotos ou participar de “workshop” de origami apresentando, posteriormente, as dobraduras feitas.");
                requisitos.add("Utilizar origamis como decoração de 1 (um) evento, preferencialmente, promovido pelo Grupo Escoteiro, seção ou matilha/patrulha.");
                break;

            case "Arco e Flecha":
                requisitos.add("Elaborar 1 (um) trabalho escrito sobre arco e flecha, citando sua origem, evolução histórica e características.");
                requisitos.add("Apresentar 1 (um) trabalho sobre a regulamentação da prática do arco e flecha como atividade esportiva.");
                requisitos.add("Demonstrar todos os tipos de arcos, tipos de flechas, tipos de pontas e tipos de competição.");
                requisitos.add("Demonstrar conhecimento sobre ancoragem, postura, nomenclatura e medidas envolvidas no esporte.");
                requisitos.add("Ter conhecimento das regras de segurança para manejar 1 (um) arco e flecha.");
                requisitos.add("Explicar o que faz a Associação Nacional e Internacional de Arco e Flecha e o tipo de competições desse esporte.");
                requisitos.add("Ter conhecimento prático de arco e flecha mediante curso de tiro com arco e flecha, com prática mínima de 6h. " +
                        "Este item é obrigatório para qualquer Nível onde se conquiste itens que vão além da teoria fazendo uso do arco e flecha.");
                requisitos.add("Participar de uma prova simulada de tiro de arco e flecha com pontuação mínima: " +
                        "sendo 50% das flechas pontuando a 10 (dez) metros- Alvo FITA ou IFAA e 30% das flechas pontuando a quinze metros Alvo FITA ou IFAA.");
                requisitos.add("Participar de prova com monitoramento de juiz habilitado, item esse que só poderá ser efetuado mediante participação anterior em uma competição de tiro de arco e flecha.");
                break;

            case "Capoeira":
                requisitos.add("Explicar as diferenças entre os estilos de capoeira, Angola e Regional.");
                requisitos.add("Contar a origem histórica da capoeira através de uma palestra para jovens da mesma faixa etária.");
                requisitos.add("Demonstrar que sabe tocar os instrumentos musicais da capoeira (berimbau e pandeiro) e opcionais (agogô, reco-reco e atabaque).");
                requisitos.add("Cantar 3 (três) músicas de capoeira.");
                requisitos.add("Demonstrar movimentos básicos da capoeira (ginga, meia-lua, benção, esquivas, etc.).");
                requisitos.add("Convidar seu grupo de capoeira para realizar uma roda no seu Grupo Escoteiro e demonstrar seu jogo na mesma.");
                break;

            case "Boxe":
                requisitos.add("Contar a história do boxe – nacional e mundial – para seu examinador.");
                requisitos.add("Descrever suas regras e demonstrar as 5 (cinco) técnicas básicas de golpes no boxe, " +
                        "citando cada golpe e demonstrando com 1 (um) professor e/ou outro praticante juvenil.");
                requisitos.add("Demonstrar 3 (três) tipos de saídas de golpes, 4 (quatro) tipos de defesa de golpes e duas defesas de mão.");
                requisitos.add("Listar, para seu examinador, nomes dos maiores nomes boxeadores da história, destacando suas principais características.");
                requisitos.add("Apresentar todas as federações (brasileiras e internacionais) de boxe e como se organizam suas categorias.");
                requisitos.add("Discorrer sobre os benefícios que o Boxe pode trazer para sua saúde e sua formação pessoal, apontando também os cuidados que se deve ter quanto à sua prática.");
                break;

            case "Almoxarifado":
                requisitos.add("Demonstrar noções básicas do funcionamento de 1 (um) almoxarifado.");
                requisitos.add("Selecionar corretamente o material para 1 (um) acampamento da seção.");
                requisitos.add("Visitar 1 (um) almoxarifado de 1 (um) órgão público ou empresa privada entrevistando seu responsável, " +
                        "para conhecer a importância e a responsabilidade da função.");
                requisitos.add("Encarregar-se do material da seção durante 1 (um) acampamento de final de semana.");
                requisitos.add("Administrar o almoxarifado da seção por 1 (um) período mínimo de 3 (três) meses.");
                requisitos.add("Organizar 1 (um) cadastro de fornecedores do material utilizado pela seção.");
                requisitos.add("Realizar o inventário do material da seção, efetuando 1 (um) levantamento do valor em moeda corrente, " +
                        "para o caso de ser necessária a substituição de qualquer item.");
                requisitos.add("Executar a manutenção apropriada no material de campo da seção.");
                requisitos.add("Organizar o processo de controle de estoque do material utilizado pela seção.");
                break;

            case "Ferramentas de Corte":
                requisitos.add("Identificar 6 (seis) tipos de ferramentas de corte e sua finalidade de utilização.");
                requisitos.add("Demonstrar como afiar e conservar 4 (quatro) tipos de ferramentas de corte, entre elas faca e machadinha.");
                requisitos.add("Demonstrar as formas de utilização de 1 (um) canivete multifunção e de uma faca estilo punhal.");
                requisitos.add("Demonstrar a forma de condução de canivetes e facas.");
                requisitos.add("Demonstrar a forma de utilização de 1 (um) facão, machadinha e machado.");
                requisitos.add("Construir uma bainha, em couro ou material similar, para faca e facão.");
                requisitos.add("Demonstrar a forma de condução de facão, machadinha e machado.");
                requisitos.add("Demonstrar a forma de utilização de 1 (um) serrote.");
                requisitos.add("Conhecer as regras de segurança para manuseio de ferramentas de corte e construir 1 (um) canto do lenhador conforme regras de segurança.");
                requisitos.add("Descascar de forma correta, com emprego de canivete e faca, duas laranjas e duas maçãs.");
                requisitos.add("Construir, com emprego da faca, 2 (dois) espetos para assar ovo.");
                requisitos.add("Construir, com emprego de facão e machadinha, no mínimo 4 (quatro) estacas para emprego em toldo, demonstrando a rigidez e utilidade da obra construída.");
                break;

            case "Cidadania do Mundo":
                requisitos.add("Pesquisar sobre a Organização Mundial do Movimento Escoteiro (WOSM), localização do Escritório Mundial, suas Regiões e respectivos Escritórios.");
                requisitos.add("Identificar em 1 (um) planisfério pelo menos cinquenta países em que o Movimento Escoteiro tenha existência legal, em todas as Regiões Escoteiras.");
                requisitos.add("Reconhecer o emblema escoteiro e a bandeira nacional de pelo menos trinta deles e explicar o significado do emblema oficial da Organização Mundial do Movimento Escoteiro.");
                requisitos.add("Manter correspondência com 1 (um) escoteiro estrangeiro durante 6 ((seis) meses (mínimo de 5 (cinco) cartas), " +
                        "procurando aumentar seus conhecimentos gerais sobre a geografia, a história e os costumes do país em questão, " +
                        "não só por meio da correspondência, mas também pela leitura de livros.");
                requisitos.add("Acampar com escoteiros estrangeiros, em atividades nacionais ou internacionais.");
                requisitos.add("Participar de alguma atividade de caráter internacional promovida por uma Organização Escoteira ou Organização Internacional (ONU, UNESCO, UNICEF, UNHCR etc.).");
                requisitos.add("Escrever 1 (um) artigo sobre os problemas atuais do mundo e como o Escotismo pode colaborar na busca de solução.");
                requisitos.add("Identificar os 5 (cinco) países que possuem os maiores contingentes escoteiros na relação membros potenciais / membros efetivos e a razão deste sucesso.");
                requisitos.add("Pesquisar e apresentar uma palestra sobre os principais Parques do Escotismo Mundial.");
                requisitos.add("Montar 1 (um) painel com pelo menos quinze insígnias escoteiras estrangeiras.");
                requisitos.add("Pesquisar e apresentar pelo menos 3 (três) exemplos de trabalhos comunitários desenvolvidos por associações escoteiras estrangeiras.");
                requisitos.add("Relatar os esforços de 3 (três) organizações que se ocupem em promover a paz mundial, identificando sua metodologia de atuação e abrangência.");
                break;

            case "Aquicultura":
                requisitos.add("Saber o que é aquicultura, quais suas características e quais espécies são considerados pescado.");
                requisitos.add("Conhecer os cuidados básicos exigidos pela espécie de aquicultura a que se dedica.");
                requisitos.add("Conhecer as modalidades de cultura e os métodos mais aplicados, pesquisando sobre os mais utilizados em sua região.");
                requisitos.add("Manter uma criação, durante 1 (um) período adequado à espécie a que se dedica, e fazer 1 (um) prato para ser degustado pela seção.");
                requisitos.add("Conhecer os sistemas de alimentação, reprodução, prevenção de doenças e tratamento de águas ou condições de clima e correnteza.");
                requisitos.add("Visitar uma aquicultura e elaborar relatório para apresentação à seção, destacando os beneficias resultantes para a comunidade local.");
                break;

            case "Arte Digital":
                requisitos.add("Apresentar à sua seção 1 (um) programa de desenho digital a sua escolha, demonstrando " +
                        "o uso de diversas ferramentas disponíveis, como texturas e filtros de cor.");
                requisitos.add("Explicar a importância do trabalho com layers, demonstrando a formatação de uma imagem utilizando esta ferramenta.");
                requisitos.add("Organizar uma exposição em sua seção, contendo pelo menos 5 (cinco) de seus trabalhos.");
                requisitos.add("Explicar ou à seção a importância dos efeitos de luz e sombra e quais as melhores técnicas para se conseguir os resultados desejados.");
                requisitos.add("Explicar o que é e como funciona uma mesa digitalizadora, demonstrando seu uso à seção.");
                requisitos.add("Fazer uma apresentação à matilha ou matilha/patrulha sobre a importância da paleta de cores selecionada para 1 (um) trabalho, " +
                        "utilizando recursos midiáticos de escolha livre (vídeos, apresentações de slides, cartazes.)");
                break;

            case "Babá":
                requisitos.add("Demonstrar que conhece os telefones de emergência de sua localidade.");
                requisitos.add("Descrever regras de segurança a serem observadas quando cuidando de crianças e bebês.");
                requisitos.add("Explicar os cuidados de higiene a observar no trato com crianças e bebês.");
                requisitos.add("Ter noções básicas de primeiros socorros.");
                requisitos.add("Demonstrar como trocar a fralda de 1 (um) bebê.");
                requisitos.add("Preparar uma mamadeira.");
                requisitos.add("Distrair duas crianças, por mais de 4 (quatro) horas.");
                requisitos.add("Explicar como tratar com doenças infantis comuns.");
                requisitos.add("Trabalhar como voluntário durante pelo menos 5 (cinco) períodos, totalizando vinte horas, " +
                        "em uma creche, maternal ou jardim de infância, descrevendo seu funcionamento.");
                break;

            default:
                System.out.println("Especialidade não cadastrada no banco de dados!");
        }

        for (String req : requisitos) {
            RequisitosEspecialidade requisito = new RequisitosEspecialidade(especialidade, req);
            requisitosEspecialidadeRepository.save(requisito);
        }
    }

    private void montaTabelaEspecialidade(Areas area, String esp) {
        Especialidades especialidade = new Especialidades(area, esp);
        especialidadesRepository.save(especialidade);
        geraRequisitosEspecialidade(especialidade);
    }

    private void geraEspecialidades(Areas area) {
        switch (area.getArea()) {
            case "Ciência e Tecnologia":
                montaTabelaEspecialidade(area, "Arqueologia");
                montaTabelaEspecialidade(area, "Astronáutica");
                montaTabelaEspecialidade(area, "Anatomia Humana");
                break;

            case "Cultura":
                montaTabelaEspecialidade(area, "Anime");
                montaTabelaEspecialidade(area, "Budismo");
                montaTabelaEspecialidade(area, "Arte em Origami");
                break;

            case "Desportos":
                montaTabelaEspecialidade(area, "Arco e Flecha");
                montaTabelaEspecialidade(area, "Capoeira");
                montaTabelaEspecialidade(area, "Boxe");
                break;

            case "Habilidades Escoteiras":
                montaTabelaEspecialidade(area, "Almoxarifado");
                montaTabelaEspecialidade(area, "Ferramentas de Corte");
                montaTabelaEspecialidade(area, "Cidadania do Mundo");
                break;

            case "Serviços":
                montaTabelaEspecialidade(area, "Aquicultura");
                montaTabelaEspecialidade(area, "Arte Digital");
                montaTabelaEspecialidade(area, "Babá");
                break;

            default:
                System.out.println("Área não cadastrada no banco de dados!");
        }
    }

    private void geraAreas() {
        Areas ciencTec = new Areas("Ciência e Tecnologia");
        areasRepository.save(ciencTec);
        geraEspecialidades(ciencTec);

        Areas cultura = new Areas("Cultura");
        areasRepository.save(cultura);
        geraEspecialidades(cultura);

        Areas desportos = new Areas("Desportos");
        areasRepository.save(desportos);
        geraEspecialidades(desportos);

        Areas habEscot = new Areas("Habilidades Escoteiras");
        areasRepository.save(habEscot);
        geraEspecialidades(habEscot);

        Areas servicos = new Areas("Serviços");
        areasRepository.save(servicos);
        geraEspecialidades(servicos);
    }

    private void geraResponsavel() {
        String nome = "Rickey Little";
        String cpf = "628.462.126-43";
        String telefone = "(48) 98149-1949";
        String email = "rickey.little@gmail.com";
        Responsavel responsavel = new Responsavel(nome, cpf, telefone, email);
        responsavelRepository.save(responsavel);

        nome = "Dan Baumbach III";
        cpf = "105.087.240-15";
        telefone = "(49) 97370-4847";
        email = "baubach@hotmail.com";
        responsavel = new Responsavel(nome, cpf, telefone, email);
        responsavelRepository.save(responsavel);

        nome = "Teddy Harris";
        cpf = "681.467.611-78";
        telefone = "(51) 99512-3438";
        email = "teddyh@hotmail.com";
        responsavel = new Responsavel(nome, cpf, telefone, email);
        responsavelRepository.save(responsavel);

        nome = "Shannon Hoppe";
        cpf = "407.440.046-40";
        telefone = "(48) 3235-8287";
        email = "shoppe@gmail.com";
        responsavel = new Responsavel(nome, cpf, telefone, email);
        responsavelRepository.save(responsavel);

        nome = "Tyesha Torphy";
        cpf = "870.510.875-68";
        telefone = "(73) 99011-6840";
        email = "torphy@yahoo.com";
        responsavel = new Responsavel(nome, cpf, telefone, email);
        responsavelRepository.save(responsavel);
    }

    private boolean montaTabelaJovem(String tipoSang, String nome, Date dataNasc, String endereco, String cpf, String telefone, String email, List<String> alergias, List<String> cpfResponsaveis) {
        Optional<TipoSanguineo> tipoSanguineo = tipoSanguineoRepository.findByTipoSanguineo(tipoSang);

        if (tipoSanguineo.isPresent()) {
            TipoSanguineo tipSang = tipoSanguineo.get();

            Optional<Jovem> j = jovemRepository.findByCpf(cpf);

            if (!j.isPresent()) {
                Jovem jovem = new Jovem(tipSang, nome, dataNasc, endereco, cpf, telefone, email);

                if (!alergias.isEmpty()) {
                    for (String a : alergias) {
                        Optional<Alergias> alergia = alergiasRepository.findByAlergia(a);

                        if (alergia.isPresent()) {
                            Alergias alerg = alergia.get();

                            jovem.adicionaAlergia(alerg);
                        } else {
                            System.out.println("A alergia \"" + a + "\" não está cadastrada no banco de dados!");
                        }
                    }
                }

                for (String cpfs : cpfResponsaveis) {
                    Optional<Responsavel> cpfRes = responsavelRepository.findByCpf(cpfs);

                    if (cpfRes.isPresent()) {
                        Responsavel responsavel = cpfRes.get();

                        jovem.adicionaResponsavel(responsavel);
                    } else {
                        System.out.println("Não há um responsável com o CPF \"" + "\" cadastrado no banco de dados!");
                    }
                }

                Set<Responsavel> responsaveis = jovem.getResponsaveis();

                if (responsaveis.isEmpty()) {
                    return false;
                } else {
                    jovemRepository.save(jovem);
                    return true;
                }
            }
        } else {
            System.out.println("Tipo sanguíneo" + tipoSang + "não cadastrado no banco de dados!");
        }

        return false;
    }

    private void geraJovem() {
        montaTabelaJovem("A-",
                "Ernest Will",
                new Date("2011/08/14"),
                "3117 Stokes Flats",
                "865.411.217-45",
                "(727) 936-3855 x5780",
                "will.ernest@gmail.com",
                new ArrayList<>(List.of("Ovo", "Ácaro")),
                new ArrayList<>(List.of("628.462.126-43")));
        montaTabelaJovem("A+",
                "Onie Gulgowski",
                new Date("2009/11/16"),
                "238 Parisian Square",
                "683.083.207-16",
                "(641) 817-0445 x5535",
                "onie@yahoo.com",
                new ArrayList<>(List.of("Amendoim", "Aranha", "Glúten")),
                new ArrayList<>(List.of("105.087.240-15", "681.467.611-78")));
        montaTabelaJovem("O+",
                "Francis Haag",
                new Date("2014/07/04"),
                "58314 Anjelica Landing",
                "401.571.884-42",
                "(267) 872-4230",
                "haag.francis@gmail.com",
                new ArrayList<>(),
                new ArrayList<>(List.of("407.440.046-40", "870.510.875-68", "105.087.240-15")));
        montaTabelaJovem("AB-",
                "Cayla Upton",
                new Date("2011/08/15"),
                "5715 Murazik Forge",
                "724.724.140-30",
                "(865) 301-6946 x0909",
                "caylaup@outlook.com",
                new ArrayList<>(List.of("Aranha")),
                new ArrayList<>(List.of("407.440.046-40")));
        montaTabelaJovem("O-",
                "Margherita Cruickshank",
                new Date("2009/03/24"),
                "25852 Corkery Bridge",
                "258.668.417-62",
                "(574) 626-0169",
                "marg.crui@gmail.com",
                new ArrayList<>(List.of("Glúten")),
                new ArrayList<>(List.of("870.510.875-68")));
    }

    private void montaTabelaProgressoInsignia(Integer idJovem, Integer idInsignia, String dia) {
        Optional<Jovem> j = jovemRepository.findById(idJovem);
        Optional<List<RequisitosInsignia>> req = requisitosInsigniaRepository.findByInsignia_IdInsignias(idInsignia);

        if (j.isPresent() && req.isPresent()) {
            Jovem jovem = j.get();
            List<RequisitosInsignia> requisitosInsignias = req.get();

            for (RequisitosInsignia requisitosInsignia : requisitosInsignias) {
                Date data = new Date(dia);

                ProgressoInsignia progressoInsignia = new ProgressoInsignia(jovem, requisitosInsignia, data);
                progressoInsigniaRepository.save(progressoInsignia);
            }
        }
    }

    private void geraProgressoInsignia() {
        montaTabelaProgressoInsignia(1, 1, "2018/01/01");
        montaTabelaProgressoInsignia(2, 3, "2020/12/05");
    }

    private void montaTabelaProgressoDistintivo(Integer idJovem, Integer idRequisito, String d) {
        Optional<Jovem> j = jovemRepository.findById(idJovem);
        Optional<RequisitosDistintivo> r = requisitosDistintivoRepository.findById(idRequisito);

        if (j.isPresent() && r.isPresent()) {
            Jovem jovem = j.get();
            RequisitosDistintivo requisitosDistintivo = r.get();

            Date data = new Date(d);

            ProgressoDistintivo progressoDistintivo = new ProgressoDistintivo(jovem, requisitosDistintivo, data);
            progressoDistintivoRepository.save(progressoDistintivo);
        }
    }

    private void geraProgressoDistintivo() {
        montaTabelaProgressoDistintivo(1, 1, "2018/03/02");
        montaTabelaProgressoDistintivo(1, 2, "2019/03/02");
        montaTabelaProgressoDistintivo(1, 3, "2020/03/02");
        montaTabelaProgressoDistintivo(1, 4, "2021/03/02");

        montaTabelaProgressoDistintivo(2, 1, "2018/03/02");
        montaTabelaProgressoDistintivo(2, 2, "2019/03/02");
        montaTabelaProgressoDistintivo(2, 3, "2020/03/02");
        montaTabelaProgressoDistintivo(2, 4, "2021/03/02");

        montaTabelaProgressoDistintivo(3, 1, "2018/03/02");

        montaTabelaProgressoDistintivo(4, 1, "2018/03/02");
        montaTabelaProgressoDistintivo(4, 2, "2019/03/02");

        montaTabelaProgressoDistintivo(5, 1, "2018/03/02");
        montaTabelaProgressoDistintivo(5, 2, "2019/03/02");
        montaTabelaProgressoDistintivo(5, 3, "2020/03/02");
    }

    private void montaTabelaProgressoEspecialidade(Integer idJovem, Integer idEspecialidade, String d) {
        Optional<Jovem> j = jovemRepository.findById(idJovem);
        Optional<List<RequisitosEspecialidade>> r = requisitosEspecialidadeRepository.findByEspecialidade_IdEspecialidades(idEspecialidade);

        if (j.isPresent() && r.isPresent()) {
            Jovem jovem = j.get();
            List<RequisitosEspecialidade> requisitos = r.get();

            Date data = new Date(d);

            for (RequisitosEspecialidade requisitosEspecialidade : requisitos) {
                ProgressoEspecialidade progressoEspecialidade = new ProgressoEspecialidade(jovem, requisitosEspecialidade, data);
                progressoEspecialidadeRepository.save(progressoEspecialidade);
            }
        }
    }

    private void geraProgressoEspecialidade() {
        montaTabelaProgressoEspecialidade(1, 1, "2018/06/02");
        montaTabelaProgressoEspecialidade(1, 4, "2018/07/02");
        montaTabelaProgressoEspecialidade(1, 7, "2018/08/02");
        montaTabelaProgressoEspecialidade(1, 10, "2018/09/02");
        montaTabelaProgressoEspecialidade(1, 13, "2018/10/02");

        montaTabelaProgressoEspecialidade(2, 1, "2018/06/02");
        montaTabelaProgressoEspecialidade(2, 3, "2018/07/02");
        montaTabelaProgressoEspecialidade(2, 7, "2018/08/02");
        montaTabelaProgressoEspecialidade(2, 10, "2018/09/02");
        montaTabelaProgressoEspecialidade(2, 13, "2018/10/02");

        montaTabelaProgressoEspecialidade(3, 15, "2018/06/02");

        montaTabelaProgressoEspecialidade(4, 9, "2018/06/02");
        montaTabelaProgressoEspecialidade(4, 8, "2018/07/02");

        montaTabelaProgressoEspecialidade(5, 14, "2018/06/02");
        montaTabelaProgressoEspecialidade(5, 2, "2018/07/02");
        montaTabelaProgressoEspecialidade(5, 5, "2018/08/02");
    }

    private void montaTabelaAcampamentos(Jovem jovem, Date data) {
        Acampamentos acampamento = new Acampamentos(jovem, data);
        this.acampamentosRepository.save(acampamento);
    }

    private void geraAcampamentos() {
        Optional<Jovem> j = this.jovemRepository.findById(1);
        if (j.isPresent()) {
            Jovem jovem = j.get();
            montaTabelaAcampamentos(jovem, new Date("2018/03/09"));
            montaTabelaAcampamentos(jovem, new Date("2018/04/09"));
            montaTabelaAcampamentos(jovem, new Date("2018/05/09"));
        }

        j = this.jovemRepository.findById(2);
        if (j.isPresent()) {
            Jovem jovem = j.get();
            montaTabelaAcampamentos(jovem, new Date("2018/03/09"));
            montaTabelaAcampamentos(jovem, new Date("2018/04/09"));
            montaTabelaAcampamentos(jovem, new Date("2018/05/09"));
        }

        j = this.jovemRepository.findById(3);
        if (j.isPresent()) {
            Jovem jovem = j.get();
            montaTabelaAcampamentos(jovem, new Date("2018/05/09"));
        }
    }

    private void geraTabelas() {
        System.out.println("Povoando o banco de dados...");
        geraTipoSanguineo();
        geraAlergias();
        geraInsignias();
        geraDistintivos();
        geraAreas();
        geraResponsavel();
        geraJovem();
        geraProgressoInsignia();
        geraProgressoDistintivo();
        geraProgressoEspecialidade();
        geraAcampamentos();
        System.out.println("Banco de dados povoado com sucesso!");
    }


    // --------------------------------------------------------------------------------------------- //
    // ----------------------------------------- Aplicação ----------------------------------------- //

    private void registraJovem() {
        Scanner input = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = input.nextLine();

        System.out.print("Data de nascimento: ");
        String dataNasc = input.nextLine();

        System.out.print("Endereço: ");
        String endereco = input.nextLine();

        System.out.print("CPF: ");
        String cpf = input.nextLine();

        System.out.print("Telefone: ");
        String telefone = input.nextLine();

        System.out.print("Email: ");
        String email = input.nextLine();

        System.out.print("Tipo Sanguíneo: ");
        String tipoSanguineo = input.nextLine();

        System.out.print("CPF do(s) responsável(eis) separado por vírgula e sem espaço: ");
        String cpfResponsaveis = input.nextLine();

        System.out.print("Alergias separadas por vírgula e sem espaço: ");
        String alergias = input.nextLine();

        List<String> cpfResp = new ArrayList<>(List.of(cpfResponsaveis.split(",")));
        List<String> alergia = new ArrayList<>(List.of(alergias.split(",")));

        try {
            String dia, mes, ano;
            dia = dataNasc.split("/")[0];
            mes = dataNasc.split("/")[1];
            ano = dataNasc.split("/")[2];

            Date data = new Date(ano + "/" + mes + "/" + dia);

            boolean criou = montaTabelaJovem(tipoSanguineo, nome, data, endereco,
                    cpf, telefone, email, alergia, cpfResp);

            if (criou) {
                System.out.println("Jovem adicionado com sucesso");
            } else {
                System.out.println("Não foi possível registrar o jovem");
            }
        } catch (Exception e) {
            System.out.println("Não foi possível registrar o jovem");
        }
    }

    private Integer escolheEspecialidade(Scanner input) {
        System.out.println("Escolha uma das especialidades abaixo:");
        Iterable<Especialidades> esp = especialidadesRepository.findAll();

        List<Integer> idEspecialidades = new ArrayList<>();

        for (Especialidades e : esp) {
            idEspecialidades.add(e.getIdEspecialidades());
            System.out.println(e.getIdEspecialidades() + " - " + e.getEspecialidade());
        }

        Integer i = input.nextInt();

        if (idEspecialidades.contains(i)) {
            return i;
        } else {
            return -1;
        }
    }

    private Integer escolheRequisitoEspecialidade(Scanner input, Integer idEspecialidade) {
        System.out.println("Escolha o requisito:");

        Iterable<RequisitosEspecialidade> reqEsp = requisitosEspecialidadeRepository.findAllByEspecialidade_IdEspecialidades(idEspecialidade);

        List<Integer> idReq = new ArrayList<>();
        for (RequisitosEspecialidade requisitosEspecialidade : reqEsp) {
            System.out.println(requisitosEspecialidade.getIdRequisitosEspecialidade() + " - " + requisitosEspecialidade.getRequisito());
            idReq.add(requisitosEspecialidade.getIdRequisitosEspecialidade());
        }

        Integer i = input.nextInt();

        if (idReq.contains(i)) {
            return i;
        } else {
            return -1;
        }
    }

    private boolean possuiRequisitosEspecialidade(String cpf, Integer idRequisito) {
        Iterable<ProgressoEspecialidade> progressoJovem = progressoEspecialidadeRepository.findAllByJovem_Cpf(cpf);

        for (ProgressoEspecialidade progresso : progressoJovem) {
            if (progresso.getIdRequisitoEspecialidade().equals(idRequisito)) {
                return false;
            }
        }

        return true;
    }

    private void registraProgressaoEspecialidade() {
        Scanner input = new Scanner(System.in);

        Integer idEspecialidade = escolheEspecialidade(input);
        if (idEspecialidade == -1) {
            System.out.println("Especialidade não encontrada!");
            return;
        }

        Integer idRequisito = escolheRequisitoEspecialidade(input, idEspecialidade);
        if (idRequisito == -1) {
            System.out.println("Requisito não encontrado!");
            return;
        }

        Optional<RequisitosEspecialidade> reqEsp = requisitosEspecialidadeRepository.findById(idRequisito);
        if (!reqEsp.isPresent()) {
            System.out.println("Requisito não está presente no bancom de dados!");
            return;
        }

        System.out.print("Informe o CPF do jovem: ");
        input = new Scanner(System.in);
        String cpf = input.nextLine();

        Optional<Jovem> j = jovemRepository.findByCpf(cpf);
        if (!j.isPresent()) {
            System.out.println("Jovem não cadastrado no banco de dados!");
            return;
        }

        if (!possuiRequisitosEspecialidade(cpf, idRequisito)) {
            System.out.println("O jovem já possui este requisito");
            return;
        }

        System.out.print("Informe a data de conclusão do requisito: ");
        String data = input.nextLine();

        try {
            String dia, mes, ano;
            dia = data.split("/")[0];
            mes = data.split("/")[1];
            ano = data.split("/")[2];

            Date dataConclusao = new Date(ano + "/" + mes + "/" + dia);
            Jovem jovem = j.get();
            RequisitosEspecialidade requisitosEspecialidade = reqEsp.get();

            ProgressoEspecialidade progressoEspecialidade = new ProgressoEspecialidade(jovem, requisitosEspecialidade, dataConclusao);
            progressoEspecialidadeRepository.save(progressoEspecialidade);

            System.out.println("Progressão cadastrada com sucesso!");
        } catch (Exception e) {
            System.out.println("Formato de data incorreto!");
        }
    }

    private Integer escolheInsignia(Scanner input) {
        System.out.println("Escolha uma das insígnias abaixo:");
        Iterable<Insignias> insignias = insigniasRepository.findAll();

        List<Integer> idInsignias = new ArrayList<>();
        for (Insignias insignia : insignias) {
            idInsignias.add(insignia.getIdInsignias());
            System.out.println(insignia.getIdInsignias() + " - " + insignia.getNome());
        }

        Integer idInsignia = input.nextInt();

        if (idInsignias.contains(idInsignia)) {
            return idInsignia;
        } else {
            return -1;
        }
    }

    private Integer escolheRequisitoInsignia(Scanner input, Integer idInsignia) {
        System.out.println("Escolha o requisito:");

        Iterable<RequisitosInsignia> requisitosInsignias = requisitosInsigniaRepository.findAllByInsignia_IdInsignias(idInsignia);

        List<Integer> idRequisitos = new ArrayList<>();
        for (RequisitosInsignia requisitosInsignia : requisitosInsignias) {
            idRequisitos.add(requisitosInsignia.getIdRequisitosInsignia());
            System.out.println(requisitosInsignia.getIdRequisitosInsignia() + " - " + requisitosInsignia.getRequisito());
        }

        Integer idRequisito = input.nextInt();
        if (idRequisitos.contains(idRequisito)) {
            return idRequisito;
        } else {
            return -1;
        }
    }

    private boolean possuiRequisitosInsignia(String cpf, Integer idRequisito) {
        Iterable<ProgressoInsignia> progressoJovem = progressoInsigniaRepository.findAllByJovem_Cpf(cpf);

        for (ProgressoInsignia progressoInsignia : progressoJovem) {
            if (progressoInsignia.getIdRequisitoInsignia().equals(idRequisito)) {
                System.out.println("O jovem já possui este requisito");
                return false;
            }
        }

        return true;
    }

    private void registraProgressaoInsignia() {
        Scanner input = new Scanner(System.in);

        Integer idInsignia = escolheInsignia(input);
        if (idInsignia == -1) {
            System.out.println("Insígnia não encontrada!");
            return;
        }

        Integer idRequisito = escolheRequisitoInsignia(input, idInsignia);
        if (idRequisito == -1) {
            System.out.println("Requisito não encontrado!");
            return;
        }

        Optional<RequisitosInsignia> reqInsignia = requisitosInsigniaRepository.findById(idRequisito);
        if (!reqInsignia.isPresent()) {
            System.out.println("Requisito não está presente no bancom de dados!");
            return;
        }

        System.out.print("Informe o CPF do jovem: ");
        input = new Scanner(System.in);
        String cpf = input.nextLine();

        Optional<Jovem> j = jovemRepository.findByCpf(cpf);
        if (!j.isPresent()) {
            System.out.println("Jovem não cadastrado no banco de dados!");
            return;
        }

        if (!possuiRequisitosInsignia(cpf, idRequisito)) {
            return;
        }

        System.out.print("Informe a data de conclusão do requisito: ");
        String data = input.nextLine();

        try {
            String dia, mes, ano;
            dia = data.split("/")[0];
            mes = data.split("/")[1];
            ano = data.split("/")[2];

            Date dataConclusao = new Date(ano + "/" + mes + "/" + dia);
            Jovem jovem = j.get();
            RequisitosInsignia requisitosInsignia = reqInsignia.get();

            ProgressoInsignia progressoInsignia = new ProgressoInsignia(jovem, requisitosInsignia, dataConclusao);
            progressoInsigniaRepository.save(progressoInsignia);

            System.out.println("Progressão cadastrada com sucesso!");
        } catch (Exception e) {
            System.out.println("Formato de data incorreto!");
        }
    }

    private Integer escolheDistintivo(Scanner input) {
        System.out.println("Escolha um dos distintivos abaixo:");

        Iterable<Distintivos> distintivos = distintivosRepository.findAll();

        List<Integer> idDistintivos = new ArrayList<>();
        for (Distintivos distintivo : distintivos) {
            idDistintivos.add(distintivo.getIdDistintivos());
            System.out.println(distintivo.getIdDistintivos() + " - " + distintivo.getNome());
        }

        Integer idDistintivo = input.nextInt();
        if (idDistintivos.contains(idDistintivo)) {
            return idDistintivo;
        } else {
            return -1;
        }
    }

    private boolean possuiRequisitosDistintivo(String cpf, Integer idDistintivo) {
        Iterable<ProgressoDistintivo> progDist = progressoDistintivoRepository.findAllByJovem_Cpf(cpf);

        List<Integer> idProgresso = new ArrayList<>();
        for (ProgressoDistintivo progressoDistintivo : progDist) {
            Integer id = progressoDistintivo.getIdRequisitosDistintivo();
            if (id.equals(idDistintivo)) {
                System.out.println("O jovem já possui este distintivo!");
                return false;
            }

            idProgresso.add(id);
        }

        if (idDistintivo == 1 || idProgresso.contains(idDistintivo - 1)) {
            return true;
        } else {
            System.out.println("O jovem não alcançou os pré requisitos para obter este distintivo!");
            return false;
        }
    }

    private void registraProgressaoDistintivo() {
        Scanner input = new Scanner(System.in);

        Integer idDistintivo = escolheDistintivo(input);
        if (idDistintivo == -1) {
            System.out.println("Distintivo não encontrado!");
            return;
        }

        System.out.print("Informe o CPF do jovem: ");
        input = new Scanner(System.in);
        String cpf = input.nextLine();

        Optional<Jovem> j = jovemRepository.findByCpf(cpf);
        if (!j.isPresent()) {
            System.out.println("Jovem não cadastrado no banco de dados!");
            return;
        }

        if (!possuiRequisitosDistintivo(cpf, idDistintivo)) {
            return;
        }

        System.out.print("Informe a data de conclusão do requisito: ");
        String data = input.nextLine();

        try {
            String dia, mes, ano;
            dia = data.split("/")[0];
            mes = data.split("/")[1];
            ano = data.split("/")[2];

            Date dataConclusao = new Date(ano + "/" + mes + "/" + dia);
            Jovem jovem = j.get();

            Optional<RequisitosDistintivo> reqDist = requisitosDistintivoRepository.findById(idDistintivo);
            RequisitosDistintivo requisitosDistintivo = reqDist.get();

            ProgressoDistintivo progressoDistintivo = new ProgressoDistintivo(jovem, requisitosDistintivo, dataConclusao);
            progressoDistintivoRepository.save(progressoDistintivo);

            System.out.println("Progressão cadastrada com sucesso!");
        } catch (Exception e) {
            System.out.println("Formato de data incorreto!");
        }
    }

    private void registraAcampamento() {
        System.out.print("Informe o CPF do jovem: ");

        Scanner input = new Scanner(System.in);

        String cpf = input.nextLine();

        Optional<Jovem> j = this.jovemRepository.findByCpf(cpf);
        if (j.isPresent()) {
            Jovem jovem = j.get();

            System.out.print("Informe a data que foi realizado o acampamento: ");

            try {
                String dataEscolhida = input.nextLine();
                String dia, mes, ano;

                dia = dataEscolhida.split("/")[0];
                mes = dataEscolhida.split("/")[1];
                ano = dataEscolhida.split("/")[2];

                Date data = new Date(ano + "/" + mes + "/" + dia);

                Optional<Acampamentos> acampamentos = this.acampamentosRepository.findByJovemAndData(jovem, data);
                if (!acampamentos.isPresent()) {
                    montaTabelaAcampamentos(jovem, data);
                    System.out.println("Acampamento Registrado com sucesso!");
                } else {
                    System.out.println("Já há um acampamento registrado!");
                }
            } catch (Exception e) {
                System.out.println("Não foi possível registrar o acampamento!");
            }

        } else {
            System.out.println("Jovem não registrado no banco de dados!");
        }
    }

    private void menuRegistro() {
        System.out.println("\nEscolha o que gostaria de registrar:");
        System.out.println("1 - Registrar um jovem.");
        System.out.println("2 - Adicionar uma progressão de especialidade a um jovem");
        System.out.println("3 - Adicionar uma progressão de insígnia a um jovem");
        System.out.println("4 - Adicionar uma progressão de distintivo a um jovem");
        System.out.println("5 - Adicionar um acampamento");
        System.out.println("Escolha qualquer tecla para retornar");

        Scanner op = new Scanner(System.in);
        switch (op.nextLine()) {
            case "1":
                registraJovem();
                break;

            case "2":
                registraProgressaoEspecialidade();
                break;

            case "3":
                registraProgressaoInsignia();
                break;

            case "4":
                registraProgressaoDistintivo();
                break;

            case "5":
                registraAcampamento();
                break;

            default:
                break;
        }

    }

    private void dadosBiograficos() {
        System.out.print("Informe o CPF do jovem: ");
        Scanner cpf = new Scanner(System.in);

        Optional<Jovem> j = jovemRepository.findByCpf(cpf.nextLine());
        if (j.isPresent()) {
            Jovem jovem = j.get();

            System.out.println(jovem);
        }
    }

    private void possuemEspecialidade() {
        Scanner input = new Scanner(System.in);

        Integer idEspecialidade = escolheEspecialidade(input);
        if (idEspecialidade == -1) {
            System.out.println("Especialidade não encontrada!");
            return;
        }

        Optional<Especialidades> esp = especialidadesRepository.findById(idEspecialidade);

        if (esp.isPresent()) {
            Especialidades especialidade = esp.get();

            Iterable<RequisitosEspecialidade> requisitosEspecialidades = requisitosEspecialidadeRepository.findAllByEspecialidade_IdEspecialidades(idEspecialidade);

            Integer quantRequisitos = 0;
            for (RequisitosEspecialidade requisitosEspecialidade : requisitosEspecialidades) {
                quantRequisitos += 1;
            }

            Iterable<ProgressoEspecialidade> progressoEspecialidades = progressoEspecialidadeRepository.findAllByRequisitosEspecialidade_Especialidade(especialidade);

            HashMap<Integer, Integer> jovensProgresso = new HashMap<>();
            for (ProgressoEspecialidade progressoEspecialidade : progressoEspecialidades) {
                Integer idJovem = progressoEspecialidade.getJovem().getIdJovem();
                Integer quantReq = 0;

                if (jovensProgresso.containsKey(idJovem)) {
                    quantReq = jovensProgresso.get(idJovem);
                }

                quantReq += 1;

                jovensProgresso.put(idJovem, quantReq);
            }

            System.out.println("Jovens que possuem os Requisitos: ");
            for (Map.Entry<Integer, Integer> map : jovensProgresso.entrySet()) {
                Integer key = map.getKey();
                Integer quantReq = map.getValue();

                if (Objects.equals(quantReq, quantRequisitos)) {
                    Optional<Jovem> jovem = jovemRepository.findById(key);

                    if (jovem.isPresent()) {
                        Jovem j = jovem.get();

                        System.out.println(j.getNome());
                    }
                }
            }
        }
    }

    private boolean possuiTodosRequisitosEspecialidade(String cpf, Integer idEspecialiade) {
        Iterable<RequisitosEspecialidade> requisitosEspecialidades = requisitosEspecialidadeRepository.findAllByEspecialidade_IdEspecialidades(idEspecialiade);

        List<Integer> reqEsp = new ArrayList<>();
        for (RequisitosEspecialidade requisitosEspecialidade : requisitosEspecialidades) {
            reqEsp.add(requisitosEspecialidade.getIdRequisitosEspecialidade());
        }

        Iterable<ProgressoEspecialidade> progressoEspecialidades = progressoEspecialidadeRepository.findAllByJovem_Cpf(cpf);

        List<Integer> proEsp = new ArrayList<>();
        for (ProgressoEspecialidade progressoEspecialidade : progressoEspecialidades) {
            if (progressoEspecialidade.getRequisitosEspecialidade().getEspecialidade().getIdEspecialidades().equals(idEspecialiade)) {
                proEsp.add(progressoEspecialidade.getIdRequisitoEspecialidade());
            }
        }

        return reqEsp.equals(proEsp);
    }

    private boolean possuiTodosRequisitosInsignias(String cpf, Integer idInsignia) {
        Iterable<RequisitosInsignia> requisitosInsignias = requisitosInsigniaRepository.findAllByInsignia_IdInsignias(idInsignia);

        List<Integer> reqInsig = new ArrayList<>();
        for (RequisitosInsignia requisitosInsignia : requisitosInsignias) {
            reqInsig.add(requisitosInsignia.getIdRequisitosInsignia());
        }

        Iterable<ProgressoInsignia> progressoInsignias = progressoInsigniaRepository.findAllByJovem_Cpf(cpf);

        List<Integer> proInsig = new ArrayList<>();
        for (ProgressoInsignia progressoInsignia : progressoInsignias) {
            if (progressoInsignia.getRequisitosInsignia().getInsignia().getIdInsignias().equals(idInsignia)) {
                proInsig.add(progressoInsignia.getIdRequisitoInsignia());
            }
        }

        return reqInsig.equals(proInsig);
    }

    private void especialidadesEInsignias() {
        System.out.print("Informe o CPF do jovem: ");

        Scanner input = new Scanner(System.in);
        String cpf = input.nextLine();

        Optional<Jovem> j = jovemRepository.findByCpf(cpf);
        if (j.isPresent()) {
            Iterable<ProgressoEspecialidade> progressoEspecialidades = progressoEspecialidadeRepository.findAllByJovem_Cpf(cpf);

            System.out.println("Especialdiades:");
            List<Integer> especialidades = new ArrayList<>();
            for (ProgressoEspecialidade progressoEspecialidade : progressoEspecialidades) {
                Integer idEspecialidade = progressoEspecialidade.getRequisitosEspecialidade().getEspecialidade().getIdEspecialidades();

                if ((!especialidades.contains(idEspecialidade)) && possuiTodosRequisitosEspecialidade(cpf, idEspecialidade)) {
                    especialidades.add(idEspecialidade);
                    System.out.println(progressoEspecialidade.getRequisitosEspecialidade().getEspecialidade().getEspecialidade());
                }
            }

            Iterable<ProgressoInsignia> progressoInsignias = progressoInsigniaRepository.findAllByJovem_Cpf(cpf);

            System.out.println("\nInsígnias:");
            List<Integer> insignias = new ArrayList<>();
            for (ProgressoInsignia progressoInsignia : progressoInsignias) {
                Integer idInsignia = progressoInsignia.getRequisitosInsignia().getInsignia().getIdInsignias();

                if ((!insignias.contains(idInsignia)) && possuiTodosRequisitosInsignias(cpf, idInsignia)) {
                    insignias.add(idInsignia);
                    System.out.println(progressoInsignia.getRequisitosInsignia().getInsignia().getNome());
                }
            }
        }
    }

    private boolean jovemPossuiUmaInsignia(String cpf) {
        Iterable<Insignias> insig = this.insigniasRepository.findAll();

        for (Insignias insignia : insig) {
            if (possuiTodosRequisitosInsignias(cpf, insignia.getIdInsignias())) {
                return true;
            }
        }

        return false;
    }

    private boolean jovemPossuiUmaEspecialidade(String cpf, Integer idEspecialidade) {
        Optional<Jovem> j = this.jovemRepository.findByCpf(cpf);

        if (j.isPresent()) {
            Jovem jovem = j.get();
            int reqAlcancados = 0;
            List<ProgressoEspecialidade> progressoEspecialidade = jovem.getProgressoEspecialidades();

            for (ProgressoEspecialidade progresso : progressoEspecialidade) {
                if (progresso.getRequisitosEspecialidade().getEspecialidade().getIdEspecialidades().equals(idEspecialidade)) {
                    reqAlcancados++;
                }
            }

            Iterable<RequisitosEspecialidade> requisitosEspecialidades = this.requisitosEspecialidadeRepository.findAllByEspecialidade_IdEspecialidades(idEspecialidade);

            int quantRequisitos = 0;
            for (RequisitosEspecialidade requisitosEspecialidade : requisitosEspecialidades) {
                quantRequisitos++;
            }

            return reqAlcancados == quantRequisitos;
        }

        return false;
    }

    private boolean jovemPossuiCincoEspecialidadesEmTresAreas(String cpf) {
        Iterable<Areas> areas = this.areasRepository.findAll();
        Set<String> areasAlcancadas = new HashSet<>();
        int quantEspecialidade = 0;

        for (Areas area : areas) {
            String nomeArea = area.getArea();

            for (Especialidades especialidade : area.getEspecialidades()) {
                if (jovemPossuiUmaEspecialidade(cpf, especialidade.getIdEspecialidades())) {
                    quantEspecialidade++;
                    areasAlcancadas.add(nomeArea);
                }
            }
        }

        return areasAlcancadas.size() >= 3 && quantEspecialidade >= 5;
    }


    private void possuiCruzeiro() {
        List<String> jovensComCruzeiro = new ArrayList<>();
        Iterable<Jovem> j = this.jovemRepository.findAll();

        for (Jovem jovem : j) {
            String cpf = jovem.getCpf();

            List<Acampamentos> acampamentos = this.acampamentosRepository.findAllByJovem_Cpf(cpf);

            if (acampamentos.size() >= 3 && jovemPossuiUmaInsignia(cpf) && jovemPossuiCincoEspecialidadesEmTresAreas(cpf)) {
                jovensComCruzeiro.add(jovem.getNome());
            }
        }

        if (!jovensComCruzeiro.isEmpty()) {
            System.out.println("Jovens que possuem todos os requisitos:");

            for (String jovem : jovensComCruzeiro) {
                System.out.println(jovem);
            }

        } else {
            System.out.println("Não há jovens que cumpram todos os requisitos!");
        }
    }

    private void requisitosCumpridos() {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o CPF do jovem: ");

        String cpf = input.nextLine();

        Optional<Jovem> j = this.jovemRepository.findByCpf(cpf);
        if (j.isPresent()) {
            Integer idEspecialidade = escolheEspecialidade(input);
            if (idEspecialidade == -1) {
                System.out.println("Especialidade não encontrada!");
                return;
            }

            Optional<Especialidades> especialidades = this.especialidadesRepository.findById(idEspecialidade);
            Especialidades especialidade = especialidades.get();

            List<String> requisitos = new ArrayList<>();
            Iterable<ProgressoEspecialidade> progressoEspecialidades = this.progressoEspecialidadeRepository.findAllByJovem_CpfAndRequisitosEspecialidade_Especialidade(cpf, especialidade);
            for(ProgressoEspecialidade progressoEspecialidade:progressoEspecialidades){
                requisitos.add(progressoEspecialidade.getRequisitosEspecialidade().getRequisito());
            }

            if(! requisitos.isEmpty()){
                System.out.println("\nRequisitos conquistados:");
                for(String requisito: requisitos){
                    System.out.println(requisito);
                }
            } else{
                System.out.println("\nO jovem não possui nenhum requisito na especialidade " + especialidade.getEspecialidade());
            }
        } else{
            System.out.println("Jovem não encontrado!");
        }
    }

    private void menuRelatorio() {
        System.out.println("\nEscolha qual relatório deseja:");
        System.out.println("1 - Dados biográficos de um determinado jovem");
        System.out.println("2 - Jovens que possuem uma determinada especialidade");
        System.out.println("3 - Especialidades e insígnias que um determinado jovem possui");
        System.out.println("4 - Requisitos já cumpridos por um determinado jovem para uma determinada especialidade");
        System.out.println("5 - Jovens que possuem todos os requisitos para obter o Cruzeiro do Sul");
        System.out.println("Escolha qualquer tecla para retornar");

        Scanner op = new Scanner(System.in);

        switch (op.nextLine()) {
            case "1":
                dadosBiograficos();
                break;

            case "2":
                possuemEspecialidade();
                break;

            case "3":
                especialidadesEInsignias();
                break;

            case "4":
                requisitosCumpridos();
                break;

            case "5":
                possuiCruzeiro();
                break;

            default:
                break;

        }
    }

    private void menu() {
        while (true) {
            System.out.println("\nEscolha uma das opções abaixo:");
            System.out.println("1 - Fazer um registro");
            System.out.println("2 - Gerar um relatório");
            System.out.println("Escolha qualquer outra tecla para sair");

            Scanner op = new Scanner(System.in);

            switch (op.nextLine()) {
                case "1":
                    menuRegistro();
                    break;

                case "2":
                    menuRelatorio();
                    break;

                default:
                    return;
            }
        }
    }

    @Override
    public void run(String... args) throws Exception {
        try {
            geraTabelas();
            menu();
        } catch (Exception e) {
            log.error(e.toString());
        }
    }
}
