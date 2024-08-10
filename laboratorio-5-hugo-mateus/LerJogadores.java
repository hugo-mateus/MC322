import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;


public class LerJogadores implements IArquivo {
    @Override
    public void lerArquivo(Jogo jogo, String path) {
        List<Jogador> jogadores = new ArrayList<>();

        try {
            File file = new File(path);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(file);
            doc.getDocumentElement().normalize();

            NodeList nodeList = doc.getElementsByTagName("Jogador");

            for (int i = 0; i < nodeList.getLength(); i++) {
                Element jogadorElement = (Element) nodeList.item(i);

                String nome = jogadorElement.getElementsByTagName("nome").item(0).getTextContent();
                int nivel = Integer.parseInt(jogadorElement.getElementsByTagName("nivel").item(0).getTextContent());
                RaçaEnum raça = RaçaEnum.valueOf(jogadorElement.getElementsByTagName("raça").item(0).getTextContent());
                ClasseEnum classe = ClasseEnum.valueOf(jogadorElement.getElementsByTagName("classe").item(0).getTextContent());
                Inventário inventário_vazio = new Inventário(1, null);
                Jogador jogador = new Jogador(nome, nivel, raça, classe);
                jogador.setInventário(inventário_vazio);
                jogadores.add(jogador);
            }
        } catch (Exception e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
            e.printStackTrace();
        }

        jogo.setJogadores(jogadores);
    }
}

