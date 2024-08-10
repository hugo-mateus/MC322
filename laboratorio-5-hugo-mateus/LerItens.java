import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;
import java.util.*;

public class LerItens implements IArquivo  {
    
    public void lerArquivo(Jogo jogo, String path) {
        List<Item> itens = new ArrayList<>();

        try {
            File file = new File(path);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(file);
            doc.getDocumentElement().normalize();

            NodeList nodeList = doc.getElementsByTagName("Item");

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element itemElement = (Element) node;
                    String nome = itemElement.getElementsByTagName("nome").item(0).getTextContent();
                    int bonusPoder = Integer.parseInt(itemElement.getElementsByTagName("bonusPoder").item(0).getTextContent());
                    int valor = Integer.parseInt(itemElement.getElementsByTagName("valor").item(0).getTextContent());
                    TipoItem tipo = TipoItem.valueOf(itemElement.getElementsByTagName("tipo").item(0).getTextContent().toUpperCase());
                    boolean itemGrande = Boolean.parseBoolean(itemElement.getElementsByTagName("itemGrande").item(0).getTextContent());
                    
                    List<ClasseEnum> classesCompatíveis = new ArrayList<>();
                    NodeList classesNodeList = itemElement.getElementsByTagName("classesCompatíveis").item(0).getChildNodes();
                    for (int j = 0; j < classesNodeList.getLength(); j++) {
                        Node classeNode = classesNodeList.item(j);
                        if (classeNode.getNodeType() == Node.ELEMENT_NODE) {
                            ClasseEnum classe = ClasseEnum.valueOf(itemElement.getElementsByTagName("classe").item(0).getTextContent());
                            classesCompatíveis.add(classe);
                        }
                    }
                    
                    List<RaçaEnum> raçasCompatíveis = new ArrayList<>();
                    NodeList raçasNodeList = itemElement.getElementsByTagName("raçasCompatíveis").item(0).getChildNodes();
                    for (int k = 0; k < raçasNodeList.getLength(); k++) {
                        Node raçaNode = raçasNodeList.item(k);
                        if (raçaNode.getNodeType() == Node.ELEMENT_NODE) {
                            RaçaEnum raça = RaçaEnum.valueOf(itemElement.getElementsByTagName("raça").item(0).getTextContent());
                            raçasCompatíveis.add(raça);
                        }
                    }
                    

                    Item item = new Item(nome, bonusPoder, valor, tipo, itemGrande, classesCompatíveis, raçasCompatíveis);
                    itens.add(item);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        jogo.setItens(itens);
    }
}
