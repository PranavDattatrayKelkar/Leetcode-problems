package personalprojects;

import java.util.HashMap;
import java.util.Map;

/**
 * This class stores and returns a map of indian classical notes mapped to western notes
 *
 */
public class MusicalNotesTranslator {
    public static HashMap<String, String> musicNotes = new HashMap<String, String>();

    /**
     * Returns a map of the existing notes mapping between western notes and indian notes
     */
    public static void getMapping() {
        musicNotes.put("C", "Sa");
        musicNotes.put("D", "Re");
        musicNotes.put("E", "Ga");
        musicNotes.put("F", "Ma");
        musicNotes.put("G", "Pa");
        musicNotes.put("A", "Dha");
        musicNotes.put("B", "Ni");
    }

    /**
     * This is the notes map printer
     */
    public static void MapPrinter() {
        for(Map.Entry<String, String> notes : musicNotes.entrySet())
        {
            System.out.println("Western note :" + notes.getKey() + ", Indian note : " + notes.getValue());
        }
    }

    /**
     * This method returns a corresponding indian note for an input westernNote
     * @param westernNote
     * @return Indian note
     */
    public static String getCorrespondingNote(String westernNote) {
        if(musicNotes.containsKey(westernNote))
        {
            return musicNotes.get(westernNote);
        } else
        {
            System.out.println("This is a new note please add it to the mapping");
        }
        return null;
    }

    /**
     * Adding a new note to the map of existing notes
     * @param newWesternNote
     * @param indianNote
     */
    public static void putNewNote(String newWesternNote, String indianNote) {
        if(!(musicNotes.containsKey(newWesternNote))) {
            musicNotes.put(newWesternNote, indianNote);
        }
    }

}
