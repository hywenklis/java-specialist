package DataStructure.HashMap;

import java.util.HashMap;
import java.util.Map;

public class MusicStreamingService {
    public static void main(String[] args) {
        // Criando o catálogo musical
        Map<String, String> musicCatalog = new HashMap<>();

        // Adicionando músicas
        musicCatalog.put("TRACK_001", "Bohemian Rhapsody - Queen");
        musicCatalog.put("TRACK_002", "Imagine - John Lennon");
        musicCatalog.put("TRACK_003", "Shape of You - Ed Sheeran");

        System.out.println("Catálogo Completo: " + musicCatalog);

        // Listando todas as músicas
        System.out.println("\nPlaylist:");
        for (Map.Entry<String, String> entry : musicCatalog.entrySet()) {
            String trackId = entry.getKey();
            String trackDetails = entry.getValue();
            System.out.println("Código: " + trackId + " | Música: " + trackDetails);
        }

        // Buscando uma música
        String searchId = "TRACK_004";
        if (musicCatalog.containsKey(searchId)) {
            System.out.println("\nMúsica encontrada: " + musicCatalog.get(searchId));
        } else {
            System.out.println("\nMúsica " + searchId + " não está no catálogo");
        }

        // Removendo uma música
        musicCatalog.remove("TRACK_002");
        System.out.println("\nCatálogo após remoção: " + musicCatalog);

        // Limpando o catálogo
        musicCatalog.clear();
        System.out.println("\nCatálogo resetado: " + musicCatalog);
    }
}
