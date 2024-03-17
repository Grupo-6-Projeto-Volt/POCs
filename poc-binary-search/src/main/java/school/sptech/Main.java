package school.sptech;

import school.sptech.util.Ordenacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitorInt = new Scanner(System.in);
        List<Produto> produtos = new ArrayList<>();

        int escolha = 0;
        int limiteExibicao = 10; // Variavel para limitar a exibição dos produtos


        adicionarProdutos(produtos);

        System.out.println("=-".repeat(10) + " POC Busca Binária: Srint 1 " + "=-".repeat(10));
        do {
            System.out.println("\nMenu");
            System.out.print("""
                    [1] Listagem de todos os produtos
                    [2] Lista com os maiores preços
                    [3] Lista com as maiores quantidades no estoque
                    [4] Buscar por Preço
                    [5] Buscar por Quantidade em estoque
                    [6] Buscar por Id
                    [7] Ver últimos produtos inseridos
                    
                    [9] Sair
                    >>\s""");

            escolha = leitorInt.nextInt();

            if(escolha == 1){
                // Listagem de todos os produtos
                produtos.forEach(System.out::println);
            }
            else if (escolha == 2) {
                // Lista com os maiores preços
                Ordenacao.bubbleSortMaiorPreco(produtos).stream().limit(limiteExibicao).forEach(System.out::println);
            }
            else if (escolha == 3) {
                // Lista com as maiores quantidades no estoque
                Ordenacao.selectionSortMaiorQtdEstoque(produtos).stream().limit(limiteExibicao).forEach(System.out::println);
            }
            else if (escolha == 4) {
                // Buscar por Preço

            }
            else if (escolha == 5) {
                // Buscar por Quantidade em estoque

            }
            else if (escolha == 6) {
                // Buscar por Id

            }
            else if (escolha == 7) {
                // Ver últimos produtos inseridos
                Ordenacao.insertionSortUltimosInseridos(produtos).stream().limit(limiteExibicao).forEach(System.out::println);
            }
            else if (escolha == 9) {
                System.out.println("Até logo! :) ");
            }
            else {
                System.out.println("Esolha uma opção válida!!");
            }

        } while (escolha != 9);

    }

    public static void adicionarProdutos(List<Produto> produtos){
        produtos.add(new Produto(1, "Apple iPhone 13 Pro", "O mais recente smartphone da Apple com câmera Pro e 5G.", 999.0, 10));
        produtos.add(new Produto(2, "Samsung Galaxy S21 Ultra", "Smartphone premium da Samsung com tela de 120Hz e câmera de 108MP.", 1199.0, 8));
        produtos.add(new Produto(3, "Sony WH-1000XM4", "Fones de ouvido com cancelamento de ruído da Sony, reconhecidos pela qualidade de áudio.", 299.0, 15));
        produtos.add(new Produto(4, "Dell XPS 13", "Laptop ultraleve da Dell com tela InfinityEdge e processadores Intel Core de 11ª geração.", 1199.0, 5));
        produtos.add(new Produto(5, "LG C1 OLED TV", "TV OLED 4K da LG com Dolby Vision IQ e Dolby Atmos.", 1499.0, 7));
        produtos.add(new Produto(6, "Nintendo Switch", "Console híbrido da Nintendo que pode ser usado como console de mesa ou portátil.", 299.0, 20));
        produtos.add(new Produto(7, "Logitech MX Master 3", "Mouse sem fio avançado da Logitech com roda de rolagem MagSpeed e botões programáveis.", 99.0, 25));
        produtos.add(new Produto(8, "GoPro HERO10 Black", "Câmera de ação 5.3K da GoPro com estabilização HyperSmooth 4.0 e tela sensível ao toque.", 399.0, 12));
        produtos.add(new Produto(9, "Bose QuietComfort Earbuds", "Fones de ouvido verdadeiramente sem fio da Bose com cancelamento de ruído ajustável.", 279.0, 18));
        produtos.add(new Produto(10, "Asus ROG Strix G15", "Notebook para jogos da Asus com tela de 15.6 polegadas e processador AMD Ryzen 9.", 1599.0, 6));
        produtos.add(new Produto(11, "Apple Watch Series 7", "Smartwatch da Apple com tela Retina Always-On e resistência à água.", 349.0, 14));
        produtos.add(new Produto(12, "Microsoft Surface Pro 8", "Tablet 2 em 1 da Microsoft com processadores Intel Core de 11ª geração.", 1099.0, 9));
        produtos.add(new Produto(13, "Sony A7 III", "Câmera mirrorless da Sony com sensor full-frame de 24.2MP e vídeo 4K.", 1799.0, 4));
        produtos.add(new Produto(14, "Razer BlackWidow V3 Pro", "Teclado mecânico sem fio da Razer com switches Green e RGB Chroma.", 229.0, 20));
        produtos.add(new Produto(15, "Samsung Odyssey G7", "Monitor gamer curvo de 27 polegadas da Samsung com taxa de atualização de 240Hz.", 699.0, 10));
        produtos.add(new Produto(16, "Google Pixel 6 Pro", "Smartphone do Google com câmera de 50MP e carregamento rápido de 30W.", 899.0, 8));
        produtos.add(new Produto(17, "Bose SoundLink Revolve+", "Caixa de som Bluetooth 360 graus da Bose com até 16 horas de reprodução.", 299.0, 15));
        produtos.add(new Produto(18, "Nvidia GeForce RTX 3080", "Placa de vídeo para jogos da Nvidia com 10GB de memória GDDR6X.", 699.0, 5));
        produtos.add(new Produto(19, "Canon EOS R6", "Câmera mirrorless da Canon com sensor full-frame de 20.1MP e gravação 4K.", 2499.0, 7));
        produtos.add(new Produto(20, "Xbox Series X", "Console de última geração da Microsoft com suporte a 4K e Ray Tracing.", 499.0, 25));
        produtos.add(new Produto(21, "Apple AirPods Pro", "Fones de ouvido sem fio da Apple com cancelamento de ruído ativo e resistência à água.", 249.0, 30));
        produtos.add(new Produto(22, "Lenovo Legion 7i", "Notebook gamer da Lenovo com tela de 15.6 polegadas e processador Intel Core i7.", 1599.0, 15));
        produtos.add(new Produto(23, "Samsung Galaxy Watch 4", "Smartwatch da Samsung com monitoramento avançado de saúde e função ECG.", 299.0, 18));
        produtos.add(new Produto(24, "AMD Ryzen 9 5900X", "Processador de desktop da AMD com 12 núcleos e 24 threads.", 549.0, 10));
        produtos.add(new Produto(25, "Sony X950H 4K TV", "TV LED 4K da Sony com tecnologia Triluminos e Android TV.", 1099.0, 6));
        produtos.add(new Produto(26, "HP Reverb G2", "Óculos de realidade virtual de alta resolução da HP com controladores ergonômicos.", 599.0, 8));
        produtos.add(new Produto(27, "Corsair Vengeance RGB Pro", "Módulos de memória RAM DDR4 da Corsair com iluminação RGB personalizável.", 129.0, 30));
        produtos.add(new Produto(28, "Amazon Echo Dot (4ª geração)", "Smart speaker da Amazon com Alexa integrada e som de alta qualidade.", 49.0, 40));
        produtos.add(new Produto(29, "Logitech G Pro X Wireless", "Headset gamer sem fio da Logitech com drivers de 50mm e microfone Blue Voice.", 199.0, 12));
        produtos.add(new Produto(30, "Raspberry Pi 4 Model B", "Mini computador poderoso para projetos DIY e IoT.", 35.0, 50));
        produtos.add(new Produto(31, "Garmin Forerunner 945", "Relógio esportivo GPS da Garmin com monitoramento avançado de treino.", 599.0, 8));
        produtos.add(new Produto(32, "Acer Predator Helios 300", "Notebook gamer da Acer com tela de 15.6 polegadas e NVIDIA GeForce RTX 3060.", 1199.0, 10));
        produtos.add(new Produto(33, "Sony WH-CH710N", "Fones de ouvido com cancelamento de ruído da Sony com até 35 horas de bateria.", 199.0, 20));
        produtos.add(new Produto(34, "LG UltraGear 27GL850-B", "Monitor gamer de 27 polegadas com resolução QHD e 144Hz de taxa de atualização.", 449.0, 15));
        produtos.add(new Produto(35, "AMD Radeon RX 6800 XT", "Placa de vídeo AMD para jogos de alta performance.", 649.0, 7));
        produtos.add(new Produto(36, "OnePlus 9 Pro", "Smartphone premium da OnePlus com câmera Hasselblad e tela Fluid AMOLED.", 969.0, 12));
        produtos.add(new Produto(37, "Apple MacBook Air M1", "Laptop ultraleve da Apple com chip M1 e até 18 horas de bateria.", 999.0, 8));
        produtos.add(new Produto(38, "Bose Frames Tempo", "Óculos de sol com alto-falantes da Bose e proteção UV.", 249.0, 20));
        produtos.add(new Produto(39, "Samsung Odyssey G9", "Monitor gamer ultrawide de 49 polegadas com resolução QLED e taxa de atualização de 240Hz.", 1499.0, 5));
        produtos.add(new Produto(40, "Logitech G502 Hero", "Mouse gamer da Logitech com sensor HERO 25K e 11 botões programáveis.", 79.0, 25));
        produtos.add(new Produto(41, "Anker PowerCore 26800", "Power bank de alta capacidade da Anker com 26800mAh.", 59.0, 30));
        produtos.add(new Produto(42, "SteelSeries Arctis 7", "Headset sem fio da SteelSeries com som surround DTS Headphone:X v2.0.", 149.0, 15));
        produtos.add(new Produto(43, "Asus ROG Swift PG279Q", "Monitor gamer de 27 polegadas com resolução WQHD e taxa de atualização de 165Hz.", 699.0, 10));
        produtos.add(new Produto(44, "Sony Xperia 1 III", "Smartphone premium da Sony com tela 4K HDR OLED e câmera ZEISS.", 1299.0, 8));
        produtos.add(new Produto(45, "DJI Mavic Air 2", "Drone portátil da DJI com câmera 4K e autonomia de até 34 minutos.", 799.0, 10));
        produtos.add(new Produto(46, "HP Spectre x360", "Notebook 2 em 1 da HP com tela OLED de 13.3 polegadas e processador Intel Core i7.", 1299.0, 6));
        produtos.add(new Produto(47, "Razer DeathAdder V2", "Mouse gamer da Razer com sensor óptico de 20.000 DPI.", 69.0, 25));
        produtos.add(new Produto(48, "Sonos Beam", "Soundbar inteligente da Sonos com suporte a Alexa e Google Assistant.", 399.0, 12));
        produtos.add(new Produto(49, "Nvidia GeForce RTX 3090", "Placa de vídeo topo de linha da Nvidia com 24GB de memória GDDR6X.", 1499.0, 5));
        produtos.add(new Produto(50, "Sony WF-1000XM4", "Fones de ouvido sem fio com cancelamento de ruído da Sony e áudio Hi-Res.", 279.0, 18));
        produtos.add(new Produto(51, "Acer Predator XB271HU", "Monitor gamer de 27 polegadas com resolução WQHD e taxa de atualização de 144Hz.", 499.0, 10));
        produtos.add(new Produto(52, "Samsung Galaxy Tab S7+", "Tablet premium da Samsung com tela de 12.4 polegadas e suporte a S Pen.", 849.0, 15));
        produtos.add(new Produto(53, "Apple AirTag", "Dispositivo de rastreamento Bluetooth da Apple para encontrar itens perdidos.", 29.0, 40));
        produtos.add(new Produto(54, "HyperX Cloud II", "Headset gamer da HyperX com som surround virtual 7.1 e microfone destacável.", 79.0, 20));
        produtos.add(new Produto(55, "LG OLED48C1", "TV OLED 4K de 48 polegadas da LG com processador α9 Gen4 AI.", 1499.0, 7));
        produtos.add(new Produto(56, "AMD Ryzen 5 5600X", "Processador de desktop da AMD com 6 núcleos e 12 threads.", 299.0, 10));
        produtos.add(new Produto(57, "Logitech G Pro X", "Teclado mecânico da Logitech com switches GX Blue e iluminação RGB.", 129.0, 25));
        produtos.add(new Produto(58, "Xiaomi Mi 11", "Smartphone com Snapdragon 888, tela AMOLED de 120Hz e câmera de 108MP.", 699.0, 8));
        produtos.add(new Produto(59, "Sennheiser HD 650", "Fones de ouvido de alta fidelidade da Sennheiser com drivers de 40mm.", 399.0, 15));
        produtos.add(new Produto(60, "Apple iPad Pro 2021", "Tablet da Apple com chip M1, tela Liquid Retina XDR e suporte a Apple Pencil 2.", 799.0, 20));
        produtos.add(new Produto(61, "Nvidia GeForce RTX 3060 Ti", "Placa de vídeo para jogos da Nvidia com 8GB de memória GDDR6.", 399.0, 30));
        produtos.add(new Produto(62, "Bose Home Speaker 500", "Smart speaker da Bose com som estéreo de 360 graus e controle por voz.", 299.0, 12));
        produtos.add(new Produto(63, "Razer Naga Trinity", "Mouse gamer da Razer com 3 placas laterais intercambiáveis e sensor óptico 5G.", 99.0, 25));
        produtos.add(new Produto(64, "Samsung Odyssey G5", "Monitor gamer curvo de 27 polegadas da Samsung com resolução QHD e 144Hz.", 299.0, 15));
        produtos.add(new Produto(65, "Apple Mac mini M1", "Mini computador da Apple com chip M1, até 16GB de RAM e 2TB de armazenamento.", 699.0, 6));
        produtos.add(new Produto(66, "Sony PS5 DualSense", "Controle sem fio do PlayStation 5 com feedback tátil e gatilhos adaptáveis.", 69.0, 30));
        produtos.add(new Produto(67, "LG Gram 17", "Notebook ultraleve da LG com tela de 17 polegadas e até 19.5 horas de bateria.", 1299.0, 8));
        produtos.add(new Produto(68, "Canon EOS RP", "Câmera mirrorless full-frame da Canon com sensor de 26.2MP e foco automático Dual Pixel CMOS.", 999.0, 10));
        produtos.add(new Produto(69, "Roku Streaming Stick+", "Dispositivo de streaming da Roku com suporte a 4K, HDR e controle remoto.", 49.0, 25));
        produtos.add(new Produto(70, "Samsung Galaxy Buds Pro", "Fones de ouvido sem fio da Samsung com cancelamento de ruído inteligente.", 199.0, 20));
        produtos.add(new Produto(71, "Asus TUF Gaming VG27AQ", "Monitor gamer de 27 polegadas com resolução WQHD e taxa de atualização de 165Hz.", 429.0, 15));
        produtos.add(new Produto(72, "Logitech C920 HD Pro", "Webcam HD da Logitech com vídeo Full HD 1080p e correção de luz automática.", 69.0, 20));
        produtos.add(new Produto(73, "Apple TV 4K (2021)", "Dispositivo de streaming da Apple com suporte a Dolby Vision e Dolby Atmos.", 179.0, 25));
        produtos.add(new Produto(74, "Samsung Galaxy Book Pro 360", "Notebook 2 em 1 da Samsung com tela AMOLED e processador Intel Core i7.", 1299.0, 10));
        produtos.add(new Produto(75, "Corsair K95 RGB Platinum XT", "Teclado mecânico da Corsair com switches Cherry MX Speed e iluminação RGB.", 159.0, 15));
        produtos.add(new Produto(76, "GoPro MAX", "Câmera de ação 360 graus da GoPro com estabilização Max HyperSmooth.", 499.0, 12));
        produtos.add(new Produto(77, "JBL Flip 5", "Caixa de som Bluetooth à prova d'água da JBL com até 12 horas de reprodução.", 89.0, 30));
        produtos.add(new Produto(78, "MSI GeForce RTX 3070 Gaming X Trio", "Placa de vídeo MSI com 8GB de memória GDDR6 e sistema de resfriamento Tri Frozr 2.", 649.0, 8));
        produtos.add(new Produto(79, "HyperX Cloud Flight", "Headset gamer sem fio da HyperX com até 30 horas de autonomia de bateria.", 139.0, 15));
        produtos.add(new Produto(80, "Google Nest Hub (2ª geração)", "Assistente de casa inteligente do Google com tela sensível ao toque de 7 polegadas.", 99.0, 20));
    }
}